package codegym.vn.bt1.controller;

import codegym.vn.bt1.model.Setting;
import codegym.vn.bt1.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping()
public class SettingController {
    @Autowired
    private SettingService settingService;
    @GetMapping("/setting")
    public String setting(Model model, @RequestParam("id") int id){
        model.addAttribute("setting", settingService.findById(id));
        model.addAttribute("action", "setting");
        model.addAttribute("languages", getLanguages());
        model.addAttribute("pageSizes", getPageSize());
        return "update";
    }
    @PostMapping("/setting")
    public String doUpdate(@ModelAttribute("setting") Setting setting){
        settingService.update(setting);
        return "redirect:/list";
    }
    private List<String> getLanguages() {
        List<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Vietnamese");
        languages.add("Japanese");
        languages.add("Chinese");
        return languages;
    }
    private List<Integer> getPageSize() {
        List<Integer> pageSizes = new ArrayList<>();
        pageSizes.add(5);
        pageSizes.add(10);
        pageSizes.add(15);
        pageSizes.add(25);
        pageSizes.add(50);
        pageSizes.add(100);
        return pageSizes;
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String displayList(Model model) {
        model.addAttribute("setting", settingService.findAll());
        return "list";
    }

}

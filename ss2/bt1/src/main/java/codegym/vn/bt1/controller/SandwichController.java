package codegym.vn.bt1.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {
    @PostMapping("/choose")
    public String save(@RequestParam("comdiments") String[] comdiments, Model model) {
        model.addAttribute("selected",comdiments);
        for (String e: comdiments){
            System.out.println(e);
        }
        return "sandwich";
    }
    @GetMapping("")
    public String show(){
        return "sandwich";
    }
}

package codegym.vn.upmusic.controller;

import codegym.vn.upmusic.entity.Music;
import codegym.vn.upmusic.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class MusicController {
    @Autowired
    MusicService musicService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String displayList(Model model) {
        model.addAttribute("musics", musicService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String displayCreate(Model model) {
        model.addAttribute("music", new Music());
        model.addAttribute("action", "create");
        return "create";
    }
    @PostMapping("/create")
    public String doCreateOrEdit(@ModelAttribute("music") Music music,
                                 @RequestParam("action") String action) {
        if ("create".equals(action)) {
            musicService.create(music);
        } else {
            musicService.update(music);
        }
        return "redirect:/list";
    }
}

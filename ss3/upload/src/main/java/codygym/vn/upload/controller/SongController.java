package codygym.vn.upload.controller;

import codygym.vn.upload.entity.Song;
import codygym.vn.upload.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
//@PropertySource("classpath:upload_file.properties")
public class SongController {
    @Autowired
    private SongService songService;
//    @Value("${file-upload}")
//    private String fileUpload;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String displayList(Model model) {
        model.addAttribute("songs", songService.findAll());
        return "list";
    }

    @GetMapping("/upload")
    public String displayUpload(Model model) {
        model.addAttribute("song",new Song());
        return "/upload";
    }
    @PostMapping("/upload")
    public String doUpload(@ModelAttribute("songs") Song song){
        songService.uploadSong(song);
        return "redirect:/list";
    }
    @GetMapping("/play")
    public String play(Model model){
        model.addAttribute("song",model);
        return "/play";
    }
}

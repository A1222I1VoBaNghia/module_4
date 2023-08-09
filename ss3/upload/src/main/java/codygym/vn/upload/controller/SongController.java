package codygym.vn.upload.controller;

import codygym.vn.upload.entity.Song;
import codygym.vn.upload.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("")
public class SongController {
    @Autowired
    private SongService songService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String displayList(Model model) {
        model.addAttribute("songs", songService.findAll());
        return "list";
    }

    @GetMapping("/upload")
    public String displayUpload(Model model) {
        model.addAttribute("song",new Song());
        model.addAttribute("formatSongs", getFormatSong());
        return "/upload";
    }
    @PostMapping("/upload")
    public String doUpdate(@ModelAttribute("songs") Song song){
        songService.uploadSong(song);
        return "redirect:/list";
    }
    private List<String> getFormatSong() {
        List<String> formatSongs = new ArrayList<>();
        formatSongs.add(".mp3");
        formatSongs.add(".wav");
        formatSongs.add(".ogg");
        formatSongs.add(".m4p");
        return formatSongs;
    }
}

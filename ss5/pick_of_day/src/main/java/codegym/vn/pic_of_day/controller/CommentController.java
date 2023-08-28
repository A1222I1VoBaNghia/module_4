package codegym.vn.pic_of_day.controller;

import codegym.vn.pic_of_day.entity.Comment;
import codegym.vn.pic_of_day.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/comment")
public class CommentController {


    private CommentService commentService;
    @Autowired
    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @GetMapping("/like")
    public String like(@RequestParam("id") int id){
        commentService.updateLike(id);
        return "redirect:/comment";
    }

    @PostMapping("/create")
    public String doComment(@ModelAttribute("comment") Comment comment){
        commentService.createComment(comment);
        return "redirect:/comment";
    }

    @GetMapping("")
    public String listComment(Model model){
        model.addAttribute("comment", new Comment());
        model.addAttribute("comments",commentService.findAll());
        return "/comment";
    }
}

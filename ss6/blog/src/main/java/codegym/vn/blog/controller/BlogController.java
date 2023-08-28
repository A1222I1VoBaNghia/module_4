package codegym.vn.blog.controller;


import codegym.vn.blog.entity.Blog;
import codegym.vn.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(" ")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping("/list")
    public String displayListBlog(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String displayCreate(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute Blog blog) {
        blogService.create(blog);
        return "redirect: /list";
    }

    @GetMapping("/detail")
    public String displayDetail(Model model, @RequestParam("id") int id) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "detail";
    }

    @GetMapping("/update")
    public String displayUpdate(Model model) {
        model.addAttribute("blog", new Blog());
        return "update";
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute Blog blog) {
        blogService.update(blog);
        return "redirect: /list";
    }
    @GetMapping("/delete")
    public String doDelete(@ModelAttribute Blog blog, @RequestParam("id") int id){
        blogService.deleteById(id);
        return "redirect: /list";
    }
}

package codegym.vn.blogupdate.controller;

import codegym.vn.blogupdate.entity.Blog;
import codegym.vn.blogupdate.service.BlogCategoryService;
import codegym.vn.blogupdate.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private BlogCategoryService blogCategoryService;

    @GetMapping("/list")
    public String displayBlog(Model model){
        model.addAttribute("blogs", blogService.findAllBlog());
        return"blog/list";
    }

    @GetMapping("/create")
    public String displayCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("blogCategories", blogCategoryService.findAll());
        return "blog/create";
    }
    @PostMapping("/create")
    public String createBook(@ModelAttribute("blog") Blog blog) {
        blogService.createBlog(blog);
        return "redirect:/blog/list";
    }
    @GetMapping("/listPaging")
    public String displayBlogPaging(Model model,
                                    @RequestParam("page") Optional<Integer> page,
                                    @RequestParam("size")Optional<Integer> size,
                                    @RequestParam("sort")Optional<String> sort) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        String sortField = sort.orElse("name");
        Pageable pageable = PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).ascending());
        Page<Blog> blogs = blogService.findAll(pageable);
        model.addAttribute("blogs", blogs);
        int totalPage = blogs.getTotalPages();
        if (totalPage > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "blog/list";
    }
}

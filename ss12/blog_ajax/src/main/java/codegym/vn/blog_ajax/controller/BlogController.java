package codegym.vn.blog_ajax.controller;

import codegym.vn.blog_ajax.entity.Blog;
import codegym.vn.blog_ajax.entity.BlogCategory;
import codegym.vn.blog_ajax.service.BlogCategoryService;
import codegym.vn.blog_ajax.service.BlogService;
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
        return "blog/listPaging";
    }

    @GetMapping("/create")
    public String displayCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("blogCategories", blogCategoryService.findAll());
        return "blog/create";
    }
    @PostMapping("/create")
    public String createBlog(@ModelAttribute("blog") Blog blog) {
        blogService.createBlog(blog);
        return "redirect:/blog/listPaging";
    }
//    @GetMapping("/listPaging")
//    public String displayBlogPaging(Model model,
//                                    @RequestParam("page") Optional<Integer> page,
//                                    @RequestParam("size")Optional<Integer> size,
//                                    @RequestParam("sort")Optional<String> sort) {
//        int currentPage = page.orElse(1);
//        int pageSize = size.orElse(5);
//        String sortField = sort.orElse("datePublish");
//        Pageable pageable = PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).descending());
//        Page<Blog> blogs = blogService.findAll(pageable);
//        model.addAttribute("blogs", blogs);
//        int totalPage = blogs.getTotalPages();
//        if (totalPage > 1) {
//            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
//                    .boxed()
//                    .collect(Collectors.toList());
//            model.addAttribute("pageNumbers", pageNumbers);
//        }
//        return "blog/listPaging";
//    }

    @GetMapping("/createCategory")
    public String displayCreateBlogCategory(Model model) {
        model.addAttribute("blogCategory", new BlogCategory());
        return "blog/createCategory";
    }
    @PostMapping("/createCategory")
    public String createBlogCategory(@ModelAttribute("blogCategory") BlogCategory blogCategory) {
        blogCategoryService.create(blogCategory);
        return "redirect:/blog/listPaging";
    }

    @GetMapping("/detail")
    public String displayDetail(Model model, @RequestParam("id") String id) {
        Blog blog = blogService.findBlogById(id);
        model.addAttribute("blog", blog);
        return "blog/detail";
    }

    @GetMapping("/update")
    public String displayUpdate(Model model, @RequestParam("id") String id) {
        blogService.findBlogById(id);
        model.addAttribute("blog", blogService.findBlogById(id));
        model.addAttribute("blogCategories", blogCategoryService.findAll());
        return "blog/update";
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute Blog blog, @RequestAttribute("id") String id) {
        blogService.findBlogById(id);
        blogService.updateBlog( blogService.findBlogById(id));
        return "redirect:/blog/listPaging";
    }
}

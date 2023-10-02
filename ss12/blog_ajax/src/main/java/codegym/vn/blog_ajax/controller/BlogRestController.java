package codegym.vn.blog_ajax.controller;

import codegym.vn.blog_ajax.entity.Blog;
import codegym.vn.blog_ajax.entity.BlogCategory;
import codegym.vn.blog_ajax.service.BlogCategoryService;
import codegym.vn.blog_ajax.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class BlogRestController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private BlogCategoryService blogCategoryService;
    @GetMapping("/category/list")
    public ResponseEntity<List<BlogCategory>> getCategory(){
        List<BlogCategory> categoryList = blogCategoryService.findAll();
        if (categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList,HttpStatus.OK);
    }
    @GetMapping("/blog/list")
    public ResponseEntity<List<Blog>> getAllBlog(){
        List<Blog> list = blogService.findAllBlog();
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable String id){
        Blog blog = blogService.findBlogById(id);
        if(blog == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
    @GetMapping("/blog/search")
    public ResponseEntity<?> searchByName(@RequestParam("keyword") String keyword) {
        return new ResponseEntity<>(blogService.findBlogsByAuthorContainingIgnoreCaseOrContentContainingIgnoreCaseOrBlogCategory_CategoryName(keyword),HttpStatus.OK);
    }
}

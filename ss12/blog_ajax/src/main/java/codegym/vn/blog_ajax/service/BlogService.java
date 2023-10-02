package codegym.vn.blog_ajax.service;

import codegym.vn.blog_ajax.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    void createBlog(Blog blog);
    void updateBlog(Blog blog);
    void deleteBlog(Blog blog);
    Blog findBlogById(String id);
    List<Blog> findAllBlog();
    Page<Blog> findAll(Pageable pageable);

//    List<Blog> findBlogsByAuthorContainingIgnoreCaseOrContentContainingIgnoreCaseOrBlogCategory_CategoryName(String keyword);
//List<Blog> findBlogsByAuthorContainingIgnoreCaseOrContentContainingIgnoreCaseOrBlogCategory_CategoryName(String author, String content, String categoryName);

    List<Blog> findBlogsByAuthorContainingIgnoreCaseOrContentContainingIgnoreCaseOrBlogCategory_CategoryName(String keyword);
}

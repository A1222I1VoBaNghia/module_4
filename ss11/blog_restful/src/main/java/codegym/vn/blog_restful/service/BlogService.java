package codegym.vn.blog_restful.service;

import codegym.vn.blog_restful.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface BlogService {
    void createBlog(Blog blog);
    void updateBlog(Blog blog);
    void deleteBlog(String id);
    Blog findBlogById(String id);
    List<Blog> findAllBlog();
    Page<Blog> findAll(Pageable pageable);
    List<Blog> findBlogByContentOrBlogCategoryOrAuthor(String content, String blogCategoryName, String author);

    List<Blog> findBlogByCategoryId(int id);
}

package codegym.vn.blog_restful.repository;

import codegym.vn.blog_restful.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,String> {
    List<Blog> findBlogByContentOrBlogCategoryOrAuthor(String content, String blogCategoryName, String author);
    List<Blog> findBlogsByBlogCategoryCategoryId(int id);
}

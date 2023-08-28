package codegym.vn.blogupdate.repository;

import codegym.vn.blogupdate.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,String> {
    List<Blog> findBlogByContentOrBlogCategoryOrAuthor(String content, String blogCategoryName, String author);
}

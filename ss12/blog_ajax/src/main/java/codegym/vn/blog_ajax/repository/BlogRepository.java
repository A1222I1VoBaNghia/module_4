package codegym.vn.blog_ajax.repository;

import codegym.vn.blog_ajax.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,String> {
    List<Blog> findBlogsByAuthorContainingIgnoreCaseOrContentContainingIgnoreCaseOrBlogCategory_CategoryName(String author, String content, String categoryName);
//    @Query("select b from Blog b where b.author=:keyword or b.content=:keyword or b.blogCategory.categoryName=:keyword")
//    List<Blog> findBlogsByAuthorContainingIgnoreCaseOrContentContainingIgnoreCaseOrBlogCategory_CategoryNameOr(String keyword);
}

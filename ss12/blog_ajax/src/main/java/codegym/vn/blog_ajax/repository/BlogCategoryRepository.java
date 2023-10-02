package codegym.vn.blog_ajax.repository;

import codegym.vn.blog_ajax.entity.BlogCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogCategoryRepository extends JpaRepository<BlogCategory, Integer> {
}

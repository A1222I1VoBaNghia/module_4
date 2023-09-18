package codegym.vn.blog_restful.repository;

import codegym.vn.blog_restful.entity.BlogCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogCategoryRepository extends JpaRepository<BlogCategory,Integer> {
}

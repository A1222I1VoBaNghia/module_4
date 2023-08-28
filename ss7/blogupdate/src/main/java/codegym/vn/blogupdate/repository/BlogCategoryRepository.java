package codegym.vn.blogupdate.repository;

import codegym.vn.blogupdate.entity.BlogCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogCategoryRepository extends JpaRepository<BlogCategory,Integer> {
}

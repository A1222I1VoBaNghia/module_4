package codegym.vn.blog.repository;

import codegym.vn.blog.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogRepository extends JpaRepository<Blog,Integer> {
}

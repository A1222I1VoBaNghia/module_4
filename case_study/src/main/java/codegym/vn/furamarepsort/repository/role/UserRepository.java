package codegym.vn.furamarepsort.repository.role;

import codegym.vn.furamarepsort.entity.role.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}

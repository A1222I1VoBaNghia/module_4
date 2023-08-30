package codegym.vn.form.service;

import codegym.vn.form.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface UserService {
    void create(User user);
    List<User> findAll();
    User findById(int id);
    Page<User> findAll(Pageable pageable);
}

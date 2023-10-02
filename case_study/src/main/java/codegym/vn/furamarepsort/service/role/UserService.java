package codegym.vn.furamarepsort.service.role;

import codegym.vn.furamarepsort.entity.role.User;

import java.util.List;

public interface UserService{
    void create (User user);
    void update (User user);
    void deleteByUserName (String username);
    List<User> findAll();
    User findByUsername(String username);
}

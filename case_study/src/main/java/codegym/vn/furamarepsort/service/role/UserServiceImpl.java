package codegym.vn.furamarepsort.service.role;

import codegym.vn.furamarepsort.entity.role.User;
import codegym.vn.furamarepsort.repository.role.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository repository;
    @Override
    public void create(User user) {
        repository.save(user);
    }

    @Override
    public void update(User user) {
        repository.save(user);
    }

    @Override
    public void deleteByUserName(String username) {
        repository.deleteById(username);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return repository.findById(username).orElse(null);
    }
}

package codegym.vn.cart.service;

import codegym.vn.cart.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Optional<Product> findByID(int id);
    void save(Product product);
    Page<Product> findAll(Pageable pageable);
}

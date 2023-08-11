package codegym.vn.productmanagement.repository;

import codegym.vn.productmanagement.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(int id);
    void create(Product product);
    void update(Product product);
    void delete(Product product);
    List<Product> findByName(String name);
}

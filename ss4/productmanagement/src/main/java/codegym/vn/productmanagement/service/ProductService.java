package codegym.vn.productmanagement.service;

import codegym.vn.productmanagement.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    void create(Product product);
    void update(Product product);
    void delete(Product product);
    List<Product> findByName(String name);

}

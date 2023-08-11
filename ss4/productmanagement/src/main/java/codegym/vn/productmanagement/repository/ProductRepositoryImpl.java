package codegym.vn.productmanagement.repository;

import codegym.vn.productmanagement.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements ProductRepository{
    private static Map<Integer, Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"KDR P/s",10, 25000.0,"organic"));
        productMap.put(2,new Product(2,"KDR Colgate",12, 35000.0,"chemistry"));
        productMap.put(3,new Product(3,"KDR Sensodyne",20, 55000.0,"organic"));
        productMap.put(4,new Product(4,"KDR Crest",40, 45000.0,"pre-organic"));
        productMap.put(5,new Product(5,"KDR Closeup",5, 20000.0,"chemistry"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void create(Product product) {
        if (!productMap.containsKey(product.getId())) {
            productMap.put(product.getId(), product);
        }
    }

    @Override
    public void update(Product product) {
        if (productMap.containsKey(product.getId())) {
            productMap.put(product.getId(), product);
        }
    }

    @Override
    public void delete(Product product) {
        if (productMap.containsKey(product.getId())) {
            productMap.remove(product.getId());
        }
    }

    @Override
    public List<Product> findByName(String name) {
        return new ArrayList<>(productMap.values());
    }
}

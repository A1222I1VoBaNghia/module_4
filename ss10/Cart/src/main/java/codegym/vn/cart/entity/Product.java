package codegym.vn.cart.entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    private int id;
    private String productName;
    private String image;
    @Column(columnDefinition = "TEXT")
    private String description;
    private double price;
    private double discountPrice;

    public Product() {
    }

    public Product(int id, String productName, String image, String description, double price, double discountPrice) {
        this.id = id;
        this.productName = productName;
        this.image = image;
        this.description = description;
        this.price = price;
        this.discountPrice = discountPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}

package codegym.vn.borrow_book.entiity;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Order {
    @Id
    @Range(min = 0, max = 99999)
    private int orderID;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateBorrow;
    @OneToMany(mappedBy = "order")
    private List<Book> books;

    public Order() {
    }

    public Order(int orderID, Date dateBorrow, List<Book> books) {
        this.orderID = orderID;
        this.dateBorrow = dateBorrow;
        this.books = books;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

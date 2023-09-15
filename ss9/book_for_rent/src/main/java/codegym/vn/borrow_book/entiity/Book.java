package codegym.vn.borrow_book.entiity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class Book {
    @Id
    @Column(columnDefinition = "varchar(10)")
    @Pattern(regexp = "B[0-9]{4}", message = "BookId phải có dạng Bxxxx")
    private String bookID;
    private String bookName;
    private String author;
    private int numberOfBook;
    @Column(columnDefinition = "TEXT")
    private String shortContent;
    @ManyToOne
    @JoinColumn(name = "orderID")
    private Order order;

    public Book() {
    }

    public Book(String bookID, String bookName, String author, int numberOfBook, String shortContent, Order order) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.numberOfBook = numberOfBook;
        this.shortContent = shortContent;
        this.order = order;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    public String getShortContent() {
        return shortContent;
    }

    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}

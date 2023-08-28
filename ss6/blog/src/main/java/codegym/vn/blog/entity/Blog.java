package codegym.vn.blog.entity;

import javax.persistence.*;

@Entity
@Table
public class Blog {
    @Id
    @GeneratedValue
    private int id;

    private String author;
    @Column(columnDefinition = "longtext")
    private String content;

    private String shortContent;

    public Blog(int id, String author, String content, String shortContent) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.shortContent = shortContent;
    }

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getShortContent() {
        return shortContent;
    }

    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }
}

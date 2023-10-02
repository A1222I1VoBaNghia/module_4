package codegym.vn.blog_ajax.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Blog {
    @Id
    @Column(columnDefinition = "varchar(20)")
    private String blogId;

    private String content;

    private String author;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datePublish;


    @ManyToOne
    @JoinColumn(name = "categoryId")
    private BlogCategory blogCategory;

    public Blog() {
    }

    public Blog(String blogId, String content, String author, Date datePublish, BlogCategory blogCategory) {
        this.blogId = blogId;
        this.content = content;
        this.author = author;
        this.datePublish = datePublish;
        this.blogCategory = blogCategory;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }

    public BlogCategory getBlogCategory() {
        return blogCategory;
    }

    public void setBlogCategory(BlogCategory blogCategory) {
        this.blogCategory = blogCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return blogId.equals(blog.blogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blogId);
    }
}

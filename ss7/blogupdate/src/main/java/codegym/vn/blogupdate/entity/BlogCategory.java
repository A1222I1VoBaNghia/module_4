package codegym.vn.blogupdate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class BlogCategory {
    @Id
    @GeneratedValue
    private int categoryId;

    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Blog> blogs;

    public BlogCategory() {
    }

    public BlogCategory(int categoryId, String categoryName, List<Blog> blogs) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.blogs = blogs;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}

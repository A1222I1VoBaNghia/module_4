package codegym.vn.pic_of_day.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue
    private int id;
    private int review;
    private String author;
    private String feedback;
    private long numOfLike;

    public Comment() {
    }

    public Comment(int id, int review, String author, String feedback, long numOfLike) {
        this.id = id;
        this.review = review;
        this.author = author;
        this.feedback = feedback;
        this.numOfLike = numOfLike;
    }

    public Comment(int id, int review, String author, String feedback) {
        this.id = id;
        this.review = review;
        this.author = author;
        this.feedback = feedback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public long getNumOfLike() {
        return numOfLike;
    }

    public void setNumOfLike(long numOfLike) {
        this.numOfLike = numOfLike;
    }
}

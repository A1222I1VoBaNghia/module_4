package codegym.vn.pic_of_day.repository;

import codegym.vn.pic_of_day.entity.Comment;

import java.util.List;

public interface CommentRepository {
    void createComment(Comment comment);
    List<Comment> findAll();
    void updateLike(int id);
}

package codegym.vn.pic_of_day.service;

import codegym.vn.pic_of_day.entity.Comment;

import java.util.List;

public interface CommentService {
    void createComment(Comment comment);
    List<Comment> findAll();
    void updateLike(int id);
}

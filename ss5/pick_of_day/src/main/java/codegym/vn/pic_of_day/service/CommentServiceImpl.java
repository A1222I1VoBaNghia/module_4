package codegym.vn.pic_of_day.service;

import codegym.vn.pic_of_day.entity.Comment;
import codegym.vn.pic_of_day.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentRepository commentRepository;
    @Override
    public void createComment(Comment comment) {
        commentRepository.createComment(comment);
    }

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public void updateLike(int id) {
        commentRepository.updateLike(id);
    }
}

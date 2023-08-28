package codegym.vn.pic_of_day.repository;

import codegym.vn.pic_of_day.entity.Comment;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class CommentRepositoryImpl implements CommentRepository{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void createComment(Comment comment) {
        entityManager.persist(comment);
    }

    @Override
    public List<Comment> findAll() {
        return entityManager.createQuery("from Comment c").getResultList();
    }

    @Override
    public void updateLike(int id) {
        Comment comment = entityManager.find(Comment.class, id);
        comment.setNumOfLike(comment.getNumOfLike() + 1);
        entityManager.merge(comment);
    }
}

package codegym.vn.upmusic.repository;

import codegym.vn.upmusic.entity.Music;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class MusicRepositoryImpl implements MusicRepository{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void create(Music music) {
        entityManager.persist(music);
    }

    @Override
    public void delete(Music music) {
        entityManager.remove(music);
    }

    @Override
    public void update(Music music) {
        entityManager.merge(music);
    }

    @Override
    public Music findById(String id) {
        return entityManager.find(Music.class,id);
    }

    @Override
    public List<Music> findAll() {
        return entityManager.createQuery("from Music m").getResultList();
    }
}

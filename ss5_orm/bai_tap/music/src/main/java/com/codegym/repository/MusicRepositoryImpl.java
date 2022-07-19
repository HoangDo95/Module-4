package com.codegym.repository;

import com.codegym.model.Music;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class MusicRepositoryImpl implements MusicRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Music> showList() {
        TypedQuery<Music> query = ConnectionUtil.entityManager.createQuery("select m from Music as m", Music.class);
        return query.getResultList();
    }

    @Override
    public void create(Music music) {
        entityManager.persist(music);
    }

    @Override
    public Music findById(int id) {
        TypedQuery<Music> query = ConnectionUtil.entityManager.createQuery("select m from Music as m where  m.id=:id", Music.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void edit(Music music) {
        EntityTransaction entityTransaction = ConnectionUtil.entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(music);
        entityTransaction.commit();
    }

    @Override
    public void delete(int id) {
        EntityTransaction entityTransaction = ConnectionUtil.entityManager.getTransaction();
        entityTransaction.begin();
        ConnectionUtil.entityManager.remove(ConnectionUtil.entityManager.find(Music.class, id));
        entityTransaction.commit();
    }
}

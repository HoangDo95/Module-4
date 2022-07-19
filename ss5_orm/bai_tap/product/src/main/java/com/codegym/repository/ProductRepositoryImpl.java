package com.codegym.repository;

import com.codegym.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = ConnectionUtil.entityManager.createQuery("select p from Product as p", Product.class);
        return query.getResultList();
    }

    @Override
    public void create(Product product) {
        entityManager.persist(product);
    }

    @Override
    public Product findById(int id) {
        TypedQuery<Product> query = ConnectionUtil.entityManager.createQuery("select p from Product as p where  p.id=:id", Product.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void edit(Product product) {
        entityManager.merge(product);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(Product.class, id));
    }

    @Override
    public List<Product> findByName(String name) {
        return null;
    }


}

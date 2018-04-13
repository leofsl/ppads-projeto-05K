package com.munka.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
public abstract class GenericDAO<T> {

    public EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MunkaAppDALPU");
        return emf.createEntityManager();
    }

    public abstract boolean create(T obj);

    public abstract T find(Long id);

    public abstract List<T> findAll();

    public abstract T update(T obj);

    public abstract boolean delete(T obj);
}

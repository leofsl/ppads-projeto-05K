package com.munka.dao;

import com.munka.entities.Categoria;
import com.munka.entities.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
public class CategoriaDAO extends GenericDAO<Categoria> {

    @Override
    public boolean create(Categoria obj) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception ex) {
            return false;
        } finally {
            em.close();
        }
        return true;
    }

    @Override
    public Categoria find(Long id) {
        Categoria u = new Categoria();
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            TypedQuery<Categoria> query = em.createNamedQuery("Categoria.findByIdcategoria", Categoria.class);
            query.setParameter("idcategoria", id);
            u = query.getSingleResult();
            em.getTransaction().commit();
        } catch (Exception ex) {
            return u;
        } finally {
            em.close();
        }
        return u;
    }

    @Override
    public List<Categoria> findAll() {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        TypedQuery<Categoria> query = em.createNamedQuery("Categoria.findAll", Categoria.class);
        List<Categoria> categorias = query.getResultList();
        em.getTransaction().commit();
        em.clear();
        em.close();
        return categorias;
    }

    @Override
    public Categoria update(Categoria obj) {
        Categoria u = new Categoria();
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            u = em.merge(obj);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            return u;
        } finally {
            em.close();
        }
        return u;
    }

    @Override
    public boolean delete(Categoria obj) {
        EntityManager em = getEntityManager();
        Categoria u = new Categoria();
        try {
            em.getTransaction().begin();
            if (!em.contains(obj)) {
                u = em.merge(obj);
            }
            em.remove(u);
            em.getTransaction().commit();
        } catch (Exception ex) {
            return false;
        } finally {
            em.close();
        }
        return true;
    }
}

package com.munka.dao;

import com.munka.entities.Comentario;
import com.munka.entities.Instituicao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
public class InstituicaoDAO extends GenericDAO<Instituicao> {

    @Override
    public boolean create(Instituicao obj) {
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
    public Instituicao find(Long id) {
        Instituicao u = new Instituicao();
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            TypedQuery<Instituicao> query = em.createNamedQuery("Instituicao.findByIdinstituicao", Instituicao.class);
            query.setParameter("idinstituicao", id);
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
    public List<Instituicao> findAll() {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        TypedQuery<Instituicao> query = em.createNamedQuery("Instituicao.findAll", Instituicao.class);
        List<Instituicao> instituicoes = query.getResultList();
        em.getTransaction().commit();
        em.clear();
        em.close();
        return instituicoes;
    }

    @Override
    public Instituicao update(Instituicao obj) {
        Instituicao u = new Instituicao();
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
    public boolean delete(Instituicao obj) {
        EntityManager em = getEntityManager();
        Instituicao u = new Instituicao();
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

package com.munka.dao;

import com.munka.entities.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
public class UsuarioDAO extends GenericDAO<Usuario> {
    
    @Override
    public boolean create(Usuario obj) {
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
    public Usuario find(Long id) {
        Usuario u = new Usuario();
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            TypedQuery<Usuario> query = em.createNamedQuery("Usuario.findByIdusuario", Usuario.class);
            query.setParameter("idusuario", id);
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
    public List<Usuario> findAll() {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        TypedQuery<Usuario> query = em.createNamedQuery("Usuario.findAll", Usuario.class);
        List<Usuario> usuarios = query.getResultList();
        em.getTransaction().commit();
        em.clear();
        em.close();
        return usuarios;
    }
    
    @Override
    public Usuario update(Usuario obj) {
        Usuario u = null;
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
    public boolean delete(Usuario obj) {
        EntityManager em = getEntityManager();
        Usuario u = new Usuario();
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
    
    public Usuario autenticar(String email, String senha) {
        Usuario u = null;
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            TypedQuery<Usuario> query = em.createNamedQuery("Usuario.findByEmailAndSenha", Usuario.class);
            query.setParameter("email", email);
            query.setParameter("senha", senha);
            u = (Usuario) query.getResultList().get(0);
            em.getTransaction().commit();
        } catch (Exception ex) {
            return u;
        } finally {
            em.close();
        }
        return u;
    }
}

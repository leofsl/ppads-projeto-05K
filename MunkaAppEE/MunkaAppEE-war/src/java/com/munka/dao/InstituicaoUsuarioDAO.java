package com.munka.dao;

import static com.munka.dashboards.TabelaPosts_.status;
import com.munka.entities.InstituicaoUsuario;
import com.munka.entities.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
public class InstituicaoUsuarioDAO extends GenericDAO<InstituicaoUsuario> {
    
    @Override
    public boolean create(InstituicaoUsuario obj) {
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
    
    public boolean approve(int fkinstituicao, int fkusuario) {
        boolean result = false;
        String sql = "INSERT INTO instituicao_usuario (FKINSTITUICAO, FKUSUARIO) VALUES (?,?); ";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, fkinstituicao);
            ps.setInt(2, fkusuario);
            ps.executeUpdate();
            em.getTransaction().commit();
            result = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            result = false;
        }
        return result;
    }
    
    public boolean negar(String idUsuario) {
        boolean result = false;
        String sql = "UPDATE usuario SET TIPO_USUARIO = -1 WHERE IDUSUARIO = ?;";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idUsuario));
            ps.executeUpdate();
            em.getTransaction().commit();
            result = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            result = false;
        }
        return result;
    }
    
    public boolean alterarEmpresa(String idUsuario, String idEmpresa) {
        boolean result = false;
        String sql = "{CALL ALTERAR_EMPRESA(?,?)}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idUsuario));
            ps.setInt(2, Integer.parseInt(idEmpresa));
            ps.executeUpdate();
            em.getTransaction().commit();
            result = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            result = false;
        }
        return result;
    }
    
    public boolean deleteByUsuarioId(String idUsuario) {
        boolean result = false;
        String sql = "DELETE FROM instituicao_usuario WHERE FKUSUARIO = ?;";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idUsuario));
            ps.executeUpdate();
            em.getTransaction().commit();
            result = true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            result = false;
        }
        return result;
    }
    
    public InstituicaoUsuario findByIdInstituicao(Long id) {
        InstituicaoUsuario u = new InstituicaoUsuario();
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            TypedQuery<InstituicaoUsuario> query = em.createNamedQuery("InstituicaoUsuario.findByIdinstituicaousuario", InstituicaoUsuario.class);
            query.setParameter("idinstituicaousuario", id);
            u = query.getSingleResult();
            em.getTransaction().commit();
        } catch (Exception ex) {
            return u;
        } finally {
            em.close();
        }
        return u;
    }
    
    public InstituicaoUsuario findByIdUsuario(Usuario obj) {
        InstituicaoUsuario u = new InstituicaoUsuario();
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            TypedQuery<InstituicaoUsuario> query = em.createNamedQuery("InstituicaoUsuario.findByUsuario", InstituicaoUsuario.class);
            query.setParameter("fkusuario", obj);
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
    public List<InstituicaoUsuario> findAll() {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        TypedQuery<InstituicaoUsuario> query = em.createNamedQuery("InstituicaoUsuario.findAll", InstituicaoUsuario.class);
        List<InstituicaoUsuario> categorias = query.getResultList();
        em.getTransaction().commit();
        em.clear();
        em.close();
        return categorias;
    }
    
    @Override
    public InstituicaoUsuario update(InstituicaoUsuario obj) {
        InstituicaoUsuario u = new InstituicaoUsuario();
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
    public boolean delete(InstituicaoUsuario obj) {
        EntityManager em = getEntityManager();
        InstituicaoUsuario u = new InstituicaoUsuario();
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
    
    @Override
    public InstituicaoUsuario find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

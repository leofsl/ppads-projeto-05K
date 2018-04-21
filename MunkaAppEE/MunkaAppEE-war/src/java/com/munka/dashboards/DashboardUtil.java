package com.munka.dashboards;

import com.munka.entities.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
public class DashboardUtil {

    private EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MunkaAppDALPU");
        return emf.createEntityManager();
    }

    public List<Grafico> getGraficoStatus() {
        List<Grafico> valores = new ArrayList();
        Grafico g = null;
        String sql = "{CALL QTD_CHAM_POR_STATUS()}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            ResultSet rs = em.unwrap(Connection.class).prepareCall(sql).executeQuery();
            while (rs.next()) {
                g = new Grafico(rs.getString("NOME_STATUS"), rs.getInt("QTD"));
                valores.add(g);
            }
            em.getTransaction().commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return valores;
        }
        return valores;
    }

    public List<Grafico> getGraficoZelador() {
        List<Grafico> valores = new ArrayList();
        Grafico g = null;
        String sql = "{CALL QTD_CHAM_POR_ZELADOR()}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            ResultSet rs = em.unwrap(Connection.class).prepareCall(sql).executeQuery();
            while (rs.next()) {
                g = new Grafico(rs.getString("NOME_USUARIO"), rs.getInt("QTD"));
                valores.add(g);
            }
            em.getTransaction().commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return valores;
        }
        return valores;
    }

    public List<TabelaPosts> getTabelaPosts() {
        List<TabelaPosts> valores = new ArrayList();
        TabelaPosts t = null;
        String sql = "{CALL POSTS_MAIS_UPADOS()}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            ResultSet rs = em.unwrap(Connection.class).prepareCall(sql).executeQuery();
            while (rs.next()) {
                t = new TabelaPosts(rs.getString("ASSUNTO"),
                        rs.getString("NOME_CATEGORIA"),
                        rs.getString("NOME_STATUS"),
                        rs.getInt("IDPOST"));

                valores.add(t);
            }
            em.getTransaction().commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return valores;
        }
        return valores;
    }

    public List<TabelaPosts> getTabelaPostsByCategoria(int categoria) {
        List<TabelaPosts> valores = new ArrayList();
        TabelaPosts t = null;
        String sql = "{CALL POSTS_POR_CATEGORIA(?)}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, categoria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                t = new TabelaPosts(rs.getString("ASSUNTO"),
                        rs.getString("NOME_CATEGORIA"),
                        rs.getString("NOME_STATUS"),
                        rs.getInt("IDPOST"));

                valores.add(t);
            }
            em.getTransaction().commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return valores;
        }
        return valores;
    }

    public List<TabelaPosts> getTabelaPostsByStatus(int status) {
        List<TabelaPosts> valores = new ArrayList();
        TabelaPosts t = null;
        String sql = "{CALL POSTS_POR_STATUS(?)}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, status);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                t = new TabelaPosts(rs.getString("ASSUNTO"),
                        rs.getString("NOME_CATEGORIA"),
                        rs.getString("NOME_STATUS"),
                        rs.getInt("IDPOST"));

                valores.add(t);
            }
            em.getTransaction().commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return valores;
        }
        return valores;
    }

    public List<TabelaPosts> getTabelaPostsByStatusECategoria(int status, int categoria) {
        List<TabelaPosts> valores = new ArrayList();
        TabelaPosts t = null;
        String sql = "{CALL POSTS_POR_STATUS_E_CAT(?,?)}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, status);
            ps.setInt(2, categoria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                t = new TabelaPosts(rs.getString("ASSUNTO"),
                        rs.getString("NOME_CATEGORIA"),
                        rs.getString("NOME_STATUS"),
                        rs.getInt("IDPOST"));

                valores.add(t);
            }
            em.getTransaction().commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return valores;
        }
        return valores;
    }

    public List<TabelaPosts> getTabelaMeusPosts(int idUsuario) {
        List<TabelaPosts> valores = new ArrayList();
        TabelaPosts t = null;
        String sql = "{CALL MEUS_POSTS(?)}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                t = new TabelaPosts(rs.getString("ASSUNTO"),
                        rs.getString("NOME_CATEGORIA"),
                        rs.getString("NOME_STATUS"),
                        rs.getInt("IDPOST"));

                valores.add(t);
            }
            em.getTransaction().commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return valores;
        }
        return valores;
    }

    public List<TabelaPosts> getTabelaMeusPostsByStatus(int idUsuario, int status) {
        List<TabelaPosts> valores = new ArrayList();
        TabelaPosts t = null;
        String sql = "{CALL MEUS_POSTS_POR_STATUS(?,?)}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, idUsuario);
            ps.setInt(2, status);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                t = new TabelaPosts(rs.getString("ASSUNTO"),
                        rs.getString("NOME_CATEGORIA"),
                        rs.getString("NOME_STATUS"),
                        rs.getInt("IDPOST"));

                valores.add(t);
            }
            em.getTransaction().commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return valores;
        }
        return valores;
    }

    public List<TabelaPosts> getTabelaMeusPostsByStatusECat(int idUsuario, int status, int categoria) {
        List<TabelaPosts> valores = new ArrayList();
        TabelaPosts t = null;
        String sql = "{CALL MEUS_POSTS_POR_CAT_E_STATUS(?,?,?)}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, idUsuario);
            ps.setInt(2, status);
            ps.setInt(3, categoria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                t = new TabelaPosts(rs.getString("ASSUNTO"),
                        rs.getString("NOME_CATEGORIA"),
                        rs.getString("NOME_STATUS"),
                        rs.getInt("IDPOST"));

                valores.add(t);
            }
            em.getTransaction().commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return valores;
        }
        return valores;
    }

    public List<TabelaPosts> getTabelaMeusPostsByCategoria(int idUsuario, int categoria) {
        List<TabelaPosts> valores = new ArrayList();
        TabelaPosts t = null;
        String sql = "{CALL MEUS_POSTS_POR_CATEGORIA(?,?)}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, idUsuario);
            ps.setInt(2, categoria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                t = new TabelaPosts(rs.getString("ASSUNTO"),
                        rs.getString("NOME_CATEGORIA"),
                        rs.getString("NOME_STATUS"),
                        rs.getInt("IDPOST"));

                valores.add(t);
            }
            em.getTransaction().commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return valores;
        }
        return valores;
    }

    public List<TabelaUsuario> getTabelaUsuarios(int idInstituicao) {
        List<TabelaUsuario> valores = new ArrayList();
        TabelaUsuario t = null;
        String sql = "{CALL USUARIOS_PARA_MOD(?)}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, idInstituicao);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                t = new TabelaUsuario(rs.getString("NOME_USUARIO"),
                        rs.getString("IDENT_INTERNO_EMPRESA"),
                        rs.getString("IDUSUARIO"));

                valores.add(t);
            }
            em.getTransaction().commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return valores;
        }
        return valores;
    }

    public List<TabelaUsuario> getTabelaUsuariosAprov(int idInstituicao) {
        List<TabelaUsuario> valores = new ArrayList();
        TabelaUsuario t = null;
        String sql = "{CALL USUARIOS_PARA_APROVACAO(?)}";
        try {
            EntityManager em = getEntityManager();
            em.getTransaction().begin();
            PreparedStatement ps = em.unwrap(Connection.class).prepareStatement(sql);
            ps.setInt(1, idInstituicao);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                t = new TabelaUsuario(rs.getString("NOME_USUARIO"),
                        rs.getString("IDENT_INTERNO_EMPRESA"),
                        rs.getString("IDUSUARIO"));

                valores.add(t);
            }
            em.getTransaction().commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return valores;
        }
        return valores;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.munka.beans;

import com.munka.dao.UsuarioDAO;
import com.munka.dashboards.DashboardUtil;
import com.munka.dashboards.TabelaPosts;
import com.munka.entities.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 */
@Stateless
@Path("/users")
public class UsuarioBean implements UsuarioBeanLocal {

    @GET
    @Path("/test")
    @Override
    public String test() {
        return "ola";
    }

    @GET
    @Path("/findAll")
    @Override
    public List<Usuario> findAll() {
        return new UsuarioDAO().findAll();
    }

    @GET
    @Path("/posts")
    @Override
    public List<TabelaPosts> getPostsUsuario() {
        return new DashboardUtil().getTabelaMeusPosts(1);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.munka.beans;

import com.munka.dao.CategoriaDAO;
import com.munka.entities.Categoria;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 */
@Stateless
@Path("/categorias")
public class CategoriaBean implements CategoriaBeanLocal {

    @GET
    @Path("/findAll")
    @Override
    public List<Categoria> findAll() {
        return new CategoriaDAO().findAll();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}

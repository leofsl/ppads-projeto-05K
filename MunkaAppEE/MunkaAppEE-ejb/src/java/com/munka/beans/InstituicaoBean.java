/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.munka.beans;

import com.munka.dao.InstituicaoDAO;
import com.munka.entities.Instituicao;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 */
@Stateless
@Path("/instituicao")
public class InstituicaoBean implements InstituicaoBeanLocal {

    @GET
    @Path("/findAll")
    @Override
    public List<Instituicao> findAll() {
        return new InstituicaoDAO().findAll();
    }

}

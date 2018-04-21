/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.munka.beans;

import com.munka.dashboards.DashboardUtil;
import com.munka.dashboards.Grafico;
import com.munka.dashboards.TabelaPosts;
import com.munka.dashboards.TabelaUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 */
@Stateless
@Path("/graficos")
public class DashboardBean implements DashboardBeanLocal {

    @GET
    @Path("/graficoStatus")
    @Override
    public List<Grafico> getGraficoStatus() {
        return new DashboardUtil().getGraficoStatus();
    }

    @GET
    @Path("/graficoZelador")
    @Override
    public List<Grafico> getGraficoZelador() {
        return new DashboardUtil().getGraficoZelador();
    }

    @GET
    @Path("/tabelaPosts")
    @Override
    public List<TabelaPosts> getTabelaPosts() {
        return new DashboardUtil().getTabelaPosts();
    }

    @GET
    @Path("/tabelaPosts/{id}")
    @Override
    public List<TabelaUsuario> getTabelaUsuarios(@PathParam("id") String id) {
        return new DashboardUtil().getTabelaUsuarios(Integer.parseInt(id));
    }

    @GET
    @Path("/tabelaMeusPosts/{id}")
    @Override
    public List<TabelaPosts> getTabelaMeusPosts(@PathParam("id") String id) {
        return new DashboardUtil().getTabelaMeusPosts(Integer.parseInt(id));
    }

    @GET
    @Path("/tabelaMeusPostsPorCategoria/{idUsuario}/{idCategoria}")
    @Override
    public List<TabelaPosts> getTabelaPostsByCategoria(@PathParam("idUsuario") String idUsuario, @PathParam("idCategoria") String idCategoria) {
        return new DashboardUtil().getTabelaMeusPostsByCategoria(Integer.parseInt(idUsuario), Integer.parseInt(idCategoria));
    }

    @GET
    @Path("/tabelaMeusPostsPorStatus/{idUsuario}/{idStatus}")
    @Override
    public List<TabelaPosts> getTabelaPostsByStatus(@PathParam("idUsuario") String idUsuario, @PathParam("idStatus") String idStatus) {
        return new DashboardUtil().getTabelaMeusPostsByStatus(Integer.parseInt(idUsuario), Integer.parseInt(idStatus));
    }

    @GET
    @Path("/tabelaMeusPostsPorStatusECategoria/{idUsuario}/{idStatus}")
    @Override
    public List<TabelaPosts> getTabelaPostsByStatusECategoria(@PathParam("idUsuario") String idUsuario, @PathParam("idStatus") String idStatus, @PathParam("idCategoria") String idCategoria) {
        return new DashboardUtil().getTabelaMeusPostsByStatusECat(Integer.parseInt(idUsuario), Integer.parseInt(idStatus), Integer.parseInt(idCategoria));
    }

    @GET
    @Path("/tabelaTodosPostsPorStatus/{idStatus}")
    @Override
    public List<TabelaPosts> getTodosPostsByStatus(@PathParam("idStatus") String idStatus) {
        return new DashboardUtil().getTabelaPostsByStatus(Integer.parseInt(idStatus));
    }

    @GET
    @Path("/tabelaTodosPostsPorCategoria/{idCategoria}")
    @Override
    public List<TabelaPosts> getTodosPostsByCategoria(@PathParam("idCategoria") String idCategoria) {
        return new DashboardUtil().getTabelaPostsByCategoria(Integer.parseInt(idCategoria));
    }

    @GET
    @Path("/tabelaTodosPostsPorStatusECategoria/{idStatus}/{idCategoria}}")
    @Override
    public List<TabelaPosts> getTodosPostsByStatusECategoria(@PathParam("idStatus") String idStatus, @PathParam("idCategoria") String idCategoria) {
        return new DashboardUtil().getTabelaPostsByStatusECategoria(Integer.parseInt(idStatus), Integer.parseInt(idCategoria));
    }

}

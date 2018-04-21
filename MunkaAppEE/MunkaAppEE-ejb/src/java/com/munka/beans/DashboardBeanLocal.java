/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.munka.beans;

import com.munka.dashboards.Grafico;
import com.munka.dashboards.TabelaPosts;
import com.munka.dashboards.TabelaUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 */
@Local
public interface DashboardBeanLocal {

    List<Grafico> getGraficoStatus();

    List<Grafico> getGraficoZelador();

    List<TabelaPosts> getTabelaPosts();

    List<TabelaUsuario> getTabelaUsuarios(String id);

    List<TabelaPosts> getTabelaMeusPosts(String id);

    List<TabelaPosts> getTabelaPostsByCategoria(String idUsuario, String idCategoria);

    List<TabelaPosts> getTabelaPostsByStatus(String idUsuario, String idStatus);

    List<TabelaPosts> getTabelaPostsByStatusECategoria(String idUsuario, String idStatus, String idCategoria);

    List<TabelaPosts> getTodosPostsByStatus(String idStatus);

    List<TabelaPosts> getTodosPostsByCategoria(String idCategoria);

    List<TabelaPosts> getTodosPostsByStatusECategoria(String idStatus, String idCategoria);

}

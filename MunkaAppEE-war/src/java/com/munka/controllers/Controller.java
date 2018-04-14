package com.munka.controllers;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
public interface Controller {

    /**
     * Executa uma ação de acordo com a necessidade.
     */
    public void execute();

    /**
     * Inicializa a(s) variável(is) de um controller.
     *
     * @param request
     */
    public void init(HttpServletRequest request);

    /**
     * Retorna uma String com a página de resposta que será usada para exibir os resultados.
     *
     * @return
     */
    public String getReturnPage();
}

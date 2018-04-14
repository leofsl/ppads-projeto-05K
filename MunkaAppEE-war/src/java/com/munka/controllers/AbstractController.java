package com.munka.controllers;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
public abstract class AbstractController implements Controller {

    private HttpServletRequest request;
    protected String returnPage;

    public void init(HttpServletRequest request) {
        this.setRequest(request);
    }

    /**
     * Define a página de resposta
     *
     * @param page
     */
    public void setReturnPage(String page) {
        returnPage = page;
    }

    public String getReturnPage() {
        return returnPage;
    }

    /**
     * Retorna um objeto com as requisições HTTP
     *
     * @return
     */
    public HttpServletRequest getRequest() {
        return request;
    }

    /**
     * Inicializa a variável relacionada às requisições com as requisições passadas por parâmetro
     *
     * @param request
     */
    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void setSessionValues(String name, Object value, String returnPage) {
        this.getRequest().getSession().setAttribute(name, value);
        this.setReturnPage(returnPage);
    }

    public void setSessionValues(String name, Object value) {
        this.getRequest().getSession().setAttribute(name, value);
    }

}

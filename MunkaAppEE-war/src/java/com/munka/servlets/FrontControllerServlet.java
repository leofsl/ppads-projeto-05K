/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.munka.servlets;

import com.munka.controllers.Controller;
import com.munka.controllers.ControllerFactory;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 */
public class FrontControllerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=ISO-8859-1");
        request.setCharacterEncoding("ISO-8859-1");
        try (PrintWriter out = response.getWriter()) {
            //Pega o parâmetro control enviado pela requisição HTTP
            String controller = request.getParameter("control");
            //Pega um objeto de alguma classe que implemente a interface Controller
            
            Controller control = ControllerFactory.getControllerByFullClassName(controller);
            //Inicializa o controller
            control.init(request);
            //Executa a ação
            control.execute();
         // testa agora 
            response.sendRedirect(request.getContextPath() + control.getReturnPage());
            
            // aqui o seu era assim :estava settando isso statico, no servido o root muda, ou seja o caminho da sua applicacao muda
            // e pra isso tem que pegar o caminho dinamico usando request.getContextPath.. assim tanto faz onde a apliacao vai estar.
            //vai redirecionar para o caminho (dinamico) da sua applicacao + o return.
            // hahahahh ta bom entao.. whats faloo
           // response.sendRedirect("/MonkaAppEE-war" + control.getReturnPage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

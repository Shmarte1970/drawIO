/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.java.web.servetsimple;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pedro Ríos
 */
public class FormularioSegundoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             Enumeration<String> parametros ;
            /* TODO output your page here. You may use following sample code. */
            String parametro, valor;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejemplo de servlet</title>");            
            out.println("</head>");
            out.println("<body bgcolor=#ffffff>");
            out.println("<TABLET BORDER=2>");
            parametros = request.getParameterNames();
            while (parametros.hasMoreElements()){
                parametro = (String) parametros.nextElement();
                valor = request.getParameter(parametro);
                out.println("<tr><td>nombre: " + parametro +"</td>");
                out.println("<td>valor: "+valor+"</td></tr>");
            }
            out.println("</TABLE><br><br>");
            out.println("<a href=http://localhost:8081/SegundoServlet/index.html>Regresar</a>");
            
           /* out.println("<h1>Servlet FormularioSegundoServlet at " + request.getContextPath() + "</h1>");*/
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
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
    @Override  protected void doGet{HttpServletRequest, request,  HttpServletResponse 
            response)
                throws ServletException, IOException {
                processRequest(request, response);
    }
}
}

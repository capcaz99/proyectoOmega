/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author carlosaburto
 */
public class loginServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            String username = request.getParameter("username"), 
                   password = request.getParameter("password"),
                   passwordDB = "";
           if( username != null &&  password != null){
               try {
                   System.out.println("Verificar cuenta");
                   
                   Class.forName("org.apache.derby.jdbc.ClientDriver");
                   Connection con = DriverManager.getConnection(
                                    "jdbc:derby://localhost:1527/DBWizard",
                                    "root",
                                    "root");
                   Statement query = con.createStatement();
                   ResultSet rs = query.executeQuery("SELECT * FROM USERS WHERE USERNAME ="+"'"+username+"'");
                   
                   while(rs.next())
                    passwordDB = rs.getString("PASSWORD");
                   
                   if(password.equals(passwordDB)){
                       
                    System.out.println("Login exitoso!");
                    
                    HttpSession mySession = request.getSession();
                    mySession.setAttribute("username", username);
                    mySession.setMaxInactiveInterval(20);
                    response.sendRedirect("home.jsp");
                    
                       
                   }else{
                       System.out.println("Contraseña - usuario incorrecto");
                       response.sendRedirect("index.html");
                   }
               
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
               } catch (SQLException ex) {
                   Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
               } 
            } else{
               System.out.println("Vacio");
               response.sendRedirect("index.html");
            }
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

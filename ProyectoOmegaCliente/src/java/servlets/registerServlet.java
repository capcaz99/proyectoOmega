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
public class registerServlet extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int id = -1;
            String username = request.getParameter("username"),
                    password = request.getParameter("password"),
                    password2 = request.getParameter("password2");
            if (username != null && password != null && password2 != null) {
                if (password.equals(password2)) {

                    try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con = DriverManager.getConnection(
                                "jdbc:derby://localhost:1527/DBWizard",
                                "root",
                                "root");
                        Statement query = con.createStatement();
                        ResultSet rs = query.executeQuery("SELECT MAX(USERID) FROM USERS");

                        while (rs.next()) {
                            id = Integer.parseInt(rs.getString(1)) + 1;
                        }

                        query.executeUpdate("INSERT INTO USERS VALUES('" + username + "','" + password + "'," + id + ")");

                        HttpSession mySession = request.getSession();
                        mySession.setAttribute("username", username);
                        mySession.setMaxInactiveInterval(20);
                        response.sendRedirect("home.jsp");

                        con.commit();
                        con.close();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    System.out.println("Contraseñas mal");
                    response.sendRedirect("crearCuenta.html");
                }
            } else {
                System.out.println("Null");
                response.sendRedirect("crearCuenta.html");
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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

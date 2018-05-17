<%-- 
    Document   : home
    Created on : 08-may-2018, 18:37:18
    Author     : carlosaburto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            HttpSession mySession = request.getSession();
            String username = (String) mySession.getAttribute("username");
            String userid   = (String) mySession.getAttribute("userid");
        %>
        
        <h1>Bienvenido <%= username %></h1>
    </body>
</html>

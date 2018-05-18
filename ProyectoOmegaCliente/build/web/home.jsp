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

        <script>
            
            function callRESTfulWebService(id, method, target) {
                var ajaxRequest;
                if (window.XMLHttpRequest) {
                    ajaxRequest = new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
                } else {
                    ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
                }
                ajaxRequest.onreadystatechange = function () {
                    if (ajaxRequest.readyState == 4 &&
                            (ajaxRequest.status == 200 || ajaxRequest.status == 204)) {
                        document.getElementById(id).innerHTML = ajaxRequest.responseText;
                    }
                }
                ajaxRequest.open(method, target, true /*async*/);
                ajaxRequest.setRequestHeader("Content-Type", "text/html");
                ajaxRequest.send();
            }
 
        
        </script>

    </head>
     <%
            HttpSession mySession = request.getSession();
            String username = (String) mySession.getAttribute("username");
            String userid = (String) mySession.getAttribute("userid");
            String funcion = "callRESTfulWebService('tablas','GET','http://localhost:8080/ProyectoOmegaRest/webresources/tablas/" +userid + "')";
        %>
    <body>

        <h1>Bienvenido <%= username%></h1>
        <button onclick="<%= funcion %>">Ver Tablas creadas</button>
        <h2>Las tablas que has creado son: </h2>
        <div id="tablas"></div>

    </body>
</html>

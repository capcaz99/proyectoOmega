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
                        var resString = ajaxRequest.responseText;
                        var result = resString.split("_");
                        var final = "";
                        var str = "";
                        for (var i = 0; i < result.length; i++) {
                            str1 = "callObtener('registros','GET','http://localhost:8080/ProyectoOmegaRest/webresources/registros/" + result[i] + "/1/1')";
                            final = final + result[i] + "<button onclick=" + str1 + ">Ver registros</button><br>";
                        }
                        
                        document.getElementById(id).innerHTML = final;
                    }
                }
                ajaxRequest.open(method, target, true /*async*/);
                ajaxRequest.setRequestHeader("Content-Type", "text/html");
                ajaxRequest.send();
            }

            function callObtener(id, method, target) {
                var ajaxRequest;
                if (window.XMLHttpRequest) {
                    ajaxRequest = new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
                } else {
                    ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
                }
                ajaxRequest.onreadystatechange = function () {
                    if (ajaxRequest.readyState == 4 &&
                            (ajaxRequest.status == 200 || ajaxRequest.status == 204)) {
                        var JSONObject = JSON.parse(ajaxRequest.responseText);
                        var nombres = JSONObject.nombres;
                        var datos = JSONObject.datos;
                        var tipos = JSONObject.tipos;
                        var tabla = JSONObject.tabla;
                        var txt = "<table id='tabla' name='"+tabla+"'>";
                        var cantidad = datos.length;
                        var medida = cantidad / nombres.length;
                        var drop = "<select id='campo'>";

                        txt = txt + "<tr>";
                        for (var j = 0; j < nombres.length; j++) {
                            txt = txt + "<th>" + nombres[j] + "</th>";
                            drop = drop + "<option value='" + tipos[j]+ "_" + nombres[j]  + "'>" + nombres[j] + "</option>";
                        }
                        txt = txt + "</tr>";
                        drop = drop + "</select>";

                        for (var k = 0; k < medida; k++) {
                            txt = txt + "<tr>";
                            for (var r = 0; r < nombres.length; r++)
                                txt = txt + "<th>" + datos[k + (medida * r)] + "</th>";
                            txt = txt + "</tr>";
                        }
                        
                        txt = txt +"<tr>"
                        var campo;
                        for (var r = 0; r < nombres.length; r++){
                                campo = "campo"+r;
                                txt = txt + "<th><input type='text' name='"+tipos[r]+"' id='"+campo+"'></th>";
                            }
                        txt = txt + "</tr>";
                        txt = txt + "<input type='hidden' id='cuenta' name='"+nombres.length+"'>";
                        txt = txt + "</table>";
                        txt = txt +"<br>Para agregar rellena los cuadros de texto<br>";
                        var boton = "callAgregar('mensaje','POST','http://localhost:8080/ProyectoOmegaRest/webresources/registros/')";
                        txt = txt +"<button onclick="+boton+">Agregar</button>";
                        txt = txt + "<br> Para editar introduce el id y selecciona el campo que quieres cambiar y su nuevo valor<br>"
                        txt = txt + "<br>Si quieres eliminar un registro introduce unicamente el id del mismo sin importar los demás campos<br>"
                        txt = txt + "ID: <input type='text' id='idCambio'><br>";
                        txt = txt + "Campo:" + drop + "<br>";
                        txt = txt + "Nuevo valor: <input type='text' id='nuevoValor'><br>"
                        boton = "callEditar('mensaje','PUT','http://localhost:8080/ProyectoOmegaRest/webresources/registros/')";
                        txt = txt + "<button onclick="+boton+">Editar</button>";
                        boton = "callEliminar('mensaje','DELETE','http://localhost:8080/ProyectoOmegaRest/webresources/registros/')";
                        txt = txt + "<button onclick="+boton+">Eliminar</button>";
                       
                        document.getElementById(id).innerHTML = txt;
                    }
                }
                ajaxRequest.open(method, target, true /*async*/);
                ajaxRequest.setRequestHeader("Content-Type", "text/html");
                ajaxRequest.send();
            }


            function callEditar(id, method, target) {
                var ajaxRequest;
                if (window.XMLHttpRequest) {
                    ajaxRequest = new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
                } else {
                    ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
                }
                ajaxRequest.onreadystatechange = function () {
                    if (ajaxRequest.readyState == 4 &&
                            (ajaxRequest.status == 200 || ajaxRequest.status == 204)) {
                            if(ajaxRequest.responseText == "0")
                                document.getElementById(id).innerHTML ="Valor editado, vuelve a obtener datos" ;
                            else
                                document.getElementById(id).innerHTML ="Hubo un error, vuelve a intentarlo más tarde" ;
                    }
                }
                
                var nuevoValor = document.getElementById("nuevoValor").value;
                var idN = document.getElementById("idCambio").value;
                var campo = document.getElementById("campo").value;
                var tabla = document.getElementById("tabla").getAttribute("name");
                
                target = target+tabla+"/"+idN+"/"+campo.toLowerCase()+"_"+nuevoValor;
                ajaxRequest.open(method, target, true /*async*/);
                ajaxRequest.setRequestHeader("Content-Type", "text/html");
                ajaxRequest.send();
            }
            
            function callEliminar(id, method, target) {
                var ajaxRequest;
                if (window.XMLHttpRequest) {
                    ajaxRequest = new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
                } else {
                    ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
                }
                ajaxRequest.onreadystatechange = function () {
                    if (ajaxRequest.readyState == 4 &&
                            (ajaxRequest.status == 200 || ajaxRequest.status == 204)) {
                            if(ajaxRequest.responseText == "0")
                                document.getElementById(id).innerHTML ="Valor eliminado, vuelve a obtener datos" ;
                            else
                                document.getElementById(id).innerHTML ="Hubo un error, vuelve a intentarlo más tarde" ;
                    }
                }
                
                
                var idN = document.getElementById("idCambio").value;
                
                var tabla = document.getElementById("tabla").getAttribute("name");
                
                target = target+tabla+"/"+idN+"/2";
                ajaxRequest.open(method, target, true /*async*/);
                ajaxRequest.setRequestHeader("Content-Type", "text/html");
                ajaxRequest.send();
            }
            
            function callAgregar(id, method, target) {
                var ajaxRequest;
                if (window.XMLHttpRequest) {
                    ajaxRequest = new XMLHttpRequest(); // IE7+, Firefox, Chrome, Opera, Safari
                } else {
                    ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP"); // IE6, IE5
                }
                ajaxRequest.onreadystatechange = function () {
                    if (ajaxRequest.readyState == 4 &&
                            (ajaxRequest.status == 200 || ajaxRequest.status == 204)) {
                            if(ajaxRequest.responseText == "0")
                                document.getElementById(id).innerHTML ="Valor agregado, vuelve a obtener datos" ;
                            else
                                document.getElementById(id).innerHTML ="Hubo un error, vuelve a intentarlo más tarde" ;
                    }
                }
                
                
                var idN = document.getElementById("idCambio").value;
                var tabla = document.getElementById("tabla").getAttribute("name");
                var cantidad = parseInt(document.getElementById("cuenta").getAttribute("name"));
                var datos="";
                var campo;
                for (var i = 0; i < cantidad; i++) {
                    campo="campo"+i;
                    datos=datos+document.getElementById(campo).getAttribute("name").toLowerCase()+"_";
                    if(i+1 != cantidad)
                        datos=datos+document.getElementById(campo).value+"_";
                }
                datos = datos+document.getElementById(campo).value;
                
               
                target = target+tabla+"/2/"+datos;
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

        String funcion = "callRESTfulWebService('tablas','GET','http://localhost:8080/ProyectoOmegaRest/webresources/tablas/" + userid + "')";
    %>
    <body>

        <h1>Bienvenido <%= username%></h1>
        <button onclick="<%= funcion%>">Ver Tablas creadas</button>
        <a href="createTablePage.jsp">Agregar nueva tabla</a>
        <h2>Las tablas que has creado son: </h2>
        <div id="tablas"></div>
        <div id="registros"></div>
        <div id="mensaje"></div>

    </body>
</html>

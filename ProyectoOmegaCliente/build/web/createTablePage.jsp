<%-- 
    Document   : createTablePage
    Created on : 16/05/2018, 05:37:59 PM
    Author     : ARENDONCL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create a new Table!</h1> 
        <br>
        <label> Tablename </label>
        <br>
        <input type="text" name="table_name" value="" id="table_name"/>
        <br>
        <label> How many fields </label>
        <br>
        <input type="text" name="number_fields" value="" id="number_fields"/>
        <label> Field name </label>
        <br>
        <input type="text" name="field_name" value="" id="field_name"/>
        <label> type </label>
        <select name="type" id = "type">
            <option>boolean</option>
            <option>varchar</option>
            <option>integer</option>
            <option>double</option>
            <option>char</option>
        </select>
        <br>
        <label> Characteristics </label>
        <input type="checkbox" name="Primary Key" value="" id ="primary_key" />
        <input type="checkbox" name="Unique" value="" id ="unique"/>
        <input type="checkbox" name="Not null" value="" id ="not_null"/>
        <br>
        <input type="submit" value="add file" id="field_name" />
        <input type="submit" value="remove  field" id="remove_value" />
        
        <script>
            var tablaElementos = document.getElementById('table');
            var txtField_name = document.getElementById('field_name');
            var number_fields = document.getElementById('number_fields');
            var ddlType = document.getElementById('type');
            var btnAdd = document.getElementById('add_value');
            var btnRm = document.getElementById('remove_value');
            var primary_key = document.getElementById('primary_key');
            var unique = document.getElementById('unique');
            var not_null = document.getElementById('not_null');
            var datos = [];
          
    
             function btnAdd_Click(event) {
                 
 /*               var field_name= txtField_name.value || '';
                var type = ddlType.value || '';
                 
                 if (!field_name || !field_name.trim().length) {
                alert('El campo debe tener un nombre');
                return;
                
                 txtField_name.value = '';
                 txtField_name.focus();
                 
                var item = {
                field_name: field_name.trim(),
                type: type,
                primary_key: primary_key.
                 };

            datos.push(item);*/
                
    }

}  
            
            
        </script>
        
        
        
        
        
        
    </body>
</html>

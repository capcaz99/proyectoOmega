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
        <label> Table name </label>
        <br>
        <input type="text" name="table_name" value="" id="table_name"/>
        <br>
        <label> How many fields </label>
        <br>
        <input type="text" name="number_fields" value="" id="number_fields"/>
        <br>
        <label> Field name </label>
        <br>
        <input type="text" name="field_name" value="" id="field_name"/>
        <br>
        <label> type </label>
        <select name="type" id = "type" onclick="show_varchar_opt()">
            <option>boolean</option>
            <option>varchar</option>
            <option>integer</option>
            <option>double</option>
            <option>char</option>
        </select>
        <br>
        <label id="varchar_length_lbl"> varchar length </label>
        <br>
        <input type="text" name="varchar_length" value="" id ="varchar_length" />
        <br>
        <label> Characteristics: </label>
        <br>
        <label> Primary key </label>
        <input type="checkbox" name="Primary Key" value="" id ="primary_key" />
        <label> Unique </label>
        <input type="checkbox" name="Unique" value="" id ="unique"/>
        <label> Not null </label>
        <input type="checkbox" name="Not null" value="" id ="not_null"/>
        <br>
        <input type="submit" value="remove  field" id="remove_value" />
        <input type="submit" value="add file" id="field_name_btn" onclick ="btnAddField_Click()" />


        <script>

            document.getElementById("varchar_length").style.visibility = "hidden";
            document.getElementById("varchar_length_lbl").style.visibility = "hidden";
            
            function unique_Click(){
            if (document.getElementById("unique").checked === true){
            return ("-u");
            }
            else
                    return ("--");
            }
            
            function not_null_Click(){
            if (document.getElementById("not_null").checked === true){
            return (unique_Click().toString() + "n");
            }
            else
                    return (unique_Click().toString() + "-");
            }

            function all_charact(){
            if (document.getElementById("primary_key").checked === true)
                    return ("p--");
            else
                    return not_null_Click().toString();
            }
            
            function show_varchar_opt(){
            if(document.getElementById("type").value === "varchar"){
                document.getElementById("varchar_length").style.visibility = "visible";
                document.getElementById("varchar_length_lbl").style.visibility = "visible";
            }
            else{
                document.getElementById("varchar_length").style.visibility = "hidden";
                document.getElementById("varchar_length_lbl").style.visibility = "hidden";                
            }  
            }
            
            function type_varch(){
            length = Number(document.getElementById("varchar_length").value.toString());
            if (length !== 0)
            return all_charact().toString()+length;
             else
            return all_charact().toString();
            }


            function btnAddField_Click() {  
            var lbl = document.createElement("LABEL");       
            var fn = document.createTextNode(document.getElementById('field_name').value.toString()+" ");
            var t = document.createTextNode(document.getElementById('type').value.toString()+" "+type_varch().toString());
            var br = document.createElement("br");
            lbl.appendChild(fn);
            lbl.appendChild(t);
            document.body.appendChild(br);                   
            document.body.appendChild(lbl);
            }
            


        </script>
        <br>
        <label> </label>
        <!--<label id = "type_rdy">  </label>
        <label id = "charact_key_rdy"> </label>
        --!>



    </body>
</html>
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author carlosaburto
 */
@WebService(serviceName = "crearTabla")
@Stateless()
public class crearTabla {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crear")
    public Integer crear(@WebParam(name = "nombreColumnas") ArrayList nombreColumnas, @WebParam(name = "tipoColumnas") ArrayList tipoColumnas, @WebParam(name = "caracterColumnas") ArrayList caracterColumnas) {
        try {
            
            String nombre, tipo, nombreTabla, caract, tam, end = "", IdUsuario;
            char[] caracteristicas;
             
            nombreTabla   = (String)nombreColumnas.get(0);
            IdUsuario     = (String)tipoColumnas.get(0);
            
            StringBuilder QueryString = new StringBuilder("create table "+nombreTabla+" ( ");
            
            for (int j = 0; j < nombreColumnas.size()-1; j++) {
                
                nombre = (String)nombreColumnas.get(j+1);
                tipo   = (String)tipoColumnas.get(j+1);
                caract = (String)caracterColumnas.get(j);
                caracteristicas = caract.substring(0, 3).toCharArray();
                
                if(tipo.equals("varchar"))
                    QueryString.append(nombre+" "+tipo+"("+caract.substring(3)+") ");
                else
                    QueryString.append(nombre+" "+tipo+" ");
                
                for (int i = 0; i < caracteristicas.length; i++) {
                    System.out.println("j:"+j+" i:"+i+" :"+caracteristicas[i]);
                    if(caracteristicas[i] != '-'){
                        if(i == 0)
                            end = "primary key("+nombre+")";
                        else    
                            if(i == 1)
                                QueryString.append("not null ");
                            else
                                QueryString.append("unique ");
                    }
                }
                QueryString.append(", ");
            }
            QueryString.append(end+")");
            
            System.out.println(QueryString.toString());
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DBWizard;create=true;",
                    "root", "root");
            Statement query = con.createStatement();
            query.executeUpdate(QueryString.toString());
            
            System.out.println("Query creacion tabla ejecutada");
             
            String query2 = "INSERT INTO RELACION VALUES("+Integer.parseInt(IdUsuario)+",'"+nombreTabla+"')";
            query.executeUpdate(query2);
            
             System.out.println("Query relacion ejecutada.");
            con.commit();
            con.close();
            
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(crearTabla.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(crearTabla.class.getName()).log(Level.SEVERE, null, ex);
            return 2;
        }
    }
}

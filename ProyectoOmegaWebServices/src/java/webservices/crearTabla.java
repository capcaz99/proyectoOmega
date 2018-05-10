/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import java.util.ArrayList;
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
    public Boolean crear(@WebParam(name = "nombreColumnas") ArrayList nombreColumnas, @WebParam(name = "tipoColumnas") ArrayList tipoColumnas, @WebParam(name = "caracterColumnas") ArrayList caracterColumnas) {
        
         //try {
            
            String nombre, tipo, nombreTabla, caract, tam, end = "";
            char[] caracteristicas;
             
            nombreTabla = (String)nombreColumnas.get(0);
            
            StringBuilder QueryString = new StringBuilder("create table "+nombreTabla+" ( ");
            
            for (int j = 0; j < nombreColumnas.size()-1; j++) {
                
                nombre = (String)nombreColumnas.get(j+1);
                tipo   = (String)tipoColumnas.get(j);
                caract = (String)caracterColumnas.get(j);
                caracteristicas = caract.substring(0, 2).toCharArray();
                
                if(tipo.equals("varchar"))
                    QueryString.append(nombre+" "+tipo+"("+caract.substring(3)+") ");
                else
                    QueryString.append(nombre+" "+tipo+" ");
                
                for (int i = 0; i < caracteristicas.length; i++) {
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
//            Class.forName("org.apache.derby.jdbc.ClientDriver");
//            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DBWizard;create=true;",
//                    "root", "root");
//            Statement query = con.createStatement();
//            query.executeUpdate(QueryString.toString());
//            
//            con.commit();
//            con.close();
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(crearTabla.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(crearTabla.class.getName()).log(Level.SEVERE, null, ex);
//        }
         return true;
        
        
    }
    
    
}

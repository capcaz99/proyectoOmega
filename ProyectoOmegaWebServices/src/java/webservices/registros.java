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
@WebService(serviceName = "registros")
@Stateless()
public class registros {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "crearRegistro")
    public Integer crearRegistro(@WebParam(name = "nombreTabla") String nombreTabla, @WebParam(name = "datosTupla") ArrayList datosTupla) {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DBWizard;",
                    "root", "root");
            Statement query = con.createStatement();

            StringBuilder QueryString = new StringBuilder("INSERT INTO " + nombreTabla + " VALUES(");

            String valor;
            for (int i = 0; i < datosTupla.size(); i += 2) {
                valor = (String) datosTupla.get(i);

                switch (valor) {
                    case ("varchar"):
                        QueryString.append("'" + ((String) datosTupla.get(i + 1)) + "'");
                        break;
                    case ("char"):
                        QueryString.append("'" + ((String) datosTupla.get(i + 1)) + "'");
                        break;
                    case ("int"):
                        QueryString.append(Integer.parseInt((String) datosTupla.get(i + 1)));
                        break;
                    case ("double"):
                        QueryString.append(Double.parseDouble((String) datosTupla.get(i + 1)));
                        break;
                    default:
                        QueryString.append((String) datosTupla.get(i + 1));
                        break;
                }
                
                if(i+2 != datosTupla.size())
                    QueryString.append(", ");
            }
            
            QueryString.append(")");
            
            System.out.println("Agregar:" + QueryString.toString());
            query.executeUpdate(QueryString.toString());

            con.commit();
            con.close();

            return 0; //Sin errror 

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registros.class.getName()).log(Level.SEVERE, null, ex);
            return 1; //Error en encontrar la base de datos. 
        } catch (SQLException ex) {
            Logger.getLogger(registros.class.getName()).log(Level.SEVERE, null, ex);
            return 2; //Error al hacer la conexión a la base de datos o al ejecutar query
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarRegistro")
    public Integer editarRegistro(@WebParam(name = "nombreTabla") String nombreTabla, @WebParam(name = "llave") ArrayList llave, @WebParam(name = "nuevosDatos") ArrayList nuevosDatos) {
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DBWizard;",
                    "root", "root");
            Statement query = con.createStatement();
            
            StringBuilder QueryString = new StringBuilder("UPDATEV " + nombreTabla + "SET ");
            
            String valor1, valor2, valor3;
            
            for (int i = 0; i < nuevosDatos.size(); i += 3) {
                valor1 = (String) nuevosDatos.get(i); //TIPO
                valor2 = (String) nuevosDatos.get(i+1); // NOMBRE DE COLUMNA
                valor3 = (String) nuevosDatos.get(i+2); //VALOR DE COLUMNA
                
                QueryString.append(valor2+" = ");
                switch (valor1) {
                    case ("varchar"):
                        QueryString.append("'" + valor3 + "'");
                        break;
                    case ("char"):
                        QueryString.append("'" + valor3 + "'");
                        break;
                    case ("int"):
                        QueryString.append(Integer.parseInt(valor3));
                        break;
                    case ("double"):
                        QueryString.append(Double.parseDouble(valor3));
                        break;
                    default:
                        QueryString.append(valor3);
                        break;
                }
                
                if(i+3 != nuevosDatos.size())
                    QueryString.append(", ");
            }
            
            QueryString.append(" WHERE "+(String)llave.get(1)+" = ");
            
            switch ((String)llave.get(0)) {
                    case ("varchar"):
                        QueryString.append("'" + (String)llave.get(3) + "'");
                        break;
                    case ("char"):
                        QueryString.append("'" + (String)llave.get(3) + "'");
                        break;
                    case ("int"):
                        QueryString.append(Integer.parseInt((String)llave.get(3)));
                        break;
                    case ("double"):
                        QueryString.append(Double.parseDouble((String)llave.get(3)));
                        break;
                    default:
                        QueryString.append((String)llave.get(3));
                        break;
                }
            
            System.out.println("Editar:" + QueryString.toString());
            //query.executeUpdate(QueryString.toString());

            con.commit();
            con.close();

            return 0; //Sin errror 
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registros.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(registros.class.getName()).log(Level.SEVERE, null, ex);
            return 2;
        }
            
            
    }
    
    
    

}

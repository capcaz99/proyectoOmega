/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import org.json.simple.JSONObject;

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
                    case ("integer"):
                        QueryString.append(Integer.parseInt((String) datosTupla.get(i + 1)));
                        break;
                    case ("double"):
                        QueryString.append(Double.parseDouble((String) datosTupla.get(i + 1)));
                        break;
                    default:
                        QueryString.append((String) datosTupla.get(i + 1));
                        break;
                }

                if (i + 2 != datosTupla.size()) {
                    QueryString.append(", ");
                }
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

            StringBuilder QueryString = new StringBuilder("UPDATE " + nombreTabla + " SET ");

            String valor1, valor2, valor3;

            for (int i = 0; i < nuevosDatos.size(); i += 3) {
                valor1 = (String) nuevosDatos.get(i); //TIPO
                valor2 = (String) nuevosDatos.get(i + 1); // NOMBRE DE COLUMNA
                valor3 = (String) nuevosDatos.get(i + 2); //VALOR DE COLUMNA

                QueryString.append(valor2 + " = ");
                switch (valor1) {
                    case ("varchar"):
                        QueryString.append("'" + valor3 + "'");
                        break;
                    case ("char"):
                        QueryString.append("'" + valor3 + "'");
                        break;
                    case ("integer"):
                        QueryString.append(Integer.parseInt(valor3));
                        break;
                    case ("double"):
                        QueryString.append(Double.parseDouble(valor3));
                        break;
                    default:
                        QueryString.append(valor3);
                        break;
                }

                if (i + 3 != nuevosDatos.size()) {
                    QueryString.append(", ");
                }
            }

            QueryString.append(" WHERE " + (String) llave.get(1) + " = ");

            switch ((String) llave.get(0)) {
                case ("varchar"):
                    QueryString.append("'" + (String) llave.get(2) + "'");
                    break;
                case ("char"):
                    QueryString.append("'" + (String) llave.get(2) + "'");
                    break;
                case ("integer"):
                    QueryString.append(Integer.parseInt((String) llave.get(2)));
                    break;
                case ("double"):
                    QueryString.append(Double.parseDouble((String) llave.get(2)));
                    break;
                default:
                    QueryString.append((String) llave.get(2));
                    break;
            }

            System.out.println("Editar:" + QueryString.toString());
            query.executeUpdate(QueryString.toString());

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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarRegistro")
    public Integer eliminarRegistro(@WebParam(name = "nombreTabla") String nombreTabla, @WebParam(name = "lave") ArrayList llave) {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DBWizard;",
                    "root", "root");
            Statement query = con.createStatement();

            StringBuilder QueryString = new StringBuilder("DELETE FROM " + nombreTabla);

            QueryString.append(" WHERE " + (String) llave.get(1) + " = ");

            switch ((String) llave.get(0)) {
                case ("varchar"):
                    QueryString.append("'" + (String) llave.get(2) + "'");
                    break;
                case ("char"):
                    QueryString.append("'" + (String) llave.get(2) + "'");
                    break;
                case ("integer"):
                    QueryString.append(Integer.parseInt((String) llave.get(2)));
                    break;
                case ("double"):
                    QueryString.append(Double.parseDouble((String) llave.get(2)));
                    break;
                default:
                    QueryString.append((String) llave.get(2));
                    break;
            }

            System.out.println("Eliminar:" + QueryString.toString());
            query.executeUpdate(QueryString.toString());

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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerTablasUsuario")
    public ArrayList obtenerTablasUsuario(@WebParam(name = "idUsuario") String idUsuario) {

        try {

            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DBWizard;",
                    "root", "root");

            Statement query = con.createStatement();
            String QueryString = "SELECT * FROM RELACION WHERE IDUSUARIO =" + Integer.parseInt(idUsuario);

            ResultSet rs = query.executeQuery(QueryString);

            ArrayList nombres = new ArrayList();

            while (rs.next()) {
                nombres.add(rs.getString("NOMBRETABLA"));
            }

            con.close();

            return nombres;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(registros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerRegistros")
    public String obtenerRegistros(@WebParam(name = "nombreTabla") String nombreTabla) {
        try {

            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DBWizard;",
                    "root", "root");
            Statement query = con.createStatement();
            
            String QueryString = "SELECT * FROM " + nombreTabla;
            PreparedStatement ps = con.prepareStatement(QueryString, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            rs.last();
            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount();
            int numRows = rs.getRow();
            rs.beforeFirst();
            
            System.out.println("TAMAÑOS: " + numCols + "------" + numRows);
            System.out.println("NOMBRES: " + nombreTabla);
            Object datos[][] = new Object[numRows][numCols];

            JSONObject json = new JSONObject();

            int j = 0;
            String nombre; 
            ArrayList data = new ArrayList();
            ArrayList nombres = new ArrayList();
            ArrayList tipos = new ArrayList();
            for (int i = 0; i < numCols; i++) {
                rs.beforeFirst();
                nombre = rsmd.getColumnName(i+1);
                tipos.add(rsmd.getColumnTypeName(i+1));
                
                nombres.add(nombre);
                while (rs.next()) {
                    data.add(rs.getString(nombre));
                    j++;
                }
            }
               json.put("tabla",nombreTabla);
               json.put("nombres", nombres);
               json.put("tipos", tipos);
               json.put("datos", data);

            con.close();

            return json.toJSONString();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(registros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }


}

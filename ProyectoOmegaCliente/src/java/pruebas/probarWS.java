/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Aburto Peralta 149962
 */
public class probarWS {

   
    
    
    
    public static void main(String[] args) throws SQLException{
        
        //Probar crear tabla
//        ArrayList nombre = new ArrayList();
//        ArrayList tipo = new ArrayList();
//        ArrayList caract = new ArrayList();
//        
//        nombre.add("tablaPrueba");
//        nombre.add("usuario");
//        nombre.add("pass");
//        nombre.add("id");
//        tipo.add("1");
//        tipo.add("varchar");
//        tipo.add("varchar");
//        tipo.add("int");
//        caract.add("-un20");
//        caract.add("--n20");
//        caract.add("p--");
//        
//        System.out.println("WS CREAR TABLA: "+crear(nombre,tipo,caract));
        
        //Probar crear registro
//        ArrayList datos = new ArrayList();
//        
//        datos.add("varchar");
//        datos.add("capcaz99");
//        datos.add("varchar");
//        datos.add("1234");
//        datos.add("int");
//        datos.add("1");
        
        //System.out.println("WS Crear Registro: "+crearRegistro("tablaPrueba",datos));
        
        //Probar editar registro
        //ArrayList llave = new ArrayList();
//        ArrayList nuevosDatos = new ArrayList();
//        
//        llave.add("int");
//        llave.add("id");
//        llave.add("1");
////        
//        nuevosDatos.add("varchar");
//        nuevosDatos.add("usuario");
//        nuevosDatos.add("cap");
//        nuevosDatos.add("varchar");
//        nuevosDatos.add("pass");
//        nuevosDatos.add("1324");
        
        //System.out.println("WS editar Registro: "+editarRegistro("tablaPrueba",llave,nuevosDatos));
        
        //Probar eliminar
        //System.out.println("WS eliminar registro: "+eliminarRegistro("tablaPrueba", llave));
        
        
        //Probar obtener registros
//        ResultSet rs = (ResultSet) obtenerRegistros("tablaprueba");
        
  //      System.out.println(rs.getString("USUARIO"));
        
        
        //Probar obtener tablas
        ArrayList resultado = (ArrayList)obtenerTablasUsuario("1");
        System.out.println("YA");
        for (int i = 0; i < resultado.size(); i++) {
            System.out.println(resultado.get(i));
        }
        
    }

    private static Integer crear(java.util.List<java.lang.Object> nombreColumnas, java.util.List<java.lang.Object> tipoColumnas, java.util.List<java.lang.Object> caracterColumnas) {
        webservices.CrearTabla_Service service = new webservices.CrearTabla_Service();
        webservices.CrearTabla port = service.getCrearTablaPort();
        return port.crear(nombreColumnas, tipoColumnas, caracterColumnas);
    }

    private static Integer crearRegistro(java.lang.String nombreTabla, java.util.List<java.lang.Object> datosTupla) {
        webservices.Registros_Service service = new webservices.Registros_Service();
        webservices.Registros port = service.getRegistrosPort();
        return port.crearRegistro(nombreTabla, datosTupla);
    }

    private static Integer editarRegistro(java.lang.String nombreTabla, java.util.List<java.lang.Object> llave, java.util.List<java.lang.Object> nuevosDatos) {
        webservices.Registros_Service service = new webservices.Registros_Service();
        webservices.Registros port = service.getRegistrosPort();
        return port.editarRegistro(nombreTabla, llave, nuevosDatos);
    }

    private static Integer eliminarRegistro(java.lang.String nombreTabla, java.util.List<java.lang.Object> lave) {
        webservices.Registros_Service service = new webservices.Registros_Service();
        webservices.Registros port = service.getRegistrosPort();
        return port.eliminarRegistro(nombreTabla, lave);
    }

    private static Object obtenerRegistros(java.lang.String nombreTabla) {
        webservices.Registros_Service service = new webservices.Registros_Service();
        webservices.Registros port = service.getRegistrosPort();
        return port.obtenerRegistros(nombreTabla);
    }

    private static java.util.List<java.lang.Object> obtenerTablasUsuario(java.lang.String idUsuario) {
        webservices.Registros_Service service = new webservices.Registros_Service();
        webservices.Registros port = service.getRegistrosPort();
        return port.obtenerTablasUsuario(idUsuario);
    }
    
    
    
    
    
    
    
    
    
    

   

    

   

   

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Aburto Peralta 149962
 */
public class probarWS {

   
    
    
    
    public static void main(String[] args){
        
        //Probar crear tabla
        ArrayList nombre = new ArrayList();
        ArrayList tipo = new ArrayList();
        ArrayList caract = new ArrayList();
        
        nombre.add("tablaPrueba");
        nombre.add("usuario");
        nombre.add("pass");
        nombre.add("id");
        tipo.add("varchar");
        tipo.add("varchar");
        tipo.add("int");
        caract.add("-un20");
        caract.add("--n20");
        caract.add("p--");
        
        //System.out.println("WS CREAR TABLA: "+crear(nombre,tipo,caract));
        
        //Probar crear registro
        ArrayList datos = new ArrayList();
        
         datos.add("varchar");
        datos.add("capcaz99");
        datos.add("varchar");
        datos.add("1234");
        datos.add("int");
        datos.add("1");
        
        //System.out.println("WS Crear Registro: "+crearRegistro("tablaPrueba",datos));
        
        //Probar editar registro
        
        
        
    }

    private static Boolean crear(java.util.List<java.lang.Object> nombreColumnas, java.util.List<java.lang.Object> tipoColumnas, java.util.List<java.lang.Object> caracterColumnas) {
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
    
    
    
    

   

    

   

   

}

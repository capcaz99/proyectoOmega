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
        
        System.out.println(crear(nombre,tipo,caract));
        
        
    }

    private static Boolean crear(java.util.List<java.lang.Object> nombreColumnas, java.util.List<java.lang.Object> tipoColumnas, java.util.List<java.lang.Object> caracterColumnas) {
        webservices.CrearTabla_Service service = new webservices.CrearTabla_Service();
        webservices.CrearTabla port = service.getCrearTablaPort();
        return port.crear(nombreColumnas, tipoColumnas, caracterColumnas);
    }

   

    

   

   

}

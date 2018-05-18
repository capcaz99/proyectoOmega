/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author carlosaburto
 */
@Path("registros/{nombreTabla}/{llave}/{datos}")
public class RegistrosResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RegistrosResource
     */
    public RegistrosResource() {
    }

    /**
     * Retrieves representation of an instance of webservices.RegistrosResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String getHtml(@PathParam("nombreTabla")String nombreTabla) {
        return obtenerRegistros(nombreTabla);
    }
    
    @DELETE
    @Produces("text/html")
    public String deleteHtml(@PathParam("nombreTabla")String nombreTabla,@PathParam("llave")String llave) {
        ArrayList llaveEnviar = new ArrayList();
        llaveEnviar.add("int");
        llaveEnviar.add("id");
        llaveEnviar.add(llave);
        return ""+eliminarRegistro(nombreTabla,llaveEnviar);
    }
    
    @POST
    @Produces("text/html")
    public String postHtml(@PathParam("nombreTabla")String nombreTabla, @PathParam("datos")String datos) {
        ArrayList datosEnviar = new ArrayList();
        String[] dat = datos.split("_");
        //0-tipo 1-VALOR
        for (int i = 0; i < dat.length; i++) 
            datosEnviar.add(dat[i]);
        System.out.println("---------tamdatos--------:"+dat.length);
        return ""+crearRegistro(nombreTabla,datosEnviar);
    }
    

    /**
     * PUT method for updating or creating an instance of RegistrosResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public String putHtml(@PathParam("nombreTabla")String nombreTabla,@PathParam("llave")String llave,@PathParam("datos")String datos) {
        
        ArrayList llaveEnviar = new ArrayList();
        ArrayList datosEnviar = new ArrayList();
        String[] dat = datos.split("_");
        //0-tipo 1-nombre 2-valor
        for (int i = 0; i < dat.length; i++) 
            datosEnviar.add(dat[i]);
            
        
        llaveEnviar.add("int");
        llaveEnviar.add("id");
        llaveEnviar.add(llave);
        
        return ""+editarRegistro(nombreTabla,llaveEnviar,datosEnviar);
        
    }

    private static String obtenerRegistros(java.lang.String nombreTabla) {
        webservices.Registros_Service service = new webservices.Registros_Service();
        webservices.Registros port = service.getRegistrosPort();
        return port.obtenerRegistros(nombreTabla);
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

    private static Integer crearRegistro(java.lang.String nombreTabla, java.util.List<java.lang.Object> datosTupla) {
        webservices.Registros_Service service = new webservices.Registros_Service();
        webservices.Registros port = service.getRegistrosPort();
        return port.crearRegistro(nombreTabla, datosTupla);
    }
    
    
    
    
    
    
    
    
    
    
}

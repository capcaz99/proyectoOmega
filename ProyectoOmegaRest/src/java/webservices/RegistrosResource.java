/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author carlosaburto
 */
@Path("registros/{nombreTabla}")
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

    /**
     * PUT method for updating or creating an instance of RegistrosResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
    }

    private static String obtenerRegistros(java.lang.String nombreTabla) {
        webservices.Registros_Service service = new webservices.Registros_Service();
        webservices.Registros port = service.getRegistrosPort();
        return port.obtenerRegistros(nombreTabla);
    }
    
    
    
    
}

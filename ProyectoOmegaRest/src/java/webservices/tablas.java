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
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author carlosaburto
 */
@Path("tablas/{userid}")
public class tablas {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of tablas
     */
    public tablas() {
    }

    /**
     * Retrieves representation of an instance of webservices.tablas
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String getXml(@PathParam("userid")String userid) {
        
        ArrayList nombres = (ArrayList) obtenerTablasUsuario(userid);
        StringBuilder resultado = new StringBuilder();
        int i;
        for (i = 0; i < nombres.size()-1; i++) 
            resultado.append((String) nombres.get(i)+"_");
        
        resultado.append((String) nombres.get(i));

        
        return resultado.toString();
    }

    /**
     * PUT method for updating or creating an instance of tablas
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }

    private static java.util.List<java.lang.Object> obtenerTablasUsuario(java.lang.String idUsuario) {
        webservices.Registros_Service service = new webservices.Registros_Service();
        webservices.Registros port = service.getRegistrosPort();
        return port.obtenerTablasUsuario(idUsuario);
    }
    
    
    
}

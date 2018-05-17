
package webservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "registros", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Registros {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://webservices/", className = "webservices.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://webservices/", className = "webservices.HelloResponse")
    @Action(input = "http://webservices/registros/helloRequest", output = "http://webservices/registros/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param nombreTabla
     * @param datosTupla
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearRegistro", targetNamespace = "http://webservices/", className = "webservices.CrearRegistro")
    @ResponseWrapper(localName = "crearRegistroResponse", targetNamespace = "http://webservices/", className = "webservices.CrearRegistroResponse")
    @Action(input = "http://webservices/registros/crearRegistroRequest", output = "http://webservices/registros/crearRegistroResponse")
    public Integer crearRegistro(
        @WebParam(name = "nombreTabla", targetNamespace = "")
        String nombreTabla,
        @WebParam(name = "datosTupla", targetNamespace = "")
        List<Object> datosTupla);

    /**
     * 
     * @param nombreTabla
     * @param nuevosDatos
     * @param llave
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editarRegistro", targetNamespace = "http://webservices/", className = "webservices.EditarRegistro")
    @ResponseWrapper(localName = "editarRegistroResponse", targetNamespace = "http://webservices/", className = "webservices.EditarRegistroResponse")
    @Action(input = "http://webservices/registros/editarRegistroRequest", output = "http://webservices/registros/editarRegistroResponse")
    public Integer editarRegistro(
        @WebParam(name = "nombreTabla", targetNamespace = "")
        String nombreTabla,
        @WebParam(name = "llave", targetNamespace = "")
        List<Object> llave,
        @WebParam(name = "nuevosDatos", targetNamespace = "")
        List<Object> nuevosDatos);

    /**
     * 
     * @param nombreTabla
     * @param lave
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarRegistro", targetNamespace = "http://webservices/", className = "webservices.EliminarRegistro")
    @ResponseWrapper(localName = "eliminarRegistroResponse", targetNamespace = "http://webservices/", className = "webservices.EliminarRegistroResponse")
    @Action(input = "http://webservices/registros/eliminarRegistroRequest", output = "http://webservices/registros/eliminarRegistroResponse")
    public Integer eliminarRegistro(
        @WebParam(name = "nombreTabla", targetNamespace = "")
        String nombreTabla,
        @WebParam(name = "lave", targetNamespace = "")
        List<Object> lave);

    /**
     * 
     * @param nombreTabla
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerRegistros", targetNamespace = "http://webservices/", className = "webservices.ObtenerRegistros")
    @ResponseWrapper(localName = "obtenerRegistrosResponse", targetNamespace = "http://webservices/", className = "webservices.ObtenerRegistrosResponse")
    @Action(input = "http://webservices/registros/obtenerRegistrosRequest", output = "http://webservices/registros/obtenerRegistrosResponse")
    public String obtenerRegistros(
        @WebParam(name = "nombreTabla", targetNamespace = "")
        String nombreTabla);

    /**
     * 
     * @param idUsuario
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerTablasUsuario", targetNamespace = "http://webservices/", className = "webservices.ObtenerTablasUsuario")
    @ResponseWrapper(localName = "obtenerTablasUsuarioResponse", targetNamespace = "http://webservices/", className = "webservices.ObtenerTablasUsuarioResponse")
    @Action(input = "http://webservices/registros/obtenerTablasUsuarioRequest", output = "http://webservices/registros/obtenerTablasUsuarioResponse")
    public List<Object> obtenerTablasUsuario(
        @WebParam(name = "idUsuario", targetNamespace = "")
        String idUsuario);

}

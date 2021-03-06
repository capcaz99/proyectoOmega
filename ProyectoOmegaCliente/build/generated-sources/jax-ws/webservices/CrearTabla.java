
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
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "crearTabla", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CrearTabla {


    /**
     * 
     * @param nombreColumnas
     * @param tipoColumnas
     * @param caracterColumnas
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crear", targetNamespace = "http://webservices/", className = "webservices.Crear")
    @ResponseWrapper(localName = "crearResponse", targetNamespace = "http://webservices/", className = "webservices.CrearResponse")
    @Action(input = "http://webservices/crearTabla/crearRequest", output = "http://webservices/crearTabla/crearResponse")
    public Integer crear(
        @WebParam(name = "nombreColumnas", targetNamespace = "")
        List<Object> nombreColumnas,
        @WebParam(name = "tipoColumnas", targetNamespace = "")
        List<Object> tipoColumnas,
        @WebParam(name = "caracterColumnas", targetNamespace = "")
        List<Object> caracterColumnas);

}

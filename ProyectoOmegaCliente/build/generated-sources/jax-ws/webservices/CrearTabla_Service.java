
package webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "crearTabla", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:8080/crearTabla/crearTabla?WSDL")
public class CrearTabla_Service
    extends Service
{

    private final static URL CREARTABLA_WSDL_LOCATION;
    private final static WebServiceException CREARTABLA_EXCEPTION;
    private final static QName CREARTABLA_QNAME = new QName("http://webservices/", "crearTabla");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/crearTabla/crearTabla?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CREARTABLA_WSDL_LOCATION = url;
        CREARTABLA_EXCEPTION = e;
    }

    public CrearTabla_Service() {
        super(__getWsdlLocation(), CREARTABLA_QNAME);
    }

    public CrearTabla_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CREARTABLA_QNAME, features);
    }

    public CrearTabla_Service(URL wsdlLocation) {
        super(wsdlLocation, CREARTABLA_QNAME);
    }

    public CrearTabla_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CREARTABLA_QNAME, features);
    }

    public CrearTabla_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CrearTabla_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CrearTabla
     */
    @WebEndpoint(name = "crearTablaPort")
    public CrearTabla getCrearTablaPort() {
        return super.getPort(new QName("http://webservices/", "crearTablaPort"), CrearTabla.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CrearTabla
     */
    @WebEndpoint(name = "crearTablaPort")
    public CrearTabla getCrearTablaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "crearTablaPort"), CrearTabla.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CREARTABLA_EXCEPTION!= null) {
            throw CREARTABLA_EXCEPTION;
        }
        return CREARTABLA_WSDL_LOCATION;
    }

}


package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrearRegistro_QNAME = new QName("http://webservices/", "crearRegistro");
    private final static QName _EditarRegistro_QNAME = new QName("http://webservices/", "editarRegistro");
    private final static QName _CrearRegistroResponse_QNAME = new QName("http://webservices/", "crearRegistroResponse");
    private final static QName _Hello_QNAME = new QName("http://webservices/", "hello");
    private final static QName _EditarRegistroResponse_QNAME = new QName("http://webservices/", "editarRegistroResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://webservices/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link EditarRegistroResponse }
     * 
     */
    public EditarRegistroResponse createEditarRegistroResponse() {
        return new EditarRegistroResponse();
    }

    /**
     * Create an instance of {@link CrearRegistroResponse }
     * 
     */
    public CrearRegistroResponse createCrearRegistroResponse() {
        return new CrearRegistroResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link EditarRegistro }
     * 
     */
    public EditarRegistro createEditarRegistro() {
        return new EditarRegistro();
    }

    /**
     * Create an instance of {@link CrearRegistro }
     * 
     */
    public CrearRegistro createCrearRegistro() {
        return new CrearRegistro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "crearRegistro")
    public JAXBElement<CrearRegistro> createCrearRegistro(CrearRegistro value) {
        return new JAXBElement<CrearRegistro>(_CrearRegistro_QNAME, CrearRegistro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "editarRegistro")
    public JAXBElement<EditarRegistro> createEditarRegistro(EditarRegistro value) {
        return new JAXBElement<EditarRegistro>(_EditarRegistro_QNAME, EditarRegistro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearRegistroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "crearRegistroResponse")
    public JAXBElement<CrearRegistroResponse> createCrearRegistroResponse(CrearRegistroResponse value) {
        return new JAXBElement<CrearRegistroResponse>(_CrearRegistroResponse_QNAME, CrearRegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarRegistroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "editarRegistroResponse")
    public JAXBElement<EditarRegistroResponse> createEditarRegistroResponse(EditarRegistroResponse value) {
        return new JAXBElement<EditarRegistroResponse>(_EditarRegistroResponse_QNAME, EditarRegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}

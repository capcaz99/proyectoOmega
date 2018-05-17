
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
<<<<<<< HEAD
    private final static QName _CrearRegistroResponse_QNAME = new QName("http://webservices/", "crearRegistroResponse");
    private final static QName _EditarRegistro_QNAME = new QName("http://webservices/", "editarRegistro");
    private final static QName _EditarRegistroResponse_QNAME = new QName("http://webservices/", "editarRegistroResponse");
    private final static QName _Hello_QNAME = new QName("http://webservices/", "hello");
=======
    private final static QName _EliminarRegistroResponse_QNAME = new QName("http://webservices/", "eliminarRegistroResponse");
    private final static QName _EditarRegistro_QNAME = new QName("http://webservices/", "editarRegistro");
    private final static QName _CrearRegistroResponse_QNAME = new QName("http://webservices/", "crearRegistroResponse");
    private final static QName _Hello_QNAME = new QName("http://webservices/", "hello");
    private final static QName _ObtenerRegistrosResponse_QNAME = new QName("http://webservices/", "obtenerRegistrosResponse");
    private final static QName _EditarRegistroResponse_QNAME = new QName("http://webservices/", "editarRegistroResponse");
    private final static QName _ObtenerRegistros_QNAME = new QName("http://webservices/", "obtenerRegistros");
>>>>>>> master
    private final static QName _HelloResponse_QNAME = new QName("http://webservices/", "helloResponse");
    private final static QName _ObtenerTablasUsuarioResponse_QNAME = new QName("http://webservices/", "obtenerTablasUsuarioResponse");
    private final static QName _ObtenerTablasUsuario_QNAME = new QName("http://webservices/", "obtenerTablasUsuario");
    private final static QName _EliminarRegistro_QNAME = new QName("http://webservices/", "eliminarRegistro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarRegistro }
     * 
     */
    public EliminarRegistro createEliminarRegistro() {
        return new EliminarRegistro();
    }

    /**
     * Create an instance of {@link ObtenerTablasUsuario }
     * 
     */
    public ObtenerTablasUsuario createObtenerTablasUsuario() {
        return new ObtenerTablasUsuario();
    }

    /**
     * Create an instance of {@link ObtenerTablasUsuarioResponse }
     * 
     */
    public ObtenerTablasUsuarioResponse createObtenerTablasUsuarioResponse() {
        return new ObtenerTablasUsuarioResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public CrearRegistro createCrearRegistro() {
        return new CrearRegistro();
    }

    /**
     * Create an instance of {@link ObtenerRegistros }
     * 
     */
    public ObtenerRegistros createObtenerRegistros() {
        return new ObtenerRegistros();
    }

    /**
     * Create an instance of {@link EditarRegistroResponse }
     * 
     */
    public CrearRegistroResponse createCrearRegistroResponse() {
        return new CrearRegistroResponse();
    }

    /**
     * Create an instance of {@link ObtenerRegistrosResponse }
     * 
     */
    public ObtenerRegistrosResponse createObtenerRegistrosResponse() {
        return new ObtenerRegistrosResponse();
    }

    /**
     * Create an instance of {@link CrearRegistroResponse }
     * 
     */
    public EditarRegistro createEditarRegistro() {
        return new EditarRegistro();
    }

    /**
     * Create an instance of {@link EditarRegistroResponse }
     * 
     */
    public EditarRegistroResponse createEditarRegistroResponse() {
        return new EditarRegistroResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link EliminarRegistroResponse }
     * 
     */
    public EliminarRegistroResponse createEliminarRegistroResponse() {
        return new EliminarRegistroResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarRegistroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "eliminarRegistroResponse")
    public JAXBElement<EliminarRegistroResponse> createEliminarRegistroResponse(EliminarRegistroResponse value) {
        return new JAXBElement<EliminarRegistroResponse>(_EliminarRegistroResponse_QNAME, EliminarRegistroResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "editarRegistro")
    public JAXBElement<EditarRegistro> createEditarRegistro(EditarRegistro value) {
        return new JAXBElement<EditarRegistro>(_EditarRegistro_QNAME, EditarRegistro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerRegistrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "obtenerRegistrosResponse")
    public JAXBElement<ObtenerRegistrosResponse> createObtenerRegistrosResponse(ObtenerRegistrosResponse value) {
        return new JAXBElement<ObtenerRegistrosResponse>(_ObtenerRegistrosResponse_QNAME, ObtenerRegistrosResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerRegistros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "obtenerRegistros")
    public JAXBElement<ObtenerRegistros> createObtenerRegistros(ObtenerRegistros value) {
        return new JAXBElement<ObtenerRegistros>(_ObtenerRegistros_QNAME, ObtenerRegistros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTablasUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "obtenerTablasUsuarioResponse")
    public JAXBElement<ObtenerTablasUsuarioResponse> createObtenerTablasUsuarioResponse(ObtenerTablasUsuarioResponse value) {
        return new JAXBElement<ObtenerTablasUsuarioResponse>(_ObtenerTablasUsuarioResponse_QNAME, ObtenerTablasUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTablasUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "obtenerTablasUsuario")
    public JAXBElement<ObtenerTablasUsuario> createObtenerTablasUsuario(ObtenerTablasUsuario value) {
        return new JAXBElement<ObtenerTablasUsuario>(_ObtenerTablasUsuario_QNAME, ObtenerTablasUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "eliminarRegistro")
    public JAXBElement<EliminarRegistro> createEliminarRegistro(EliminarRegistro value) {
        return new JAXBElement<EliminarRegistro>(_EliminarRegistro_QNAME, EliminarRegistro.class, null, value);
    }

}

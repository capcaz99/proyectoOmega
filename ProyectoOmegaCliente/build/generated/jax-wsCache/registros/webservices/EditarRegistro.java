
package webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para editarRegistro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="editarRegistro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreTabla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="llave" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nuevosDatos" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editarRegistro", propOrder = {
    "nombreTabla",
    "llave",
    "nuevosDatos"
})
public class EditarRegistro {

    protected String nombreTabla;
    protected List<Object> llave;
    protected List<Object> nuevosDatos;

    /**
     * Obtiene el valor de la propiedad nombreTabla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTabla() {
        return nombreTabla;
    }

    /**
     * Define el valor de la propiedad nombreTabla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTabla(String value) {
        this.nombreTabla = value;
    }

    /**
     * Gets the value of the llave property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the llave property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLlave().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getLlave() {
        if (llave == null) {
            llave = new ArrayList<Object>();
        }
        return this.llave;
    }

    /**
     * Gets the value of the nuevosDatos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nuevosDatos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNuevosDatos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getNuevosDatos() {
        if (nuevosDatos == null) {
            nuevosDatos = new ArrayList<Object>();
        }
        return this.nuevosDatos;
    }

}

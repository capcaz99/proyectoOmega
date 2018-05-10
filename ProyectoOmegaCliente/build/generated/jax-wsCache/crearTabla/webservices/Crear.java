
package webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crear complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crear">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreColumnas" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoColumnas" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="caracterColumnas" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crear", propOrder = {
    "nombreColumnas",
    "tipoColumnas",
    "caracterColumnas"
})
public class Crear {

    protected List<Object> nombreColumnas;
    protected List<Object> tipoColumnas;
    protected List<Object> caracterColumnas;

    /**
     * Gets the value of the nombreColumnas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombreColumnas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombreColumnas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getNombreColumnas() {
        if (nombreColumnas == null) {
            nombreColumnas = new ArrayList<Object>();
        }
        return this.nombreColumnas;
    }

    /**
     * Gets the value of the tipoColumnas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoColumnas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoColumnas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getTipoColumnas() {
        if (tipoColumnas == null) {
            tipoColumnas = new ArrayList<Object>();
        }
        return this.tipoColumnas;
    }

    /**
     * Gets the value of the caracterColumnas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caracterColumnas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaracterColumnas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getCaracterColumnas() {
        if (caracterColumnas == null) {
            caracterColumnas = new ArrayList<Object>();
        }
        return this.caracterColumnas;
    }

}

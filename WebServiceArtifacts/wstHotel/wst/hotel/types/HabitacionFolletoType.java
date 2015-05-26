
package wst.hotel.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for habitacionFolletoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="habitacionFolletoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contenido" type="{types.hotel.wst}contenidoFolletoType" minOccurs="0"/>
 *         &lt;element name="fotos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "habitacionFolletoType", propOrder = {
    "contenido",
    "fotos"
})
public class HabitacionFolletoType {

    protected ContenidoFolletoType contenido;
    protected List<String> fotos;

    /**
     * Gets the value of the contenido property.
     * 
     * @return
     *     possible object is
     *     {@link ContenidoFolletoType }
     *     
     */
    public ContenidoFolletoType getContenido() {
        return contenido;
    }

    /**
     * Sets the value of the contenido property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContenidoFolletoType }
     *     
     */
    public void setContenido(ContenidoFolletoType value) {
        this.contenido = value;
    }

    /**
     * Gets the value of the fotos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fotos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFotos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFotos() {
        if (fotos == null) {
            fotos = new ArrayList<String>();
        }
        return this.fotos;
    }

}

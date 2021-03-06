
package wst.hotel.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for habitacionesFolletoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="habitacionesFolletoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreOpcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habitacionFolleto" type="{types.hotel.wst}habitacionFolletoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "habitacionesFolletoType", propOrder = {
    "nombreOpcion",
    "habitacionFolleto"
})
public class HabitacionesFolletoType {

    protected String nombreOpcion;
    protected List<HabitacionFolletoType> habitacionFolleto;

    /**
     * Gets the value of the nombreOpcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreOpcion() {
        return nombreOpcion;
    }

    /**
     * Sets the value of the nombreOpcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreOpcion(String value) {
        this.nombreOpcion = value;
    }

    /**
     * Gets the value of the habitacionFolleto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the habitacionFolleto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHabitacionFolleto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HabitacionFolletoType }
     * 
     * 
     */
    public List<HabitacionFolletoType> getHabitacionFolleto() {
        if (habitacionFolleto == null) {
            habitacionFolleto = new ArrayList<HabitacionFolletoType>();
        }
        return this.habitacionFolleto;
    }

}

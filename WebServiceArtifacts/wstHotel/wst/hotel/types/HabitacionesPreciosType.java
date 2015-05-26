
package wst.hotel.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for habitacionesPreciosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="habitacionesPreciosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="preciosRegimen" type="{types.hotel.wst}preciosRegimenType" maxOccurs="unbounded"/>
 *         &lt;element name="tiposHabitacion" type="{types.hotel.wst}tiposHabitacionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "habitacionesPreciosType", propOrder = {
    "preciosRegimen",
    "tiposHabitacion"
})
public class HabitacionesPreciosType {

    @XmlElement(required = true)
    protected List<PreciosRegimenType> preciosRegimen;
    @XmlElement(required = true)
    protected List<TiposHabitacionType> tiposHabitacion;

    /**
     * Gets the value of the preciosRegimen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preciosRegimen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreciosRegimen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreciosRegimenType }
     * 
     * 
     */
    public List<PreciosRegimenType> getPreciosRegimen() {
        if (preciosRegimen == null) {
            preciosRegimen = new ArrayList<PreciosRegimenType>();
        }
        return this.preciosRegimen;
    }

    /**
     * Gets the value of the tiposHabitacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiposHabitacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposHabitacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TiposHabitacionType }
     * 
     * 
     */
    public List<TiposHabitacionType> getTiposHabitacion() {
        if (tiposHabitacion == null) {
            tiposHabitacion = new ArrayList<TiposHabitacionType>();
        }
        return this.tiposHabitacion;
    }

}

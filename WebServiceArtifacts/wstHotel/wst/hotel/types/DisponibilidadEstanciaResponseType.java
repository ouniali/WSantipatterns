
package wst.hotel.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disponibilidadEstanciaResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disponibilidadEstanciaResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disponibilidadEstanciaResponseRow" type="{types.hotel.wst}disponibilidadEstanciaResponseRowType" maxOccurs="unbounded"/>
 *         &lt;element name="totalesDisponibilidad" type="{types.hotel.wst}totalesDisponibilidadType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disponibilidadEstanciaResponseType", propOrder = {
    "disponibilidadEstanciaResponseRow",
    "totalesDisponibilidad"
})
public class DisponibilidadEstanciaResponseType {

    @XmlElement(required = true)
    protected List<DisponibilidadEstanciaResponseRowType> disponibilidadEstanciaResponseRow;
    @XmlElement(required = true)
    protected TotalesDisponibilidadType totalesDisponibilidad;

    /**
     * Gets the value of the disponibilidadEstanciaResponseRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disponibilidadEstanciaResponseRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisponibilidadEstanciaResponseRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisponibilidadEstanciaResponseRowType }
     * 
     * 
     */
    public List<DisponibilidadEstanciaResponseRowType> getDisponibilidadEstanciaResponseRow() {
        if (disponibilidadEstanciaResponseRow == null) {
            disponibilidadEstanciaResponseRow = new ArrayList<DisponibilidadEstanciaResponseRowType>();
        }
        return this.disponibilidadEstanciaResponseRow;
    }

    /**
     * Gets the value of the totalesDisponibilidad property.
     * 
     * @return
     *     possible object is
     *     {@link TotalesDisponibilidadType }
     *     
     */
    public TotalesDisponibilidadType getTotalesDisponibilidad() {
        return totalesDisponibilidad;
    }

    /**
     * Sets the value of the totalesDisponibilidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalesDisponibilidadType }
     *     
     */
    public void setTotalesDisponibilidad(TotalesDisponibilidadType value) {
        this.totalesDisponibilidad = value;
    }

}

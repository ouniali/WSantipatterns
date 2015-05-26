
package wst.hotel.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disponibilidadEstanciaV2ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disponibilidadEstanciaV2ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disponibilidadEstanciaV2ResponseRow" type="{types.hotel.wst}disponibilidadEstanciaV2ResponseRowType" maxOccurs="unbounded"/>
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
@XmlType(name = "disponibilidadEstanciaV2ResponseType", propOrder = {
    "disponibilidadEstanciaV2ResponseRow",
    "totalesDisponibilidad"
})
public class DisponibilidadEstanciaV2ResponseType {

    @XmlElement(required = true)
    protected List<DisponibilidadEstanciaV2ResponseRowType> disponibilidadEstanciaV2ResponseRow;
    @XmlElement(required = true)
    protected TotalesDisponibilidadType totalesDisponibilidad;

    /**
     * Gets the value of the disponibilidadEstanciaV2ResponseRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disponibilidadEstanciaV2ResponseRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisponibilidadEstanciaV2ResponseRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisponibilidadEstanciaV2ResponseRowType }
     * 
     * 
     */
    public List<DisponibilidadEstanciaV2ResponseRowType> getDisponibilidadEstanciaV2ResponseRow() {
        if (disponibilidadEstanciaV2ResponseRow == null) {
            disponibilidadEstanciaV2ResponseRow = new ArrayList<DisponibilidadEstanciaV2ResponseRowType>();
        }
        return this.disponibilidadEstanciaV2ResponseRow;
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

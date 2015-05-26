
package no.bring.logistics.shippingguide._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternativeDeliveryDatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternativeDeliveryDatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternativeDeliveryDate" type="{http://www.bring.no/logistics/shippingguide/1.0}AlternativeDeliveryDateType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeDeliveryDatesType", propOrder = {
    "alternativeDeliveryDate"
})
public class AlternativeDeliveryDatesType {

    @XmlElement(name = "AlternativeDeliveryDate")
    protected List<AlternativeDeliveryDateType> alternativeDeliveryDate;

    /**
     * Gets the value of the alternativeDeliveryDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeDeliveryDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeDeliveryDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeDeliveryDateType }
     * 
     * 
     */
    public List<AlternativeDeliveryDateType> getAlternativeDeliveryDate() {
        if (alternativeDeliveryDate == null) {
            alternativeDeliveryDate = new ArrayList<AlternativeDeliveryDateType>();
        }
        return this.alternativeDeliveryDate;
    }

}

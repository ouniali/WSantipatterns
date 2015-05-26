
package _170._0._168._192.tt.bookingapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfChargeBreakUp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChargeBreakUp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChargeBreakUp" type="{http://192.168.0.170/TT/BookingAPI}ChargeBreakUp" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChargeBreakUp", propOrder = {
    "chargeBreakUp"
})
public class ArrayOfChargeBreakUp {

    @XmlElement(name = "ChargeBreakUp", nillable = true)
    protected List<ChargeBreakUp> chargeBreakUp;

    /**
     * Gets the value of the chargeBreakUp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeBreakUp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeBreakUp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeBreakUp }
     * 
     * 
     */
    public List<ChargeBreakUp> getChargeBreakUp() {
        if (chargeBreakUp == null) {
            chargeBreakUp = new ArrayList<ChargeBreakUp>();
        }
        return this.chargeBreakUp;
    }

}

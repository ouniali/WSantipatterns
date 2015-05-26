
package ws_2013.cangooroo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import rentacar.ws_2013.RentACarBookingResult;


/**
 * <p>Java class for ArrayOfRentACarBookingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRentACarBookingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RentACarBookingResult" type="{WS_2013.RentACar}RentACarBookingResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRentACarBookingResult", propOrder = {
    "rentACarBookingResult"
})
public class ArrayOfRentACarBookingResult {

    @XmlElement(name = "RentACarBookingResult", nillable = true)
    protected List<RentACarBookingResult> rentACarBookingResult;

    /**
     * Gets the value of the rentACarBookingResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentACarBookingResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentACarBookingResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RentACarBookingResult }
     * 
     * 
     */
    public List<RentACarBookingResult> getRentACarBookingResult() {
        if (rentACarBookingResult == null) {
            rentACarBookingResult = new ArrayList<RentACarBookingResult>();
        }
        return this.rentACarBookingResult;
    }

}

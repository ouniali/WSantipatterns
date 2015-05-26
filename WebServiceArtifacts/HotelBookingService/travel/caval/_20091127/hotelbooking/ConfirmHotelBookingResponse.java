
package travel.caval._20091127.hotelbooking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for confirmHotelBookingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="confirmHotelBookingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://caval.travel/20091127/hotelBooking}cavalHotelBookingConfirmRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmHotelBookingResponse", propOrder = {
    "_return"
})
public class ConfirmHotelBookingResponse {

    @XmlElement(name = "return")
    protected CavalHotelBookingConfirmRS _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link CavalHotelBookingConfirmRS }
     *     
     */
    public CavalHotelBookingConfirmRS getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link CavalHotelBookingConfirmRS }
     *     
     */
    public void setReturn(CavalHotelBookingConfirmRS value) {
        this._return = value;
    }

}

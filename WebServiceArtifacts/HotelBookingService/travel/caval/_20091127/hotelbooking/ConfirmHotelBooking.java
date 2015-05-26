
package travel.caval._20091127.hotelbooking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for confirmHotelBooking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="confirmHotelBooking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rq" type="{http://caval.travel/20091127/hotelBooking}cavalHotelBookingConfirmRQ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmHotelBooking", propOrder = {
    "rq"
})
public class ConfirmHotelBooking {

    protected CavalHotelBookingConfirmRQ rq;

    /**
     * Gets the value of the rq property.
     * 
     * @return
     *     possible object is
     *     {@link CavalHotelBookingConfirmRQ }
     *     
     */
    public CavalHotelBookingConfirmRQ getRq() {
        return rq;
    }

    /**
     * Sets the value of the rq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CavalHotelBookingConfirmRQ }
     *     
     */
    public void setRq(CavalHotelBookingConfirmRQ value) {
        this.rq = value;
    }

}


package travel.caval._20091127.hotelbooking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAvailableHotels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAvailableHotels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rq" type="{http://caval.travel/20091127/hotelBooking}cavalHotelAvailabilityRQ" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableHotels", propOrder = {
    "rq"
})
public class GetAvailableHotels {

    protected CavalHotelAvailabilityRQ rq;

    /**
     * Gets the value of the rq property.
     * 
     * @return
     *     possible object is
     *     {@link CavalHotelAvailabilityRQ }
     *     
     */
    public CavalHotelAvailabilityRQ getRq() {
        return rq;
    }

    /**
     * Sets the value of the rq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CavalHotelAvailabilityRQ }
     *     
     */
    public void setRq(CavalHotelAvailabilityRQ value) {
        this.rq = value;
    }

}

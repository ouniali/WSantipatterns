
package travel.whl.api.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBookingsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBookingsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bookings" type="{http://api.whl.travel/soap}BookingsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBookingsResponseType", propOrder = {
    "bookings"
})
public class GetBookingsResponseType {

    @XmlElement(name = "Bookings", required = true)
    protected BookingsType bookings;

    /**
     * Gets the value of the bookings property.
     * 
     * @return
     *     possible object is
     *     {@link BookingsType }
     *     
     */
    public BookingsType getBookings() {
        return bookings;
    }

    /**
     * Sets the value of the bookings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingsType }
     *     
     */
    public void setBookings(BookingsType value) {
        this.bookings = value;
    }

}

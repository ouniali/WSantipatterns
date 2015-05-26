
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookingRequest" type="{http://192.168.0.170/TT/BookingAPI}WSGetBookingRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingRequest"
})
@XmlRootElement(name = "GetBooking")
public class GetBooking {

    protected WSGetBookingRequest bookingRequest;

    /**
     * Gets the value of the bookingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link WSGetBookingRequest }
     *     
     */
    public WSGetBookingRequest getBookingRequest() {
        return bookingRequest;
    }

    /**
     * Sets the value of the bookingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSGetBookingRequest }
     *     
     */
    public void setBookingRequest(WSGetBookingRequest value) {
        this.bookingRequest = value;
    }

}

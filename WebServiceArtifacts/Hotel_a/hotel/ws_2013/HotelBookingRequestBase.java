
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelBookingRequestBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelBookingRequestBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rooms" type="{WS_2013.Hotel}ArrayOfRoomBooking" minOccurs="0"/>
 *         &lt;element name="BookingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClientReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientObservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelBookingRequestBase", propOrder = {
    "token",
    "rooms",
    "bookingId",
    "clientReference",
    "clientObservation"
})
@XmlSeeAlso({
    HotelBookingRequest.class
})
public abstract class HotelBookingRequestBase {

    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "Rooms")
    protected ArrayOfRoomBooking rooms;
    @XmlElement(name = "BookingId")
    protected int bookingId;
    @XmlElement(name = "ClientReference")
    protected String clientReference;
    @XmlElement(name = "ClientObservation")
    protected String clientObservation;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomBooking }
     *     
     */
    public ArrayOfRoomBooking getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomBooking }
     *     
     */
    public void setRooms(ArrayOfRoomBooking value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the bookingId property.
     * 
     */
    public int getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     */
    public void setBookingId(int value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the clientReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientReference() {
        return clientReference;
    }

    /**
     * Sets the value of the clientReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientReference(String value) {
        this.clientReference = value;
    }

    /**
     * Gets the value of the clientObservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientObservation() {
        return clientObservation;
    }

    /**
     * Sets the value of the clientObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientObservation(String value) {
        this.clientObservation = value;
    }

}

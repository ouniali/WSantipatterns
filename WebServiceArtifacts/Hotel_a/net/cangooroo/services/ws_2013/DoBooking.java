
package net.cangooroo.services.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import clientcredential.ws_2013.ClientCredential;
import hotel.ws_2013.HotelBookingRequest;


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
 *         &lt;element name="credential" type="{WS_2013.ClientCredential}ClientCredential" minOccurs="0"/>
 *         &lt;element name="hotelBooking" type="{WS_2013.Hotel}HotelBookingRequest" minOccurs="0"/>
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
    "credential",
    "hotelBooking"
})
@XmlRootElement(name = "doBooking")
public class DoBooking {

    protected ClientCredential credential;
    protected HotelBookingRequest hotelBooking;

    /**
     * Gets the value of the credential property.
     * 
     * @return
     *     possible object is
     *     {@link ClientCredential }
     *     
     */
    public ClientCredential getCredential() {
        return credential;
    }

    /**
     * Sets the value of the credential property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientCredential }
     *     
     */
    public void setCredential(ClientCredential value) {
        this.credential = value;
    }

    /**
     * Gets the value of the hotelBooking property.
     * 
     * @return
     *     possible object is
     *     {@link HotelBookingRequest }
     *     
     */
    public HotelBookingRequest getHotelBooking() {
        return hotelBooking;
    }

    /**
     * Sets the value of the hotelBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelBookingRequest }
     *     
     */
    public void setHotelBooking(HotelBookingRequest value) {
        this.hotelBooking = value;
    }

}

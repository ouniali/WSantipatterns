
package net.cangooroo.services.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.HotelBookingRoomResult;


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
 *         &lt;element name="cancelBookingResult" type="{WS_2013.Hotel}HotelBookingRoomResult" minOccurs="0"/>
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
    "cancelBookingResult"
})
@XmlRootElement(name = "cancelBookingResponse")
public class CancelBookingResponse {

    protected HotelBookingRoomResult cancelBookingResult;

    /**
     * Gets the value of the cancelBookingResult property.
     * 
     * @return
     *     possible object is
     *     {@link HotelBookingRoomResult }
     *     
     */
    public HotelBookingRoomResult getCancelBookingResult() {
        return cancelBookingResult;
    }

    /**
     * Sets the value of the cancelBookingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelBookingRoomResult }
     *     
     */
    public void setCancelBookingResult(HotelBookingRoomResult value) {
        this.cancelBookingResult = value;
    }

}

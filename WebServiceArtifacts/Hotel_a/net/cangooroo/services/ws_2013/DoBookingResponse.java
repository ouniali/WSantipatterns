
package net.cangooroo.services.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ws_2013.cangooroo.BookingDetail;


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
 *         &lt;element name="doBookingResult" type="{Cangooroo.WS_2013}BookingDetail" minOccurs="0"/>
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
    "doBookingResult"
})
@XmlRootElement(name = "doBookingResponse")
public class DoBookingResponse {

    protected BookingDetail doBookingResult;

    /**
     * Gets the value of the doBookingResult property.
     * 
     * @return
     *     possible object is
     *     {@link BookingDetail }
     *     
     */
    public BookingDetail getDoBookingResult() {
        return doBookingResult;
    }

    /**
     * Sets the value of the doBookingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingDetail }
     *     
     */
    public void setDoBookingResult(BookingDetail value) {
        this.doBookingResult = value;
    }

}

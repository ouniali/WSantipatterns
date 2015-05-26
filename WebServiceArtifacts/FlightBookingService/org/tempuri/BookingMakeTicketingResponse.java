
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.TicketingResponse;


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
 *         &lt;element name="Booking_MakeTicketingResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}TicketingResponse" minOccurs="0"/>
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
    "bookingMakeTicketingResult"
})
@XmlRootElement(name = "Booking_MakeTicketingResponse")
public class BookingMakeTicketingResponse {

    @XmlElementRef(name = "Booking_MakeTicketingResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<TicketingResponse> bookingMakeTicketingResult;

    /**
     * Gets the value of the bookingMakeTicketingResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TicketingResponse }{@code >}
     *     
     */
    public JAXBElement<TicketingResponse> getBookingMakeTicketingResult() {
        return bookingMakeTicketingResult;
    }

    /**
     * Sets the value of the bookingMakeTicketingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TicketingResponse }{@code >}
     *     
     */
    public void setBookingMakeTicketingResult(JAXBElement<TicketingResponse> value) {
        this.bookingMakeTicketingResult = value;
    }

}

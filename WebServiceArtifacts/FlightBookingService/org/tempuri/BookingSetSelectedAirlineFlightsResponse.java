
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.ArrayOfFlights;


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
 *         &lt;element name="Booking_SetSelectedAirlineFlightsResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfFlights" minOccurs="0"/>
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
    "bookingSetSelectedAirlineFlightsResult"
})
@XmlRootElement(name = "Booking_SetSelectedAirlineFlightsResponse")
public class BookingSetSelectedAirlineFlightsResponse {

    @XmlElementRef(name = "Booking_SetSelectedAirlineFlightsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlights> bookingSetSelectedAirlineFlightsResult;

    /**
     * Gets the value of the bookingSetSelectedAirlineFlightsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlights }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFlights> getBookingSetSelectedAirlineFlightsResult() {
        return bookingSetSelectedAirlineFlightsResult;
    }

    /**
     * Sets the value of the bookingSetSelectedAirlineFlightsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlights }{@code >}
     *     
     */
    public void setBookingSetSelectedAirlineFlightsResult(JAXBElement<ArrayOfFlights> value) {
        this.bookingSetSelectedAirlineFlightsResult = value;
    }

}

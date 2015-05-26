
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.ArrayOfCustomerUserPaymentMethodsEN;


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
 *         &lt;element name="Booking_FlightSearchPaymentMethodsResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfCustomerUserPaymentMethodsEN" minOccurs="0"/>
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
    "bookingFlightSearchPaymentMethodsResult"
})
@XmlRootElement(name = "Booking_FlightSearchPaymentMethodsResponse")
public class BookingFlightSearchPaymentMethodsResponse {

    @XmlElementRef(name = "Booking_FlightSearchPaymentMethodsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomerUserPaymentMethodsEN> bookingFlightSearchPaymentMethodsResult;

    /**
     * Gets the value of the bookingFlightSearchPaymentMethodsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerUserPaymentMethodsEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomerUserPaymentMethodsEN> getBookingFlightSearchPaymentMethodsResult() {
        return bookingFlightSearchPaymentMethodsResult;
    }

    /**
     * Sets the value of the bookingFlightSearchPaymentMethodsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerUserPaymentMethodsEN }{@code >}
     *     
     */
    public void setBookingFlightSearchPaymentMethodsResult(JAXBElement<ArrayOfCustomerUserPaymentMethodsEN> value) {
        this.bookingFlightSearchPaymentMethodsResult = value;
    }

}

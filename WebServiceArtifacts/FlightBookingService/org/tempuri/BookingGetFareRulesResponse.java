
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.ArrayOfAirlineFareRule;


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
 *         &lt;element name="Booking_GetFareRulesResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAirlineFareRule" minOccurs="0"/>
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
    "bookingGetFareRulesResult"
})
@XmlRootElement(name = "Booking_GetFareRulesResponse")
public class BookingGetFareRulesResponse {

    @XmlElementRef(name = "Booking_GetFareRulesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAirlineFareRule> bookingGetFareRulesResult;

    /**
     * Gets the value of the bookingGetFareRulesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAirlineFareRule }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAirlineFareRule> getBookingGetFareRulesResult() {
        return bookingGetFareRulesResult;
    }

    /**
     * Sets the value of the bookingGetFareRulesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAirlineFareRule }{@code >}
     *     
     */
    public void setBookingGetFareRulesResult(JAXBElement<ArrayOfAirlineFareRule> value) {
        this.bookingGetFareRulesResult = value;
    }

}

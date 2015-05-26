
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.ArrayOfPackageSummary;


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
 *         &lt;element name="Booking_GetPackageSummaryResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfPackageSummary" minOccurs="0"/>
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
    "bookingGetPackageSummaryResult"
})
@XmlRootElement(name = "Booking_GetPackageSummaryResponse")
public class BookingGetPackageSummaryResponse {

    @XmlElementRef(name = "Booking_GetPackageSummaryResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPackageSummary> bookingGetPackageSummaryResult;

    /**
     * Gets the value of the bookingGetPackageSummaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPackageSummary }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPackageSummary> getBookingGetPackageSummaryResult() {
        return bookingGetPackageSummaryResult;
    }

    /**
     * Sets the value of the bookingGetPackageSummaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPackageSummary }{@code >}
     *     
     */
    public void setBookingGetPackageSummaryResult(JAXBElement<ArrayOfPackageSummary> value) {
        this.bookingGetPackageSummaryResult = value;
    }

}

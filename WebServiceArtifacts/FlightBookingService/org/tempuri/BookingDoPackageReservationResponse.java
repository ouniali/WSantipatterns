
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.ResultPackage;


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
 *         &lt;element name="Booking_DoPackageReservationResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ResultPackage" minOccurs="0"/>
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
    "bookingDoPackageReservationResult"
})
@XmlRootElement(name = "Booking_DoPackageReservationResponse")
public class BookingDoPackageReservationResponse {

    @XmlElementRef(name = "Booking_DoPackageReservationResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResultPackage> bookingDoPackageReservationResult;

    /**
     * Gets the value of the bookingDoPackageReservationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResultPackage }{@code >}
     *     
     */
    public JAXBElement<ResultPackage> getBookingDoPackageReservationResult() {
        return bookingDoPackageReservationResult;
    }

    /**
     * Sets the value of the bookingDoPackageReservationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResultPackage }{@code >}
     *     
     */
    public void setBookingDoPackageReservationResult(JAXBElement<ResultPackage> value) {
        this.bookingDoPackageReservationResult = value;
    }

}

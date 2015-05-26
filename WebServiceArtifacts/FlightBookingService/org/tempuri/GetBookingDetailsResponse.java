
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.ReservationDetails;


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
 *         &lt;element name="GetBookingDetailsResult" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ReservationDetails" minOccurs="0"/>
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
    "getBookingDetailsResult"
})
@XmlRootElement(name = "GetBookingDetailsResponse")
public class GetBookingDetailsResponse {

    @XmlElementRef(name = "GetBookingDetailsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReservationDetails> getBookingDetailsResult;

    /**
     * Gets the value of the getBookingDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReservationDetails }{@code >}
     *     
     */
    public JAXBElement<ReservationDetails> getGetBookingDetailsResult() {
        return getBookingDetailsResult;
    }

    /**
     * Sets the value of the getBookingDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReservationDetails }{@code >}
     *     
     */
    public void setGetBookingDetailsResult(JAXBElement<ReservationDetails> value) {
        this.getBookingDetailsResult = value;
    }

}

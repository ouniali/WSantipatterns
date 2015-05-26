
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="fareQuoteRequest" type="{http://192.168.0.170/TT/BookingAPI}WSGetFareQuoteRequest" minOccurs="0"/>
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
    "fareQuoteRequest"
})
@XmlRootElement(name = "GetFareQuote")
public class GetFareQuote {

    protected WSGetFareQuoteRequest fareQuoteRequest;

    /**
     * Gets the value of the fareQuoteRequest property.
     * 
     * @return
     *     possible object is
     *     {@link WSGetFareQuoteRequest }
     *     
     */
    public WSGetFareQuoteRequest getFareQuoteRequest() {
        return fareQuoteRequest;
    }

    /**
     * Sets the value of the fareQuoteRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSGetFareQuoteRequest }
     *     
     */
    public void setFareQuoteRequest(WSGetFareQuoteRequest value) {
        this.fareQuoteRequest = value;
    }

}

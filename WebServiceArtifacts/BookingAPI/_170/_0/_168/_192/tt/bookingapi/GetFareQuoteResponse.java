
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetFareQuoteResult" type="{http://192.168.0.170/TT/BookingAPI}WSGetFareQuoteResponse" minOccurs="0"/>
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
    "getFareQuoteResult"
})
@XmlRootElement(name = "GetFareQuoteResponse")
public class GetFareQuoteResponse {

    @XmlElement(name = "GetFareQuoteResult")
    protected WSGetFareQuoteResponse getFareQuoteResult;

    /**
     * Gets the value of the getFareQuoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSGetFareQuoteResponse }
     *     
     */
    public WSGetFareQuoteResponse getGetFareQuoteResult() {
        return getFareQuoteResult;
    }

    /**
     * Sets the value of the getFareQuoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSGetFareQuoteResponse }
     *     
     */
    public void setGetFareQuoteResult(WSGetFareQuoteResponse value) {
        this.getFareQuoteResult = value;
    }

}

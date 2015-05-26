
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
 *         &lt;element name="GetTripDetailResult" type="{http://192.168.0.170/TT/BookingAPI}WSGetTripDetailResponse" minOccurs="0"/>
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
    "getTripDetailResult"
})
@XmlRootElement(name = "GetTripDetailResponse")
public class GetTripDetailResponse {

    @XmlElement(name = "GetTripDetailResult")
    protected WSGetTripDetailResponse getTripDetailResult;

    /**
     * Gets the value of the getTripDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSGetTripDetailResponse }
     *     
     */
    public WSGetTripDetailResponse getGetTripDetailResult() {
        return getTripDetailResult;
    }

    /**
     * Sets the value of the getTripDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSGetTripDetailResponse }
     *     
     */
    public void setGetTripDetailResult(WSGetTripDetailResponse value) {
        this.getTripDetailResult = value;
    }

}

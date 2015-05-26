
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
 *         &lt;element name="GetChangeRequestStatusResult" type="{http://192.168.0.170/TT/BookingAPI}WSChangeRequestStatusResponse" minOccurs="0"/>
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
    "getChangeRequestStatusResult"
})
@XmlRootElement(name = "GetChangeRequestStatusResponse")
public class GetChangeRequestStatusResponse {

    @XmlElement(name = "GetChangeRequestStatusResult")
    protected WSChangeRequestStatusResponse getChangeRequestStatusResult;

    /**
     * Gets the value of the getChangeRequestStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSChangeRequestStatusResponse }
     *     
     */
    public WSChangeRequestStatusResponse getGetChangeRequestStatusResult() {
        return getChangeRequestStatusResult;
    }

    /**
     * Sets the value of the getChangeRequestStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSChangeRequestStatusResponse }
     *     
     */
    public void setGetChangeRequestStatusResult(WSChangeRequestStatusResponse value) {
        this.getChangeRequestStatusResult = value;
    }

}


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
 *         &lt;element name="GetChangeRequestQueueResult" type="{http://192.168.0.170/TT/BookingAPI}WSChangeRequestQueueResponse" minOccurs="0"/>
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
    "getChangeRequestQueueResult"
})
@XmlRootElement(name = "GetChangeRequestQueueResponse")
public class GetChangeRequestQueueResponse {

    @XmlElement(name = "GetChangeRequestQueueResult")
    protected WSChangeRequestQueueResponse getChangeRequestQueueResult;

    /**
     * Gets the value of the getChangeRequestQueueResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSChangeRequestQueueResponse }
     *     
     */
    public WSChangeRequestQueueResponse getGetChangeRequestQueueResult() {
        return getChangeRequestQueueResult;
    }

    /**
     * Sets the value of the getChangeRequestQueueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSChangeRequestQueueResponse }
     *     
     */
    public void setGetChangeRequestQueueResult(WSChangeRequestQueueResponse value) {
        this.getChangeRequestQueueResult = value;
    }

}

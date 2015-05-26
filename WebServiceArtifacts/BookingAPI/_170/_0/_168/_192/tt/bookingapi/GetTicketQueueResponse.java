
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
 *         &lt;element name="GetTicketQueueResult" type="{http://192.168.0.170/TT/BookingAPI}WSTicketQueueResponse" minOccurs="0"/>
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
    "getTicketQueueResult"
})
@XmlRootElement(name = "GetTicketQueueResponse")
public class GetTicketQueueResponse {

    @XmlElement(name = "GetTicketQueueResult")
    protected WSTicketQueueResponse getTicketQueueResult;

    /**
     * Gets the value of the getTicketQueueResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSTicketQueueResponse }
     *     
     */
    public WSTicketQueueResponse getGetTicketQueueResult() {
        return getTicketQueueResult;
    }

    /**
     * Sets the value of the getTicketQueueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTicketQueueResponse }
     *     
     */
    public void setGetTicketQueueResult(WSTicketQueueResponse value) {
        this.getTicketQueueResult = value;
    }

}

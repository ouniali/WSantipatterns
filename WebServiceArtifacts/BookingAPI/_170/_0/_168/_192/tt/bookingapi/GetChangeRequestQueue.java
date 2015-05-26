
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
 *         &lt;element name="wsChangeRequestQueueRequest" type="{http://192.168.0.170/TT/BookingAPI}WSChangeRequestQueueRequest" minOccurs="0"/>
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
    "wsChangeRequestQueueRequest"
})
@XmlRootElement(name = "GetChangeRequestQueue")
public class GetChangeRequestQueue {

    protected WSChangeRequestQueueRequest wsChangeRequestQueueRequest;

    /**
     * Gets the value of the wsChangeRequestQueueRequest property.
     * 
     * @return
     *     possible object is
     *     {@link WSChangeRequestQueueRequest }
     *     
     */
    public WSChangeRequestQueueRequest getWsChangeRequestQueueRequest() {
        return wsChangeRequestQueueRequest;
    }

    /**
     * Sets the value of the wsChangeRequestQueueRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSChangeRequestQueueRequest }
     *     
     */
    public void setWsChangeRequestQueueRequest(WSChangeRequestQueueRequest value) {
        this.wsChangeRequestQueueRequest = value;
    }

}


package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSChangeRequestQueueResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSChangeRequestQueueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeReqQueueItems" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSChangeRequestQueue" minOccurs="0"/>
 *         &lt;element name="QueueCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Status" type="{http://192.168.0.170/TT/BookingAPI}WSStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSChangeRequestQueueResponse", propOrder = {
    "changeReqQueueItems",
    "queueCount",
    "status"
})
public class WSChangeRequestQueueResponse {

    @XmlElement(name = "ChangeReqQueueItems")
    protected ArrayOfWSChangeRequestQueue changeReqQueueItems;
    @XmlElement(name = "QueueCount")
    protected int queueCount;
    @XmlElement(name = "Status")
    protected WSStatus status;

    /**
     * Gets the value of the changeReqQueueItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSChangeRequestQueue }
     *     
     */
    public ArrayOfWSChangeRequestQueue getChangeReqQueueItems() {
        return changeReqQueueItems;
    }

    /**
     * Sets the value of the changeReqQueueItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSChangeRequestQueue }
     *     
     */
    public void setChangeReqQueueItems(ArrayOfWSChangeRequestQueue value) {
        this.changeReqQueueItems = value;
    }

    /**
     * Gets the value of the queueCount property.
     * 
     */
    public int getQueueCount() {
        return queueCount;
    }

    /**
     * Sets the value of the queueCount property.
     * 
     */
    public void setQueueCount(int value) {
        this.queueCount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WSStatus }
     *     
     */
    public WSStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSStatus }
     *     
     */
    public void setStatus(WSStatus value) {
        this.status = value;
    }

}

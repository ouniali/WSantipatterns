
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSBookingQueueResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSBookingQueueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Itinerarys" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSFlightItinerary" minOccurs="0"/>
 *         &lt;element name="BookingDetails" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSBookingDetailForQueue" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://192.168.0.170/TT/BookingAPI}WSStatus" minOccurs="0"/>
 *         &lt;element name="QueueCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSBookingQueueResponse", propOrder = {
    "itinerarys",
    "bookingDetails",
    "status",
    "queueCount"
})
public class WSBookingQueueResponse {

    @XmlElement(name = "Itinerarys")
    protected ArrayOfWSFlightItinerary itinerarys;
    @XmlElement(name = "BookingDetails")
    protected ArrayOfWSBookingDetailForQueue bookingDetails;
    @XmlElement(name = "Status")
    protected WSStatus status;
    @XmlElement(name = "QueueCount")
    protected int queueCount;

    /**
     * Gets the value of the itinerarys property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSFlightItinerary }
     *     
     */
    public ArrayOfWSFlightItinerary getItinerarys() {
        return itinerarys;
    }

    /**
     * Sets the value of the itinerarys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSFlightItinerary }
     *     
     */
    public void setItinerarys(ArrayOfWSFlightItinerary value) {
        this.itinerarys = value;
    }

    /**
     * Gets the value of the bookingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSBookingDetailForQueue }
     *     
     */
    public ArrayOfWSBookingDetailForQueue getBookingDetails() {
        return bookingDetails;
    }

    /**
     * Sets the value of the bookingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSBookingDetailForQueue }
     *     
     */
    public void setBookingDetails(ArrayOfWSBookingDetailForQueue value) {
        this.bookingDetails = value;
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

}


package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSGetTripDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSGetTripDetailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingDetail" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSBookingDetail" minOccurs="0"/>
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
@XmlType(name = "WSGetTripDetailResponse", propOrder = {
    "bookingDetail",
    "status"
})
public class WSGetTripDetailResponse {

    @XmlElement(name = "BookingDetail")
    protected ArrayOfWSBookingDetail bookingDetail;
    @XmlElement(name = "Status")
    protected WSStatus status;

    /**
     * Gets the value of the bookingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSBookingDetail }
     *     
     */
    public ArrayOfWSBookingDetail getBookingDetail() {
        return bookingDetail;
    }

    /**
     * Sets the value of the bookingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSBookingDetail }
     *     
     */
    public void setBookingDetail(ArrayOfWSBookingDetail value) {
        this.bookingDetail = value;
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

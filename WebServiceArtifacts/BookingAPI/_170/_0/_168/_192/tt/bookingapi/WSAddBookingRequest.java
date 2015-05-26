
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSAddBookingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSAddBookingRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookingStatus" type="{http://192.168.0.170/TT/BookingAPI}APIBookingStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSAddBookingRequest", propOrder = {
    "refId",
    "bookingStatus"
})
public class WSAddBookingRequest {

    @XmlElement(name = "RefId")
    protected int refId;
    @XmlElement(name = "BookingStatus", required = true)
    @XmlSchemaType(name = "string")
    protected APIBookingStatus bookingStatus;

    /**
     * Gets the value of the refId property.
     * 
     */
    public int getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     */
    public void setRefId(int value) {
        this.refId = value;
    }

    /**
     * Gets the value of the bookingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link APIBookingStatus }
     *     
     */
    public APIBookingStatus getBookingStatus() {
        return bookingStatus;
    }

    /**
     * Sets the value of the bookingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIBookingStatus }
     *     
     */
    public void setBookingStatus(APIBookingStatus value) {
        this.bookingStatus = value;
    }

}


package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSBookingDetailForQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSBookingDetailForQueue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AgencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Status" type="{http://192.168.0.170/TT/BookingAPI}BookingStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSBookingDetailForQueue", propOrder = {
    "createdOn",
    "agencyId",
    "bookingId",
    "status"
})
public class WSBookingDetailForQueue {

    @XmlElement(name = "CreatedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdOn;
    @XmlElement(name = "AgencyId")
    protected int agencyId;
    @XmlElement(name = "BookingId")
    protected int bookingId;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected BookingStatus status;

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedOn(XMLGregorianCalendar value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the agencyId property.
     * 
     */
    public int getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     */
    public void setAgencyId(int value) {
        this.agencyId = value;
    }

    /**
     * Gets the value of the bookingId property.
     * 
     */
    public int getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     */
    public void setBookingId(int value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BookingStatus }
     *     
     */
    public BookingStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingStatus }
     *     
     */
    public void setStatus(BookingStatus value) {
        this.status = value;
    }

}


package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSSendChangeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSendChangeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestType" type="{http://192.168.0.170/TT/BookingAPI}ChangeRequestType"/>
 *         &lt;element name="TicketId" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangeRequestModeComment" type="{http://192.168.0.170/TT/BookingAPI}ChangeRequestModeComment"/>
 *         &lt;element name="SubAgentID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsFullBookingCancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Sectors" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSendChangeRequest", propOrder = {
    "bookingId",
    "requestType",
    "ticketId",
    "remarks",
    "changeRequestModeComment",
    "subAgentID",
    "isFullBookingCancel",
    "sectors"
})
public class WSSendChangeRequest {

    @XmlElement(name = "BookingId")
    protected String bookingId;
    @XmlElement(name = "RequestType", required = true)
    @XmlSchemaType(name = "string")
    protected ChangeRequestType requestType;
    @XmlElement(name = "TicketId")
    protected ArrayOfInt ticketId;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "ChangeRequestModeComment", required = true)
    @XmlSchemaType(name = "string")
    protected ChangeRequestModeComment changeRequestModeComment;
    @XmlElement(name = "SubAgentID")
    protected int subAgentID;
    @XmlElement(name = "IsFullBookingCancel")
    protected boolean isFullBookingCancel;
    @XmlElement(name = "Sectors")
    protected ArrayOfString sectors;

    /**
     * Gets the value of the bookingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingId(String value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeRequestType }
     *     
     */
    public ChangeRequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeRequestType }
     *     
     */
    public void setRequestType(ChangeRequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the ticketId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getTicketId() {
        return ticketId;
    }

    /**
     * Sets the value of the ticketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setTicketId(ArrayOfInt value) {
        this.ticketId = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the changeRequestModeComment property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeRequestModeComment }
     *     
     */
    public ChangeRequestModeComment getChangeRequestModeComment() {
        return changeRequestModeComment;
    }

    /**
     * Sets the value of the changeRequestModeComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeRequestModeComment }
     *     
     */
    public void setChangeRequestModeComment(ChangeRequestModeComment value) {
        this.changeRequestModeComment = value;
    }

    /**
     * Gets the value of the subAgentID property.
     * 
     */
    public int getSubAgentID() {
        return subAgentID;
    }

    /**
     * Sets the value of the subAgentID property.
     * 
     */
    public void setSubAgentID(int value) {
        this.subAgentID = value;
    }

    /**
     * Gets the value of the isFullBookingCancel property.
     * 
     */
    public boolean isIsFullBookingCancel() {
        return isFullBookingCancel;
    }

    /**
     * Sets the value of the isFullBookingCancel property.
     * 
     */
    public void setIsFullBookingCancel(boolean value) {
        this.isFullBookingCancel = value;
    }

    /**
     * Gets the value of the sectors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getSectors() {
        return sectors;
    }

    /**
     * Sets the value of the sectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setSectors(ArrayOfString value) {
        this.sectors = value;
    }

}


package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSBookingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSBookingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Agency" type="{http://192.168.0.170/TT/BookingAPI}WSAgency" minOccurs="0"/>
 *         &lt;element name="PNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://192.168.0.170/TT/BookingAPI}WSStatus" minOccurs="0"/>
 *         &lt;element name="Fare" type="{http://192.168.0.170/TT/BookingAPI}WSFare" minOccurs="0"/>
 *         &lt;element name="Passenger" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSPassenger" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Segment" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSSegment" minOccurs="0"/>
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasis" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Ticket" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSTicket" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://192.168.0.170/TT/BookingAPI}BookingSource"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSBookingDetail", propOrder = {
    "bookingId",
    "agency",
    "pnr",
    "errorMsg",
    "remarks",
    "status",
    "fare",
    "passenger",
    "origin",
    "destination",
    "segment",
    "fareType",
    "fareBasis",
    "ticket",
    "source"
})
public class WSBookingDetail {

    @XmlElement(name = "BookingId")
    protected String bookingId;
    @XmlElement(name = "Agency")
    protected WSAgency agency;
    @XmlElement(name = "PNR")
    protected String pnr;
    @XmlElement(name = "ErrorMsg")
    protected String errorMsg;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "Status")
    protected WSStatus status;
    @XmlElement(name = "Fare")
    protected WSFare fare;
    @XmlElement(name = "Passenger")
    protected ArrayOfWSPassenger passenger;
    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "Segment")
    protected ArrayOfWSSegment segment;
    @XmlElement(name = "FareType")
    protected String fareType;
    @XmlElement(name = "FareBasis")
    protected ArrayOfString fareBasis;
    @XmlElement(name = "Ticket")
    protected ArrayOfWSTicket ticket;
    @XmlElement(name = "Source", required = true)
    @XmlSchemaType(name = "string")
    protected BookingSource source;

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
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link WSAgency }
     *     
     */
    public WSAgency getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSAgency }
     *     
     */
    public void setAgency(WSAgency value) {
        this.agency = value;
    }

    /**
     * Gets the value of the pnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNR() {
        return pnr;
    }

    /**
     * Sets the value of the pnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNR(String value) {
        this.pnr = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
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
     * Gets the value of the fare property.
     * 
     * @return
     *     possible object is
     *     {@link WSFare }
     *     
     */
    public WSFare getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSFare }
     *     
     */
    public void setFare(WSFare value) {
        this.fare = value;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSPassenger }
     *     
     */
    public ArrayOfWSPassenger getPassenger() {
        return passenger;
    }

    /**
     * Sets the value of the passenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSPassenger }
     *     
     */
    public void setPassenger(ArrayOfWSPassenger value) {
        this.passenger = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSSegment }
     *     
     */
    public ArrayOfWSSegment getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSSegment }
     *     
     */
    public void setSegment(ArrayOfWSSegment value) {
        this.segment = value;
    }

    /**
     * Gets the value of the fareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareType() {
        return fareType;
    }

    /**
     * Sets the value of the fareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareType(String value) {
        this.fareType = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setFareBasis(ArrayOfString value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSTicket }
     *     
     */
    public ArrayOfWSTicket getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSTicket }
     *     
     */
    public void setTicket(ArrayOfWSTicket value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link BookingSource }
     *     
     */
    public BookingSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingSource }
     *     
     */
    public void setSource(BookingSource value) {
        this.source = value;
    }

}

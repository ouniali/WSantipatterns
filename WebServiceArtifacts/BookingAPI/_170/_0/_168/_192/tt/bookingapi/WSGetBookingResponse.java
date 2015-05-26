
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSGetBookingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSGetBookingResponse">
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
 *         &lt;element name="FareRule" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSFareRule" minOccurs="0"/>
 *         &lt;element name="Ticket" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSTicket" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://192.168.0.170/TT/BookingAPI}BookingSource"/>
 *         &lt;element name="IsDomestic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InvoiceDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvoiceCreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AgentRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSGetBookingResponse", propOrder = {
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
    "fareRule",
    "ticket",
    "source",
    "isDomestic",
    "invoiceDocumentNumber",
    "invoiceNumber",
    "invoiceCreatedOn",
    "agentRemarks",
    "ownerName"
})
public class WSGetBookingResponse {

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
    @XmlElement(name = "FareRule")
    protected ArrayOfWSFareRule fareRule;
    @XmlElement(name = "Ticket")
    protected ArrayOfWSTicket ticket;
    @XmlElement(name = "Source", required = true)
    @XmlSchemaType(name = "string")
    protected BookingSource source;
    @XmlElement(name = "IsDomestic")
    protected boolean isDomestic;
    @XmlElement(name = "InvoiceDocumentNumber")
    protected String invoiceDocumentNumber;
    @XmlElement(name = "InvoiceNumber")
    protected String invoiceNumber;
    @XmlElement(name = "InvoiceCreatedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invoiceCreatedOn;
    @XmlElement(name = "AgentRemarks")
    protected String agentRemarks;
    @XmlElement(name = "OwnerName")
    protected String ownerName;

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
     * Gets the value of the fareRule property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSFareRule }
     *     
     */
    public ArrayOfWSFareRule getFareRule() {
        return fareRule;
    }

    /**
     * Sets the value of the fareRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSFareRule }
     *     
     */
    public void setFareRule(ArrayOfWSFareRule value) {
        this.fareRule = value;
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

    /**
     * Gets the value of the isDomestic property.
     * 
     */
    public boolean isIsDomestic() {
        return isDomestic;
    }

    /**
     * Sets the value of the isDomestic property.
     * 
     */
    public void setIsDomestic(boolean value) {
        this.isDomestic = value;
    }

    /**
     * Gets the value of the invoiceDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDocumentNumber() {
        return invoiceDocumentNumber;
    }

    /**
     * Sets the value of the invoiceDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDocumentNumber(String value) {
        this.invoiceDocumentNumber = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the invoiceCreatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceCreatedOn() {
        return invoiceCreatedOn;
    }

    /**
     * Sets the value of the invoiceCreatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceCreatedOn(XMLGregorianCalendar value) {
        this.invoiceCreatedOn = value;
    }

    /**
     * Gets the value of the agentRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentRemarks() {
        return agentRemarks;
    }

    /**
     * Sets the value of the agentRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentRemarks(String value) {
        this.agentRemarks = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

}

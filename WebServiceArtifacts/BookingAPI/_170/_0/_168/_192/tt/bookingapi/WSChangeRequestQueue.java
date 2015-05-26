
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSChangeRequestQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSChangeRequestQueue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BookingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookingSource" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Itinerary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MemberId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaxFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RequestTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceRequestData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSChangeRequestQueue", propOrder = {
    "agencyId",
    "agencyName",
    "bookingDate",
    "bookingId",
    "bookingSource",
    "carrier",
    "docName",
    "flightDate",
    "flightNumber",
    "itemId",
    "itinerary",
    "memberId",
    "paxFullName",
    "pnr",
    "requestedOn",
    "requestTypeId",
    "serviceRequestData",
    "statusId"
})
public class WSChangeRequestQueue {

    @XmlElement(name = "AgencyId")
    protected int agencyId;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "BookingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookingDate;
    @XmlElement(name = "BookingId")
    protected int bookingId;
    @XmlElement(name = "BookingSource")
    protected int bookingSource;
    @XmlElement(name = "Carrier")
    protected String carrier;
    @XmlElement(name = "DocName")
    protected String docName;
    @XmlElement(name = "FlightDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flightDate;
    @XmlElement(name = "FlightNumber")
    protected String flightNumber;
    @XmlElement(name = "ItemId")
    protected int itemId;
    @XmlElement(name = "Itinerary")
    protected String itinerary;
    @XmlElement(name = "MemberId")
    protected int memberId;
    @XmlElement(name = "PaxFullName")
    protected String paxFullName;
    @XmlElement(name = "PNR")
    protected String pnr;
    @XmlElement(name = "RequestedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestedOn;
    @XmlElement(name = "RequestTypeId")
    protected int requestTypeId;
    @XmlElement(name = "ServiceRequestData")
    protected String serviceRequestData;
    @XmlElement(name = "StatusId")
    protected int statusId;

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
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingDate(XMLGregorianCalendar value) {
        this.bookingDate = value;
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
     * Gets the value of the bookingSource property.
     * 
     */
    public int getBookingSource() {
        return bookingSource;
    }

    /**
     * Sets the value of the bookingSource property.
     * 
     */
    public void setBookingSource(int value) {
        this.bookingSource = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the docName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocName() {
        return docName;
    }

    /**
     * Sets the value of the docName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocName(String value) {
        this.docName = value;
    }

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlightDate(XMLGregorianCalendar value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     */
    public void setItemId(int value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItinerary(String value) {
        this.itinerary = value;
    }

    /**
     * Gets the value of the memberId property.
     * 
     */
    public int getMemberId() {
        return memberId;
    }

    /**
     * Sets the value of the memberId property.
     * 
     */
    public void setMemberId(int value) {
        this.memberId = value;
    }

    /**
     * Gets the value of the paxFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxFullName() {
        return paxFullName;
    }

    /**
     * Sets the value of the paxFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxFullName(String value) {
        this.paxFullName = value;
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
     * Gets the value of the requestedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedOn() {
        return requestedOn;
    }

    /**
     * Sets the value of the requestedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedOn(XMLGregorianCalendar value) {
        this.requestedOn = value;
    }

    /**
     * Gets the value of the requestTypeId property.
     * 
     */
    public int getRequestTypeId() {
        return requestTypeId;
    }

    /**
     * Sets the value of the requestTypeId property.
     * 
     */
    public void setRequestTypeId(int value) {
        this.requestTypeId = value;
    }

    /**
     * Gets the value of the serviceRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRequestData() {
        return serviceRequestData;
    }

    /**
     * Sets the value of the serviceRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRequestData(String value) {
        this.serviceRequestData = value;
    }

    /**
     * Gets the value of the statusId property.
     * 
     */
    public int getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     */
    public void setStatusId(int value) {
        this.statusId = value;
    }

}

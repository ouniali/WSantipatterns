
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxType" type="{http://192.168.0.170/TT/BookingAPI}PassengerType"/>
 *         &lt;element name="Fare" type="{http://192.168.0.170/TT/BookingAPI}WSFare" minOccurs="0"/>
 *         &lt;element name="SegmentAdditionalInfo" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSSegAdditionalInfo" minOccurs="0"/>
 *         &lt;element name="ValidatingAirline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorporateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceFeeDisplayType" type="{http://192.168.0.170/TT/BookingAPI}ServiceFeeDisplay"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTicket", propOrder = {
    "ticketId",
    "ticketNumber",
    "issueDate",
    "title",
    "firstName",
    "lastName",
    "paxType",
    "fare",
    "segmentAdditionalInfo",
    "validatingAirline",
    "corporateCode",
    "tourCode",
    "endorsement",
    "remarks",
    "serviceFeeDisplayType"
})
public class WSTicket {

    @XmlElement(name = "TicketId")
    protected int ticketId;
    @XmlElement(name = "TicketNumber")
    protected String ticketNumber;
    @XmlElement(name = "IssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "PaxType", required = true)
    @XmlSchemaType(name = "string")
    protected PassengerType paxType;
    @XmlElement(name = "Fare")
    protected WSFare fare;
    @XmlElement(name = "SegmentAdditionalInfo")
    protected ArrayOfWSSegAdditionalInfo segmentAdditionalInfo;
    @XmlElement(name = "ValidatingAirline")
    protected String validatingAirline;
    @XmlElement(name = "CorporateCode")
    protected String corporateCode;
    @XmlElement(name = "TourCode")
    protected String tourCode;
    @XmlElement(name = "Endorsement")
    protected String endorsement;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "ServiceFeeDisplayType", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceFeeDisplay serviceFeeDisplayType;

    /**
     * Gets the value of the ticketId property.
     * 
     */
    public int getTicketId() {
        return ticketId;
    }

    /**
     * Sets the value of the ticketId property.
     * 
     */
    public void setTicketId(int value) {
        this.ticketId = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the paxType property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerType }
     *     
     */
    public PassengerType getPaxType() {
        return paxType;
    }

    /**
     * Sets the value of the paxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerType }
     *     
     */
    public void setPaxType(PassengerType value) {
        this.paxType = value;
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
     * Gets the value of the segmentAdditionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSSegAdditionalInfo }
     *     
     */
    public ArrayOfWSSegAdditionalInfo getSegmentAdditionalInfo() {
        return segmentAdditionalInfo;
    }

    /**
     * Sets the value of the segmentAdditionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSSegAdditionalInfo }
     *     
     */
    public void setSegmentAdditionalInfo(ArrayOfWSSegAdditionalInfo value) {
        this.segmentAdditionalInfo = value;
    }

    /**
     * Gets the value of the validatingAirline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingAirline() {
        return validatingAirline;
    }

    /**
     * Sets the value of the validatingAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingAirline(String value) {
        this.validatingAirline = value;
    }

    /**
     * Gets the value of the corporateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateCode() {
        return corporateCode;
    }

    /**
     * Sets the value of the corporateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateCode(String value) {
        this.corporateCode = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the endorsement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndorsement() {
        return endorsement;
    }

    /**
     * Sets the value of the endorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndorsement(String value) {
        this.endorsement = value;
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
     * Gets the value of the serviceFeeDisplayType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeDisplay }
     *     
     */
    public ServiceFeeDisplay getServiceFeeDisplayType() {
        return serviceFeeDisplayType;
    }

    /**
     * Sets the value of the serviceFeeDisplayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeDisplay }
     *     
     */
    public void setServiceFeeDisplayType(ServiceFeeDisplay value) {
        this.serviceFeeDisplayType = value;
    }

}


package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTicketRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTicketRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Segment" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSSegment" minOccurs="0"/>
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareRule" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSFareRule" minOccurs="0"/>
 *         &lt;element name="Fare" type="{http://192.168.0.170/TT/BookingAPI}WSFare" minOccurs="0"/>
 *         &lt;element name="Passenger" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSPassenger" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstantTicket" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PaymentInformation" type="{http://192.168.0.170/TT/BookingAPI}WSPaymentInformation" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://192.168.0.170/TT/BookingAPI}BookingSource"/>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOneWayBooking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CorporateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionalPlanType" type="{http://192.168.0.170/TT/BookingAPI}PromotionalPlanType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTicketRequest", propOrder = {
    "bookingID",
    "origin",
    "destination",
    "segment",
    "fareType",
    "fareRule",
    "fare",
    "passenger",
    "remarks",
    "instantTicket",
    "paymentInformation",
    "source",
    "sessionId",
    "isOneWayBooking",
    "corporateCode",
    "tourCode",
    "endorsement",
    "promotionalPlanType"
})
public class WSTicketRequest {

    @XmlElement(name = "BookingID")
    protected String bookingID;
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
    @XmlElement(name = "Fare")
    protected WSFare fare;
    @XmlElement(name = "Passenger")
    protected ArrayOfWSPassenger passenger;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "InstantTicket")
    protected boolean instantTicket;
    @XmlElement(name = "PaymentInformation")
    protected WSPaymentInformation paymentInformation;
    @XmlElement(name = "Source", required = true)
    @XmlSchemaType(name = "string")
    protected BookingSource source;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "IsOneWayBooking")
    protected boolean isOneWayBooking;
    @XmlElement(name = "CorporateCode")
    protected String corporateCode;
    @XmlElement(name = "TourCode")
    protected String tourCode;
    @XmlElement(name = "Endorsement")
    protected String endorsement;
    @XmlElement(name = "PromotionalPlanType", required = true)
    @XmlSchemaType(name = "string")
    protected PromotionalPlanType promotionalPlanType;

    /**
     * Gets the value of the bookingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingID() {
        return bookingID;
    }

    /**
     * Sets the value of the bookingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingID(String value) {
        this.bookingID = value;
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
     * Gets the value of the instantTicket property.
     * 
     */
    public boolean isInstantTicket() {
        return instantTicket;
    }

    /**
     * Sets the value of the instantTicket property.
     * 
     */
    public void setInstantTicket(boolean value) {
        this.instantTicket = value;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link WSPaymentInformation }
     *     
     */
    public WSPaymentInformation getPaymentInformation() {
        return paymentInformation;
    }

    /**
     * Sets the value of the paymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPaymentInformation }
     *     
     */
    public void setPaymentInformation(WSPaymentInformation value) {
        this.paymentInformation = value;
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
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the isOneWayBooking property.
     * 
     */
    public boolean isIsOneWayBooking() {
        return isOneWayBooking;
    }

    /**
     * Sets the value of the isOneWayBooking property.
     * 
     */
    public void setIsOneWayBooking(boolean value) {
        this.isOneWayBooking = value;
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
     * Gets the value of the promotionalPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalPlanType }
     *     
     */
    public PromotionalPlanType getPromotionalPlanType() {
        return promotionalPlanType;
    }

    /**
     * Sets the value of the promotionalPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalPlanType }
     *     
     */
    public void setPromotionalPlanType(PromotionalPlanType value) {
        this.promotionalPlanType = value;
    }

}


package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReservationResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationResType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelExtraInfo" type="{http://schemas.tourico.com/webservices/hotelv3}HotelExtraInfo" minOccurs="0"/>
 *         &lt;element name="RoomExtraInfo" type="{http://schemas.tourico.com/webservices/hotelv3}AmendRoomExtraInfo" minOccurs="0"/>
 *         &lt;element name="Passenger" type="{http://schemas.tourico.com/webservices/hotelv3}Passenger" minOccurs="0"/>
 *         &lt;element name="CancellationPolicies" type="{http://schemas.tourico.com/webservices/hotelv3}CancellationPoliciesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="reservationId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="origResId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="fromDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="toDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="amendmentPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="type" use="required" type="{http://schemas.tourico.com/webservices/hotelv3}PaymentType" />
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="note" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tranNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="agentRefNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationResType", propOrder = {
    "hotelExtraInfo",
    "roomExtraInfo",
    "passenger",
    "cancellationPolicies"
})
public class ReservationResType {

    @XmlElement(name = "HotelExtraInfo")
    protected HotelExtraInfo hotelExtraInfo;
    @XmlElement(name = "RoomExtraInfo")
    protected AmendRoomExtraInfo roomExtraInfo;
    @XmlElement(name = "Passenger")
    protected Passenger passenger;
    @XmlElement(name = "CancellationPolicies")
    protected CancellationPoliciesType cancellationPolicies;
    @XmlAttribute(name = "reservationId", required = true)
    protected int reservationId;
    @XmlAttribute(name = "origResId")
    protected Integer origResId;
    @XmlAttribute(name = "fromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlAttribute(name = "toDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlAttribute(name = "amendmentPrice", required = true)
    protected BigDecimal amendmentPrice;
    @XmlAttribute(name = "type", required = true)
    protected PaymentType type;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "note")
    protected String note;
    @XmlAttribute(name = "tranNum")
    protected String tranNum;
    @XmlAttribute(name = "agentRefNum")
    protected String agentRefNum;

    /**
     * Gets the value of the hotelExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelExtraInfo }
     *     
     */
    public HotelExtraInfo getHotelExtraInfo() {
        return hotelExtraInfo;
    }

    /**
     * Sets the value of the hotelExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelExtraInfo }
     *     
     */
    public void setHotelExtraInfo(HotelExtraInfo value) {
        this.hotelExtraInfo = value;
    }

    /**
     * Gets the value of the roomExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AmendRoomExtraInfo }
     *     
     */
    public AmendRoomExtraInfo getRoomExtraInfo() {
        return roomExtraInfo;
    }

    /**
     * Sets the value of the roomExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendRoomExtraInfo }
     *     
     */
    public void setRoomExtraInfo(AmendRoomExtraInfo value) {
        this.roomExtraInfo = value;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * @return
     *     possible object is
     *     {@link Passenger }
     *     
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * Sets the value of the passenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passenger }
     *     
     */
    public void setPassenger(Passenger value) {
        this.passenger = value;
    }

    /**
     * Gets the value of the cancellationPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationPoliciesType }
     *     
     */
    public CancellationPoliciesType getCancellationPolicies() {
        return cancellationPolicies;
    }

    /**
     * Sets the value of the cancellationPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationPoliciesType }
     *     
     */
    public void setCancellationPolicies(CancellationPoliciesType value) {
        this.cancellationPolicies = value;
    }

    /**
     * Gets the value of the reservationId property.
     * 
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     */
    public void setReservationId(int value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the origResId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrigResId() {
        return origResId;
    }

    /**
     * Sets the value of the origResId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrigResId(Integer value) {
        this.origResId = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the amendmentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmendmentPrice() {
        return amendmentPrice;
    }

    /**
     * Sets the value of the amendmentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmendmentPrice(BigDecimal value) {
        this.amendmentPrice = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setType(PaymentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the tranNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranNum() {
        return tranNum;
    }

    /**
     * Sets the value of the tranNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranNum(String value) {
        this.tranNum = value;
    }

    /**
     * Gets the value of the agentRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentRefNum() {
        return agentRefNum;
    }

    /**
     * Sets the value of the agentRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentRefNum(String value) {
        this.agentRefNum = value;
    }

}


package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BookV3Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookV3Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordLocatorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HotelRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="RoomsInfo" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfRoomReserveInfo" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://schemas.tourico.com/webservices/hotelv3}PaymentTypes"/>
 *         &lt;element name="CCI" type="{http://schemas.tourico.com/webservices/hotelv3}ClientCreditCardInfo" minOccurs="0"/>
 *         &lt;element name="AgentRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DeltaPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOnlyAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConfirmationEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfirmationLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookV3Request", propOrder = {
    "recordLocatorId",
    "hotelId",
    "hotelRoomTypeId",
    "checkIn",
    "checkOut",
    "roomsInfo",
    "paymentType",
    "cci",
    "agentRefNumber",
    "contactInfo",
    "requestedPrice",
    "deltaPrice",
    "currency",
    "isOnlyAvailable",
    "confirmationEmail",
    "confirmationLogo"
})
public class BookV3Request {

    @XmlElement(name = "RecordLocatorId")
    protected int recordLocatorId;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "HotelRoomTypeId")
    protected int hotelRoomTypeId;
    @XmlElement(name = "CheckIn", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkIn;
    @XmlElement(name = "CheckOut", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkOut;
    @XmlElement(name = "RoomsInfo")
    protected ArrayOfRoomReserveInfo roomsInfo;
    @XmlElement(name = "PaymentType", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentTypes paymentType;
    @XmlElement(name = "CCI")
    protected ClientCreditCardInfo cci;
    @XmlElement(name = "AgentRefNumber")
    protected String agentRefNumber;
    @XmlElement(name = "ContactInfo")
    protected String contactInfo;
    @XmlElement(name = "RequestedPrice", required = true)
    protected BigDecimal requestedPrice;
    @XmlElement(name = "DeltaPrice", required = true)
    protected BigDecimal deltaPrice;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "IsOnlyAvailable")
    protected boolean isOnlyAvailable;
    @XmlElement(name = "ConfirmationEmail")
    protected String confirmationEmail;
    @XmlElement(name = "ConfirmationLogo")
    protected String confirmationLogo;

    /**
     * Gets the value of the recordLocatorId property.
     * 
     */
    public int getRecordLocatorId() {
        return recordLocatorId;
    }

    /**
     * Sets the value of the recordLocatorId property.
     * 
     */
    public void setRecordLocatorId(int value) {
        this.recordLocatorId = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     */
    public int getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     */
    public void setHotelId(int value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the hotelRoomTypeId property.
     * 
     */
    public int getHotelRoomTypeId() {
        return hotelRoomTypeId;
    }

    /**
     * Sets the value of the hotelRoomTypeId property.
     * 
     */
    public void setHotelRoomTypeId(int value) {
        this.hotelRoomTypeId = value;
    }

    /**
     * Gets the value of the checkIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckIn() {
        return checkIn;
    }

    /**
     * Sets the value of the checkIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckIn(XMLGregorianCalendar value) {
        this.checkIn = value;
    }

    /**
     * Gets the value of the checkOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOut() {
        return checkOut;
    }

    /**
     * Sets the value of the checkOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOut(XMLGregorianCalendar value) {
        this.checkOut = value;
    }

    /**
     * Gets the value of the roomsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomReserveInfo }
     *     
     */
    public ArrayOfRoomReserveInfo getRoomsInfo() {
        return roomsInfo;
    }

    /**
     * Sets the value of the roomsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomReserveInfo }
     *     
     */
    public void setRoomsInfo(ArrayOfRoomReserveInfo value) {
        this.roomsInfo = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypes }
     *     
     */
    public PaymentTypes getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypes }
     *     
     */
    public void setPaymentType(PaymentTypes value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the cci property.
     * 
     * @return
     *     possible object is
     *     {@link ClientCreditCardInfo }
     *     
     */
    public ClientCreditCardInfo getCCI() {
        return cci;
    }

    /**
     * Sets the value of the cci property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientCreditCardInfo }
     *     
     */
    public void setCCI(ClientCreditCardInfo value) {
        this.cci = value;
    }

    /**
     * Gets the value of the agentRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentRefNumber() {
        return agentRefNumber;
    }

    /**
     * Sets the value of the agentRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentRefNumber(String value) {
        this.agentRefNumber = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfo(String value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the requestedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedPrice() {
        return requestedPrice;
    }

    /**
     * Sets the value of the requestedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedPrice(BigDecimal value) {
        this.requestedPrice = value;
    }

    /**
     * Gets the value of the deltaPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeltaPrice() {
        return deltaPrice;
    }

    /**
     * Sets the value of the deltaPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeltaPrice(BigDecimal value) {
        this.deltaPrice = value;
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
     * Gets the value of the isOnlyAvailable property.
     * 
     */
    public boolean isIsOnlyAvailable() {
        return isOnlyAvailable;
    }

    /**
     * Sets the value of the isOnlyAvailable property.
     * 
     */
    public void setIsOnlyAvailable(boolean value) {
        this.isOnlyAvailable = value;
    }

    /**
     * Gets the value of the confirmationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationEmail() {
        return confirmationEmail;
    }

    /**
     * Sets the value of the confirmationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationEmail(String value) {
        this.confirmationEmail = value;
    }

    /**
     * Gets the value of the confirmationLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationLogo() {
        return confirmationLogo;
    }

    /**
     * Sets the value of the confirmationLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationLogo(String value) {
        this.confirmationLogo = value;
    }

}


package org.datacontract.schemas._2004._07.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HotelReservationEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelReservationEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="B2BID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BaseCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseMarkUp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseTotalCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseTotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseTotalPrice_MYR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BookingRequestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingResponseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancellationPenaltyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CancelledDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CheckOutDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CurrencyRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelEmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelReservationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HotelSuppReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOnRequestHotel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSupEmailverified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LocalContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkupApplied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoofRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatorAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatorDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatorEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatorTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrinfInfoDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromoAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SupplierBookingid1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierBookingid2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierLocalcontact1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierLocalcontact2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierLocalcontact3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserLoginID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationEN", propOrder = {
    "agentMarkup",
    "b2BID",
    "baseCurrency",
    "baseMarkUp",
    "baseTotalCost",
    "baseTotalPrice",
    "baseTotalPriceMYR",
    "bookingRequestName",
    "bookingResponseName",
    "cancellationPenaltyAmount",
    "cancelledDateTime",
    "checkInDate",
    "checkOutDate",
    "currencyRatio",
    "customerUserID",
    "errorDescription",
    "hotelAddress",
    "hotelCity",
    "hotelCode",
    "hotelCountry",
    "hotelEmailId",
    "hotelName",
    "hotelReservationID",
    "hotelSuppReservationID",
    "hotelTel",
    "internalReferenceNo",
    "isOnRequestHotel",
    "isSupEmailverified",
    "localContact",
    "markupApplied",
    "noofRooms",
    "notes",
    "operatorAddress",
    "operatorDetails",
    "operatorEmail",
    "operatorTelephone",
    "prinfInfoDetails",
    "promoAmount",
    "reservationID",
    "resultMsg",
    "serviceID",
    "status",
    "supplierBookingid1",
    "supplierBookingid2",
    "supplierLocalcontact1",
    "supplierLocalcontact2",
    "supplierLocalcontact3",
    "userLoginID"
})
public class HotelReservationEN {

    @XmlElement(name = "AgentMarkup")
    protected BigDecimal agentMarkup;
    @XmlElement(name = "B2BID")
    protected Integer b2BID;
    @XmlElementRef(name = "BaseCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseCurrency;
    @XmlElement(name = "BaseMarkUp")
    protected BigDecimal baseMarkUp;
    @XmlElement(name = "BaseTotalCost")
    protected BigDecimal baseTotalCost;
    @XmlElement(name = "BaseTotalPrice")
    protected BigDecimal baseTotalPrice;
    @XmlElement(name = "BaseTotalPrice_MYR")
    protected BigDecimal baseTotalPriceMYR;
    @XmlElementRef(name = "BookingRequestName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingRequestName;
    @XmlElementRef(name = "BookingResponseName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingResponseName;
    @XmlElement(name = "CancellationPenaltyAmount")
    protected BigDecimal cancellationPenaltyAmount;
    @XmlElement(name = "CancelledDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelledDateTime;
    @XmlElement(name = "CheckInDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInDate;
    @XmlElement(name = "CheckOutDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkOutDate;
    @XmlElement(name = "CurrencyRatio")
    protected BigDecimal currencyRatio;
    @XmlElement(name = "CustomerUserID")
    protected Integer customerUserID;
    @XmlElementRef(name = "ErrorDescription", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorDescription;
    @XmlElementRef(name = "HotelAddress", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelAddress;
    @XmlElementRef(name = "HotelCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelCity;
    @XmlElementRef(name = "HotelCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelCode;
    @XmlElementRef(name = "HotelCountry", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelCountry;
    @XmlElementRef(name = "HotelEmailId", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelEmailId;
    @XmlElementRef(name = "HotelName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelName;
    @XmlElement(name = "HotelReservationID")
    protected Integer hotelReservationID;
    @XmlElementRef(name = "HotelSuppReservationID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelSuppReservationID;
    @XmlElementRef(name = "HotelTel", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelTel;
    @XmlElementRef(name = "InternalReferenceNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> internalReferenceNo;
    @XmlElement(name = "IsOnRequestHotel")
    protected Boolean isOnRequestHotel;
    @XmlElement(name = "IsSupEmailverified")
    protected Integer isSupEmailverified;
    @XmlElementRef(name = "LocalContact", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localContact;
    @XmlElementRef(name = "MarkupApplied", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markupApplied;
    @XmlElement(name = "NoofRooms")
    protected Integer noofRooms;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "OperatorAddress", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatorAddress;
    @XmlElementRef(name = "OperatorDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatorDetails;
    @XmlElementRef(name = "OperatorEmail", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatorEmail;
    @XmlElementRef(name = "OperatorTelephone", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatorTelephone;
    @XmlElementRef(name = "PrinfInfoDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prinfInfoDetails;
    @XmlElement(name = "PromoAmount")
    protected BigDecimal promoAmount;
    @XmlElementRef(name = "ReservationID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reservationID;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElement(name = "ServiceID")
    protected Integer serviceID;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElementRef(name = "SupplierBookingid1", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplierBookingid1;
    @XmlElementRef(name = "SupplierBookingid2", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplierBookingid2;
    @XmlElementRef(name = "SupplierLocalcontact1", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplierLocalcontact1;
    @XmlElementRef(name = "SupplierLocalcontact2", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplierLocalcontact2;
    @XmlElementRef(name = "SupplierLocalcontact3", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplierLocalcontact3;
    @XmlElement(name = "UserLoginID")
    protected Integer userLoginID;

    /**
     * Gets the value of the agentMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgentMarkup() {
        return agentMarkup;
    }

    /**
     * Sets the value of the agentMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgentMarkup(BigDecimal value) {
        this.agentMarkup = value;
    }

    /**
     * Gets the value of the b2BID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getB2BID() {
        return b2BID;
    }

    /**
     * Sets the value of the b2BID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setB2BID(Integer value) {
        this.b2BID = value;
    }

    /**
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseCurrency(JAXBElement<String> value) {
        this.baseCurrency = value;
    }

    /**
     * Gets the value of the baseMarkUp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseMarkUp() {
        return baseMarkUp;
    }

    /**
     * Sets the value of the baseMarkUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseMarkUp(BigDecimal value) {
        this.baseMarkUp = value;
    }

    /**
     * Gets the value of the baseTotalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseTotalCost() {
        return baseTotalCost;
    }

    /**
     * Sets the value of the baseTotalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseTotalCost(BigDecimal value) {
        this.baseTotalCost = value;
    }

    /**
     * Gets the value of the baseTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseTotalPrice() {
        return baseTotalPrice;
    }

    /**
     * Sets the value of the baseTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseTotalPrice(BigDecimal value) {
        this.baseTotalPrice = value;
    }

    /**
     * Gets the value of the baseTotalPriceMYR property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseTotalPriceMYR() {
        return baseTotalPriceMYR;
    }

    /**
     * Sets the value of the baseTotalPriceMYR property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseTotalPriceMYR(BigDecimal value) {
        this.baseTotalPriceMYR = value;
    }

    /**
     * Gets the value of the bookingRequestName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingRequestName() {
        return bookingRequestName;
    }

    /**
     * Sets the value of the bookingRequestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingRequestName(JAXBElement<String> value) {
        this.bookingRequestName = value;
    }

    /**
     * Gets the value of the bookingResponseName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingResponseName() {
        return bookingResponseName;
    }

    /**
     * Sets the value of the bookingResponseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingResponseName(JAXBElement<String> value) {
        this.bookingResponseName = value;
    }

    /**
     * Gets the value of the cancellationPenaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCancellationPenaltyAmount() {
        return cancellationPenaltyAmount;
    }

    /**
     * Sets the value of the cancellationPenaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCancellationPenaltyAmount(BigDecimal value) {
        this.cancellationPenaltyAmount = value;
    }

    /**
     * Gets the value of the cancelledDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelledDateTime() {
        return cancelledDateTime;
    }

    /**
     * Sets the value of the cancelledDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelledDateTime(XMLGregorianCalendar value) {
        this.cancelledDateTime = value;
    }

    /**
     * Gets the value of the checkInDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the value of the checkInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckInDate(XMLGregorianCalendar value) {
        this.checkInDate = value;
    }

    /**
     * Gets the value of the checkOutDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * Sets the value of the checkOutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOutDate(XMLGregorianCalendar value) {
        this.checkOutDate = value;
    }

    /**
     * Gets the value of the currencyRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRatio() {
        return currencyRatio;
    }

    /**
     * Sets the value of the currencyRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRatio(BigDecimal value) {
        this.currencyRatio = value;
    }

    /**
     * Gets the value of the customerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserID() {
        return customerUserID;
    }

    /**
     * Sets the value of the customerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserID(Integer value) {
        this.customerUserID = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorDescription(JAXBElement<String> value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the hotelAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelAddress() {
        return hotelAddress;
    }

    /**
     * Sets the value of the hotelAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelAddress(JAXBElement<String> value) {
        this.hotelAddress = value;
    }

    /**
     * Gets the value of the hotelCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelCity() {
        return hotelCity;
    }

    /**
     * Sets the value of the hotelCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelCity(JAXBElement<String> value) {
        this.hotelCity = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelCode(JAXBElement<String> value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the hotelCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelCountry() {
        return hotelCountry;
    }

    /**
     * Sets the value of the hotelCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelCountry(JAXBElement<String> value) {
        this.hotelCountry = value;
    }

    /**
     * Gets the value of the hotelEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelEmailId() {
        return hotelEmailId;
    }

    /**
     * Sets the value of the hotelEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelEmailId(JAXBElement<String> value) {
        this.hotelEmailId = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelName(JAXBElement<String> value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the hotelReservationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelReservationID() {
        return hotelReservationID;
    }

    /**
     * Sets the value of the hotelReservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelReservationID(Integer value) {
        this.hotelReservationID = value;
    }

    /**
     * Gets the value of the hotelSuppReservationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelSuppReservationID() {
        return hotelSuppReservationID;
    }

    /**
     * Sets the value of the hotelSuppReservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelSuppReservationID(JAXBElement<String> value) {
        this.hotelSuppReservationID = value;
    }

    /**
     * Gets the value of the hotelTel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelTel() {
        return hotelTel;
    }

    /**
     * Sets the value of the hotelTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelTel(JAXBElement<String> value) {
        this.hotelTel = value;
    }

    /**
     * Gets the value of the internalReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternalReferenceNo() {
        return internalReferenceNo;
    }

    /**
     * Sets the value of the internalReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternalReferenceNo(JAXBElement<String> value) {
        this.internalReferenceNo = value;
    }

    /**
     * Gets the value of the isOnRequestHotel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOnRequestHotel() {
        return isOnRequestHotel;
    }

    /**
     * Sets the value of the isOnRequestHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnRequestHotel(Boolean value) {
        this.isOnRequestHotel = value;
    }

    /**
     * Gets the value of the isSupEmailverified property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsSupEmailverified() {
        return isSupEmailverified;
    }

    /**
     * Sets the value of the isSupEmailverified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsSupEmailverified(Integer value) {
        this.isSupEmailverified = value;
    }

    /**
     * Gets the value of the localContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalContact() {
        return localContact;
    }

    /**
     * Sets the value of the localContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalContact(JAXBElement<String> value) {
        this.localContact = value;
    }

    /**
     * Gets the value of the markupApplied property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkupApplied() {
        return markupApplied;
    }

    /**
     * Sets the value of the markupApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkupApplied(JAXBElement<String> value) {
        this.markupApplied = value;
    }

    /**
     * Gets the value of the noofRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoofRooms() {
        return noofRooms;
    }

    /**
     * Sets the value of the noofRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoofRooms(Integer value) {
        this.noofRooms = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the operatorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorAddress() {
        return operatorAddress;
    }

    /**
     * Sets the value of the operatorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorAddress(JAXBElement<String> value) {
        this.operatorAddress = value;
    }

    /**
     * Gets the value of the operatorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorDetails() {
        return operatorDetails;
    }

    /**
     * Sets the value of the operatorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorDetails(JAXBElement<String> value) {
        this.operatorDetails = value;
    }

    /**
     * Gets the value of the operatorEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorEmail() {
        return operatorEmail;
    }

    /**
     * Sets the value of the operatorEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorEmail(JAXBElement<String> value) {
        this.operatorEmail = value;
    }

    /**
     * Gets the value of the operatorTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatorTelephone() {
        return operatorTelephone;
    }

    /**
     * Sets the value of the operatorTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatorTelephone(JAXBElement<String> value) {
        this.operatorTelephone = value;
    }

    /**
     * Gets the value of the prinfInfoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrinfInfoDetails() {
        return prinfInfoDetails;
    }

    /**
     * Sets the value of the prinfInfoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrinfInfoDetails(JAXBElement<String> value) {
        this.prinfInfoDetails = value;
    }

    /**
     * Gets the value of the promoAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromoAmount() {
        return promoAmount;
    }

    /**
     * Sets the value of the promoAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromoAmount(BigDecimal value) {
        this.promoAmount = value;
    }

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReservationID(JAXBElement<String> value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the resultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getResultMsg() {
        return resultMsg;
    }

    /**
     * Sets the value of the resultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setResultMsg(JAXBElement<Result> value) {
        this.resultMsg = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceID(Integer value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the supplierBookingid1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierBookingid1() {
        return supplierBookingid1;
    }

    /**
     * Sets the value of the supplierBookingid1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierBookingid1(JAXBElement<String> value) {
        this.supplierBookingid1 = value;
    }

    /**
     * Gets the value of the supplierBookingid2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierBookingid2() {
        return supplierBookingid2;
    }

    /**
     * Sets the value of the supplierBookingid2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierBookingid2(JAXBElement<String> value) {
        this.supplierBookingid2 = value;
    }

    /**
     * Gets the value of the supplierLocalcontact1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierLocalcontact1() {
        return supplierLocalcontact1;
    }

    /**
     * Sets the value of the supplierLocalcontact1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierLocalcontact1(JAXBElement<String> value) {
        this.supplierLocalcontact1 = value;
    }

    /**
     * Gets the value of the supplierLocalcontact2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierLocalcontact2() {
        return supplierLocalcontact2;
    }

    /**
     * Sets the value of the supplierLocalcontact2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierLocalcontact2(JAXBElement<String> value) {
        this.supplierLocalcontact2 = value;
    }

    /**
     * Gets the value of the supplierLocalcontact3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierLocalcontact3() {
        return supplierLocalcontact3;
    }

    /**
     * Sets the value of the supplierLocalcontact3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierLocalcontact3(JAXBElement<String> value) {
        this.supplierLocalcontact3 = value;
    }

    /**
     * Gets the value of the userLoginID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserLoginID() {
        return userLoginID;
    }

    /**
     * Sets the value of the userLoginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserLoginID(Integer value) {
        this.userLoginID = value;
    }

}

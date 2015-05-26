
package org.datacontract.schemas._2004._07.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AFIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Adult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="B2BDAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="B2BDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B2BIAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="B2BICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingCharges" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}BookingChargesInfo" minOccurs="0"/>
 *         &lt;element name="BookingError" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}FlightError" minOccurs="0"/>
 *         &lt;element name="Child" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Infant" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsFlightOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsInsuranceAdded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMinFareFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowFareRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkupApplied" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfMarkupFlightEN" minOccurs="0"/>
 *         &lt;element name="NetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PunitID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="SegLen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxBreakDown" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfTaxBreakDownInfo" minOccurs="0"/>
 *         &lt;element name="UpdatedTaxMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dispCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inBoundFlights" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfFlightSegment" minOccurs="0"/>
 *         &lt;element name="outBoundFlights" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfFlightSegment" minOccurs="0"/>
 *         &lt;element name="priceInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PriceInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", propOrder = {
    "afIndex",
    "adult",
    "b2BDAmount",
    "b2BDCode",
    "b2BIAmount",
    "b2BICode",
    "bookingCharges",
    "bookingError",
    "child",
    "classCode",
    "currencyCode",
    "fareType",
    "flightClass",
    "flightDirection",
    "infant",
    "isFlightOnly",
    "isInsuranceAdded",
    "isMinFareFlight",
    "isSelected",
    "isShowFareRules",
    "mk",
    "markupApplied",
    "netAmount",
    "punitID",
    "resultMsg",
    "segLen",
    "taxBreakDown",
    "updatedTaxMarkup",
    "dispCurrencyCode",
    "inBoundFlights",
    "outBoundFlights",
    "priceInfo"
})
public class Flights {

    @XmlElement(name = "AFIndex")
    protected Integer afIndex;
    @XmlElement(name = "Adult")
    protected Integer adult;
    @XmlElement(name = "B2BDAmount")
    protected BigDecimal b2BDAmount;
    @XmlElementRef(name = "B2BDCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> b2BDCode;
    @XmlElement(name = "B2BIAmount")
    protected BigDecimal b2BIAmount;
    @XmlElementRef(name = "B2BICode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> b2BICode;
    @XmlElementRef(name = "BookingCharges", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<BookingChargesInfo> bookingCharges;
    @XmlElementRef(name = "BookingError", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightError> bookingError;
    @XmlElement(name = "Child")
    protected Integer child;
    @XmlElementRef(name = "ClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classCode;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "FareType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareType;
    @XmlElementRef(name = "FlightClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightClass;
    @XmlElementRef(name = "FlightDirection", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightDirection;
    @XmlElement(name = "Infant")
    protected Integer infant;
    @XmlElement(name = "IsFlightOnly")
    protected Boolean isFlightOnly;
    @XmlElement(name = "IsInsuranceAdded")
    protected Boolean isInsuranceAdded;
    @XmlElement(name = "IsMinFareFlight")
    protected Boolean isMinFareFlight;
    @XmlElement(name = "IsSelected")
    protected Boolean isSelected;
    @XmlElement(name = "IsShowFareRules")
    protected Boolean isShowFareRules;
    @XmlElementRef(name = "MK", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mk;
    @XmlElementRef(name = "MarkupApplied", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMarkupFlightEN> markupApplied;
    @XmlElement(name = "NetAmount")
    protected BigDecimal netAmount;
    @XmlElement(name = "PunitID")
    protected Integer punitID;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElement(name = "SegLen")
    protected Integer segLen;
    @XmlElementRef(name = "TaxBreakDown", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaxBreakDownInfo> taxBreakDown;
    @XmlElement(name = "UpdatedTaxMarkup")
    protected BigDecimal updatedTaxMarkup;
    @XmlElementRef(name = "dispCurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispCurrencyCode;
    @XmlElementRef(name = "inBoundFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlightSegment> inBoundFlights;
    @XmlElementRef(name = "outBoundFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlightSegment> outBoundFlights;
    @XmlElementRef(name = "priceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PriceInformation> priceInfo;

    /**
     * Gets the value of the afIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAFIndex() {
        return afIndex;
    }

    /**
     * Sets the value of the afIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAFIndex(Integer value) {
        this.afIndex = value;
    }

    /**
     * Gets the value of the adult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdult() {
        return adult;
    }

    /**
     * Sets the value of the adult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdult(Integer value) {
        this.adult = value;
    }

    /**
     * Gets the value of the b2BDAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getB2BDAmount() {
        return b2BDAmount;
    }

    /**
     * Sets the value of the b2BDAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setB2BDAmount(BigDecimal value) {
        this.b2BDAmount = value;
    }

    /**
     * Gets the value of the b2BDCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getB2BDCode() {
        return b2BDCode;
    }

    /**
     * Sets the value of the b2BDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setB2BDCode(JAXBElement<String> value) {
        this.b2BDCode = value;
    }

    /**
     * Gets the value of the b2BIAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getB2BIAmount() {
        return b2BIAmount;
    }

    /**
     * Sets the value of the b2BIAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setB2BIAmount(BigDecimal value) {
        this.b2BIAmount = value;
    }

    /**
     * Gets the value of the b2BICode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getB2BICode() {
        return b2BICode;
    }

    /**
     * Sets the value of the b2BICode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setB2BICode(JAXBElement<String> value) {
        this.b2BICode = value;
    }

    /**
     * Gets the value of the bookingCharges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BookingChargesInfo }{@code >}
     *     
     */
    public JAXBElement<BookingChargesInfo> getBookingCharges() {
        return bookingCharges;
    }

    /**
     * Sets the value of the bookingCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BookingChargesInfo }{@code >}
     *     
     */
    public void setBookingCharges(JAXBElement<BookingChargesInfo> value) {
        this.bookingCharges = value;
    }

    /**
     * Gets the value of the bookingError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightError }{@code >}
     *     
     */
    public JAXBElement<FlightError> getBookingError() {
        return bookingError;
    }

    /**
     * Sets the value of the bookingError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightError }{@code >}
     *     
     */
    public void setBookingError(JAXBElement<FlightError> value) {
        this.bookingError = value;
    }

    /**
     * Gets the value of the child property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChild() {
        return child;
    }

    /**
     * Sets the value of the child property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChild(Integer value) {
        this.child = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassCode(JAXBElement<String> value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the fareType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareType() {
        return fareType;
    }

    /**
     * Sets the value of the fareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareType(JAXBElement<String> value) {
        this.fareType = value;
    }

    /**
     * Gets the value of the flightClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightClass() {
        return flightClass;
    }

    /**
     * Sets the value of the flightClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightClass(JAXBElement<String> value) {
        this.flightClass = value;
    }

    /**
     * Gets the value of the flightDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightDirection() {
        return flightDirection;
    }

    /**
     * Sets the value of the flightDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightDirection(JAXBElement<String> value) {
        this.flightDirection = value;
    }

    /**
     * Gets the value of the infant property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInfant() {
        return infant;
    }

    /**
     * Sets the value of the infant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInfant(Integer value) {
        this.infant = value;
    }

    /**
     * Gets the value of the isFlightOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFlightOnly() {
        return isFlightOnly;
    }

    /**
     * Sets the value of the isFlightOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFlightOnly(Boolean value) {
        this.isFlightOnly = value;
    }

    /**
     * Gets the value of the isInsuranceAdded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInsuranceAdded() {
        return isInsuranceAdded;
    }

    /**
     * Sets the value of the isInsuranceAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInsuranceAdded(Boolean value) {
        this.isInsuranceAdded = value;
    }

    /**
     * Gets the value of the isMinFareFlight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMinFareFlight() {
        return isMinFareFlight;
    }

    /**
     * Sets the value of the isMinFareFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMinFareFlight(Boolean value) {
        this.isMinFareFlight = value;
    }

    /**
     * Gets the value of the isSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSelected() {
        return isSelected;
    }

    /**
     * Sets the value of the isSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSelected(Boolean value) {
        this.isSelected = value;
    }

    /**
     * Gets the value of the isShowFareRules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowFareRules() {
        return isShowFareRules;
    }

    /**
     * Sets the value of the isShowFareRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowFareRules(Boolean value) {
        this.isShowFareRules = value;
    }

    /**
     * Gets the value of the mk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMK() {
        return mk;
    }

    /**
     * Sets the value of the mk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMK(JAXBElement<String> value) {
        this.mk = value;
    }

    /**
     * Gets the value of the markupApplied property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMarkupFlightEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMarkupFlightEN> getMarkupApplied() {
        return markupApplied;
    }

    /**
     * Sets the value of the markupApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMarkupFlightEN }{@code >}
     *     
     */
    public void setMarkupApplied(JAXBElement<ArrayOfMarkupFlightEN> value) {
        this.markupApplied = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the punitID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPunitID() {
        return punitID;
    }

    /**
     * Sets the value of the punitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPunitID(Integer value) {
        this.punitID = value;
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
     * Gets the value of the segLen property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegLen() {
        return segLen;
    }

    /**
     * Sets the value of the segLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegLen(Integer value) {
        this.segLen = value;
    }

    /**
     * Gets the value of the taxBreakDown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaxBreakDownInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaxBreakDownInfo> getTaxBreakDown() {
        return taxBreakDown;
    }

    /**
     * Sets the value of the taxBreakDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaxBreakDownInfo }{@code >}
     *     
     */
    public void setTaxBreakDown(JAXBElement<ArrayOfTaxBreakDownInfo> value) {
        this.taxBreakDown = value;
    }

    /**
     * Gets the value of the updatedTaxMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpdatedTaxMarkup() {
        return updatedTaxMarkup;
    }

    /**
     * Sets the value of the updatedTaxMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpdatedTaxMarkup(BigDecimal value) {
        this.updatedTaxMarkup = value;
    }

    /**
     * Gets the value of the dispCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispCurrencyCode() {
        return dispCurrencyCode;
    }

    /**
     * Sets the value of the dispCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispCurrencyCode(JAXBElement<String> value) {
        this.dispCurrencyCode = value;
    }

    /**
     * Gets the value of the inBoundFlights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightSegment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFlightSegment> getInBoundFlights() {
        return inBoundFlights;
    }

    /**
     * Sets the value of the inBoundFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightSegment }{@code >}
     *     
     */
    public void setInBoundFlights(JAXBElement<ArrayOfFlightSegment> value) {
        this.inBoundFlights = value;
    }

    /**
     * Gets the value of the outBoundFlights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightSegment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFlightSegment> getOutBoundFlights() {
        return outBoundFlights;
    }

    /**
     * Sets the value of the outBoundFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightSegment }{@code >}
     *     
     */
    public void setOutBoundFlights(JAXBElement<ArrayOfFlightSegment> value) {
        this.outBoundFlights = value;
    }

    /**
     * Gets the value of the priceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}
     *     
     */
    public JAXBElement<PriceInformation> getPriceInfo() {
        return priceInfo;
    }

    /**
     * Sets the value of the priceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}
     *     
     */
    public void setPriceInfo(JAXBElement<PriceInformation> value) {
        this.priceInfo = value;
    }

}

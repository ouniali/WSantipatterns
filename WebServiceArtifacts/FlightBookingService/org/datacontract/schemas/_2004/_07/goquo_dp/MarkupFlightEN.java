
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
 * <p>Java class for MarkupFlightEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkupFlightEN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}MarkupGroupsEN">
 *       &lt;sequence>
 *         &lt;element name="AdultPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Airlines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppliesToDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrCities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B2BId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="B2BUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BookingStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CabinClass" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}CabinClass" minOccurs="0"/>
 *         &lt;element name="CalcMarkupBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChildPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightJourneyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfantPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsAddToTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsApplyIfFirstSegAirCodeMatches" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsApplyToMultiSegmentFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPercentageBased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarkupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkupFCancellationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MarkupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MarkupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TravelEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TravelStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkupFlightEN", propOrder = {
    "adultPrice",
    "airlines",
    "appliesToDays",
    "arrCities",
    "b2BId",
    "b2BUserId",
    "bookingClass",
    "bookingEndDate",
    "bookingStartDate",
    "cabinClass",
    "calcMarkupBy",
    "childPrice",
    "currencyCode",
    "depCities",
    "endPrice",
    "fareType",
    "flightJourneyType",
    "infantPrice",
    "isAddToTax",
    "isApplyIfFirstSegAirCodeMatches",
    "isApplyToMultiSegmentFlight",
    "isPercentageBased",
    "markupCode",
    "markupFCancellationID",
    "markupID",
    "markupName",
    "markupType",
    "prefix",
    "startPrice",
    "travelEndDate",
    "travelStartDate"
})
public class MarkupFlightEN
    extends MarkupGroupsEN
{

    @XmlElement(name = "AdultPrice")
    protected BigDecimal adultPrice;
    @XmlElementRef(name = "Airlines", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airlines;
    @XmlElementRef(name = "AppliesToDays", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> appliesToDays;
    @XmlElementRef(name = "ArrCities", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrCities;
    @XmlElement(name = "B2BId")
    protected Integer b2BId;
    @XmlElement(name = "B2BUserId")
    protected Integer b2BUserId;
    @XmlElementRef(name = "BookingClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingClass;
    @XmlElement(name = "BookingEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookingEndDate;
    @XmlElement(name = "BookingStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookingStartDate;
    @XmlElement(name = "CabinClass")
    @XmlSchemaType(name = "string")
    protected CabinClass cabinClass;
    @XmlElementRef(name = "CalcMarkupBy", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calcMarkupBy;
    @XmlElement(name = "ChildPrice")
    protected BigDecimal childPrice;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "DepCities", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depCities;
    @XmlElement(name = "EndPrice")
    protected BigDecimal endPrice;
    @XmlElementRef(name = "FareType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareType;
    @XmlElementRef(name = "FlightJourneyType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightJourneyType;
    @XmlElement(name = "InfantPrice")
    protected BigDecimal infantPrice;
    @XmlElement(name = "IsAddToTax")
    protected Boolean isAddToTax;
    @XmlElement(name = "IsApplyIfFirstSegAirCodeMatches")
    protected Boolean isApplyIfFirstSegAirCodeMatches;
    @XmlElement(name = "IsApplyToMultiSegmentFlight")
    protected Boolean isApplyToMultiSegmentFlight;
    @XmlElement(name = "IsPercentageBased")
    protected Boolean isPercentageBased;
    @XmlElementRef(name = "MarkupCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markupCode;
    @XmlElement(name = "MarkupFCancellationID")
    protected Integer markupFCancellationID;
    @XmlElement(name = "MarkupID")
    protected Integer markupID;
    @XmlElementRef(name = "MarkupName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markupName;
    @XmlElementRef(name = "MarkupType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markupType;
    @XmlElementRef(name = "Prefix", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prefix;
    @XmlElement(name = "StartPrice")
    protected BigDecimal startPrice;
    @XmlElement(name = "TravelEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar travelEndDate;
    @XmlElement(name = "TravelStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar travelStartDate;

    /**
     * Gets the value of the adultPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdultPrice() {
        return adultPrice;
    }

    /**
     * Sets the value of the adultPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdultPrice(BigDecimal value) {
        this.adultPrice = value;
    }

    /**
     * Gets the value of the airlines property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirlines() {
        return airlines;
    }

    /**
     * Sets the value of the airlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirlines(JAXBElement<String> value) {
        this.airlines = value;
    }

    /**
     * Gets the value of the appliesToDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAppliesToDays() {
        return appliesToDays;
    }

    /**
     * Sets the value of the appliesToDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAppliesToDays(JAXBElement<String> value) {
        this.appliesToDays = value;
    }

    /**
     * Gets the value of the arrCities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrCities() {
        return arrCities;
    }

    /**
     * Sets the value of the arrCities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrCities(JAXBElement<String> value) {
        this.arrCities = value;
    }

    /**
     * Gets the value of the b2BId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getB2BId() {
        return b2BId;
    }

    /**
     * Sets the value of the b2BId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setB2BId(Integer value) {
        this.b2BId = value;
    }

    /**
     * Gets the value of the b2BUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getB2BUserId() {
        return b2BUserId;
    }

    /**
     * Sets the value of the b2BUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setB2BUserId(Integer value) {
        this.b2BUserId = value;
    }

    /**
     * Gets the value of the bookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingClass() {
        return bookingClass;
    }

    /**
     * Sets the value of the bookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingClass(JAXBElement<String> value) {
        this.bookingClass = value;
    }

    /**
     * Gets the value of the bookingEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingEndDate() {
        return bookingEndDate;
    }

    /**
     * Sets the value of the bookingEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingEndDate(XMLGregorianCalendar value) {
        this.bookingEndDate = value;
    }

    /**
     * Gets the value of the bookingStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingStartDate() {
        return bookingStartDate;
    }

    /**
     * Sets the value of the bookingStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingStartDate(XMLGregorianCalendar value) {
        this.bookingStartDate = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClass }
     *     
     */
    public CabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClass }
     *     
     */
    public void setCabinClass(CabinClass value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the calcMarkupBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalcMarkupBy() {
        return calcMarkupBy;
    }

    /**
     * Sets the value of the calcMarkupBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalcMarkupBy(JAXBElement<String> value) {
        this.calcMarkupBy = value;
    }

    /**
     * Gets the value of the childPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChildPrice() {
        return childPrice;
    }

    /**
     * Sets the value of the childPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChildPrice(BigDecimal value) {
        this.childPrice = value;
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
     * Gets the value of the depCities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepCities() {
        return depCities;
    }

    /**
     * Sets the value of the depCities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepCities(JAXBElement<String> value) {
        this.depCities = value;
    }

    /**
     * Gets the value of the endPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndPrice() {
        return endPrice;
    }

    /**
     * Sets the value of the endPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndPrice(BigDecimal value) {
        this.endPrice = value;
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
     * Gets the value of the flightJourneyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightJourneyType() {
        return flightJourneyType;
    }

    /**
     * Sets the value of the flightJourneyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightJourneyType(JAXBElement<String> value) {
        this.flightJourneyType = value;
    }

    /**
     * Gets the value of the infantPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInfantPrice() {
        return infantPrice;
    }

    /**
     * Sets the value of the infantPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInfantPrice(BigDecimal value) {
        this.infantPrice = value;
    }

    /**
     * Gets the value of the isAddToTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAddToTax() {
        return isAddToTax;
    }

    /**
     * Sets the value of the isAddToTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAddToTax(Boolean value) {
        this.isAddToTax = value;
    }

    /**
     * Gets the value of the isApplyIfFirstSegAirCodeMatches property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsApplyIfFirstSegAirCodeMatches() {
        return isApplyIfFirstSegAirCodeMatches;
    }

    /**
     * Sets the value of the isApplyIfFirstSegAirCodeMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsApplyIfFirstSegAirCodeMatches(Boolean value) {
        this.isApplyIfFirstSegAirCodeMatches = value;
    }

    /**
     * Gets the value of the isApplyToMultiSegmentFlight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsApplyToMultiSegmentFlight() {
        return isApplyToMultiSegmentFlight;
    }

    /**
     * Sets the value of the isApplyToMultiSegmentFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsApplyToMultiSegmentFlight(Boolean value) {
        this.isApplyToMultiSegmentFlight = value;
    }

    /**
     * Gets the value of the isPercentageBased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPercentageBased() {
        return isPercentageBased;
    }

    /**
     * Sets the value of the isPercentageBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPercentageBased(Boolean value) {
        this.isPercentageBased = value;
    }

    /**
     * Gets the value of the markupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkupCode() {
        return markupCode;
    }

    /**
     * Sets the value of the markupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkupCode(JAXBElement<String> value) {
        this.markupCode = value;
    }

    /**
     * Gets the value of the markupFCancellationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarkupFCancellationID() {
        return markupFCancellationID;
    }

    /**
     * Sets the value of the markupFCancellationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarkupFCancellationID(Integer value) {
        this.markupFCancellationID = value;
    }

    /**
     * Gets the value of the markupID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarkupID() {
        return markupID;
    }

    /**
     * Sets the value of the markupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarkupID(Integer value) {
        this.markupID = value;
    }

    /**
     * Gets the value of the markupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkupName() {
        return markupName;
    }

    /**
     * Sets the value of the markupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkupName(JAXBElement<String> value) {
        this.markupName = value;
    }

    /**
     * Gets the value of the markupType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkupType() {
        return markupType;
    }

    /**
     * Sets the value of the markupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkupType(JAXBElement<String> value) {
        this.markupType = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefix(JAXBElement<String> value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the startPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartPrice() {
        return startPrice;
    }

    /**
     * Sets the value of the startPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartPrice(BigDecimal value) {
        this.startPrice = value;
    }

    /**
     * Gets the value of the travelEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelEndDate() {
        return travelEndDate;
    }

    /**
     * Sets the value of the travelEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelEndDate(XMLGregorianCalendar value) {
        this.travelEndDate = value;
    }

    /**
     * Gets the value of the travelStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelStartDate() {
        return travelStartDate;
    }

    /**
     * Sets the value of the travelStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelStartDate(XMLGregorianCalendar value) {
        this.travelStartDate = value;
    }

}

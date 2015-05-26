
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BookingTravelerRef;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareStatus" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareInfoRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}BookingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TaxInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareCalc" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PassengerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}BookingTravelerRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}WaiverCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PaymentRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChangePenalty" type="{http://www.travelport.com/schema/air_v18_0}typeFarePenalty" minOccurs="0"/>
 *         &lt;element name="CancelPenalty" type="{http://www.travelport.com/schema/air_v18_0}typeFarePenalty" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FeeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}Adjustment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}Yield" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirPricingModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TicketingModifiersRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSegmentPricingModifiers" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrPrices"/>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrProviderSupplier"/>
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="CommandKey">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AmountType" type="{http://www.travelport.com/schema/common_v15_0}StringLength1to32" />
 *       &lt;attribute name="IncludesVAT" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ExchangeAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="ForfeitAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="Refundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Exchangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="LatestTicketingTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PricingMethod" use="required" type="{http://www.travelport.com/schema/air_v18_0}typePricingMethod" />
 *       &lt;attribute name="Checksum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ETicketability" type="{http://www.travelport.com/schema/air_v18_0}typeEticketability" />
 *       &lt;attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v15_0}typeCarrier" />
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="AirPricingInfoGroup" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TotalNetPrice" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="Ticketed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PricingType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="25"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareInfo",
    "fareStatus",
    "fareInfoRef",
    "bookingInfo",
    "taxInfo",
    "fareCalc",
    "passengerType",
    "bookingTravelerRef",
    "waiverCode",
    "paymentRef",
    "changePenalty",
    "cancelPenalty",
    "feeInfo",
    "adjustment",
    "yield",
    "airPricingModifiers",
    "ticketingModifiersRef",
    "airSegmentPricingModifiers"
})
@XmlRootElement(name = "AirPricingInfo")
public class AirPricingInfo {

    @XmlElement(name = "FareInfo")
    protected List<FareInfo> fareInfo;
    @XmlElement(name = "FareStatus")
    protected FareStatus fareStatus;
    @XmlElement(name = "FareInfoRef")
    protected List<FareInfoRef> fareInfoRef;
    @XmlElement(name = "BookingInfo")
    protected List<BookingInfo> bookingInfo;
    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "FareCalc")
    protected String fareCalc;
    @XmlElement(name = "PassengerType")
    protected List<PassengerType> passengerType;
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<BookingTravelerRef> bookingTravelerRef;
    @XmlElement(name = "WaiverCode")
    protected WaiverCode waiverCode;
    @XmlElement(name = "PaymentRef")
    protected List<PaymentRef> paymentRef;
    @XmlElement(name = "ChangePenalty")
    protected TypeFarePenalty changePenalty;
    @XmlElement(name = "CancelPenalty")
    protected TypeFarePenalty cancelPenalty;
    @XmlElement(name = "FeeInfo")
    protected List<FeeInfo> feeInfo;
    @XmlElement(name = "Adjustment")
    protected List<Adjustment> adjustment;
    @XmlElement(name = "Yield")
    protected List<Yield> yield;
    @XmlElement(name = "AirPricingModifiers")
    protected AirPricingModifiers airPricingModifiers;
    @XmlElement(name = "TicketingModifiersRef")
    protected TicketingModifiersRef ticketingModifiersRef;
    @XmlElement(name = "AirSegmentPricingModifiers")
    protected List<AirSegmentPricingModifiers> airSegmentPricingModifiers;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "CommandKey")
    protected String commandKey;
    @XmlAttribute(name = "AmountType")
    protected String amountType;
    @XmlAttribute(name = "IncludesVAT")
    protected Boolean includesVAT;
    @XmlAttribute(name = "ExchangeAmount")
    protected String exchangeAmount;
    @XmlAttribute(name = "ForfeitAmount")
    protected String forfeitAmount;
    @XmlAttribute(name = "Refundable")
    protected Boolean refundable;
    @XmlAttribute(name = "Exchangeable")
    protected Boolean exchangeable;
    @XmlAttribute(name = "LatestTicketingTime")
    protected String latestTicketingTime;
    @XmlAttribute(name = "PricingMethod", required = true)
    protected TypePricingMethod pricingMethod;
    @XmlAttribute(name = "Checksum")
    protected String checksum;
    @XmlAttribute(name = "ETicketability")
    protected TypeEticketability eTicketability;
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    @XmlAttribute(name = "AirPricingInfoGroup")
    protected Integer airPricingInfoGroup;
    @XmlAttribute(name = "TotalNetPrice")
    protected String totalNetPrice;
    @XmlAttribute(name = "Ticketed")
    protected Boolean ticketed;
    @XmlAttribute(name = "PricingType")
    protected String pricingType;
    @XmlAttribute(name = "TotalPrice")
    protected String totalPrice;
    @XmlAttribute(name = "BasePrice")
    protected String basePrice;
    @XmlAttribute(name = "ApproximateTotalPrice")
    protected String approximateTotalPrice;
    @XmlAttribute(name = "ApproximateBasePrice")
    protected String approximateBasePrice;
    @XmlAttribute(name = "EquivalentBasePrice")
    protected String equivalentBasePrice;
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    @XmlAttribute(name = "Fees")
    protected String fees;
    @XmlAttribute(name = "Services")
    protected String services;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;

    /**
     * Gets the value of the fareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfo }
     * 
     * 
     */
    public List<FareInfo> getFareInfo() {
        if (fareInfo == null) {
            fareInfo = new ArrayList<FareInfo>();
        }
        return this.fareInfo;
    }

    /**
     * Gets the value of the fareStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FareStatus }
     *     
     */
    public FareStatus getFareStatus() {
        return fareStatus;
    }

    /**
     * Sets the value of the fareStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStatus }
     *     
     */
    public void setFareStatus(FareStatus value) {
        this.fareStatus = value;
    }

    /**
     * Gets the value of the fareInfoRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfoRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInfoRef }
     * 
     * 
     */
    public List<FareInfoRef> getFareInfoRef() {
        if (fareInfoRef == null) {
            fareInfoRef = new ArrayList<FareInfoRef>();
        }
        return this.fareInfoRef;
    }

    /**
     * Gets the value of the bookingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingInfo }
     * 
     * 
     */
    public List<BookingInfo> getBookingInfo() {
        if (bookingInfo == null) {
            bookingInfo = new ArrayList<BookingInfo>();
        }
        return this.bookingInfo;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfo }
     * 
     * 
     */
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TypeTaxInfo>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the fareCalc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCalc() {
        return fareCalc;
    }

    /**
     * Sets the value of the fareCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCalc(String value) {
        this.fareCalc = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerType }
     * 
     * 
     */
    public List<PassengerType> getPassengerType() {
        if (passengerType == null) {
            passengerType = new ArrayList<PassengerType>();
        }
        return this.passengerType;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTravelerRef }
     * 
     * 
     */
    public List<BookingTravelerRef> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<BookingTravelerRef>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Gets the value of the waiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link WaiverCode }
     *     
     */
    public WaiverCode getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverCode }
     *     
     */
    public void setWaiverCode(WaiverCode value) {
        this.waiverCode = value;
    }

    /**
     * The reference to the Payment if Air Pricing
     *                             is charged Gets the value of the paymentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentRef }
     * 
     * 
     */
    public List<PaymentRef> getPaymentRef() {
        if (paymentRef == null) {
            paymentRef = new ArrayList<PaymentRef>();
        }
        return this.paymentRef;
    }

    /**
     * Gets the value of the changePenalty property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFarePenalty }
     *     
     */
    public TypeFarePenalty getChangePenalty() {
        return changePenalty;
    }

    /**
     * Sets the value of the changePenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFarePenalty }
     *     
     */
    public void setChangePenalty(TypeFarePenalty value) {
        this.changePenalty = value;
    }

    /**
     * Gets the value of the cancelPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFarePenalty }
     *     
     */
    public TypeFarePenalty getCancelPenalty() {
        return cancelPenalty;
    }

    /**
     * Sets the value of the cancelPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFarePenalty }
     *     
     */
    public void setCancelPenalty(TypeFarePenalty value) {
        this.cancelPenalty = value;
    }

    /**
     * Gets the value of the feeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeInfo }
     * 
     * 
     */
    public List<FeeInfo> getFeeInfo() {
        if (feeInfo == null) {
            feeInfo = new ArrayList<FeeInfo>();
        }
        return this.feeInfo;
    }

    /**
     * Gets the value of the adjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adjustment }
     * 
     * 
     */
    public List<Adjustment> getAdjustment() {
        if (adjustment == null) {
            adjustment = new ArrayList<Adjustment>();
        }
        return this.adjustment;
    }

    /**
     * Gets the value of the yield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Yield }
     * 
     * 
     */
    public List<Yield> getYield() {
        if (yield == null) {
            yield = new ArrayList<Yield>();
        }
        return this.yield;
    }

    /**
     * Gets the value of the airPricingModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers }
     *     
     */
    public AirPricingModifiers getAirPricingModifiers() {
        return airPricingModifiers;
    }

    /**
     * Sets the value of the airPricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers }
     *     
     */
    public void setAirPricingModifiers(AirPricingModifiers value) {
        this.airPricingModifiers = value;
    }

    /**
     * Gets the value of the ticketingModifiersRef property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingModifiersRef }
     *     
     */
    public TicketingModifiersRef getTicketingModifiersRef() {
        return ticketingModifiersRef;
    }

    /**
     * Sets the value of the ticketingModifiersRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingModifiersRef }
     *     
     */
    public void setTicketingModifiersRef(TicketingModifiersRef value) {
        this.ticketingModifiersRef = value;
    }

    /**
     * Gets the value of the airSegmentPricingModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentPricingModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegmentPricingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentPricingModifiers }
     * 
     * 
     */
    public List<AirSegmentPricingModifiers> getAirSegmentPricingModifiers() {
        if (airSegmentPricingModifiers == null) {
            airSegmentPricingModifiers = new ArrayList<AirSegmentPricingModifiers>();
        }
        return this.airSegmentPricingModifiers;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the commandKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandKey() {
        return commandKey;
    }

    /**
     * Sets the value of the commandKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandKey(String value) {
        this.commandKey = value;
    }

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountType(String value) {
        this.amountType = value;
    }

    /**
     * Gets the value of the includesVAT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesVAT() {
        return includesVAT;
    }

    /**
     * Sets the value of the includesVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesVAT(Boolean value) {
        this.includesVAT = value;
    }

    /**
     * Gets the value of the exchangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeAmount() {
        return exchangeAmount;
    }

    /**
     * Sets the value of the exchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeAmount(String value) {
        this.exchangeAmount = value;
    }

    /**
     * Gets the value of the forfeitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForfeitAmount() {
        return forfeitAmount;
    }

    /**
     * Sets the value of the forfeitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForfeitAmount(String value) {
        this.forfeitAmount = value;
    }

    /**
     * Gets the value of the refundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundable() {
        return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundable(Boolean value) {
        this.refundable = value;
    }

    /**
     * Gets the value of the exchangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExchangeable() {
        return exchangeable;
    }

    /**
     * Sets the value of the exchangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExchangeable(Boolean value) {
        this.exchangeable = value;
    }

    /**
     * Gets the value of the latestTicketingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestTicketingTime() {
        return latestTicketingTime;
    }

    /**
     * Sets the value of the latestTicketingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestTicketingTime(String value) {
        this.latestTicketingTime = value;
    }

    /**
     * Gets the value of the pricingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TypePricingMethod }
     *     
     */
    public TypePricingMethod getPricingMethod() {
        return pricingMethod;
    }

    /**
     * Sets the value of the pricingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePricingMethod }
     *     
     */
    public void setPricingMethod(TypePricingMethod value) {
        this.pricingMethod = value;
    }

    /**
     * Gets the value of the checksum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Sets the value of the checksum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksum(String value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the eTicketability property.
     * 
     * @return
     *     possible object is
     *     {@link TypeEticketability }
     *     
     */
    public TypeEticketability getETicketability() {
        return eTicketability;
    }

    /**
     * Sets the value of the eTicketability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEticketability }
     *     
     */
    public void setETicketability(TypeEticketability value) {
        this.eTicketability = value;
    }

    /**
     * Gets the value of the platingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Gets the value of the airPricingInfoGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAirPricingInfoGroup() {
        return airPricingInfoGroup;
    }

    /**
     * Sets the value of the airPricingInfoGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAirPricingInfoGroup(Integer value) {
        this.airPricingInfoGroup = value;
    }

    /**
     * Gets the value of the totalNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNetPrice() {
        return totalNetPrice;
    }

    /**
     * Sets the value of the totalNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNetPrice(String value) {
        this.totalNetPrice = value;
    }

    /**
     * Gets the value of the ticketed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketed() {
        return ticketed;
    }

    /**
     * Sets the value of the ticketed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketed(Boolean value) {
        this.ticketed = value;
    }

    /**
     * Gets the value of the pricingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingType() {
        return pricingType;
    }

    /**
     * Sets the value of the pricingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingType(String value) {
        this.pricingType = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePrice(String value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the approximateTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTotalPrice() {
        return approximateTotalPrice;
    }

    /**
     * Sets the value of the approximateTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTotalPrice(String value) {
        this.approximateTotalPrice = value;
    }

    /**
     * Gets the value of the approximateBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateBasePrice() {
        return approximateBasePrice;
    }

    /**
     * Sets the value of the approximateBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateBasePrice(String value) {
        this.approximateBasePrice = value;
    }

    /**
     * Gets the value of the equivalentBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentBasePrice() {
        return equivalentBasePrice;
    }

    /**
     * Sets the value of the equivalentBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentBasePrice(String value) {
        this.equivalentBasePrice = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxes(String value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFees(String value) {
        this.fees = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

}

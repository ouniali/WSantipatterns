
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceEvent">
 *       &lt;sequence>
 *         &lt;element name="DistributionSetDataSourceIdentifiers" type="{http://www.xignite.com/services/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AmountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeclaredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntitlementPeriodStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntitlementPeriodEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReinvestmentPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ReinvestmentPriceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberInitialInstruments" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NewSecurities" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NewInstrumentMatch" type="{http://www.xignite.com/services/}Instrument" minOccurs="0"/>
 *         &lt;element name="ValidationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InterestDayCountConvention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MeetingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpreadDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpreadRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InstrumentAllotmentOrPlacementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstrumentDistributionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriptionPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SubscriptionPriceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributionInKindAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributionInKindDiscountCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributionInKindDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DistributionInKindDiscountQuotationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributionInKindValidStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributionInKindValidEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomAttributes" type="{http://www.xignite.com/services/}ArrayOfCustomAttribute" minOccurs="0"/>
 *         &lt;element name="InterestPaymentFixings" type="{http://www.xignite.com/services/}ArrayOfInterestPaymentFixing" minOccurs="0"/>
 *         &lt;element name="ExDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "distributionSetDataSourceIdentifiers",
    "amount",
    "amountType",
    "paymentType",
    "currency",
    "payDate",
    "declaredDate",
    "recordDate",
    "entitlementPeriodStart",
    "entitlementPeriodEnd",
    "note",
    "reinvestmentPrice",
    "reinvestmentPriceCurrency",
    "paymentClassification",
    "numberInitialInstruments",
    "newSecurities",
    "newInstrumentMatch",
    "validationType",
    "interestDayCountConvention",
    "couponNumber",
    "meetingDate",
    "spreadDirection",
    "spreadRate",
    "instrumentAllotmentOrPlacementType",
    "instrumentDistributionType",
    "paymentStatus",
    "subscriptionPrice",
    "subscriptionPriceCurrency",
    "settlementType",
    "distributionInKindAgent",
    "distributionInKindDiscountCurrency",
    "distributionInKindDiscountAmount",
    "distributionInKindDiscountQuotationType",
    "distributionInKindValidStart",
    "distributionInKindValidEnd",
    "customAttributes",
    "interestPaymentFixings",
    "exDate"
})
public class Payment
    extends AbstractPublicWebServiceEvent
{

    @XmlElement(name = "DistributionSetDataSourceIdentifiers")
    protected ArrayOfString distributionSetDataSourceIdentifiers;
    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "AmountType")
    protected String amountType;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "PayDate")
    protected String payDate;
    @XmlElement(name = "DeclaredDate")
    protected String declaredDate;
    @XmlElement(name = "RecordDate")
    protected String recordDate;
    @XmlElement(name = "EntitlementPeriodStart")
    protected String entitlementPeriodStart;
    @XmlElement(name = "EntitlementPeriodEnd")
    protected String entitlementPeriodEnd;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "ReinvestmentPrice")
    protected double reinvestmentPrice;
    @XmlElement(name = "ReinvestmentPriceCurrency")
    protected String reinvestmentPriceCurrency;
    @XmlElement(name = "PaymentClassification")
    protected String paymentClassification;
    @XmlElement(name = "NumberInitialInstruments")
    protected double numberInitialInstruments;
    @XmlElement(name = "NewSecurities")
    protected double newSecurities;
    @XmlElement(name = "NewInstrumentMatch")
    protected Instrument newInstrumentMatch;
    @XmlElement(name = "ValidationType")
    protected String validationType;
    @XmlElement(name = "InterestDayCountConvention")
    protected String interestDayCountConvention;
    @XmlElement(name = "CouponNumber")
    protected String couponNumber;
    @XmlElement(name = "MeetingDate")
    protected String meetingDate;
    @XmlElement(name = "SpreadDirection")
    protected String spreadDirection;
    @XmlElement(name = "SpreadRate")
    protected double spreadRate;
    @XmlElement(name = "InstrumentAllotmentOrPlacementType")
    protected String instrumentAllotmentOrPlacementType;
    @XmlElement(name = "InstrumentDistributionType")
    protected String instrumentDistributionType;
    @XmlElement(name = "PaymentStatus")
    protected String paymentStatus;
    @XmlElement(name = "SubscriptionPrice")
    protected double subscriptionPrice;
    @XmlElement(name = "SubscriptionPriceCurrency")
    protected String subscriptionPriceCurrency;
    @XmlElement(name = "SettlementType")
    protected String settlementType;
    @XmlElement(name = "DistributionInKindAgent")
    protected String distributionInKindAgent;
    @XmlElement(name = "DistributionInKindDiscountCurrency")
    protected String distributionInKindDiscountCurrency;
    @XmlElement(name = "DistributionInKindDiscountAmount")
    protected double distributionInKindDiscountAmount;
    @XmlElement(name = "DistributionInKindDiscountQuotationType")
    protected String distributionInKindDiscountQuotationType;
    @XmlElement(name = "DistributionInKindValidStart")
    protected String distributionInKindValidStart;
    @XmlElement(name = "DistributionInKindValidEnd")
    protected String distributionInKindValidEnd;
    @XmlElement(name = "CustomAttributes")
    protected ArrayOfCustomAttribute customAttributes;
    @XmlElement(name = "InterestPaymentFixings")
    protected ArrayOfInterestPaymentFixing interestPaymentFixings;
    @XmlElement(name = "ExDate")
    protected String exDate;

    /**
     * Gets the value of the distributionSetDataSourceIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDistributionSetDataSourceIdentifiers() {
        return distributionSetDataSourceIdentifiers;
    }

    /**
     * Sets the value of the distributionSetDataSourceIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDistributionSetDataSourceIdentifiers(ArrayOfString value) {
        this.distributionSetDataSourceIdentifiers = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
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
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
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
     * Gets the value of the payDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayDate() {
        return payDate;
    }

    /**
     * Sets the value of the payDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayDate(String value) {
        this.payDate = value;
    }

    /**
     * Gets the value of the declaredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclaredDate() {
        return declaredDate;
    }

    /**
     * Sets the value of the declaredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclaredDate(String value) {
        this.declaredDate = value;
    }

    /**
     * Gets the value of the recordDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordDate() {
        return recordDate;
    }

    /**
     * Sets the value of the recordDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordDate(String value) {
        this.recordDate = value;
    }

    /**
     * Gets the value of the entitlementPeriodStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementPeriodStart() {
        return entitlementPeriodStart;
    }

    /**
     * Sets the value of the entitlementPeriodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementPeriodStart(String value) {
        this.entitlementPeriodStart = value;
    }

    /**
     * Gets the value of the entitlementPeriodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementPeriodEnd() {
        return entitlementPeriodEnd;
    }

    /**
     * Sets the value of the entitlementPeriodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementPeriodEnd(String value) {
        this.entitlementPeriodEnd = value;
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
     * Gets the value of the reinvestmentPrice property.
     * 
     */
    public double getReinvestmentPrice() {
        return reinvestmentPrice;
    }

    /**
     * Sets the value of the reinvestmentPrice property.
     * 
     */
    public void setReinvestmentPrice(double value) {
        this.reinvestmentPrice = value;
    }

    /**
     * Gets the value of the reinvestmentPriceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReinvestmentPriceCurrency() {
        return reinvestmentPriceCurrency;
    }

    /**
     * Sets the value of the reinvestmentPriceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReinvestmentPriceCurrency(String value) {
        this.reinvestmentPriceCurrency = value;
    }

    /**
     * Gets the value of the paymentClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentClassification() {
        return paymentClassification;
    }

    /**
     * Sets the value of the paymentClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentClassification(String value) {
        this.paymentClassification = value;
    }

    /**
     * Gets the value of the numberInitialInstruments property.
     * 
     */
    public double getNumberInitialInstruments() {
        return numberInitialInstruments;
    }

    /**
     * Sets the value of the numberInitialInstruments property.
     * 
     */
    public void setNumberInitialInstruments(double value) {
        this.numberInitialInstruments = value;
    }

    /**
     * Gets the value of the newSecurities property.
     * 
     */
    public double getNewSecurities() {
        return newSecurities;
    }

    /**
     * Sets the value of the newSecurities property.
     * 
     */
    public void setNewSecurities(double value) {
        this.newSecurities = value;
    }

    /**
     * Gets the value of the newInstrumentMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Instrument }
     *     
     */
    public Instrument getNewInstrumentMatch() {
        return newInstrumentMatch;
    }

    /**
     * Sets the value of the newInstrumentMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instrument }
     *     
     */
    public void setNewInstrumentMatch(Instrument value) {
        this.newInstrumentMatch = value;
    }

    /**
     * Gets the value of the validationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationType() {
        return validationType;
    }

    /**
     * Sets the value of the validationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationType(String value) {
        this.validationType = value;
    }

    /**
     * Gets the value of the interestDayCountConvention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestDayCountConvention() {
        return interestDayCountConvention;
    }

    /**
     * Sets the value of the interestDayCountConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestDayCountConvention(String value) {
        this.interestDayCountConvention = value;
    }

    /**
     * Gets the value of the couponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponNumber(String value) {
        this.couponNumber = value;
    }

    /**
     * Gets the value of the meetingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingDate() {
        return meetingDate;
    }

    /**
     * Sets the value of the meetingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingDate(String value) {
        this.meetingDate = value;
    }

    /**
     * Gets the value of the spreadDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpreadDirection() {
        return spreadDirection;
    }

    /**
     * Sets the value of the spreadDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpreadDirection(String value) {
        this.spreadDirection = value;
    }

    /**
     * Gets the value of the spreadRate property.
     * 
     */
    public double getSpreadRate() {
        return spreadRate;
    }

    /**
     * Sets the value of the spreadRate property.
     * 
     */
    public void setSpreadRate(double value) {
        this.spreadRate = value;
    }

    /**
     * Gets the value of the instrumentAllotmentOrPlacementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentAllotmentOrPlacementType() {
        return instrumentAllotmentOrPlacementType;
    }

    /**
     * Sets the value of the instrumentAllotmentOrPlacementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentAllotmentOrPlacementType(String value) {
        this.instrumentAllotmentOrPlacementType = value;
    }

    /**
     * Gets the value of the instrumentDistributionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentDistributionType() {
        return instrumentDistributionType;
    }

    /**
     * Sets the value of the instrumentDistributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentDistributionType(String value) {
        this.instrumentDistributionType = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the subscriptionPrice property.
     * 
     */
    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    /**
     * Sets the value of the subscriptionPrice property.
     * 
     */
    public void setSubscriptionPrice(double value) {
        this.subscriptionPrice = value;
    }

    /**
     * Gets the value of the subscriptionPriceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionPriceCurrency() {
        return subscriptionPriceCurrency;
    }

    /**
     * Sets the value of the subscriptionPriceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionPriceCurrency(String value) {
        this.subscriptionPriceCurrency = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementType(String value) {
        this.settlementType = value;
    }

    /**
     * Gets the value of the distributionInKindAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionInKindAgent() {
        return distributionInKindAgent;
    }

    /**
     * Sets the value of the distributionInKindAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionInKindAgent(String value) {
        this.distributionInKindAgent = value;
    }

    /**
     * Gets the value of the distributionInKindDiscountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionInKindDiscountCurrency() {
        return distributionInKindDiscountCurrency;
    }

    /**
     * Sets the value of the distributionInKindDiscountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionInKindDiscountCurrency(String value) {
        this.distributionInKindDiscountCurrency = value;
    }

    /**
     * Gets the value of the distributionInKindDiscountAmount property.
     * 
     */
    public double getDistributionInKindDiscountAmount() {
        return distributionInKindDiscountAmount;
    }

    /**
     * Sets the value of the distributionInKindDiscountAmount property.
     * 
     */
    public void setDistributionInKindDiscountAmount(double value) {
        this.distributionInKindDiscountAmount = value;
    }

    /**
     * Gets the value of the distributionInKindDiscountQuotationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionInKindDiscountQuotationType() {
        return distributionInKindDiscountQuotationType;
    }

    /**
     * Sets the value of the distributionInKindDiscountQuotationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionInKindDiscountQuotationType(String value) {
        this.distributionInKindDiscountQuotationType = value;
    }

    /**
     * Gets the value of the distributionInKindValidStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionInKindValidStart() {
        return distributionInKindValidStart;
    }

    /**
     * Sets the value of the distributionInKindValidStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionInKindValidStart(String value) {
        this.distributionInKindValidStart = value;
    }

    /**
     * Gets the value of the distributionInKindValidEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionInKindValidEnd() {
        return distributionInKindValidEnd;
    }

    /**
     * Sets the value of the distributionInKindValidEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionInKindValidEnd(String value) {
        this.distributionInKindValidEnd = value;
    }

    /**
     * Gets the value of the customAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomAttribute }
     *     
     */
    public ArrayOfCustomAttribute getCustomAttributes() {
        return customAttributes;
    }

    /**
     * Sets the value of the customAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomAttribute }
     *     
     */
    public void setCustomAttributes(ArrayOfCustomAttribute value) {
        this.customAttributes = value;
    }

    /**
     * Gets the value of the interestPaymentFixings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInterestPaymentFixing }
     *     
     */
    public ArrayOfInterestPaymentFixing getInterestPaymentFixings() {
        return interestPaymentFixings;
    }

    /**
     * Sets the value of the interestPaymentFixings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInterestPaymentFixing }
     *     
     */
    public void setInterestPaymentFixings(ArrayOfInterestPaymentFixing value) {
        this.interestPaymentFixings = value;
    }

    /**
     * Gets the value of the exDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExDate() {
        return exDate;
    }

    /**
     * Sets the value of the exDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExDate(String value) {
        this.exDate = value;
    }

}


package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentTransformationInputOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentTransformationInputOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceObj">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AmountUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nominal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NominalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MinAmountUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MaxAmountUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InputTenderedInstruments" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InputTenderedInstrumentsUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InputTenderedInstrumentsAmountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InputAcceptedInstruments" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InputAcceptedInstrumentsUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InputAcceptedInstrumentsAmountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferingLimitsLimit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Instrument" type="{http://www.xignite.com/services/}Instrument" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentTransformationInputOutput", propOrder = {
    "amount",
    "amountUnit",
    "amountCurrency",
    "nominal",
    "nominalCurrency",
    "minAmount",
    "minAmountUnit",
    "maxAmount",
    "maxAmountUnit",
    "inputTenderedInstruments",
    "inputTenderedInstrumentsUnit",
    "inputTenderedInstrumentsAmountType",
    "inputAcceptedInstruments",
    "inputAcceptedInstrumentsUnit",
    "inputAcceptedInstrumentsAmountType",
    "paymentDate",
    "offeringLimitsLimit",
    "description",
    "instrument"
})
public class InstrumentTransformationInputOutput
    extends AbstractPublicWebServiceObj
{

    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "AmountUnit")
    protected String amountUnit;
    @XmlElement(name = "AmountCurrency")
    protected String amountCurrency;
    @XmlElement(name = "Nominal")
    protected double nominal;
    @XmlElement(name = "NominalCurrency")
    protected String nominalCurrency;
    @XmlElement(name = "MinAmount")
    protected double minAmount;
    @XmlElement(name = "MinAmountUnit")
    protected String minAmountUnit;
    @XmlElement(name = "MaxAmount")
    protected double maxAmount;
    @XmlElement(name = "MaxAmountUnit")
    protected String maxAmountUnit;
    @XmlElement(name = "InputTenderedInstruments")
    protected double inputTenderedInstruments;
    @XmlElement(name = "InputTenderedInstrumentsUnit")
    protected String inputTenderedInstrumentsUnit;
    @XmlElement(name = "InputTenderedInstrumentsAmountType")
    protected String inputTenderedInstrumentsAmountType;
    @XmlElement(name = "InputAcceptedInstruments")
    protected double inputAcceptedInstruments;
    @XmlElement(name = "InputAcceptedInstrumentsUnit")
    protected String inputAcceptedInstrumentsUnit;
    @XmlElement(name = "InputAcceptedInstrumentsAmountType")
    protected String inputAcceptedInstrumentsAmountType;
    @XmlElement(name = "PaymentDate")
    protected String paymentDate;
    @XmlElement(name = "OfferingLimitsLimit")
    protected double offeringLimitsLimit;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Instrument")
    protected Instrument instrument;

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
     * Gets the value of the amountUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountUnit() {
        return amountUnit;
    }

    /**
     * Sets the value of the amountUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountUnit(String value) {
        this.amountUnit = value;
    }

    /**
     * Gets the value of the amountCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountCurrency() {
        return amountCurrency;
    }

    /**
     * Sets the value of the amountCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountCurrency(String value) {
        this.amountCurrency = value;
    }

    /**
     * Gets the value of the nominal property.
     * 
     */
    public double getNominal() {
        return nominal;
    }

    /**
     * Sets the value of the nominal property.
     * 
     */
    public void setNominal(double value) {
        this.nominal = value;
    }

    /**
     * Gets the value of the nominalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominalCurrency() {
        return nominalCurrency;
    }

    /**
     * Sets the value of the nominalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominalCurrency(String value) {
        this.nominalCurrency = value;
    }

    /**
     * Gets the value of the minAmount property.
     * 
     */
    public double getMinAmount() {
        return minAmount;
    }

    /**
     * Sets the value of the minAmount property.
     * 
     */
    public void setMinAmount(double value) {
        this.minAmount = value;
    }

    /**
     * Gets the value of the minAmountUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinAmountUnit() {
        return minAmountUnit;
    }

    /**
     * Sets the value of the minAmountUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinAmountUnit(String value) {
        this.minAmountUnit = value;
    }

    /**
     * Gets the value of the maxAmount property.
     * 
     */
    public double getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     * 
     */
    public void setMaxAmount(double value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the maxAmountUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAmountUnit() {
        return maxAmountUnit;
    }

    /**
     * Sets the value of the maxAmountUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAmountUnit(String value) {
        this.maxAmountUnit = value;
    }

    /**
     * Gets the value of the inputTenderedInstruments property.
     * 
     */
    public double getInputTenderedInstruments() {
        return inputTenderedInstruments;
    }

    /**
     * Sets the value of the inputTenderedInstruments property.
     * 
     */
    public void setInputTenderedInstruments(double value) {
        this.inputTenderedInstruments = value;
    }

    /**
     * Gets the value of the inputTenderedInstrumentsUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputTenderedInstrumentsUnit() {
        return inputTenderedInstrumentsUnit;
    }

    /**
     * Sets the value of the inputTenderedInstrumentsUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputTenderedInstrumentsUnit(String value) {
        this.inputTenderedInstrumentsUnit = value;
    }

    /**
     * Gets the value of the inputTenderedInstrumentsAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputTenderedInstrumentsAmountType() {
        return inputTenderedInstrumentsAmountType;
    }

    /**
     * Sets the value of the inputTenderedInstrumentsAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputTenderedInstrumentsAmountType(String value) {
        this.inputTenderedInstrumentsAmountType = value;
    }

    /**
     * Gets the value of the inputAcceptedInstruments property.
     * 
     */
    public double getInputAcceptedInstruments() {
        return inputAcceptedInstruments;
    }

    /**
     * Sets the value of the inputAcceptedInstruments property.
     * 
     */
    public void setInputAcceptedInstruments(double value) {
        this.inputAcceptedInstruments = value;
    }

    /**
     * Gets the value of the inputAcceptedInstrumentsUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputAcceptedInstrumentsUnit() {
        return inputAcceptedInstrumentsUnit;
    }

    /**
     * Sets the value of the inputAcceptedInstrumentsUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputAcceptedInstrumentsUnit(String value) {
        this.inputAcceptedInstrumentsUnit = value;
    }

    /**
     * Gets the value of the inputAcceptedInstrumentsAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputAcceptedInstrumentsAmountType() {
        return inputAcceptedInstrumentsAmountType;
    }

    /**
     * Sets the value of the inputAcceptedInstrumentsAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputAcceptedInstrumentsAmountType(String value) {
        this.inputAcceptedInstrumentsAmountType = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the offeringLimitsLimit property.
     * 
     */
    public double getOfferingLimitsLimit() {
        return offeringLimitsLimit;
    }

    /**
     * Sets the value of the offeringLimitsLimit property.
     * 
     */
    public void setOfferingLimitsLimit(double value) {
        this.offeringLimitsLimit = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the instrument property.
     * 
     * @return
     *     possible object is
     *     {@link Instrument }
     *     
     */
    public Instrument getInstrument() {
        return instrument;
    }

    /**
     * Sets the value of the instrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instrument }
     *     
     */
    public void setInstrument(Instrument value) {
        this.instrument = value;
    }

}

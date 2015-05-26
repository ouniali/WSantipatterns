
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dividend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dividend">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceEvent">
 *       &lt;sequence>
 *         &lt;element name="DistributionSetDataSourceIdentifiers" type="{http://www.xignite.com/services/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="DividendClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DividendPaymentFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeclaredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MeetingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntitlementPeriodStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntitlementPeriodEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AmountValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AmountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DividendType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomAttributes" type="{http://www.xignite.com/services/}ArrayOfCustomAttribute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dividend", propOrder = {
    "distributionSetDataSourceIdentifiers",
    "dividendClassification",
    "dividendPaymentFrequency",
    "payDate",
    "declaredDate",
    "recordDate",
    "meetingDate",
    "entitlementPeriodStart",
    "entitlementPeriodEnd",
    "amount",
    "amountValid",
    "amountType",
    "exDate",
    "currency",
    "dividendType",
    "customAttributes"
})
public class Dividend
    extends AbstractPublicWebServiceEvent
{

    @XmlElement(name = "DistributionSetDataSourceIdentifiers")
    protected ArrayOfString distributionSetDataSourceIdentifiers;
    @XmlElement(name = "DividendClassification")
    protected String dividendClassification;
    @XmlElement(name = "DividendPaymentFrequency")
    protected String dividendPaymentFrequency;
    @XmlElement(name = "PayDate")
    protected String payDate;
    @XmlElement(name = "DeclaredDate")
    protected String declaredDate;
    @XmlElement(name = "RecordDate")
    protected String recordDate;
    @XmlElement(name = "MeetingDate")
    protected String meetingDate;
    @XmlElement(name = "EntitlementPeriodStart")
    protected String entitlementPeriodStart;
    @XmlElement(name = "EntitlementPeriodEnd")
    protected String entitlementPeriodEnd;
    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "AmountValid")
    protected boolean amountValid;
    @XmlElement(name = "AmountType")
    protected String amountType;
    @XmlElement(name = "ExDate")
    protected String exDate;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "DividendType")
    protected String dividendType;
    @XmlElement(name = "CustomAttributes")
    protected ArrayOfCustomAttribute customAttributes;

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
     * Gets the value of the dividendClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDividendClassification() {
        return dividendClassification;
    }

    /**
     * Sets the value of the dividendClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDividendClassification(String value) {
        this.dividendClassification = value;
    }

    /**
     * Gets the value of the dividendPaymentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDividendPaymentFrequency() {
        return dividendPaymentFrequency;
    }

    /**
     * Sets the value of the dividendPaymentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDividendPaymentFrequency(String value) {
        this.dividendPaymentFrequency = value;
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
     * Gets the value of the amountValid property.
     * 
     */
    public boolean isAmountValid() {
        return amountValid;
    }

    /**
     * Sets the value of the amountValid property.
     * 
     */
    public void setAmountValid(boolean value) {
        this.amountValid = value;
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
     * Gets the value of the dividendType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDividendType() {
        return dividendType;
    }

    /**
     * Sets the value of the dividendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDividendType(String value) {
        this.dividendType = value;
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

}

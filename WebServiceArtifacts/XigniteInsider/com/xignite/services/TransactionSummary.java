
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="InsiderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsiderCIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecuritySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityCIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityType" type="{http://www.xignite.com/services/}SecurityTypes"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.xignite.com/services/}TransactionCodes"/>
 *         &lt;element name="TransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LowPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="HighPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OwnershipType" type="{http://www.xignite.com/services/}OwnershipTypes"/>
 *         &lt;element name="AmountOwnedAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSummary", propOrder = {
    "insiderName",
    "insiderCIK",
    "securitySymbol",
    "securityCIK",
    "securityType",
    "transactionDate",
    "transactionCode",
    "transactionDescription",
    "amount",
    "lowPrice",
    "highPrice",
    "value",
    "ownershipType",
    "amountOwnedAfter"
})
public class TransactionSummary
    extends Common
{

    @XmlElement(name = "InsiderName")
    protected String insiderName;
    @XmlElement(name = "InsiderCIK")
    protected String insiderCIK;
    @XmlElement(name = "SecuritySymbol")
    protected String securitySymbol;
    @XmlElement(name = "SecurityCIK")
    protected String securityCIK;
    @XmlElement(name = "SecurityType", required = true)
    @XmlSchemaType(name = "string")
    protected SecurityTypes securityType;
    @XmlElement(name = "TransactionDate")
    protected String transactionDate;
    @XmlElement(name = "TransactionCode", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionCodes transactionCode;
    @XmlElement(name = "TransactionDescription")
    protected String transactionDescription;
    @XmlElement(name = "Amount")
    protected int amount;
    @XmlElement(name = "LowPrice")
    protected double lowPrice;
    @XmlElement(name = "HighPrice")
    protected double highPrice;
    @XmlElement(name = "Value")
    protected double value;
    @XmlElement(name = "OwnershipType", required = true)
    @XmlSchemaType(name = "string")
    protected OwnershipTypes ownershipType;
    @XmlElement(name = "AmountOwnedAfter")
    protected int amountOwnedAfter;

    /**
     * Gets the value of the insiderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsiderName() {
        return insiderName;
    }

    /**
     * Sets the value of the insiderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsiderName(String value) {
        this.insiderName = value;
    }

    /**
     * Gets the value of the insiderCIK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsiderCIK() {
        return insiderCIK;
    }

    /**
     * Sets the value of the insiderCIK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsiderCIK(String value) {
        this.insiderCIK = value;
    }

    /**
     * Gets the value of the securitySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuritySymbol() {
        return securitySymbol;
    }

    /**
     * Sets the value of the securitySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuritySymbol(String value) {
        this.securitySymbol = value;
    }

    /**
     * Gets the value of the securityCIK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCIK() {
        return securityCIK;
    }

    /**
     * Sets the value of the securityCIK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCIK(String value) {
        this.securityCIK = value;
    }

    /**
     * Gets the value of the securityType property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityTypes }
     *     
     */
    public SecurityTypes getSecurityType() {
        return securityType;
    }

    /**
     * Sets the value of the securityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityTypes }
     *     
     */
    public void setSecurityType(SecurityTypes value) {
        this.securityType = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCodes }
     *     
     */
    public TransactionCodes getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCodes }
     *     
     */
    public void setTransactionCode(TransactionCodes value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the transactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDescription() {
        return transactionDescription;
    }

    /**
     * Sets the value of the transactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDescription(String value) {
        this.transactionDescription = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the lowPrice property.
     * 
     */
    public double getLowPrice() {
        return lowPrice;
    }

    /**
     * Sets the value of the lowPrice property.
     * 
     */
    public void setLowPrice(double value) {
        this.lowPrice = value;
    }

    /**
     * Gets the value of the highPrice property.
     * 
     */
    public double getHighPrice() {
        return highPrice;
    }

    /**
     * Sets the value of the highPrice property.
     * 
     */
    public void setHighPrice(double value) {
        this.highPrice = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the ownershipType property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipTypes }
     *     
     */
    public OwnershipTypes getOwnershipType() {
        return ownershipType;
    }

    /**
     * Sets the value of the ownershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipTypes }
     *     
     */
    public void setOwnershipType(OwnershipTypes value) {
        this.ownershipType = value;
    }

    /**
     * Gets the value of the amountOwnedAfter property.
     * 
     */
    public int getAmountOwnedAfter() {
        return amountOwnedAfter;
    }

    /**
     * Sets the value of the amountOwnedAfter property.
     * 
     */
    public void setAmountOwnedAfter(int value) {
        this.amountOwnedAfter = value;
    }

}

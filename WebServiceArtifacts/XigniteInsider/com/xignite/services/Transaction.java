
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="Insider" type="{http://www.xignite.com/services/}Insider" minOccurs="0"/>
 *         &lt;element name="SecurityType" type="{http://www.xignite.com/services/}SecurityTypes"/>
 *         &lt;element name="FormType" type="{http://www.xignite.com/services/}FormTypes"/>
 *         &lt;element name="EquitySwap" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SecurityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExecutionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExercisableDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.xignite.com/services/}TransactionCodes"/>
 *         &lt;element name="TransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StockAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AmountOwnedAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OwnershipType" type="{http://www.xignite.com/services/}OwnershipTypes"/>
 *         &lt;element name="OwnershipForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction", propOrder = {
    "security",
    "insider",
    "securityType",
    "formType",
    "equitySwap",
    "securityTitle",
    "optionTitle",
    "transactionDate",
    "executionDate",
    "expirationDate",
    "exercisableDate",
    "transactionCode",
    "transactionDescription",
    "optionAmount",
    "stockAmount",
    "price",
    "value",
    "amountOwnedAfter",
    "ownershipType",
    "ownershipForm",
    "formUrl"
})
@XmlSeeAlso({
    SECTransaction.class,
    Holding.class
})
public class Transaction
    extends Common
{

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "Insider")
    protected Insider insider;
    @XmlElement(name = "SecurityType", required = true)
    @XmlSchemaType(name = "string")
    protected SecurityTypes securityType;
    @XmlElement(name = "FormType", required = true)
    @XmlSchemaType(name = "string")
    protected FormTypes formType;
    @XmlElement(name = "EquitySwap")
    protected boolean equitySwap;
    @XmlElement(name = "SecurityTitle")
    protected String securityTitle;
    @XmlElement(name = "OptionTitle")
    protected String optionTitle;
    @XmlElement(name = "TransactionDate")
    protected String transactionDate;
    @XmlElement(name = "ExecutionDate")
    protected String executionDate;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "ExercisableDate")
    protected String exercisableDate;
    @XmlElement(name = "TransactionCode", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionCodes transactionCode;
    @XmlElement(name = "TransactionDescription")
    protected String transactionDescription;
    @XmlElement(name = "OptionAmount")
    protected int optionAmount;
    @XmlElement(name = "StockAmount")
    protected int stockAmount;
    @XmlElement(name = "Price")
    protected double price;
    @XmlElement(name = "Value")
    protected double value;
    @XmlElement(name = "AmountOwnedAfter")
    protected int amountOwnedAfter;
    @XmlElement(name = "OwnershipType", required = true)
    @XmlSchemaType(name = "string")
    protected OwnershipTypes ownershipType;
    @XmlElement(name = "OwnershipForm")
    protected String ownershipForm;
    @XmlElement(name = "FormUrl")
    protected String formUrl;

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setSecurity(Security value) {
        this.security = value;
    }

    /**
     * Gets the value of the insider property.
     * 
     * @return
     *     possible object is
     *     {@link Insider }
     *     
     */
    public Insider getInsider() {
        return insider;
    }

    /**
     * Sets the value of the insider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Insider }
     *     
     */
    public void setInsider(Insider value) {
        this.insider = value;
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
     * Gets the value of the formType property.
     * 
     * @return
     *     possible object is
     *     {@link FormTypes }
     *     
     */
    public FormTypes getFormType() {
        return formType;
    }

    /**
     * Sets the value of the formType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormTypes }
     *     
     */
    public void setFormType(FormTypes value) {
        this.formType = value;
    }

    /**
     * Gets the value of the equitySwap property.
     * 
     */
    public boolean isEquitySwap() {
        return equitySwap;
    }

    /**
     * Sets the value of the equitySwap property.
     * 
     */
    public void setEquitySwap(boolean value) {
        this.equitySwap = value;
    }

    /**
     * Gets the value of the securityTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityTitle() {
        return securityTitle;
    }

    /**
     * Sets the value of the securityTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityTitle(String value) {
        this.securityTitle = value;
    }

    /**
     * Gets the value of the optionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionTitle() {
        return optionTitle;
    }

    /**
     * Sets the value of the optionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionTitle(String value) {
        this.optionTitle = value;
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
     * Gets the value of the executionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionDate() {
        return executionDate;
    }

    /**
     * Sets the value of the executionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionDate(String value) {
        this.executionDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the exercisableDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExercisableDate() {
        return exercisableDate;
    }

    /**
     * Sets the value of the exercisableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExercisableDate(String value) {
        this.exercisableDate = value;
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
     * Gets the value of the optionAmount property.
     * 
     */
    public int getOptionAmount() {
        return optionAmount;
    }

    /**
     * Sets the value of the optionAmount property.
     * 
     */
    public void setOptionAmount(int value) {
        this.optionAmount = value;
    }

    /**
     * Gets the value of the stockAmount property.
     * 
     */
    public int getStockAmount() {
        return stockAmount;
    }

    /**
     * Sets the value of the stockAmount property.
     * 
     */
    public void setStockAmount(int value) {
        this.stockAmount = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
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
     * Gets the value of the ownershipForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipForm() {
        return ownershipForm;
    }

    /**
     * Sets the value of the ownershipForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipForm(String value) {
        this.ownershipForm = value;
    }

    /**
     * Gets the value of the formUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormUrl() {
        return formUrl;
    }

    /**
     * Sets the value of the formUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormUrl(String value) {
        this.formUrl = value;
    }

}

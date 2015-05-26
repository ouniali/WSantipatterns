
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for derivativeTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="derivativeTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="securityTitle" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="conversionOrExercisePrice" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="transactionDate" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="deemedExecutionDate" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="transactionCoding" type="{http://www.xignite.com/services/}transactionCoding" minOccurs="0"/>
 *         &lt;element name="transactionTimeliness" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="transactionAmounts" type="{http://www.xignite.com/services/}transactionAmounts" minOccurs="0"/>
 *         &lt;element name="exerciseDate" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="underlyingSecurity" type="{http://www.xignite.com/services/}underlyingSecurity" minOccurs="0"/>
 *         &lt;element name="postTransactionAmounts" type="{http://www.xignite.com/services/}postTransactionAmounts" minOccurs="0"/>
 *         &lt;element name="ownershipNature" type="{http://www.xignite.com/services/}ownershipNature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "derivativeTransaction", propOrder = {
    "securityTitle",
    "conversionOrExercisePrice",
    "transactionDate",
    "deemedExecutionDate",
    "transactionCoding",
    "transactionTimeliness",
    "transactionAmounts",
    "exerciseDate",
    "expirationDate",
    "underlyingSecurity",
    "postTransactionAmounts",
    "ownershipNature"
})
public class DerivativeTransaction {

    protected Value securityTitle;
    protected Value conversionOrExercisePrice;
    protected Value transactionDate;
    protected Value deemedExecutionDate;
    protected TransactionCoding transactionCoding;
    protected Value transactionTimeliness;
    protected TransactionAmounts transactionAmounts;
    protected Value exerciseDate;
    protected Value expirationDate;
    protected UnderlyingSecurity underlyingSecurity;
    protected PostTransactionAmounts postTransactionAmounts;
    protected OwnershipNature ownershipNature;

    /**
     * Gets the value of the securityTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getSecurityTitle() {
        return securityTitle;
    }

    /**
     * Sets the value of the securityTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setSecurityTitle(Value value) {
        this.securityTitle = value;
    }

    /**
     * Gets the value of the conversionOrExercisePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getConversionOrExercisePrice() {
        return conversionOrExercisePrice;
    }

    /**
     * Sets the value of the conversionOrExercisePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setConversionOrExercisePrice(Value value) {
        this.conversionOrExercisePrice = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setTransactionDate(Value value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the deemedExecutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getDeemedExecutionDate() {
        return deemedExecutionDate;
    }

    /**
     * Sets the value of the deemedExecutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setDeemedExecutionDate(Value value) {
        this.deemedExecutionDate = value;
    }

    /**
     * Gets the value of the transactionCoding property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCoding }
     *     
     */
    public TransactionCoding getTransactionCoding() {
        return transactionCoding;
    }

    /**
     * Sets the value of the transactionCoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCoding }
     *     
     */
    public void setTransactionCoding(TransactionCoding value) {
        this.transactionCoding = value;
    }

    /**
     * Gets the value of the transactionTimeliness property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getTransactionTimeliness() {
        return transactionTimeliness;
    }

    /**
     * Sets the value of the transactionTimeliness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setTransactionTimeliness(Value value) {
        this.transactionTimeliness = value;
    }

    /**
     * Gets the value of the transactionAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmounts }
     *     
     */
    public TransactionAmounts getTransactionAmounts() {
        return transactionAmounts;
    }

    /**
     * Sets the value of the transactionAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmounts }
     *     
     */
    public void setTransactionAmounts(TransactionAmounts value) {
        this.transactionAmounts = value;
    }

    /**
     * Gets the value of the exerciseDate property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getExerciseDate() {
        return exerciseDate;
    }

    /**
     * Sets the value of the exerciseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setExerciseDate(Value value) {
        this.exerciseDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setExpirationDate(Value value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the underlyingSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingSecurity }
     *     
     */
    public UnderlyingSecurity getUnderlyingSecurity() {
        return underlyingSecurity;
    }

    /**
     * Sets the value of the underlyingSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingSecurity }
     *     
     */
    public void setUnderlyingSecurity(UnderlyingSecurity value) {
        this.underlyingSecurity = value;
    }

    /**
     * Gets the value of the postTransactionAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link PostTransactionAmounts }
     *     
     */
    public PostTransactionAmounts getPostTransactionAmounts() {
        return postTransactionAmounts;
    }

    /**
     * Sets the value of the postTransactionAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostTransactionAmounts }
     *     
     */
    public void setPostTransactionAmounts(PostTransactionAmounts value) {
        this.postTransactionAmounts = value;
    }

    /**
     * Gets the value of the ownershipNature property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipNature }
     *     
     */
    public OwnershipNature getOwnershipNature() {
        return ownershipNature;
    }

    /**
     * Sets the value of the ownershipNature property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipNature }
     *     
     */
    public void setOwnershipNature(OwnershipNature value) {
        this.ownershipNature = value;
    }

}

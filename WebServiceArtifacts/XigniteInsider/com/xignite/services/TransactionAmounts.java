
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionAmounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionAmounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionShares" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="transactionPricePerShare" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="transactionAcquiredDisposedCode" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionAmounts", propOrder = {
    "transactionShares",
    "transactionPricePerShare",
    "transactionAcquiredDisposedCode"
})
public class TransactionAmounts {

    protected Value transactionShares;
    protected Value transactionPricePerShare;
    protected Value transactionAcquiredDisposedCode;

    /**
     * Gets the value of the transactionShares property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getTransactionShares() {
        return transactionShares;
    }

    /**
     * Sets the value of the transactionShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setTransactionShares(Value value) {
        this.transactionShares = value;
    }

    /**
     * Gets the value of the transactionPricePerShare property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getTransactionPricePerShare() {
        return transactionPricePerShare;
    }

    /**
     * Sets the value of the transactionPricePerShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setTransactionPricePerShare(Value value) {
        this.transactionPricePerShare = value;
    }

    /**
     * Gets the value of the transactionAcquiredDisposedCode property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getTransactionAcquiredDisposedCode() {
        return transactionAcquiredDisposedCode;
    }

    /**
     * Sets the value of the transactionAcquiredDisposedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setTransactionAcquiredDisposedCode(Value value) {
        this.transactionAcquiredDisposedCode = value;
    }

}

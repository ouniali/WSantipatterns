
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for derivativeTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="derivativeTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="derivativeTransactions" type="{http://www.xignite.com/services/}ArrayOfDerivativeTransaction" minOccurs="0"/>
 *         &lt;element name="derivativeHoldings" type="{http://www.xignite.com/services/}ArrayOfDerivativeHolding" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "derivativeTable", propOrder = {
    "derivativeTransactions",
    "derivativeHoldings"
})
public class DerivativeTable {

    protected ArrayOfDerivativeTransaction derivativeTransactions;
    protected ArrayOfDerivativeHolding derivativeHoldings;

    /**
     * Gets the value of the derivativeTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDerivativeTransaction }
     *     
     */
    public ArrayOfDerivativeTransaction getDerivativeTransactions() {
        return derivativeTransactions;
    }

    /**
     * Sets the value of the derivativeTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDerivativeTransaction }
     *     
     */
    public void setDerivativeTransactions(ArrayOfDerivativeTransaction value) {
        this.derivativeTransactions = value;
    }

    /**
     * Gets the value of the derivativeHoldings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDerivativeHolding }
     *     
     */
    public ArrayOfDerivativeHolding getDerivativeHoldings() {
        return derivativeHoldings;
    }

    /**
     * Sets the value of the derivativeHoldings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDerivativeHolding }
     *     
     */
    public void setDerivativeHoldings(ArrayOfDerivativeHolding value) {
        this.derivativeHoldings = value;
    }

}


package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nonDerivativeTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nonDerivativeTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nonDerivativeTransactions" type="{http://www.xignite.com/services/}ArrayOfNonDerivativeTransaction" minOccurs="0"/>
 *         &lt;element name="nonDerivativeHoldings" type="{http://www.xignite.com/services/}ArrayOfNonDerivativeHolding" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nonDerivativeTable", propOrder = {
    "nonDerivativeTransactions",
    "nonDerivativeHoldings"
})
public class NonDerivativeTable {

    protected ArrayOfNonDerivativeTransaction nonDerivativeTransactions;
    protected ArrayOfNonDerivativeHolding nonDerivativeHoldings;

    /**
     * Gets the value of the nonDerivativeTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNonDerivativeTransaction }
     *     
     */
    public ArrayOfNonDerivativeTransaction getNonDerivativeTransactions() {
        return nonDerivativeTransactions;
    }

    /**
     * Sets the value of the nonDerivativeTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNonDerivativeTransaction }
     *     
     */
    public void setNonDerivativeTransactions(ArrayOfNonDerivativeTransaction value) {
        this.nonDerivativeTransactions = value;
    }

    /**
     * Gets the value of the nonDerivativeHoldings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNonDerivativeHolding }
     *     
     */
    public ArrayOfNonDerivativeHolding getNonDerivativeHoldings() {
        return nonDerivativeHoldings;
    }

    /**
     * Sets the value of the nonDerivativeHoldings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNonDerivativeHolding }
     *     
     */
    public void setNonDerivativeHoldings(ArrayOfNonDerivativeHolding value) {
        this.nonDerivativeHoldings = value;
    }

}

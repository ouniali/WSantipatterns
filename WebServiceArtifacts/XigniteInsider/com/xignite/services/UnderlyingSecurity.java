
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for underlyingSecurity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="underlyingSecurity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="underlyingSecurityTitle" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="underlyingSecurityShares" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "underlyingSecurity", propOrder = {
    "underlyingSecurityTitle",
    "underlyingSecurityShares"
})
public class UnderlyingSecurity {

    protected Value underlyingSecurityTitle;
    protected Value underlyingSecurityShares;

    /**
     * Gets the value of the underlyingSecurityTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getUnderlyingSecurityTitle() {
        return underlyingSecurityTitle;
    }

    /**
     * Sets the value of the underlyingSecurityTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setUnderlyingSecurityTitle(Value value) {
        this.underlyingSecurityTitle = value;
    }

    /**
     * Gets the value of the underlyingSecurityShares property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getUnderlyingSecurityShares() {
        return underlyingSecurityShares;
    }

    /**
     * Sets the value of the underlyingSecurityShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setUnderlyingSecurityShares(Value value) {
        this.underlyingSecurityShares = value;
    }

}

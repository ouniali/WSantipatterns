
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstType" type="{http://www.xignite.com/services/}SwaptionTypes"/>
 *         &lt;element name="SecondType" type="{http://www.xignite.com/services/}SwaptionTypes"/>
 *         &lt;element name="Currency" type="{http://www.xignite.com/services/}SwapCurrencyTypes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "firstType",
    "secondType",
    "currency"
})
@XmlRootElement(name = "GetSwaption")
public class GetSwaption {

    @XmlElement(name = "FirstType", required = true)
    @XmlSchemaType(name = "string")
    protected SwaptionTypes firstType;
    @XmlElement(name = "SecondType", required = true)
    @XmlSchemaType(name = "string")
    protected SwaptionTypes secondType;
    @XmlElement(name = "Currency", required = true)
    @XmlSchemaType(name = "string")
    protected SwapCurrencyTypes currency;

    /**
     * Gets the value of the firstType property.
     * 
     * @return
     *     possible object is
     *     {@link SwaptionTypes }
     *     
     */
    public SwaptionTypes getFirstType() {
        return firstType;
    }

    /**
     * Sets the value of the firstType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwaptionTypes }
     *     
     */
    public void setFirstType(SwaptionTypes value) {
        this.firstType = value;
    }

    /**
     * Gets the value of the secondType property.
     * 
     * @return
     *     possible object is
     *     {@link SwaptionTypes }
     *     
     */
    public SwaptionTypes getSecondType() {
        return secondType;
    }

    /**
     * Sets the value of the secondType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwaptionTypes }
     *     
     */
    public void setSecondType(SwaptionTypes value) {
        this.secondType = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link SwapCurrencyTypes }
     *     
     */
    public SwapCurrencyTypes getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwapCurrencyTypes }
     *     
     */
    public void setCurrency(SwapCurrencyTypes value) {
        this.currency = value;
    }

}

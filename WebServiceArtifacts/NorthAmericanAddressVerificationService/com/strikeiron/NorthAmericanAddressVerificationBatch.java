
package com.strikeiron;

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
 *         &lt;element name="Addresses" type="{http://www.strikeiron.com}ArrayOfNorthAmericanBatchAddress" minOccurs="0"/>
 *         &lt;element name="Casing" type="{http://www.strikeiron.com}CasingEnum" minOccurs="0"/>
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
    "addresses",
    "casing"
})
@XmlRootElement(name = "NorthAmericanAddressVerificationBatch")
public class NorthAmericanAddressVerificationBatch {

    @XmlElement(name = "Addresses")
    protected ArrayOfNorthAmericanBatchAddress addresses;
    @XmlElement(name = "Casing", defaultValue = "UPPER")
    @XmlSchemaType(name = "string")
    protected CasingEnum casing;

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNorthAmericanBatchAddress }
     *     
     */
    public ArrayOfNorthAmericanBatchAddress getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNorthAmericanBatchAddress }
     *     
     */
    public void setAddresses(ArrayOfNorthAmericanBatchAddress value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the casing property.
     * 
     * @return
     *     possible object is
     *     {@link CasingEnum }
     *     
     */
    public CasingEnum getCasing() {
        return casing;
    }

    /**
     * Sets the value of the casing property.
     * 
     * @param value
     *     allowed object is
     *     {@link CasingEnum }
     *     
     */
    public void setCasing(CasingEnum value) {
        this.casing = value;
    }

}

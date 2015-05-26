
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NorthAmericanAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NorthAmericanAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="USAddress" type="{http://www.strikeiron.com}USAddress" minOccurs="0"/>
 *         &lt;element name="CanadaAddress" type="{http://www.strikeiron.com}CanadaAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NorthAmericanAddress", propOrder = {
    "usAddress",
    "canadaAddress"
})
public class NorthAmericanAddress {

    @XmlElement(name = "USAddress")
    protected USAddress usAddress;
    @XmlElement(name = "CanadaAddress")
    protected CanadaAddress canadaAddress;

    /**
     * Gets the value of the usAddress property.
     * 
     * @return
     *     possible object is
     *     {@link USAddress }
     *     
     */
    public USAddress getUSAddress() {
        return usAddress;
    }

    /**
     * Sets the value of the usAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link USAddress }
     *     
     */
    public void setUSAddress(USAddress value) {
        this.usAddress = value;
    }

    /**
     * Gets the value of the canadaAddress property.
     * 
     * @return
     *     possible object is
     *     {@link CanadaAddress }
     *     
     */
    public CanadaAddress getCanadaAddress() {
        return canadaAddress;
    }

    /**
     * Sets the value of the canadaAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanadaAddress }
     *     
     */
    public void setCanadaAddress(CanadaAddress value) {
        this.canadaAddress = value;
    }

}

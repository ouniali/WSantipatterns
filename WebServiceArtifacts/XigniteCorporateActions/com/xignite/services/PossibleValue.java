
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PossibleValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PossibleValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProviderValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XigniteValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PossibleValue", propOrder = {
    "providerValue",
    "xigniteValue",
    "description"
})
public class PossibleValue {

    @XmlElement(name = "ProviderValue")
    protected String providerValue;
    @XmlElement(name = "XigniteValue")
    protected String xigniteValue;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the providerValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderValue() {
        return providerValue;
    }

    /**
     * Sets the value of the providerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderValue(String value) {
        this.providerValue = value;
    }

    /**
     * Gets the value of the xigniteValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXigniteValue() {
        return xigniteValue;
    }

    /**
     * Sets the value of the xigniteValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXigniteValue(String value) {
        this.xigniteValue = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}

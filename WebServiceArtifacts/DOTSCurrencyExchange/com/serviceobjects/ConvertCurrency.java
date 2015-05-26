
package com.serviceobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvertFromCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvertToCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "amount",
    "convertFromCurrency",
    "convertToCurrency",
    "licenseKey"
})
@XmlRootElement(name = "ConvertCurrency")
public class ConvertCurrency {

    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "ConvertFromCurrency")
    protected String convertFromCurrency;
    @XmlElement(name = "ConvertToCurrency")
    protected String convertToCurrency;
    @XmlElement(name = "LicenseKey")
    protected String licenseKey;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the convertFromCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertFromCurrency() {
        return convertFromCurrency;
    }

    /**
     * Sets the value of the convertFromCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertFromCurrency(String value) {
        this.convertFromCurrency = value;
    }

    /**
     * Gets the value of the convertToCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertToCurrency() {
        return convertToCurrency;
    }

    /**
     * Sets the value of the convertToCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertToCurrency(String value) {
        this.convertToCurrency = value;
    }

    /**
     * Gets the value of the licenseKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseKey() {
        return licenseKey;
    }

    /**
     * Sets the value of the licenseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseKey(String value) {
        this.licenseKey = value;
    }

}

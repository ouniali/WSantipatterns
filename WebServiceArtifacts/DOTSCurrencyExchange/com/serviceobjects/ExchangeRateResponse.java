
package com.serviceobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConvertFromCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvertToCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateResponse", propOrder = {
    "convertFromCurrency",
    "convertToCurrency",
    "exchangeRate",
    "error"
})
public class ExchangeRateResponse {

    @XmlElement(name = "ConvertFromCurrency")
    protected String convertFromCurrency;
    @XmlElement(name = "ConvertToCurrency")
    protected String convertToCurrency;
    @XmlElement(name = "ExchangeRate")
    protected double exchangeRate;
    @XmlElement(name = "Error")
    protected String error;

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
     * Gets the value of the exchangeRate property.
     * 
     */
    public double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     */
    public void setExchangeRate(double value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

}

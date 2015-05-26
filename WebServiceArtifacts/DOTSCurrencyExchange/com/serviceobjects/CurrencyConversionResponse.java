
package com.serviceobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyConversionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyConversionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConvertFromCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvertToCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConvertedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "CurrencyConversionResponse", propOrder = {
    "convertFromCurrency",
    "convertToCurrency",
    "amount",
    "convertedAmount",
    "error"
})
public class CurrencyConversionResponse {

    @XmlElement(name = "ConvertFromCurrency")
    protected String convertFromCurrency;
    @XmlElement(name = "ConvertToCurrency")
    protected String convertToCurrency;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "ConvertedAmount")
    protected double convertedAmount;
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
     * Gets the value of the convertedAmount property.
     * 
     */
    public double getConvertedAmount() {
        return convertedAmount;
    }

    /**
     * Sets the value of the convertedAmount property.
     * 
     */
    public void setConvertedAmount(double value) {
        this.convertedAmount = value;
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

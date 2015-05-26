
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossRateTableLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossRateTableLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="From" type="{http://www.xignite.com/services/}Currency" minOccurs="0"/>
 *         &lt;element name="ExchangeRates" type="{http://www.xignite.com/services/}ArrayOfExchangeRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossRateTableLine", propOrder = {
    "from",
    "exchangeRates"
})
public class CrossRateTableLine
    extends Common
{

    @XmlElement(name = "From")
    protected Currency from;
    @XmlElement(name = "ExchangeRates")
    protected ArrayOfExchangeRate exchangeRates;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setFrom(Currency value) {
        this.from = value;
    }

    /**
     * Gets the value of the exchangeRates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExchangeRate }
     *     
     */
    public ArrayOfExchangeRate getExchangeRates() {
        return exchangeRates;
    }

    /**
     * Sets the value of the exchangeRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExchangeRate }
     *     
     */
    public void setExchangeRates(ArrayOfExchangeRate value) {
        this.exchangeRates = value;
    }

}

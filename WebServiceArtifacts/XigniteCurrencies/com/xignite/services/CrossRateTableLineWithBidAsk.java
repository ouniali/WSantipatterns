
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossRateTableLineWithBidAsk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossRateTableLineWithBidAsk">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="From" type="{http://www.xignite.com/services/}Currency" minOccurs="0"/>
 *         &lt;element name="ExchangeRates" type="{http://www.xignite.com/services/}ArrayOfCrossRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossRateTableLineWithBidAsk", propOrder = {
    "from",
    "exchangeRates"
})
public class CrossRateTableLineWithBidAsk
    extends Common
{

    @XmlElement(name = "From")
    protected Currency from;
    @XmlElement(name = "ExchangeRates")
    protected ArrayOfCrossRate exchangeRates;

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
     *     {@link ArrayOfCrossRate }
     *     
     */
    public ArrayOfCrossRate getExchangeRates() {
        return exchangeRates;
    }

    /**
     * Sets the value of the exchangeRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrossRate }
     *     
     */
    public void setExchangeRates(ArrayOfCrossRate value) {
        this.exchangeRates = value;
    }

}

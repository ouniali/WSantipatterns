
package com.xignite.services;

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
 *         &lt;element name="GetCurrencyIntradayChartCustomResult" type="{http://www.xignite.com/services/}CurrencyChartIntraday" minOccurs="0"/>
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
    "getCurrencyIntradayChartCustomResult"
})
@XmlRootElement(name = "GetCurrencyIntradayChartCustomResponse")
public class GetCurrencyIntradayChartCustomResponse {

    @XmlElement(name = "GetCurrencyIntradayChartCustomResult")
    protected CurrencyChartIntraday getCurrencyIntradayChartCustomResult;

    /**
     * Gets the value of the getCurrencyIntradayChartCustomResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyChartIntraday }
     *     
     */
    public CurrencyChartIntraday getGetCurrencyIntradayChartCustomResult() {
        return getCurrencyIntradayChartCustomResult;
    }

    /**
     * Sets the value of the getCurrencyIntradayChartCustomResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyChartIntraday }
     *     
     */
    public void setGetCurrencyIntradayChartCustomResult(CurrencyChartIntraday value) {
        this.getCurrencyIntradayChartCustomResult = value;
    }

}

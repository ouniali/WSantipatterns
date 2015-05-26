
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
 *         &lt;element name="GetCurrencyChartResult" type="{http://www.xignite.com/services/}HistoricalChart" minOccurs="0"/>
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
    "getCurrencyChartResult"
})
@XmlRootElement(name = "GetCurrencyChartResponse")
public class GetCurrencyChartResponse {

    @XmlElement(name = "GetCurrencyChartResult")
    protected HistoricalChart getCurrencyChartResult;

    /**
     * Gets the value of the getCurrencyChartResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalChart }
     *     
     */
    public HistoricalChart getGetCurrencyChartResult() {
        return getCurrencyChartResult;
    }

    /**
     * Sets the value of the getCurrencyChartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalChart }
     *     
     */
    public void setGetCurrencyChartResult(HistoricalChart value) {
        this.getCurrencyChartResult = value;
    }

}

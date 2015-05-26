
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
 *         &lt;element name="GetChartBarsResult" type="{http://www.xignite.com/services/}CurrencyChartBars" minOccurs="0"/>
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
    "getChartBarsResult"
})
@XmlRootElement(name = "GetChartBarsResponse")
public class GetChartBarsResponse {

    @XmlElement(name = "GetChartBarsResult")
    protected CurrencyChartBars getChartBarsResult;

    /**
     * Gets the value of the getChartBarsResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyChartBars }
     *     
     */
    public CurrencyChartBars getGetChartBarsResult() {
        return getChartBarsResult;
    }

    /**
     * Sets the value of the getChartBarsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyChartBars }
     *     
     */
    public void setGetChartBarsResult(CurrencyChartBars value) {
        this.getChartBarsResult = value;
    }

}

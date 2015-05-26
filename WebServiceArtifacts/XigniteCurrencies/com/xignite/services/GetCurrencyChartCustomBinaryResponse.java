
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
 *         &lt;element name="GetCurrencyChartCustomBinaryResult" type="{http://www.xignite.com/services/}ChartBinary" minOccurs="0"/>
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
    "getCurrencyChartCustomBinaryResult"
})
@XmlRootElement(name = "GetCurrencyChartCustomBinaryResponse")
public class GetCurrencyChartCustomBinaryResponse {

    @XmlElement(name = "GetCurrencyChartCustomBinaryResult")
    protected ChartBinary getCurrencyChartCustomBinaryResult;

    /**
     * Gets the value of the getCurrencyChartCustomBinaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChartBinary }
     *     
     */
    public ChartBinary getGetCurrencyChartCustomBinaryResult() {
        return getCurrencyChartCustomBinaryResult;
    }

    /**
     * Sets the value of the getCurrencyChartCustomBinaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartBinary }
     *     
     */
    public void setGetCurrencyChartCustomBinaryResult(ChartBinary value) {
        this.getCurrencyChartCustomBinaryResult = value;
    }

}

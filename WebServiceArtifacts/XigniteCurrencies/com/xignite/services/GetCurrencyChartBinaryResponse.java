
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
 *         &lt;element name="GetCurrencyChartBinaryResult" type="{http://www.xignite.com/services/}ChartBinary" minOccurs="0"/>
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
    "getCurrencyChartBinaryResult"
})
@XmlRootElement(name = "GetCurrencyChartBinaryResponse")
public class GetCurrencyChartBinaryResponse {

    @XmlElement(name = "GetCurrencyChartBinaryResult")
    protected ChartBinary getCurrencyChartBinaryResult;

    /**
     * Gets the value of the getCurrencyChartBinaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChartBinary }
     *     
     */
    public ChartBinary getGetCurrencyChartBinaryResult() {
        return getCurrencyChartBinaryResult;
    }

    /**
     * Sets the value of the getCurrencyChartBinaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartBinary }
     *     
     */
    public void setGetCurrencyChartBinaryResult(ChartBinary value) {
        this.getCurrencyChartBinaryResult = value;
    }

}

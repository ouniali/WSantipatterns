
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
 *         &lt;element name="GetIntradayEnergyFutureChartBinaryResult" type="{http://www.xignite.com/services/}ChartBinary" minOccurs="0"/>
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
    "getIntradayEnergyFutureChartBinaryResult"
})
@XmlRootElement(name = "GetIntradayEnergyFutureChartBinaryResponse")
public class GetIntradayEnergyFutureChartBinaryResponse {

    @XmlElement(name = "GetIntradayEnergyFutureChartBinaryResult")
    protected ChartBinary getIntradayEnergyFutureChartBinaryResult;

    /**
     * Gets the value of the getIntradayEnergyFutureChartBinaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChartBinary }
     *     
     */
    public ChartBinary getGetIntradayEnergyFutureChartBinaryResult() {
        return getIntradayEnergyFutureChartBinaryResult;
    }

    /**
     * Sets the value of the getIntradayEnergyFutureChartBinaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartBinary }
     *     
     */
    public void setGetIntradayEnergyFutureChartBinaryResult(ChartBinary value) {
        this.getIntradayEnergyFutureChartBinaryResult = value;
    }

}

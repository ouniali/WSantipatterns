
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
 *         &lt;element name="GetHistoricalEnergyFutureChartCustomBinaryResult" type="{http://www.xignite.com/services/}ChartBinary" minOccurs="0"/>
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
    "getHistoricalEnergyFutureChartCustomBinaryResult"
})
@XmlRootElement(name = "GetHistoricalEnergyFutureChartCustomBinaryResponse")
public class GetHistoricalEnergyFutureChartCustomBinaryResponse {

    @XmlElement(name = "GetHistoricalEnergyFutureChartCustomBinaryResult")
    protected ChartBinary getHistoricalEnergyFutureChartCustomBinaryResult;

    /**
     * Gets the value of the getHistoricalEnergyFutureChartCustomBinaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChartBinary }
     *     
     */
    public ChartBinary getGetHistoricalEnergyFutureChartCustomBinaryResult() {
        return getHistoricalEnergyFutureChartCustomBinaryResult;
    }

    /**
     * Sets the value of the getHistoricalEnergyFutureChartCustomBinaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartBinary }
     *     
     */
    public void setGetHistoricalEnergyFutureChartCustomBinaryResult(ChartBinary value) {
        this.getHistoricalEnergyFutureChartCustomBinaryResult = value;
    }

}

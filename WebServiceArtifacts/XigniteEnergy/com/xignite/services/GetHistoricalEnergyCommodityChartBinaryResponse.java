
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
 *         &lt;element name="GetHistoricalEnergyCommodityChartBinaryResult" type="{http://www.xignite.com/services/}ChartBinary" minOccurs="0"/>
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
    "getHistoricalEnergyCommodityChartBinaryResult"
})
@XmlRootElement(name = "GetHistoricalEnergyCommodityChartBinaryResponse")
public class GetHistoricalEnergyCommodityChartBinaryResponse {

    @XmlElement(name = "GetHistoricalEnergyCommodityChartBinaryResult")
    protected ChartBinary getHistoricalEnergyCommodityChartBinaryResult;

    /**
     * Gets the value of the getHistoricalEnergyCommodityChartBinaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChartBinary }
     *     
     */
    public ChartBinary getGetHistoricalEnergyCommodityChartBinaryResult() {
        return getHistoricalEnergyCommodityChartBinaryResult;
    }

    /**
     * Sets the value of the getHistoricalEnergyCommodityChartBinaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartBinary }
     *     
     */
    public void setGetHistoricalEnergyCommodityChartBinaryResult(ChartBinary value) {
        this.getHistoricalEnergyCommodityChartBinaryResult = value;
    }

}

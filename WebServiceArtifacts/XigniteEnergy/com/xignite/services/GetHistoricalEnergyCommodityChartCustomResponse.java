
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
 *         &lt;element name="GetHistoricalEnergyCommodityChartCustomResult" type="{http://www.xignite.com/services/}HistoricalChart" minOccurs="0"/>
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
    "getHistoricalEnergyCommodityChartCustomResult"
})
@XmlRootElement(name = "GetHistoricalEnergyCommodityChartCustomResponse")
public class GetHistoricalEnergyCommodityChartCustomResponse {

    @XmlElement(name = "GetHistoricalEnergyCommodityChartCustomResult")
    protected HistoricalChart getHistoricalEnergyCommodityChartCustomResult;

    /**
     * Gets the value of the getHistoricalEnergyCommodityChartCustomResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalChart }
     *     
     */
    public HistoricalChart getGetHistoricalEnergyCommodityChartCustomResult() {
        return getHistoricalEnergyCommodityChartCustomResult;
    }

    /**
     * Sets the value of the getHistoricalEnergyCommodityChartCustomResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalChart }
     *     
     */
    public void setGetHistoricalEnergyCommodityChartCustomResult(HistoricalChart value) {
        this.getHistoricalEnergyCommodityChartCustomResult = value;
    }

}

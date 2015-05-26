
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
 *         &lt;element name="GetHistoricalEnergyCommodityChartResult" type="{http://www.xignite.com/services/}HistoricalChart" minOccurs="0"/>
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
    "getHistoricalEnergyCommodityChartResult"
})
@XmlRootElement(name = "GetHistoricalEnergyCommodityChartResponse")
public class GetHistoricalEnergyCommodityChartResponse {

    @XmlElement(name = "GetHistoricalEnergyCommodityChartResult")
    protected HistoricalChart getHistoricalEnergyCommodityChartResult;

    /**
     * Gets the value of the getHistoricalEnergyCommodityChartResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalChart }
     *     
     */
    public HistoricalChart getGetHistoricalEnergyCommodityChartResult() {
        return getHistoricalEnergyCommodityChartResult;
    }

    /**
     * Sets the value of the getHistoricalEnergyCommodityChartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalChart }
     *     
     */
    public void setGetHistoricalEnergyCommodityChartResult(HistoricalChart value) {
        this.getHistoricalEnergyCommodityChartResult = value;
    }

}


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
 *         &lt;element name="GetHistoricalEnergyFutureChartResult" type="{http://www.xignite.com/services/}HistoricalChart" minOccurs="0"/>
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
    "getHistoricalEnergyFutureChartResult"
})
@XmlRootElement(name = "GetHistoricalEnergyFutureChartResponse")
public class GetHistoricalEnergyFutureChartResponse {

    @XmlElement(name = "GetHistoricalEnergyFutureChartResult")
    protected HistoricalChart getHistoricalEnergyFutureChartResult;

    /**
     * Gets the value of the getHistoricalEnergyFutureChartResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalChart }
     *     
     */
    public HistoricalChart getGetHistoricalEnergyFutureChartResult() {
        return getHistoricalEnergyFutureChartResult;
    }

    /**
     * Sets the value of the getHistoricalEnergyFutureChartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalChart }
     *     
     */
    public void setGetHistoricalEnergyFutureChartResult(HistoricalChart value) {
        this.getHistoricalEnergyFutureChartResult = value;
    }

}

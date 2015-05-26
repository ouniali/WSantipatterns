
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
 *         &lt;element name="GetHistoricalStatisticsResult" type="{http://www.xignite.com/services/}HistoricalStatistics" minOccurs="0"/>
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
    "getHistoricalStatisticsResult"
})
@XmlRootElement(name = "GetHistoricalStatisticsResponse")
public class GetHistoricalStatisticsResponse {

    @XmlElement(name = "GetHistoricalStatisticsResult")
    protected HistoricalStatistics getHistoricalStatisticsResult;

    /**
     * Gets the value of the getHistoricalStatisticsResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalStatistics }
     *     
     */
    public HistoricalStatistics getGetHistoricalStatisticsResult() {
        return getHistoricalStatisticsResult;
    }

    /**
     * Sets the value of the getHistoricalStatisticsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalStatistics }
     *     
     */
    public void setGetHistoricalStatisticsResult(HistoricalStatistics value) {
        this.getHistoricalStatisticsResult = value;
    }

}

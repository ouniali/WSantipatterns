
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
 *         &lt;element name="GetHistoricalChartDesignResult" type="{http://www.xignite.com/services/}ChartDesign" minOccurs="0"/>
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
    "getHistoricalChartDesignResult"
})
@XmlRootElement(name = "GetHistoricalChartDesignResponse")
public class GetHistoricalChartDesignResponse {

    @XmlElement(name = "GetHistoricalChartDesignResult")
    protected ChartDesign getHistoricalChartDesignResult;

    /**
     * Gets the value of the getHistoricalChartDesignResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChartDesign }
     *     
     */
    public ChartDesign getGetHistoricalChartDesignResult() {
        return getHistoricalChartDesignResult;
    }

    /**
     * Sets the value of the getHistoricalChartDesignResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartDesign }
     *     
     */
    public void setGetHistoricalChartDesignResult(ChartDesign value) {
        this.getHistoricalChartDesignResult = value;
    }

}

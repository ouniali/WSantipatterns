
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
 *         &lt;element name="GetDelayedChartAsOfDateCustomResult" type="{http://www.xignite.com/services/}IntradayChart" minOccurs="0"/>
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
    "getDelayedChartAsOfDateCustomResult"
})
@XmlRootElement(name = "GetDelayedChartAsOfDateCustomResponse")
public class GetDelayedChartAsOfDateCustomResponse {

    @XmlElement(name = "GetDelayedChartAsOfDateCustomResult")
    protected IntradayChart getDelayedChartAsOfDateCustomResult;

    /**
     * Gets the value of the getDelayedChartAsOfDateCustomResult property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayChart }
     *     
     */
    public IntradayChart getGetDelayedChartAsOfDateCustomResult() {
        return getDelayedChartAsOfDateCustomResult;
    }

    /**
     * Sets the value of the getDelayedChartAsOfDateCustomResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayChart }
     *     
     */
    public void setGetDelayedChartAsOfDateCustomResult(IntradayChart value) {
        this.getDelayedChartAsOfDateCustomResult = value;
    }

}

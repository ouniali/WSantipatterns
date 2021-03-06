
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
 *         &lt;element name="GetDelayedBinaryChartResult" type="{http://www.xignite.com/services/}IntradayChart" minOccurs="0"/>
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
    "getDelayedBinaryChartResult"
})
@XmlRootElement(name = "GetDelayedBinaryChartResponse")
public class GetDelayedBinaryChartResponse {

    @XmlElement(name = "GetDelayedBinaryChartResult")
    protected IntradayChart getDelayedBinaryChartResult;

    /**
     * Gets the value of the getDelayedBinaryChartResult property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayChart }
     *     
     */
    public IntradayChart getGetDelayedBinaryChartResult() {
        return getDelayedBinaryChartResult;
    }

    /**
     * Sets the value of the getDelayedBinaryChartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayChart }
     *     
     */
    public void setGetDelayedBinaryChartResult(IntradayChart value) {
        this.getDelayedBinaryChartResult = value;
    }

}

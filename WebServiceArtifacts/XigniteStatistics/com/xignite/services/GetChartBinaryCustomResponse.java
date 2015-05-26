
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
 *         &lt;element name="GetChartBinaryCustomResult" type="{http://www.xignite.com/services/}ChartBinary" minOccurs="0"/>
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
    "getChartBinaryCustomResult"
})
@XmlRootElement(name = "GetChartBinaryCustomResponse")
public class GetChartBinaryCustomResponse {

    @XmlElement(name = "GetChartBinaryCustomResult")
    protected ChartBinary getChartBinaryCustomResult;

    /**
     * Gets the value of the getChartBinaryCustomResult property.
     * 
     * @return
     *     possible object is
     *     {@link ChartBinary }
     *     
     */
    public ChartBinary getGetChartBinaryCustomResult() {
        return getChartBinaryCustomResult;
    }

    /**
     * Sets the value of the getChartBinaryCustomResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChartBinary }
     *     
     */
    public void setGetChartBinaryCustomResult(ChartBinary value) {
        this.getChartBinaryCustomResult = value;
    }

}

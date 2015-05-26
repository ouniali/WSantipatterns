
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
 *         &lt;element name="GetMarketChartResult" type="{http://www.xignite.com/services/}HTMLResult" minOccurs="0"/>
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
    "getMarketChartResult"
})
@XmlRootElement(name = "GetMarketChartResponse")
public class GetMarketChartResponse {

    @XmlElement(name = "GetMarketChartResult")
    protected HTMLResult getMarketChartResult;

    /**
     * Gets the value of the getMarketChartResult property.
     * 
     * @return
     *     possible object is
     *     {@link HTMLResult }
     *     
     */
    public HTMLResult getGetMarketChartResult() {
        return getMarketChartResult;
    }

    /**
     * Sets the value of the getMarketChartResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HTMLResult }
     *     
     */
    public void setGetMarketChartResult(HTMLResult value) {
        this.getMarketChartResult = value;
    }

}

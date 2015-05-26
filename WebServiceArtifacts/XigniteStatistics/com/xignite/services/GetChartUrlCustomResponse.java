
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
 *         &lt;element name="GetChartUrlCustomResult" type="{http://www.xignite.com/services/}Chart" minOccurs="0"/>
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
    "getChartUrlCustomResult"
})
@XmlRootElement(name = "GetChartUrlCustomResponse")
public class GetChartUrlCustomResponse {

    @XmlElement(name = "GetChartUrlCustomResult")
    protected Chart getChartUrlCustomResult;

    /**
     * Gets the value of the getChartUrlCustomResult property.
     * 
     * @return
     *     possible object is
     *     {@link Chart }
     *     
     */
    public Chart getGetChartUrlCustomResult() {
        return getChartUrlCustomResult;
    }

    /**
     * Sets the value of the getChartUrlCustomResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chart }
     *     
     */
    public void setGetChartUrlCustomResult(Chart value) {
        this.getChartUrlCustomResult = value;
    }

}

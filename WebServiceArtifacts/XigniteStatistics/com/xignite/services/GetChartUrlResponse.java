
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
 *         &lt;element name="GetChartUrlResult" type="{http://www.xignite.com/services/}Chart" minOccurs="0"/>
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
    "getChartUrlResult"
})
@XmlRootElement(name = "GetChartUrlResponse")
public class GetChartUrlResponse {

    @XmlElement(name = "GetChartUrlResult")
    protected Chart getChartUrlResult;

    /**
     * Gets the value of the getChartUrlResult property.
     * 
     * @return
     *     possible object is
     *     {@link Chart }
     *     
     */
    public Chart getGetChartUrlResult() {
        return getChartUrlResult;
    }

    /**
     * Sets the value of the getChartUrlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chart }
     *     
     */
    public void setGetChartUrlResult(Chart value) {
        this.getChartUrlResult = value;
    }

}

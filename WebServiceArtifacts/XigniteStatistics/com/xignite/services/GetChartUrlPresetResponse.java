
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
 *         &lt;element name="GetChartUrlPresetResult" type="{http://www.xignite.com/services/}Chart" minOccurs="0"/>
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
    "getChartUrlPresetResult"
})
@XmlRootElement(name = "GetChartUrlPresetResponse")
public class GetChartUrlPresetResponse {

    @XmlElement(name = "GetChartUrlPresetResult")
    protected Chart getChartUrlPresetResult;

    /**
     * Gets the value of the getChartUrlPresetResult property.
     * 
     * @return
     *     possible object is
     *     {@link Chart }
     *     
     */
    public Chart getGetChartUrlPresetResult() {
        return getChartUrlPresetResult;
    }

    /**
     * Sets the value of the getChartUrlPresetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chart }
     *     
     */
    public void setGetChartUrlPresetResult(Chart value) {
        this.getChartUrlPresetResult = value;
    }

}

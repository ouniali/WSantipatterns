
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
 *         &lt;element name="ConvertHistoricalValueResult" type="{http://www.xignite.com/services/}RateConversion" minOccurs="0"/>
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
    "convertHistoricalValueResult"
})
@XmlRootElement(name = "ConvertHistoricalValueResponse")
public class ConvertHistoricalValueResponse {

    @XmlElement(name = "ConvertHistoricalValueResult")
    protected RateConversion convertHistoricalValueResult;

    /**
     * Gets the value of the convertHistoricalValueResult property.
     * 
     * @return
     *     possible object is
     *     {@link RateConversion }
     *     
     */
    public RateConversion getConvertHistoricalValueResult() {
        return convertHistoricalValueResult;
    }

    /**
     * Sets the value of the convertHistoricalValueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateConversion }
     *     
     */
    public void setConvertHistoricalValueResult(RateConversion value) {
        this.convertHistoricalValueResult = value;
    }

}

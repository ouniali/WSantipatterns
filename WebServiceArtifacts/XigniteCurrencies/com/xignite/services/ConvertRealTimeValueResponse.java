
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
 *         &lt;element name="ConvertRealTimeValueResult" type="{http://www.xignite.com/services/}ExchangeConversion" minOccurs="0"/>
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
    "convertRealTimeValueResult"
})
@XmlRootElement(name = "ConvertRealTimeValueResponse")
public class ConvertRealTimeValueResponse {

    @XmlElement(name = "ConvertRealTimeValueResult")
    protected ExchangeConversion convertRealTimeValueResult;

    /**
     * Gets the value of the convertRealTimeValueResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeConversion }
     *     
     */
    public ExchangeConversion getConvertRealTimeValueResult() {
        return convertRealTimeValueResult;
    }

    /**
     * Sets the value of the convertRealTimeValueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeConversion }
     *     
     */
    public void setConvertRealTimeValueResult(ExchangeConversion value) {
        this.convertRealTimeValueResult = value;
    }

}

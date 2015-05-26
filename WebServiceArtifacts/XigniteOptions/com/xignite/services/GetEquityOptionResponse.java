
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
 *         &lt;element name="GetEquityOptionResult" type="{http://www.xignite.com/services/}Option" minOccurs="0"/>
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
    "getEquityOptionResult"
})
@XmlRootElement(name = "GetEquityOptionResponse")
public class GetEquityOptionResponse {

    @XmlElement(name = "GetEquityOptionResult")
    protected Option getEquityOptionResult;

    /**
     * Gets the value of the getEquityOptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Option }
     *     
     */
    public Option getGetEquityOptionResult() {
        return getEquityOptionResult;
    }

    /**
     * Sets the value of the getEquityOptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Option }
     *     
     */
    public void setGetEquityOptionResult(Option value) {
        this.getEquityOptionResult = value;
    }

}

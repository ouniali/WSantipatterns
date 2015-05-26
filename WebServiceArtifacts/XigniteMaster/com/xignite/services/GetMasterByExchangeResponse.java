
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
 *         &lt;element name="GetMasterByExchangeResult" type="{http://www.xignite.com/services/}Master" minOccurs="0"/>
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
    "getMasterByExchangeResult"
})
@XmlRootElement(name = "GetMasterByExchangeResponse")
public class GetMasterByExchangeResponse {

    @XmlElement(name = "GetMasterByExchangeResult")
    protected Master getMasterByExchangeResult;

    /**
     * Gets the value of the getMasterByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link Master }
     *     
     */
    public Master getGetMasterByExchangeResult() {
        return getMasterByExchangeResult;
    }

    /**
     * Sets the value of the getMasterByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Master }
     *     
     */
    public void setGetMasterByExchangeResult(Master value) {
        this.getMasterByExchangeResult = value;
    }

}

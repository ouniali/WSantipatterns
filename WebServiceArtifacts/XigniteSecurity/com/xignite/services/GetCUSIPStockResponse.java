
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
 *         &lt;element name="GetCUSIPStockResult" type="{http://www.xignite.com/services/}Cusip" minOccurs="0"/>
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
    "getCUSIPStockResult"
})
@XmlRootElement(name = "GetCUSIPStockResponse")
public class GetCUSIPStockResponse {

    @XmlElement(name = "GetCUSIPStockResult")
    protected Cusip getCUSIPStockResult;

    /**
     * Gets the value of the getCUSIPStockResult property.
     * 
     * @return
     *     possible object is
     *     {@link Cusip }
     *     
     */
    public Cusip getGetCUSIPStockResult() {
        return getCUSIPStockResult;
    }

    /**
     * Sets the value of the getCUSIPStockResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cusip }
     *     
     */
    public void setGetCUSIPStockResult(Cusip value) {
        this.getCUSIPStockResult = value;
    }

}

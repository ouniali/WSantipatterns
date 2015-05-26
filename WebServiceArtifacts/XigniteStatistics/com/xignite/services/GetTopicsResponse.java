
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
 *         &lt;element name="GetTopicsResult" type="{http://www.xignite.com/services/}Category" minOccurs="0"/>
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
    "getTopicsResult"
})
@XmlRootElement(name = "GetTopicsResponse")
public class GetTopicsResponse {

    @XmlElement(name = "GetTopicsResult")
    protected Category getTopicsResult;

    /**
     * Gets the value of the getTopicsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getGetTopicsResult() {
        return getTopicsResult;
    }

    /**
     * Sets the value of the getTopicsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setGetTopicsResult(Category value) {
        this.getTopicsResult = value;
    }

}

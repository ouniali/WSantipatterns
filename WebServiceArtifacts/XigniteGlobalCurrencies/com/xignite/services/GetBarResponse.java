
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
 *         &lt;element name="GetBarResult" type="{http://www.xignite.com/services/}Bar" minOccurs="0"/>
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
    "getBarResult"
})
@XmlRootElement(name = "GetBarResponse")
public class GetBarResponse {

    @XmlElement(name = "GetBarResult")
    protected Bar getBarResult;

    /**
     * Gets the value of the getBarResult property.
     * 
     * @return
     *     possible object is
     *     {@link Bar }
     *     
     */
    public Bar getGetBarResult() {
        return getBarResult;
    }

    /**
     * Sets the value of the getBarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bar }
     *     
     */
    public void setGetBarResult(Bar value) {
        this.getBarResult = value;
    }

}

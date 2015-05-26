
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
 *         &lt;element name="GetCIKResult" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
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
    "getCIKResult"
})
@XmlRootElement(name = "GetCIKResponse")
public class GetCIKResponse {

    @XmlElement(name = "GetCIKResult")
    protected Security getCIKResult;

    /**
     * Gets the value of the getCIKResult property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getGetCIKResult() {
        return getCIKResult;
    }

    /**
     * Sets the value of the getCIKResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setGetCIKResult(Security value) {
        this.getCIKResult = value;
    }

}

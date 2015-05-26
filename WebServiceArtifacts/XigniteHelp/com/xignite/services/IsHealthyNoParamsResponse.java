
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
 *         &lt;element name="IsHealthyNoParamsResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isHealthyNoParamsResult"
})
@XmlRootElement(name = "IsHealthyNoParamsResponse")
public class IsHealthyNoParamsResponse {

    @XmlElement(name = "IsHealthyNoParamsResult")
    protected boolean isHealthyNoParamsResult;

    /**
     * Gets the value of the isHealthyNoParamsResult property.
     * 
     */
    public boolean isIsHealthyNoParamsResult() {
        return isHealthyNoParamsResult;
    }

    /**
     * Sets the value of the isHealthyNoParamsResult property.
     * 
     */
    public void setIsHealthyNoParamsResult(boolean value) {
        this.isHealthyNoParamsResult = value;
    }

}

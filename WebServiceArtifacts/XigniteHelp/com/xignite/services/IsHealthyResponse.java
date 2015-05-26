
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
 *         &lt;element name="IsHealthyResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isHealthyResult"
})
@XmlRootElement(name = "IsHealthyResponse")
public class IsHealthyResponse {

    @XmlElement(name = "IsHealthyResult")
    protected boolean isHealthyResult;

    /**
     * Gets the value of the isHealthyResult property.
     * 
     */
    public boolean isIsHealthyResult() {
        return isHealthyResult;
    }

    /**
     * Sets the value of the isHealthyResult property.
     * 
     */
    public void setIsHealthyResult(boolean value) {
        this.isHealthyResult = value;
    }

}


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
 *         &lt;element name="GetMasterByIndustryResult" type="{http://www.xignite.com/services/}Master" minOccurs="0"/>
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
    "getMasterByIndustryResult"
})
@XmlRootElement(name = "GetMasterByIndustryResponse")
public class GetMasterByIndustryResponse {

    @XmlElement(name = "GetMasterByIndustryResult")
    protected Master getMasterByIndustryResult;

    /**
     * Gets the value of the getMasterByIndustryResult property.
     * 
     * @return
     *     possible object is
     *     {@link Master }
     *     
     */
    public Master getGetMasterByIndustryResult() {
        return getMasterByIndustryResult;
    }

    /**
     * Sets the value of the getMasterByIndustryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Master }
     *     
     */
    public void setGetMasterByIndustryResult(Master value) {
        this.getMasterByIndustryResult = value;
    }

}

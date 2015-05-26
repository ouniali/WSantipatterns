
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
 *         &lt;element name="GetSwapRateFamilyResult" type="{http://www.xignite.com/services/}ArrayOfSwapRate" minOccurs="0"/>
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
    "getSwapRateFamilyResult"
})
@XmlRootElement(name = "GetSwapRateFamilyResponse")
public class GetSwapRateFamilyResponse {

    @XmlElement(name = "GetSwapRateFamilyResult")
    protected ArrayOfSwapRate getSwapRateFamilyResult;

    /**
     * Gets the value of the getSwapRateFamilyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSwapRate }
     *     
     */
    public ArrayOfSwapRate getGetSwapRateFamilyResult() {
        return getSwapRateFamilyResult;
    }

    /**
     * Sets the value of the getSwapRateFamilyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSwapRate }
     *     
     */
    public void setGetSwapRateFamilyResult(ArrayOfSwapRate value) {
        this.getSwapRateFamilyResult = value;
    }

}

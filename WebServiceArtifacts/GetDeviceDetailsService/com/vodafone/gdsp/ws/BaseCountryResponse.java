
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseCountryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseCountryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnCode" type="{http://ws.gdsp.vodafone.com/}returnCode" minOccurs="0"/>
 *         &lt;element name="baseCountryList" type="{http://ws.gdsp.vodafone.com/}tBaseCountry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseCountryResponse", propOrder = {
    "returnCode",
    "baseCountryList"
})
public class BaseCountryResponse {

    protected ReturnCode returnCode;
    protected TBaseCountry baseCountryList;

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnCode }
     *     
     */
    public ReturnCode getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnCode }
     *     
     */
    public void setReturnCode(ReturnCode value) {
        this.returnCode = value;
    }

    /**
     * Gets the value of the baseCountryList property.
     * 
     * @return
     *     possible object is
     *     {@link TBaseCountry }
     *     
     */
    public TBaseCountry getBaseCountryList() {
        return baseCountryList;
    }

    /**
     * Sets the value of the baseCountryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBaseCountry }
     *     
     */
    public void setBaseCountryList(TBaseCountry value) {
        this.baseCountryList = value;
    }

}

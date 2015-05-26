
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
 *         &lt;element name="GetH15Rates1Result" type="{http://www.xignite.com/services/}ArrayOfInterestRate" minOccurs="0"/>
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
    "getH15Rates1Result"
})
@XmlRootElement(name = "GetH15Rates1Response")
public class GetH15Rates1Response {

    @XmlElement(name = "GetH15Rates1Result")
    protected ArrayOfInterestRate getH15Rates1Result;

    /**
     * Gets the value of the getH15Rates1Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInterestRate }
     *     
     */
    public ArrayOfInterestRate getGetH15Rates1Result() {
        return getH15Rates1Result;
    }

    /**
     * Sets the value of the getH15Rates1Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInterestRate }
     *     
     */
    public void setGetH15Rates1Result(ArrayOfInterestRate value) {
        this.getH15Rates1Result = value;
    }

}

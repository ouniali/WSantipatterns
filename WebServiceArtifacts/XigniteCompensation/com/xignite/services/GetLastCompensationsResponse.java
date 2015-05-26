
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
 *         &lt;element name="GetLastCompensationsResult" type="{http://www.xignite.com/services/}ArrayOfOfficerCompensation" minOccurs="0"/>
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
    "getLastCompensationsResult"
})
@XmlRootElement(name = "GetLastCompensationsResponse")
public class GetLastCompensationsResponse {

    @XmlElement(name = "GetLastCompensationsResult")
    protected ArrayOfOfficerCompensation getLastCompensationsResult;

    /**
     * Gets the value of the getLastCompensationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfficerCompensation }
     *     
     */
    public ArrayOfOfficerCompensation getGetLastCompensationsResult() {
        return getLastCompensationsResult;
    }

    /**
     * Sets the value of the getLastCompensationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfficerCompensation }
     *     
     */
    public void setGetLastCompensationsResult(ArrayOfOfficerCompensation value) {
        this.getLastCompensationsResult = value;
    }

}

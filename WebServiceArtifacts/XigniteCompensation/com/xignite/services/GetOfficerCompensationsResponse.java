
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
 *         &lt;element name="GetOfficerCompensationsResult" type="{http://www.xignite.com/services/}OfficerCompensations" minOccurs="0"/>
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
    "getOfficerCompensationsResult"
})
@XmlRootElement(name = "GetOfficerCompensationsResponse")
public class GetOfficerCompensationsResponse {

    @XmlElement(name = "GetOfficerCompensationsResult")
    protected OfficerCompensations getOfficerCompensationsResult;

    /**
     * Gets the value of the getOfficerCompensationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link OfficerCompensations }
     *     
     */
    public OfficerCompensations getGetOfficerCompensationsResult() {
        return getOfficerCompensationsResult;
    }

    /**
     * Sets the value of the getOfficerCompensationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficerCompensations }
     *     
     */
    public void setGetOfficerCompensationsResult(OfficerCompensations value) {
        this.getOfficerCompensationsResult = value;
    }

}

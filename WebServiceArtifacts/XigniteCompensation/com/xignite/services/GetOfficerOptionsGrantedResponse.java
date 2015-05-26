
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
 *         &lt;element name="GetOfficerOptionsGrantedResult" type="{http://www.xignite.com/services/}OfficerOptions" minOccurs="0"/>
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
    "getOfficerOptionsGrantedResult"
})
@XmlRootElement(name = "GetOfficerOptionsGrantedResponse")
public class GetOfficerOptionsGrantedResponse {

    @XmlElement(name = "GetOfficerOptionsGrantedResult")
    protected OfficerOptions getOfficerOptionsGrantedResult;

    /**
     * Gets the value of the getOfficerOptionsGrantedResult property.
     * 
     * @return
     *     possible object is
     *     {@link OfficerOptions }
     *     
     */
    public OfficerOptions getGetOfficerOptionsGrantedResult() {
        return getOfficerOptionsGrantedResult;
    }

    /**
     * Sets the value of the getOfficerOptionsGrantedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficerOptions }
     *     
     */
    public void setGetOfficerOptionsGrantedResult(OfficerOptions value) {
        this.getOfficerOptionsGrantedResult = value;
    }

}

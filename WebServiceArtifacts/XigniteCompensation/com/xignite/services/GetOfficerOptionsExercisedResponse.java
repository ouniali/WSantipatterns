
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
 *         &lt;element name="GetOfficerOptionsExercisedResult" type="{http://www.xignite.com/services/}OfficerOptions" minOccurs="0"/>
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
    "getOfficerOptionsExercisedResult"
})
@XmlRootElement(name = "GetOfficerOptionsExercisedResponse")
public class GetOfficerOptionsExercisedResponse {

    @XmlElement(name = "GetOfficerOptionsExercisedResult")
    protected OfficerOptions getOfficerOptionsExercisedResult;

    /**
     * Gets the value of the getOfficerOptionsExercisedResult property.
     * 
     * @return
     *     possible object is
     *     {@link OfficerOptions }
     *     
     */
    public OfficerOptions getGetOfficerOptionsExercisedResult() {
        return getOfficerOptionsExercisedResult;
    }

    /**
     * Sets the value of the getOfficerOptionsExercisedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficerOptions }
     *     
     */
    public void setGetOfficerOptionsExercisedResult(OfficerOptions value) {
        this.getOfficerOptionsExercisedResult = value;
    }

}

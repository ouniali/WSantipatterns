
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
 *         &lt;element name="GetCurrentOfficersResult" type="{http://www.xignite.com/services/}ArrayOfOfficer" minOccurs="0"/>
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
    "getCurrentOfficersResult"
})
@XmlRootElement(name = "GetCurrentOfficersResponse")
public class GetCurrentOfficersResponse {

    @XmlElement(name = "GetCurrentOfficersResult")
    protected ArrayOfOfficer getCurrentOfficersResult;

    /**
     * Gets the value of the getCurrentOfficersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfficer }
     *     
     */
    public ArrayOfOfficer getGetCurrentOfficersResult() {
        return getCurrentOfficersResult;
    }

    /**
     * Sets the value of the getCurrentOfficersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfficer }
     *     
     */
    public void setGetCurrentOfficersResult(ArrayOfOfficer value) {
        this.getCurrentOfficersResult = value;
    }

}

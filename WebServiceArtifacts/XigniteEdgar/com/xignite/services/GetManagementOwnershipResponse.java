
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
 *         &lt;element name="GetManagementOwnershipResult" type="{http://www.xignite.com/services/}ManagementOwnership" minOccurs="0"/>
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
    "getManagementOwnershipResult"
})
@XmlRootElement(name = "GetManagementOwnershipResponse")
public class GetManagementOwnershipResponse {

    @XmlElement(name = "GetManagementOwnershipResult")
    protected ManagementOwnership getManagementOwnershipResult;

    /**
     * Gets the value of the getManagementOwnershipResult property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementOwnership }
     *     
     */
    public ManagementOwnership getGetManagementOwnershipResult() {
        return getManagementOwnershipResult;
    }

    /**
     * Sets the value of the getManagementOwnershipResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementOwnership }
     *     
     */
    public void setGetManagementOwnershipResult(ManagementOwnership value) {
        this.getManagementOwnershipResult = value;
    }

}

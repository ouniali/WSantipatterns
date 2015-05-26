
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
 *         &lt;element name="AddIPAddressResult" type="{http://www.xignite.com/services/}UserSummary" minOccurs="0"/>
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
    "addIPAddressResult"
})
@XmlRootElement(name = "AddIPAddressResponse")
public class AddIPAddressResponse {

    @XmlElement(name = "AddIPAddressResult")
    protected UserSummary addIPAddressResult;

    /**
     * Gets the value of the addIPAddressResult property.
     * 
     * @return
     *     possible object is
     *     {@link UserSummary }
     *     
     */
    public UserSummary getAddIPAddressResult() {
        return addIPAddressResult;
    }

    /**
     * Sets the value of the addIPAddressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSummary }
     *     
     */
    public void setAddIPAddressResult(UserSummary value) {
        this.addIPAddressResult = value;
    }

}

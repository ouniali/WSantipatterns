
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
 *         &lt;element name="GetUserStatusResult" type="{http://www.xignite.com/services/}UserSummary" minOccurs="0"/>
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
    "getUserStatusResult"
})
@XmlRootElement(name = "GetUserStatusResponse")
public class GetUserStatusResponse {

    @XmlElement(name = "GetUserStatusResult")
    protected UserSummary getUserStatusResult;

    /**
     * Gets the value of the getUserStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link UserSummary }
     *     
     */
    public UserSummary getGetUserStatusResult() {
        return getUserStatusResult;
    }

    /**
     * Sets the value of the getUserStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSummary }
     *     
     */
    public void setGetUserStatusResult(UserSummary value) {
        this.getUserStatusResult = value;
    }

}

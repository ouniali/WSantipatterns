
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
 *         &lt;element name="GetMyStatusResult" type="{http://www.xignite.com/services/}UserSummary" minOccurs="0"/>
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
    "getMyStatusResult"
})
@XmlRootElement(name = "GetMyStatusResponse")
public class GetMyStatusResponse {

    @XmlElement(name = "GetMyStatusResult")
    protected UserSummary getMyStatusResult;

    /**
     * Gets the value of the getMyStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link UserSummary }
     *     
     */
    public UserSummary getGetMyStatusResult() {
        return getMyStatusResult;
    }

    /**
     * Sets the value of the getMyStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserSummary }
     *     
     */
    public void setGetMyStatusResult(UserSummary value) {
        this.getMyStatusResult = value;
    }

}

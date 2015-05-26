
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
 *         &lt;element name="GetIssuerOwnershipsResult" type="{http://www.xignite.com/services/}IssuerOwnerships" minOccurs="0"/>
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
    "getIssuerOwnershipsResult"
})
@XmlRootElement(name = "GetIssuerOwnershipsResponse")
public class GetIssuerOwnershipsResponse {

    @XmlElement(name = "GetIssuerOwnershipsResult")
    protected IssuerOwnerships getIssuerOwnershipsResult;

    /**
     * Gets the value of the getIssuerOwnershipsResult property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerOwnerships }
     *     
     */
    public IssuerOwnerships getGetIssuerOwnershipsResult() {
        return getIssuerOwnershipsResult;
    }

    /**
     * Sets the value of the getIssuerOwnershipsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerOwnerships }
     *     
     */
    public void setGetIssuerOwnershipsResult(IssuerOwnerships value) {
        this.getIssuerOwnershipsResult = value;
    }

}

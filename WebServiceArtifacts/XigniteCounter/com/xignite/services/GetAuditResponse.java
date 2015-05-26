
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
 *         &lt;element name="GetAuditResult" type="{http://www.xignite.com/services/}ArrayOfAuditEntry" minOccurs="0"/>
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
    "getAuditResult"
})
@XmlRootElement(name = "GetAuditResponse")
public class GetAuditResponse {

    @XmlElement(name = "GetAuditResult")
    protected ArrayOfAuditEntry getAuditResult;

    /**
     * Gets the value of the getAuditResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuditEntry }
     *     
     */
    public ArrayOfAuditEntry getGetAuditResult() {
        return getAuditResult;
    }

    /**
     * Sets the value of the getAuditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuditEntry }
     *     
     */
    public void setGetAuditResult(ArrayOfAuditEntry value) {
        this.getAuditResult = value;
    }

}

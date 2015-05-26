
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
 *         &lt;element name="GetStatusesWithPatternResult" type="{http://www.xignite.com/services/}ArrayOfAuditEntry" minOccurs="0"/>
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
    "getStatusesWithPatternResult"
})
@XmlRootElement(name = "GetStatusesWithPatternResponse")
public class GetStatusesWithPatternResponse {

    @XmlElement(name = "GetStatusesWithPatternResult")
    protected ArrayOfAuditEntry getStatusesWithPatternResult;

    /**
     * Gets the value of the getStatusesWithPatternResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuditEntry }
     *     
     */
    public ArrayOfAuditEntry getGetStatusesWithPatternResult() {
        return getStatusesWithPatternResult;
    }

    /**
     * Sets the value of the getStatusesWithPatternResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuditEntry }
     *     
     */
    public void setGetStatusesWithPatternResult(ArrayOfAuditEntry value) {
        this.getStatusesWithPatternResult = value;
    }

}

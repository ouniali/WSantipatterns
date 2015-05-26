
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
 *         &lt;element name="GetStatusesResult" type="{http://www.xignite.com/services/}ArrayOfAuditEntry" minOccurs="0"/>
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
    "getStatusesResult"
})
@XmlRootElement(name = "GetStatusesResponse")
public class GetStatusesResponse {

    @XmlElement(name = "GetStatusesResult")
    protected ArrayOfAuditEntry getStatusesResult;

    /**
     * Gets the value of the getStatusesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuditEntry }
     *     
     */
    public ArrayOfAuditEntry getGetStatusesResult() {
        return getStatusesResult;
    }

    /**
     * Sets the value of the getStatusesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuditEntry }
     *     
     */
    public void setGetStatusesResult(ArrayOfAuditEntry value) {
        this.getStatusesResult = value;
    }

}

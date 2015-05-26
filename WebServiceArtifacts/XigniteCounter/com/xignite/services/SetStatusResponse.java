
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
 *         &lt;element name="SetStatusResult" type="{http://www.xignite.com/services/}AuditEntry" minOccurs="0"/>
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
    "setStatusResult"
})
@XmlRootElement(name = "SetStatusResponse")
public class SetStatusResponse {

    @XmlElement(name = "SetStatusResult")
    protected AuditEntry setStatusResult;

    /**
     * Gets the value of the setStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link AuditEntry }
     *     
     */
    public AuditEntry getSetStatusResult() {
        return setStatusResult;
    }

    /**
     * Sets the value of the setStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEntry }
     *     
     */
    public void setSetStatusResult(AuditEntry value) {
        this.setStatusResult = value;
    }

}

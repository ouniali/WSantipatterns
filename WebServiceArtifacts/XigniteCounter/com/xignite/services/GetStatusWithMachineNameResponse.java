
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
 *         &lt;element name="GetStatusWithMachineNameResult" type="{http://www.xignite.com/services/}AuditEntry" minOccurs="0"/>
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
    "getStatusWithMachineNameResult"
})
@XmlRootElement(name = "GetStatusWithMachineNameResponse")
public class GetStatusWithMachineNameResponse {

    @XmlElement(name = "GetStatusWithMachineNameResult")
    protected AuditEntry getStatusWithMachineNameResult;

    /**
     * Gets the value of the getStatusWithMachineNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link AuditEntry }
     *     
     */
    public AuditEntry getGetStatusWithMachineNameResult() {
        return getStatusWithMachineNameResult;
    }

    /**
     * Sets the value of the getStatusWithMachineNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditEntry }
     *     
     */
    public void setGetStatusWithMachineNameResult(AuditEntry value) {
        this.getStatusWithMachineNameResult = value;
    }

}

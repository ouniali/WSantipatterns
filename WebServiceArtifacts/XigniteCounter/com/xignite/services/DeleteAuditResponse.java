
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
 *         &lt;element name="DeleteAuditResult" type="{http://www.xignite.com/services/}DoubleResult" minOccurs="0"/>
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
    "deleteAuditResult"
})
@XmlRootElement(name = "DeleteAuditResponse")
public class DeleteAuditResponse {

    @XmlElement(name = "DeleteAuditResult")
    protected DoubleResult deleteAuditResult;

    /**
     * Gets the value of the deleteAuditResult property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleResult }
     *     
     */
    public DoubleResult getDeleteAuditResult() {
        return deleteAuditResult;
    }

    /**
     * Sets the value of the deleteAuditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleResult }
     *     
     */
    public void setDeleteAuditResult(DoubleResult value) {
        this.deleteAuditResult = value;
    }

}


package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getContactDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPurpose" type="{http://ws.gdsp.vodafone.com/}tContactPurposeOptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getContactDetails", propOrder = {
    "contactPurpose"
})
public class GetContactDetails_Type {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TContactPurposeOptions contactPurpose;

    /**
     * Gets the value of the contactPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link TContactPurposeOptions }
     *     
     */
    public TContactPurposeOptions getContactPurpose() {
        return contactPurpose;
    }

    /**
     * Sets the value of the contactPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link TContactPurposeOptions }
     *     
     */
    public void setContactPurpose(TContactPurposeOptions value) {
        this.contactPurpose = value;
    }

}

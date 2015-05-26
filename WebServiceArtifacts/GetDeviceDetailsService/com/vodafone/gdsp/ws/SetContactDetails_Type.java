
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setContactDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPurpose" type="{http://ws.gdsp.vodafone.com/}tContactPurposeOptions"/>
 *         &lt;element name="emailAddress" type="{http://ws.gdsp.vodafone.com/}tEmailAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setContactDetails", propOrder = {
    "contactPurpose",
    "emailAddress"
})
public class SetContactDetails_Type {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TContactPurposeOptions contactPurpose;
    protected String emailAddress;

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

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

}

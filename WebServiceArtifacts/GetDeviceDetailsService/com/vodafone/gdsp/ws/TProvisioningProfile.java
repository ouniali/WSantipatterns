
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tProvisioningProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tProvisioningProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="provisioningProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tProvisioningProfile", propOrder = {
    "provisioningProfileName"
})
public class TProvisioningProfile {

    protected String provisioningProfileName;

    /**
     * Gets the value of the provisioningProfileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioningProfileName() {
        return provisioningProfileName;
    }

    /**
     * Sets the value of the provisioningProfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioningProfileName(String value) {
        this.provisioningProfileName = value;
    }

}

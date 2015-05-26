
package com.epostcode.ws.uk;

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
 *         &lt;element name="UnregisterLicenseResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "unregisterLicenseResult"
})
@XmlRootElement(name = "UnregisterLicenseResponse")
public class UnregisterLicenseResponse {

    @XmlElement(name = "UnregisterLicenseResult")
    protected String unregisterLicenseResult;

    /**
     * Gets the value of the unregisterLicenseResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnregisterLicenseResult() {
        return unregisterLicenseResult;
    }

    /**
     * Sets the value of the unregisterLicenseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnregisterLicenseResult(String value) {
        this.unregisterLicenseResult = value;
    }

}

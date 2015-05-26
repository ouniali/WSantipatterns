
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
 *         &lt;element name="GetLicenseDetailsResult" type="{http://ws.epostcode.com/uk/}Licenses" minOccurs="0"/>
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
    "getLicenseDetailsResult"
})
@XmlRootElement(name = "GetLicenseDetailsResponse")
public class GetLicenseDetailsResponse {

    @XmlElement(name = "GetLicenseDetailsResult")
    protected Licenses getLicenseDetailsResult;

    /**
     * Gets the value of the getLicenseDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Licenses }
     *     
     */
    public Licenses getGetLicenseDetailsResult() {
        return getLicenseDetailsResult;
    }

    /**
     * Sets the value of the getLicenseDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Licenses }
     *     
     */
    public void setGetLicenseDetailsResult(Licenses value) {
        this.getLicenseDetailsResult = value;
    }

}

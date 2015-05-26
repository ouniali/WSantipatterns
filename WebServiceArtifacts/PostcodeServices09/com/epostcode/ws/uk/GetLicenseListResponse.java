
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
 *         &lt;element name="GetLicenseListResult" type="{http://ws.epostcode.com/uk/}Licenses" minOccurs="0"/>
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
    "getLicenseListResult"
})
@XmlRootElement(name = "GetLicenseListResponse")
public class GetLicenseListResponse {

    @XmlElement(name = "GetLicenseListResult")
    protected Licenses getLicenseListResult;

    /**
     * Gets the value of the getLicenseListResult property.
     * 
     * @return
     *     possible object is
     *     {@link Licenses }
     *     
     */
    public Licenses getGetLicenseListResult() {
        return getLicenseListResult;
    }

    /**
     * Sets the value of the getLicenseListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Licenses }
     *     
     */
    public void setGetLicenseListResult(Licenses value) {
        this.getLicenseListResult = value;
    }

}

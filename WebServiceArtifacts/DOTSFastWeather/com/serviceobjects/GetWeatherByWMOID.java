
package com.serviceobjects;

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
 *         &lt;element name="WMOID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wmoid",
    "licenseKey"
})
@XmlRootElement(name = "GetWeatherByWMOID")
public class GetWeatherByWMOID {

    @XmlElement(name = "WMOID")
    protected String wmoid;
    @XmlElement(name = "LicenseKey")
    protected String licenseKey;

    /**
     * Gets the value of the wmoid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWMOID() {
        return wmoid;
    }

    /**
     * Sets the value of the wmoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWMOID(String value) {
        this.wmoid = value;
    }

    /**
     * Gets the value of the licenseKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseKey() {
        return licenseKey;
    }

    /**
     * Sets the value of the licenseKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseKey(String value) {
        this.licenseKey = value;
    }

}


package com.clearforest;

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
 *         &lt;element name="licenseID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paramsXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "licenseID",
    "content",
    "paramsXML"
})
@XmlRootElement(name = "Enlighten")
public class Enlighten {

    @XmlElement(required = true)
    protected String licenseID;
    @XmlElement(required = true)
    protected String content;
    @XmlElement(required = true)
    protected String paramsXML;

    /**
     * Gets the value of the licenseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseID() {
        return licenseID;
    }

    /**
     * Sets the value of the licenseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseID(String value) {
        this.licenseID = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the paramsXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamsXML() {
        return paramsXML;
    }

    /**
     * Sets the value of the paramsXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamsXML(String value) {
        this.paramsXML = value;
    }

}


package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for displayspool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="displayspool">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authElem" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}authElem"/>
 *         &lt;element name="emailOrgNameOrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayspool", propOrder = {
    "authElem",
    "emailOrgNameOrId"
})
public class Displayspool {

    @XmlElement(required = true)
    protected AuthElem authElem;
    @XmlElement(required = true)
    protected String emailOrgNameOrId;

    /**
     * Gets the value of the authElem property.
     * 
     * @return
     *     possible object is
     *     {@link AuthElem }
     *     
     */
    public AuthElem getAuthElem() {
        return authElem;
    }

    /**
     * Sets the value of the authElem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthElem }
     *     
     */
    public void setAuthElem(AuthElem value) {
        this.authElem = value;
    }

    /**
     * Gets the value of the emailOrgNameOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailOrgNameOrId() {
        return emailOrgNameOrId;
    }

    /**
     * Sets the value of the emailOrgNameOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailOrgNameOrId(String value) {
        this.emailOrgNameOrId = value;
    }

}

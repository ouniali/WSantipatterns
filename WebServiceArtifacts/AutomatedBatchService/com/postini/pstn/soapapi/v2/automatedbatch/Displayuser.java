
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for displayuser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="displayuser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authElem" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}authElem"/>
 *         &lt;element name="userAddressOrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayuser", propOrder = {
    "authElem",
    "userAddressOrId"
})
public class Displayuser {

    @XmlElement(required = true)
    protected AuthElem authElem;
    @XmlElement(required = true)
    protected String userAddressOrId;

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
     * Gets the value of the userAddressOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAddressOrId() {
        return userAddressOrId;
    }

    /**
     * Sets the value of the userAddressOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAddressOrId(String value) {
        this.userAddressOrId = value;
    }

}

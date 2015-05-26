
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addalias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addalias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authElem" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}authElem"/>
 *         &lt;element name="userAddressOrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aliasAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="confirm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addalias", propOrder = {
    "authElem",
    "userAddressOrId",
    "aliasAddress",
    "confirm"
})
public class Addalias {

    @XmlElement(required = true)
    protected AuthElem authElem;
    @XmlElement(required = true)
    protected String userAddressOrId;
    @XmlElement(required = true)
    protected String aliasAddress;
    protected String confirm;

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

    /**
     * Gets the value of the aliasAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasAddress() {
        return aliasAddress;
    }

    /**
     * Sets the value of the aliasAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasAddress(String value) {
        this.aliasAddress = value;
    }

    /**
     * Gets the value of the confirm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirm() {
        return confirm;
    }

    /**
     * Sets the value of the confirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirm(String value) {
        this.confirm = value;
    }

}

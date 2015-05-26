
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adduser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adduser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authElem" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}authElem"/>
 *         &lt;element name="userAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="args" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}adduserargs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adduser", propOrder = {
    "authElem",
    "userAddress",
    "args"
})
public class Adduser {

    @XmlElement(required = true)
    protected AuthElem authElem;
    @XmlElement(required = true)
    protected String userAddress;
    protected Adduserargs args;

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
     * Gets the value of the userAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * Sets the value of the userAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAddress(String value) {
        this.userAddress = value;
    }

    /**
     * Gets the value of the args property.
     * 
     * @return
     *     possible object is
     *     {@link Adduserargs }
     *     
     */
    public Adduserargs getArgs() {
        return args;
    }

    /**
     * Sets the value of the args property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adduserargs }
     *     
     */
    public void setArgs(Adduserargs value) {
        this.args = value;
    }

}

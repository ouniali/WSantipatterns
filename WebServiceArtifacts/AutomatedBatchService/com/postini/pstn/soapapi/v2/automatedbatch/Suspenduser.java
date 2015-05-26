
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suspenduser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suspenduser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authElem" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}authElem"/>
 *         &lt;element name="userAddressOrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optArgStr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optArgStr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optArgStr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suspenduser", propOrder = {
    "authElem",
    "userAddressOrId",
    "optArgStr1",
    "optArgStr2",
    "optArgStr3"
})
public class Suspenduser {

    @XmlElement(required = true)
    protected AuthElem authElem;
    @XmlElement(required = true)
    protected String userAddressOrId;
    protected String optArgStr1;
    protected String optArgStr2;
    protected String optArgStr3;

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
     * Gets the value of the optArgStr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptArgStr1() {
        return optArgStr1;
    }

    /**
     * Sets the value of the optArgStr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptArgStr1(String value) {
        this.optArgStr1 = value;
    }

    /**
     * Gets the value of the optArgStr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptArgStr2() {
        return optArgStr2;
    }

    /**
     * Sets the value of the optArgStr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptArgStr2(String value) {
        this.optArgStr2 = value;
    }

    /**
     * Gets the value of the optArgStr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptArgStr3() {
        return optArgStr3;
    }

    /**
     * Sets the value of the optArgStr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptArgStr3(String value) {
        this.optArgStr3 = value;
    }

}


package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authElem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authElem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="apiKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xauth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authElem", propOrder = {

})
public class AuthElem {

    @XmlElement(required = true)
    protected String apiKey;
    @XmlElement(required = true)
    protected String email;
    protected String pword;
    protected String xauth;

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the pword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPword() {
        return pword;
    }

    /**
     * Sets the value of the pword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPword(String value) {
        this.pword = value;
    }

    /**
     * Gets the value of the xauth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXauth() {
        return xauth;
    }

    /**
     * Sets the value of the xauth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXauth(String value) {
        this.xauth = value;
    }

}

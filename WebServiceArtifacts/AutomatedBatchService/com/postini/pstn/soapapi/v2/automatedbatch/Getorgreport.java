
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getorgreport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getorgreport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authElem" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}authElem"/>
 *         &lt;element name="orgNameOrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="args" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}getorgreportargs"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getorgreport", propOrder = {
    "authElem",
    "orgNameOrId",
    "args"
})
public class Getorgreport {

    @XmlElement(required = true)
    protected AuthElem authElem;
    @XmlElement(required = true)
    protected String orgNameOrId;
    @XmlElement(required = true)
    protected Getorgreportargs args;

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
     * Gets the value of the orgNameOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgNameOrId() {
        return orgNameOrId;
    }

    /**
     * Sets the value of the orgNameOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgNameOrId(String value) {
        this.orgNameOrId = value;
    }

    /**
     * Gets the value of the args property.
     * 
     * @return
     *     possible object is
     *     {@link Getorgreportargs }
     *     
     */
    public Getorgreportargs getArgs() {
        return args;
    }

    /**
     * Sets the value of the args property.
     * 
     * @param value
     *     allowed object is
     *     {@link Getorgreportargs }
     *     
     */
    public void setArgs(Getorgreportargs value) {
        this.args = value;
    }

}

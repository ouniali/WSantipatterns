
package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifydomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifydomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authElem" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}authElem"/>
 *         &lt;element name="domainNameOrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domainModifications" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}domainRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifydomain", propOrder = {
    "authElem",
    "domainNameOrId",
    "domainModifications"
})
public class Modifydomain {

    @XmlElement(required = true)
    protected AuthElem authElem;
    @XmlElement(required = true)
    protected String domainNameOrId;
    @XmlElement(required = true)
    protected DomainRecord domainModifications;

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
     * Gets the value of the domainNameOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainNameOrId() {
        return domainNameOrId;
    }

    /**
     * Sets the value of the domainNameOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainNameOrId(String value) {
        this.domainNameOrId = value;
    }

    /**
     * Gets the value of the domainModifications property.
     * 
     * @return
     *     possible object is
     *     {@link DomainRecord }
     *     
     */
    public DomainRecord getDomainModifications() {
        return domainModifications;
    }

    /**
     * Sets the value of the domainModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainRecord }
     *     
     */
    public void setDomainModifications(DomainRecord value) {
        this.domainModifications = value;
    }

}


package com.postini.pstn.soapapi.v2.automatedbatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyorg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyorg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authElem" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}authElem"/>
 *         &lt;element name="orgNameOrId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orgModifications" type="{http://postini.com/PSTN/SOAPAPI/v2/automatedbatch}orgRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyorg", propOrder = {
    "authElem",
    "orgNameOrId",
    "orgModifications"
})
public class Modifyorg {

    @XmlElement(required = true)
    protected AuthElem authElem;
    @XmlElement(required = true)
    protected String orgNameOrId;
    @XmlElement(required = true)
    protected OrgRecord orgModifications;

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
     * Gets the value of the orgModifications property.
     * 
     * @return
     *     possible object is
     *     {@link OrgRecord }
     *     
     */
    public OrgRecord getOrgModifications() {
        return orgModifications;
    }

    /**
     * Sets the value of the orgModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgRecord }
     *     
     */
    public void setOrgModifications(OrgRecord value) {
        this.orgModifications = value;
    }

}

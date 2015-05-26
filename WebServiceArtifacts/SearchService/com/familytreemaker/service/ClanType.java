
package com.familytreemaker.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Members" type="{urn:service.familytreemaker.com}ArrayOfClanMemberType" minOccurs="0"/>
 *         &lt;element name="Facts" type="{urn:service.familytreemaker.com}ArrayOfFactType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClanType", propOrder = {
    "members",
    "facts"
})
public class ClanType {

    @XmlElement(name = "Members")
    protected ArrayOfClanMemberType members;
    @XmlElement(name = "Facts")
    protected ArrayOfFactType facts;

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClanMemberType }
     *     
     */
    public ArrayOfClanMemberType getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClanMemberType }
     *     
     */
    public void setMembers(ArrayOfClanMemberType value) {
        this.members = value;
    }

    /**
     * Gets the value of the facts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFactType }
     *     
     */
    public ArrayOfFactType getFacts() {
        return facts;
    }

    /**
     * Sets the value of the facts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFactType }
     *     
     */
    public void setFacts(ArrayOfFactType value) {
        this.facts = value;
    }

}

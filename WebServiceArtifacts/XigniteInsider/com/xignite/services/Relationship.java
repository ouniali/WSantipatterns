
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Relationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relationship">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="IsDirector" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsOfficer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OfficerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsTenPercentOwner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsOther" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relationship", propOrder = {
    "isDirector",
    "isOfficer",
    "officerTitle",
    "isTenPercentOwner",
    "isOther"
})
public class Relationship
    extends Common
{

    @XmlElement(name = "IsDirector")
    protected boolean isDirector;
    @XmlElement(name = "IsOfficer")
    protected boolean isOfficer;
    @XmlElement(name = "OfficerTitle")
    protected String officerTitle;
    @XmlElement(name = "IsTenPercentOwner")
    protected boolean isTenPercentOwner;
    @XmlElement(name = "IsOther")
    protected boolean isOther;

    /**
     * Gets the value of the isDirector property.
     * 
     */
    public boolean isIsDirector() {
        return isDirector;
    }

    /**
     * Sets the value of the isDirector property.
     * 
     */
    public void setIsDirector(boolean value) {
        this.isDirector = value;
    }

    /**
     * Gets the value of the isOfficer property.
     * 
     */
    public boolean isIsOfficer() {
        return isOfficer;
    }

    /**
     * Sets the value of the isOfficer property.
     * 
     */
    public void setIsOfficer(boolean value) {
        this.isOfficer = value;
    }

    /**
     * Gets the value of the officerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficerTitle() {
        return officerTitle;
    }

    /**
     * Sets the value of the officerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficerTitle(String value) {
        this.officerTitle = value;
    }

    /**
     * Gets the value of the isTenPercentOwner property.
     * 
     */
    public boolean isIsTenPercentOwner() {
        return isTenPercentOwner;
    }

    /**
     * Sets the value of the isTenPercentOwner property.
     * 
     */
    public void setIsTenPercentOwner(boolean value) {
        this.isTenPercentOwner = value;
    }

    /**
     * Gets the value of the isOther property.
     * 
     */
    public boolean isIsOther() {
        return isOther;
    }

    /**
     * Sets the value of the isOther property.
     * 
     */
    public void setIsOther(boolean value) {
        this.isOther = value;
    }

}

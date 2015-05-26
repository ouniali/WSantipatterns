
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rptOwnerRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rptOwnerRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isDirector" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isOfficer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isTenPercentOwner" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isOther" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="officerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rptOwnerRelationship", propOrder = {
    "isDirector",
    "isOfficer",
    "isTenPercentOwner",
    "isOther",
    "officerTitle",
    "otherText"
})
public class RptOwnerRelationship {

    protected int isDirector;
    protected int isOfficer;
    protected int isTenPercentOwner;
    protected int isOther;
    protected String officerTitle;
    protected String otherText;

    /**
     * Gets the value of the isDirector property.
     * 
     */
    public int getIsDirector() {
        return isDirector;
    }

    /**
     * Sets the value of the isDirector property.
     * 
     */
    public void setIsDirector(int value) {
        this.isDirector = value;
    }

    /**
     * Gets the value of the isOfficer property.
     * 
     */
    public int getIsOfficer() {
        return isOfficer;
    }

    /**
     * Sets the value of the isOfficer property.
     * 
     */
    public void setIsOfficer(int value) {
        this.isOfficer = value;
    }

    /**
     * Gets the value of the isTenPercentOwner property.
     * 
     */
    public int getIsTenPercentOwner() {
        return isTenPercentOwner;
    }

    /**
     * Sets the value of the isTenPercentOwner property.
     * 
     */
    public void setIsTenPercentOwner(int value) {
        this.isTenPercentOwner = value;
    }

    /**
     * Gets the value of the isOther property.
     * 
     */
    public int getIsOther() {
        return isOther;
    }

    /**
     * Sets the value of the isOther property.
     * 
     */
    public void setIsOther(int value) {
        this.isOther = value;
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
     * Gets the value of the otherText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherText() {
        return otherText;
    }

    /**
     * Sets the value of the otherText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherText(String value) {
        this.otherText = value;
    }

}

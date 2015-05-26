
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficerOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfficerOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="OfficerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Officer" type="{http://www.xignite.com/services/}Officer" minOccurs="0"/>
 *         &lt;element name="OptionsGranted" type="{http://www.xignite.com/services/}ArrayOfOptionGranted" minOccurs="0"/>
 *         &lt;element name="OptionsExercised" type="{http://www.xignite.com/services/}ArrayOfOptionExercised" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficerOptions", propOrder = {
    "officerID",
    "officer",
    "optionsGranted",
    "optionsExercised"
})
public class OfficerOptions
    extends Common
{

    @XmlElement(name = "OfficerID")
    protected String officerID;
    @XmlElement(name = "Officer")
    protected Officer officer;
    @XmlElement(name = "OptionsGranted")
    protected ArrayOfOptionGranted optionsGranted;
    @XmlElement(name = "OptionsExercised")
    protected ArrayOfOptionExercised optionsExercised;

    /**
     * Gets the value of the officerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficerID() {
        return officerID;
    }

    /**
     * Sets the value of the officerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficerID(String value) {
        this.officerID = value;
    }

    /**
     * Gets the value of the officer property.
     * 
     * @return
     *     possible object is
     *     {@link Officer }
     *     
     */
    public Officer getOfficer() {
        return officer;
    }

    /**
     * Sets the value of the officer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Officer }
     *     
     */
    public void setOfficer(Officer value) {
        this.officer = value;
    }

    /**
     * Gets the value of the optionsGranted property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOptionGranted }
     *     
     */
    public ArrayOfOptionGranted getOptionsGranted() {
        return optionsGranted;
    }

    /**
     * Sets the value of the optionsGranted property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOptionGranted }
     *     
     */
    public void setOptionsGranted(ArrayOfOptionGranted value) {
        this.optionsGranted = value;
    }

    /**
     * Gets the value of the optionsExercised property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOptionExercised }
     *     
     */
    public ArrayOfOptionExercised getOptionsExercised() {
        return optionsExercised;
    }

    /**
     * Sets the value of the optionsExercised property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOptionExercised }
     *     
     */
    public void setOptionsExercised(ArrayOfOptionExercised value) {
        this.optionsExercised = value;
    }

}

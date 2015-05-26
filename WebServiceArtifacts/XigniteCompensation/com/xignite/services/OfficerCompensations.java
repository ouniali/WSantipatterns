
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficerCompensations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfficerCompensations">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="OfficerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Officer" type="{http://www.xignite.com/services/}Officer" minOccurs="0"/>
 *         &lt;element name="Compensations" type="{http://www.xignite.com/services/}ArrayOfCompensation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficerCompensations", propOrder = {
    "officerID",
    "officer",
    "compensations"
})
public class OfficerCompensations
    extends Common
{

    @XmlElement(name = "OfficerID")
    protected String officerID;
    @XmlElement(name = "Officer")
    protected Officer officer;
    @XmlElement(name = "Compensations")
    protected ArrayOfCompensation compensations;

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
     * Gets the value of the compensations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompensation }
     *     
     */
    public ArrayOfCompensation getCompensations() {
        return compensations;
    }

    /**
     * Sets the value of the compensations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompensation }
     *     
     */
    public void setCompensations(ArrayOfCompensation value) {
        this.compensations = value;
    }

}

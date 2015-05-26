
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AliasInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AliasInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AliasCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AliasCityAbbrev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingNameInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueNameInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasInfo", propOrder = {
    "aliasCityName",
    "aliasCityAbbrev",
    "facilityCode",
    "facilityDescription",
    "mailingNameInd",
    "uniqueNameInd"
})
public class AliasInfo {

    @XmlElement(name = "AliasCityName")
    protected String aliasCityName;
    @XmlElement(name = "AliasCityAbbrev")
    protected String aliasCityAbbrev;
    @XmlElement(name = "FacilityCode")
    protected String facilityCode;
    @XmlElement(name = "FacilityDescription")
    protected String facilityDescription;
    @XmlElement(name = "MailingNameInd")
    protected String mailingNameInd;
    @XmlElement(name = "UniqueNameInd")
    protected String uniqueNameInd;

    /**
     * Gets the value of the aliasCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasCityName() {
        return aliasCityName;
    }

    /**
     * Sets the value of the aliasCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasCityName(String value) {
        this.aliasCityName = value;
    }

    /**
     * Gets the value of the aliasCityAbbrev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasCityAbbrev() {
        return aliasCityAbbrev;
    }

    /**
     * Sets the value of the aliasCityAbbrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasCityAbbrev(String value) {
        this.aliasCityAbbrev = value;
    }

    /**
     * Gets the value of the facilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCode() {
        return facilityCode;
    }

    /**
     * Sets the value of the facilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCode(String value) {
        this.facilityCode = value;
    }

    /**
     * Gets the value of the facilityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityDescription() {
        return facilityDescription;
    }

    /**
     * Sets the value of the facilityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityDescription(String value) {
        this.facilityDescription = value;
    }

    /**
     * Gets the value of the mailingNameInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingNameInd() {
        return mailingNameInd;
    }

    /**
     * Sets the value of the mailingNameInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingNameInd(String value) {
        this.mailingNameInd = value;
    }

    /**
     * Gets the value of the uniqueNameInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueNameInd() {
        return uniqueNameInd;
    }

    /**
     * Sets the value of the uniqueNameInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueNameInd(String value) {
        this.uniqueNameInd = value;
    }

}

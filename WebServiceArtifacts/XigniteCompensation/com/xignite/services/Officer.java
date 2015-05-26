
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Officer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Officer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.xignite.com/services/}Company" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DirectorSince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficerSince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectorAsReported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectorStandardized" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Biography" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Officer", propOrder = {
    "id",
    "company",
    "source",
    "sourceDate",
    "name",
    "age",
    "directorSince",
    "officerSince",
    "directorAsReported",
    "directorStandardized",
    "biography"
})
public class Officer
    extends Common
{

    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "Company")
    protected Company company;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "SourceDate")
    protected String sourceDate;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Age")
    protected int age;
    @XmlElement(name = "DirectorSince")
    protected String directorSince;
    @XmlElement(name = "OfficerSince")
    protected String officerSince;
    @XmlElement(name = "DirectorAsReported")
    protected String directorAsReported;
    @XmlElement(name = "DirectorStandardized")
    protected String directorStandardized;
    @XmlElement(name = "Biography")
    protected String biography;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCompany(Company value) {
        this.company = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the sourceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDate() {
        return sourceDate;
    }

    /**
     * Sets the value of the sourceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDate(String value) {
        this.sourceDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the age property.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the directorSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorSince() {
        return directorSince;
    }

    /**
     * Sets the value of the directorSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorSince(String value) {
        this.directorSince = value;
    }

    /**
     * Gets the value of the officerSince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficerSince() {
        return officerSince;
    }

    /**
     * Sets the value of the officerSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficerSince(String value) {
        this.officerSince = value;
    }

    /**
     * Gets the value of the directorAsReported property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorAsReported() {
        return directorAsReported;
    }

    /**
     * Sets the value of the directorAsReported property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorAsReported(String value) {
        this.directorAsReported = value;
    }

    /**
     * Gets the value of the directorStandardized property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorStandardized() {
        return directorStandardized;
    }

    /**
     * Sets the value of the directorStandardized property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorStandardized(String value) {
        this.directorStandardized = value;
    }

    /**
     * Gets the value of the biography property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiography() {
        return biography;
    }

    /**
     * Sets the value of the biography property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiography(String value) {
        this.biography = value;
    }

}

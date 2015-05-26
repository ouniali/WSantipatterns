
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OFACName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OFACName">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}OFACTypes"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://www.xignite.com/services/}ArrayOfOFACAddress" minOccurs="0"/>
 *         &lt;element name="AlternateNames" type="{http://www.xignite.com/services/}ArrayOfOFACAlternateName" minOccurs="0"/>
 *         &lt;element name="Programs" type="{http://www.xignite.com/services/}ArrayOfSanctionProgram" minOccurs="0"/>
 *         &lt;element name="Vessel" type="{http://www.xignite.com/services/}Vessel" minOccurs="0"/>
 *         &lt;element name="Score" type="{http://www.xignite.com/services/}Score" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OFACName", propOrder = {
    "id",
    "type",
    "name",
    "title",
    "remarks",
    "addresses",
    "alternateNames",
    "programs",
    "vessel",
    "score"
})
public class OFACName
    extends Common
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected OFACTypes type;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "Addresses")
    protected ArrayOfOFACAddress addresses;
    @XmlElement(name = "AlternateNames")
    protected ArrayOfOFACAlternateName alternateNames;
    @XmlElement(name = "Programs")
    protected ArrayOfSanctionProgram programs;
    @XmlElement(name = "Vessel")
    protected Vessel vessel;
    @XmlElement(name = "Score")
    protected Score score;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OFACTypes }
     *     
     */
    public OFACTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OFACTypes }
     *     
     */
    public void setType(OFACTypes value) {
        this.type = value;
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOFACAddress }
     *     
     */
    public ArrayOfOFACAddress getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOFACAddress }
     *     
     */
    public void setAddresses(ArrayOfOFACAddress value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the alternateNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOFACAlternateName }
     *     
     */
    public ArrayOfOFACAlternateName getAlternateNames() {
        return alternateNames;
    }

    /**
     * Sets the value of the alternateNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOFACAlternateName }
     *     
     */
    public void setAlternateNames(ArrayOfOFACAlternateName value) {
        this.alternateNames = value;
    }

    /**
     * Gets the value of the programs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSanctionProgram }
     *     
     */
    public ArrayOfSanctionProgram getPrograms() {
        return programs;
    }

    /**
     * Sets the value of the programs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSanctionProgram }
     *     
     */
    public void setPrograms(ArrayOfSanctionProgram value) {
        this.programs = value;
    }

    /**
     * Gets the value of the vessel property.
     * 
     * @return
     *     possible object is
     *     {@link Vessel }
     *     
     */
    public Vessel getVessel() {
        return vessel;
    }

    /**
     * Sets the value of the vessel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vessel }
     *     
     */
    public void setVessel(Vessel value) {
        this.vessel = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Score }
     *     
     */
    public Score getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Score }
     *     
     */
    public void setScore(Score value) {
        this.score = value;
    }

}

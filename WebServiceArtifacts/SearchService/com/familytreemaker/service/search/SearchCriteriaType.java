
package com.familytreemaker.service.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.familytreemaker.service.ClanType;


/**
 * <p>Java class for SearchCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Focus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Clan" type="{urn:service.familytreemaker.com}ClanType" minOccurs="0"/>
 *         &lt;element name="People" type="{urn:service.familytreemaker.com/Search}ArrayOfPersonType" minOccurs="0"/>
 *         &lt;element name="Citations" type="{urn:service.familytreemaker.com/Search}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteriaType", propOrder = {
    "focus",
    "clan",
    "people",
    "citations"
})
@XmlSeeAlso({
    HintCriteriaType.class
})
public class SearchCriteriaType {

    @XmlElement(name = "Focus")
    protected String focus;
    @XmlElement(name = "Clan")
    protected ClanType clan;
    @XmlElement(name = "People")
    protected ArrayOfPersonType people;
    @XmlElement(name = "Citations")
    protected ArrayOfString citations;

    /**
     * Gets the value of the focus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocus() {
        return focus;
    }

    /**
     * Sets the value of the focus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocus(String value) {
        this.focus = value;
    }

    /**
     * Gets the value of the clan property.
     * 
     * @return
     *     possible object is
     *     {@link ClanType }
     *     
     */
    public ClanType getClan() {
        return clan;
    }

    /**
     * Sets the value of the clan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClanType }
     *     
     */
    public void setClan(ClanType value) {
        this.clan = value;
    }

    /**
     * Gets the value of the people property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonType }
     *     
     */
    public ArrayOfPersonType getPeople() {
        return people;
    }

    /**
     * Sets the value of the people property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonType }
     *     
     */
    public void setPeople(ArrayOfPersonType value) {
        this.people = value;
    }

    /**
     * Gets the value of the citations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCitations() {
        return citations;
    }

    /**
     * Sets the value of the citations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCitations(ArrayOfString value) {
        this.citations = value;
    }

}

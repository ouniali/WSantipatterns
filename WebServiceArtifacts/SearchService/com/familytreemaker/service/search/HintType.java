
package com.familytreemaker.service.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCriteria" type="{urn:service.familytreemaker.com/Search}SearchCriteriaType" minOccurs="0"/>
 *         &lt;element name="Matches" type="{urn:service.familytreemaker.com/Search}ArrayOfMatchType" minOccurs="0"/>
 *         &lt;element name="Expiry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HintType", propOrder = {
    "searchCriteria",
    "matches",
    "expiry"
})
public class HintType {

    @XmlElement(name = "SearchCriteria")
    protected SearchCriteriaType searchCriteria;
    @XmlElement(name = "Matches")
    protected ArrayOfMatchType matches;
    @XmlElement(name = "Expiry", required = true, type = Integer.class, nillable = true)
    protected Integer expiry;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteriaType }
     *     
     */
    public SearchCriteriaType getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteriaType }
     *     
     */
    public void setSearchCriteria(SearchCriteriaType value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the matches property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMatchType }
     *     
     */
    public ArrayOfMatchType getMatches() {
        return matches;
    }

    /**
     * Sets the value of the matches property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMatchType }
     *     
     */
    public void setMatches(ArrayOfMatchType value) {
        this.matches = value;
    }

    /**
     * Gets the value of the expiry property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiry() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiry(Integer value) {
        this.expiry = value;
    }

}

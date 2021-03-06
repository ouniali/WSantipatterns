
package com.digikey.services.searchws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recordStartPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="options" type="{http://services.digikey.com/SearchWS}SearchOptions"/>
 *         &lt;element name="categories" type="{http://services.digikey.com/SearchWS}ArrayOfInt" minOccurs="0"/>
 *         &lt;element name="families" type="{http://services.digikey.com/SearchWS}ArrayOfInt1" minOccurs="0"/>
 *         &lt;element name="parametricValues" type="{http://services.digikey.com/SearchWS}ArrayOfParametricValue" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expandPackaging" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keywords",
    "recordCount",
    "recordStartPosition",
    "options",
    "categories",
    "families",
    "parametricValues",
    "site",
    "language",
    "expandPackaging"
})
@XmlRootElement(name = "KeywordParametricSearch")
public class KeywordParametricSearch {

    protected String keywords;
    protected int recordCount;
    protected int recordStartPosition;
    @XmlList
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> options;
    protected ArrayOfInt categories;
    protected ArrayOfInt1 families;
    protected ArrayOfParametricValue parametricValues;
    protected String site;
    protected String language;
    protected boolean expandPackaging;

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the recordStartPosition property.
     * 
     */
    public int getRecordStartPosition() {
        return recordStartPosition;
    }

    /**
     * Sets the value of the recordStartPosition property.
     * 
     */
    public void setRecordStartPosition(int value) {
        this.recordStartPosition = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOptions() {
        if (options == null) {
            options = new ArrayList<String>();
        }
        return this.options;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setCategories(ArrayOfInt value) {
        this.categories = value;
    }

    /**
     * Gets the value of the families property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt1 }
     *     
     */
    public ArrayOfInt1 getFamilies() {
        return families;
    }

    /**
     * Sets the value of the families property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt1 }
     *     
     */
    public void setFamilies(ArrayOfInt1 value) {
        this.families = value;
    }

    /**
     * Gets the value of the parametricValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParametricValue }
     *     
     */
    public ArrayOfParametricValue getParametricValues() {
        return parametricValues;
    }

    /**
     * Sets the value of the parametricValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParametricValue }
     *     
     */
    public void setParametricValues(ArrayOfParametricValue value) {
        this.parametricValues = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the expandPackaging property.
     * 
     */
    public boolean isExpandPackaging() {
        return expandPackaging;
    }

    /**
     * Sets the value of the expandPackaging property.
     * 
     */
    public void setExpandPackaging(boolean value) {
        this.expandPackaging = value;
    }

}

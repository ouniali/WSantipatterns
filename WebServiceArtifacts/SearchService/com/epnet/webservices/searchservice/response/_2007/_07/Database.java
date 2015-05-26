
package com.epnet.webservices.searchservice.response._2007._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Database complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Database">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sortOptions" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}ArrayOfSort" minOccurs="0"/>
 *         &lt;element name="dbTags" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}ArrayOfTag" minOccurs="0"/>
 *         &lt;element name="dbIndices" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}ArrayOfIndex" minOccurs="0"/>
 *         &lt;element name="dbFormats" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}ArrayOfFormat" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="longName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dbType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outsideSource" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Database", propOrder = {
    "sortOptions",
    "dbTags",
    "dbIndices",
    "dbFormats"
})
@XmlSeeAlso({
    DatabaseWithAuth.class
})
public class Database {

    protected ArrayOfSort sortOptions;
    protected ArrayOfTag dbTags;
    protected ArrayOfIndex dbIndices;
    protected ArrayOfFormat dbFormats;
    @XmlAttribute(name = "shortName")
    protected String shortName;
    @XmlAttribute(name = "longName")
    protected String longName;
    @XmlAttribute(name = "dbType")
    protected String dbType;
    @XmlAttribute(name = "contentType")
    protected String contentType;
    @XmlAttribute(name = "outsideSource", required = true)
    protected boolean outsideSource;

    /**
     * Gets the value of the sortOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSort }
     *     
     */
    public ArrayOfSort getSortOptions() {
        return sortOptions;
    }

    /**
     * Sets the value of the sortOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSort }
     *     
     */
    public void setSortOptions(ArrayOfSort value) {
        this.sortOptions = value;
    }

    /**
     * Gets the value of the dbTags property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTag }
     *     
     */
    public ArrayOfTag getDbTags() {
        return dbTags;
    }

    /**
     * Sets the value of the dbTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTag }
     *     
     */
    public void setDbTags(ArrayOfTag value) {
        this.dbTags = value;
    }

    /**
     * Gets the value of the dbIndices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndex }
     *     
     */
    public ArrayOfIndex getDbIndices() {
        return dbIndices;
    }

    /**
     * Sets the value of the dbIndices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndex }
     *     
     */
    public void setDbIndices(ArrayOfIndex value) {
        this.dbIndices = value;
    }

    /**
     * Gets the value of the dbFormats property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFormat }
     *     
     */
    public ArrayOfFormat getDbFormats() {
        return dbFormats;
    }

    /**
     * Sets the value of the dbFormats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFormat }
     *     
     */
    public void setDbFormats(ArrayOfFormat value) {
        this.dbFormats = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongName(String value) {
        this.longName = value;
    }

    /**
     * Gets the value of the dbType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbType() {
        return dbType;
    }

    /**
     * Sets the value of the dbType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbType(String value) {
        this.dbType = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the outsideSource property.
     * 
     */
    public boolean isOutsideSource() {
        return outsideSource;
    }

    /**
     * Sets the value of the outsideSource property.
     * 
     */
    public void setOutsideSource(boolean value) {
        this.outsideSource = value;
    }

}

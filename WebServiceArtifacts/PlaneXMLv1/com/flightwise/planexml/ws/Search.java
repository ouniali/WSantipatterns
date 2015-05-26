
package com.flightwise.planexml.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeDynamicInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "query",
    "includeDetails",
    "includeDynamicInfo",
    "page"
})
@XmlRootElement(name = "Search")
public class Search {

    protected String query;
    @XmlElement(name = "IncludeDetails")
    protected boolean includeDetails;
    @XmlElement(name = "IncludeDynamicInfo")
    protected boolean includeDynamicInfo;
    protected long page;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the includeDetails property.
     * 
     */
    public boolean isIncludeDetails() {
        return includeDetails;
    }

    /**
     * Sets the value of the includeDetails property.
     * 
     */
    public void setIncludeDetails(boolean value) {
        this.includeDetails = value;
    }

    /**
     * Gets the value of the includeDynamicInfo property.
     * 
     */
    public boolean isIncludeDynamicInfo() {
        return includeDynamicInfo;
    }

    /**
     * Sets the value of the includeDynamicInfo property.
     * 
     */
    public void setIncludeDynamicInfo(boolean value) {
        this.includeDynamicInfo = value;
    }

    /**
     * Gets the value of the page property.
     * 
     */
    public long getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(long value) {
        this.page = value;
    }

}

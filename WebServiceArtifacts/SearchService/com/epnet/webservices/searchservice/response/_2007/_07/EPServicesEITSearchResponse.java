
package com.epnet.webservices.searchservice.response._2007._07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EP.Services.EIT.SearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EP.Services.EIT.SearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Statistics" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}ArrayOfStatistics" minOccurs="0"/>
 *         &lt;element name="Facets" type="{http://epnet.com/webservices/SearchService/Response/2007/07/}Facets" minOccurs="0"/>
 *         &lt;element name="SearchResults" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EP.Services.EIT.SearchResponse", propOrder = {
    "hits",
    "statistics",
    "facets",
    "searchResults"
})
public class EPServicesEITSearchResponse {

    @XmlElement(name = "Hits")
    protected int hits;
    @XmlElement(name = "Statistics")
    protected ArrayOfStatistics statistics;
    @XmlElement(name = "Facets")
    protected Facets facets;
    @XmlElement(name = "SearchResults")
    protected EPServicesEITSearchResponse.SearchResults searchResults;

    /**
     * Gets the value of the hits property.
     * 
     */
    public int getHits() {
        return hits;
    }

    /**
     * Sets the value of the hits property.
     * 
     */
    public void setHits(int value) {
        this.hits = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStatistics }
     *     
     */
    public ArrayOfStatistics getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStatistics }
     *     
     */
    public void setStatistics(ArrayOfStatistics value) {
        this.statistics = value;
    }

    /**
     * Gets the value of the facets property.
     * 
     * @return
     *     possible object is
     *     {@link Facets }
     *     
     */
    public Facets getFacets() {
        return facets;
    }

    /**
     * Sets the value of the facets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Facets }
     *     
     */
    public void setFacets(Facets value) {
        this.facets = value;
    }

    /**
     * Gets the value of the searchResults property.
     * 
     * @return
     *     possible object is
     *     {@link EPServicesEITSearchResponse.SearchResults }
     *     
     */
    public EPServicesEITSearchResponse.SearchResults getSearchResults() {
        return searchResults;
    }

    /**
     * Sets the value of the searchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPServicesEITSearchResponse.SearchResults }
     *     
     */
    public void setSearchResults(EPServicesEITSearchResponse.SearchResults value) {
        this.searchResults = value;
    }


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
     *         &lt;any/>
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
        "content"
    })
    public static class SearchResults {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<Object> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

    }

}

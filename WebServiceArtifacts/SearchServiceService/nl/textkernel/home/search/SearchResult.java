
package nl.textkernel.home.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchSize" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="hasMoreResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="resultItems" type="{http://home.textkernel.nl/search}resultItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="queryParts" type="{http://home.textkernel.nl/search}queryPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="newQueryParts" type="{http://home.textkernel.nl/search}queryPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isOrCombined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="facetCounts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://home.textkernel.nl/search}itemCountMap" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tagcloud" type="{http://home.textkernel.nl/search}tagcloud" minOccurs="0"/>
 *         &lt;element name="searchEngine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="synonyms">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://home.textkernel.nl/search}synonymSectionArray" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "searchResult", propOrder = {
    "matchSize",
    "hasMoreResults",
    "resultItems",
    "queryParts",
    "newQueryParts",
    "isOrCombined",
    "facetCounts",
    "tagcloud",
    "searchEngine",
    "synonyms"
})
public class SearchResult {

    protected long matchSize;
    protected boolean hasMoreResults;
    @XmlElement(nillable = true)
    protected List<ResultItem> resultItems;
    @XmlElement(nillable = true)
    protected List<QueryPart> queryParts;
    @XmlElement(nillable = true)
    protected List<QueryPart> newQueryParts;
    protected boolean isOrCombined;
    @XmlElement(required = true)
    protected SearchResult.FacetCounts facetCounts;
    protected Tagcloud tagcloud;
    protected String searchEngine;
    @XmlElement(required = true)
    protected SearchResult.Synonyms synonyms;

    /**
     * Gets the value of the matchSize property.
     * 
     */
    public long getMatchSize() {
        return matchSize;
    }

    /**
     * Sets the value of the matchSize property.
     * 
     */
    public void setMatchSize(long value) {
        this.matchSize = value;
    }

    /**
     * Gets the value of the hasMoreResults property.
     * 
     */
    public boolean isHasMoreResults() {
        return hasMoreResults;
    }

    /**
     * Sets the value of the hasMoreResults property.
     * 
     */
    public void setHasMoreResults(boolean value) {
        this.hasMoreResults = value;
    }

    /**
     * Gets the value of the resultItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultItem }
     * 
     * 
     */
    public List<ResultItem> getResultItems() {
        if (resultItems == null) {
            resultItems = new ArrayList<ResultItem>();
        }
        return this.resultItems;
    }

    /**
     * Gets the value of the queryParts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryParts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryPart }
     * 
     * 
     */
    public List<QueryPart> getQueryParts() {
        if (queryParts == null) {
            queryParts = new ArrayList<QueryPart>();
        }
        return this.queryParts;
    }

    /**
     * Gets the value of the newQueryParts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newQueryParts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewQueryParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryPart }
     * 
     * 
     */
    public List<QueryPart> getNewQueryParts() {
        if (newQueryParts == null) {
            newQueryParts = new ArrayList<QueryPart>();
        }
        return this.newQueryParts;
    }

    /**
     * Gets the value of the isOrCombined property.
     * 
     */
    public boolean isIsOrCombined() {
        return isOrCombined;
    }

    /**
     * Sets the value of the isOrCombined property.
     * 
     */
    public void setIsOrCombined(boolean value) {
        this.isOrCombined = value;
    }

    /**
     * Gets the value of the facetCounts property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult.FacetCounts }
     *     
     */
    public SearchResult.FacetCounts getFacetCounts() {
        return facetCounts;
    }

    /**
     * Sets the value of the facetCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult.FacetCounts }
     *     
     */
    public void setFacetCounts(SearchResult.FacetCounts value) {
        this.facetCounts = value;
    }

    /**
     * Gets the value of the tagcloud property.
     * 
     * @return
     *     possible object is
     *     {@link Tagcloud }
     *     
     */
    public Tagcloud getTagcloud() {
        return tagcloud;
    }

    /**
     * Sets the value of the tagcloud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tagcloud }
     *     
     */
    public void setTagcloud(Tagcloud value) {
        this.tagcloud = value;
    }

    /**
     * Gets the value of the searchEngine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchEngine() {
        return searchEngine;
    }

    /**
     * Sets the value of the searchEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchEngine(String value) {
        this.searchEngine = value;
    }

    /**
     * Gets the value of the synonyms property.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult.Synonyms }
     *     
     */
    public SearchResult.Synonyms getSynonyms() {
        return synonyms;
    }

    /**
     * Sets the value of the synonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult.Synonyms }
     *     
     */
    public void setSynonyms(SearchResult.Synonyms value) {
        this.synonyms = value;
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
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://home.textkernel.nl/search}itemCountMap" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class FacetCounts {

        protected List<SearchResult.FacetCounts.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchResult.FacetCounts.Entry }
         * 
         * 
         */
        public List<SearchResult.FacetCounts.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<SearchResult.FacetCounts.Entry>();
            }
            return this.entry;
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
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://home.textkernel.nl/search}itemCountMap" minOccurs="0"/>
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
            "key",
            "value"
        })
        public static class Entry {

            protected String key;
            protected ItemCountMap value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link ItemCountMap }
             *     
             */
            public ItemCountMap getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemCountMap }
             *     
             */
            public void setValue(ItemCountMap value) {
                this.value = value;
            }

        }

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
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://home.textkernel.nl/search}synonymSectionArray" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class Synonyms {

        protected List<SearchResult.Synonyms.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchResult.Synonyms.Entry }
         * 
         * 
         */
        public List<SearchResult.Synonyms.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<SearchResult.Synonyms.Entry>();
            }
            return this.entry;
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
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://home.textkernel.nl/search}synonymSectionArray" minOccurs="0"/>
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
            "key",
            "value"
        })
        public static class Entry {

            protected String key;
            protected SynonymSectionArray value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link SynonymSectionArray }
             *     
             */
            public SynonymSectionArray getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link SynonymSectionArray }
             *     
             */
            public void setValue(SynonymSectionArray value) {
                this.value = value;
            }

        }

    }

}

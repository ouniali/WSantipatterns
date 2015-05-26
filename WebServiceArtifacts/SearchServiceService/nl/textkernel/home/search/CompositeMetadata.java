
package nl.textkernel.home.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compositeMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compositeMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facets" type="{http://home.textkernel.nl/search}facet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="defaultSearcher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searcherMetadata">
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
 *                             &lt;element name="value" type="{http://home.textkernel.nl/search}searcherMetadata" minOccurs="0"/>
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
 *         &lt;element name="fieldNameLabels">
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
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="hasDatabase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasReportingAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasEmailAlerts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasAssessmentAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasEmailAddressesOnToken" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="autoCompleteFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="savingConfig" type="{http://home.textkernel.nl/search}savingConfig" minOccurs="0"/>
 *         &lt;element name="linkNameLabels">
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
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="relevanceLabels" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="headerLinks" type="{http://home.textkernel.nl/search}headerLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasQueryExtractor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasUserLogging" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compositeMetadata", propOrder = {
    "facets",
    "defaultSearcher",
    "searcherMetadata",
    "fieldNameLabels",
    "hasDatabase",
    "hasReportingAccess",
    "hasEmailAlerts",
    "hasAssessmentAccess",
    "hasEmailAddressesOnToken",
    "autoCompleteFields",
    "savingConfig",
    "linkNameLabels",
    "relevanceLabels",
    "headerLinks",
    "hasQueryExtractor",
    "hasUserLogging"
})
public class CompositeMetadata {

    @XmlElement(nillable = true)
    protected List<Facet> facets;
    protected String defaultSearcher;
    @XmlElement(required = true)
    protected CompositeMetadata.SearcherMetadata searcherMetadata;
    @XmlElement(required = true)
    protected CompositeMetadata.FieldNameLabels fieldNameLabels;
    protected boolean hasDatabase;
    protected boolean hasReportingAccess;
    protected boolean hasEmailAlerts;
    protected boolean hasAssessmentAccess;
    protected boolean hasEmailAddressesOnToken;
    @XmlElement(nillable = true)
    protected List<String> autoCompleteFields;
    protected SavingConfig savingConfig;
    @XmlElement(required = true)
    protected CompositeMetadata.LinkNameLabels linkNameLabels;
    @XmlElement(nillable = true)
    protected List<String> relevanceLabels;
    @XmlElement(nillable = true)
    protected List<HeaderLink> headerLinks;
    protected boolean hasQueryExtractor;
    protected boolean hasUserLogging;

    /**
     * Gets the value of the facets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Facet }
     * 
     * 
     */
    public List<Facet> getFacets() {
        if (facets == null) {
            facets = new ArrayList<Facet>();
        }
        return this.facets;
    }

    /**
     * Gets the value of the defaultSearcher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSearcher() {
        return defaultSearcher;
    }

    /**
     * Sets the value of the defaultSearcher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSearcher(String value) {
        this.defaultSearcher = value;
    }

    /**
     * Gets the value of the searcherMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link CompositeMetadata.SearcherMetadata }
     *     
     */
    public CompositeMetadata.SearcherMetadata getSearcherMetadata() {
        return searcherMetadata;
    }

    /**
     * Sets the value of the searcherMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeMetadata.SearcherMetadata }
     *     
     */
    public void setSearcherMetadata(CompositeMetadata.SearcherMetadata value) {
        this.searcherMetadata = value;
    }

    /**
     * Gets the value of the fieldNameLabels property.
     * 
     * @return
     *     possible object is
     *     {@link CompositeMetadata.FieldNameLabels }
     *     
     */
    public CompositeMetadata.FieldNameLabels getFieldNameLabels() {
        return fieldNameLabels;
    }

    /**
     * Sets the value of the fieldNameLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeMetadata.FieldNameLabels }
     *     
     */
    public void setFieldNameLabels(CompositeMetadata.FieldNameLabels value) {
        this.fieldNameLabels = value;
    }

    /**
     * Gets the value of the hasDatabase property.
     * 
     */
    public boolean isHasDatabase() {
        return hasDatabase;
    }

    /**
     * Sets the value of the hasDatabase property.
     * 
     */
    public void setHasDatabase(boolean value) {
        this.hasDatabase = value;
    }

    /**
     * Gets the value of the hasReportingAccess property.
     * 
     */
    public boolean isHasReportingAccess() {
        return hasReportingAccess;
    }

    /**
     * Sets the value of the hasReportingAccess property.
     * 
     */
    public void setHasReportingAccess(boolean value) {
        this.hasReportingAccess = value;
    }

    /**
     * Gets the value of the hasEmailAlerts property.
     * 
     */
    public boolean isHasEmailAlerts() {
        return hasEmailAlerts;
    }

    /**
     * Sets the value of the hasEmailAlerts property.
     * 
     */
    public void setHasEmailAlerts(boolean value) {
        this.hasEmailAlerts = value;
    }

    /**
     * Gets the value of the hasAssessmentAccess property.
     * 
     */
    public boolean isHasAssessmentAccess() {
        return hasAssessmentAccess;
    }

    /**
     * Sets the value of the hasAssessmentAccess property.
     * 
     */
    public void setHasAssessmentAccess(boolean value) {
        this.hasAssessmentAccess = value;
    }

    /**
     * Gets the value of the hasEmailAddressesOnToken property.
     * 
     */
    public boolean isHasEmailAddressesOnToken() {
        return hasEmailAddressesOnToken;
    }

    /**
     * Sets the value of the hasEmailAddressesOnToken property.
     * 
     */
    public void setHasEmailAddressesOnToken(boolean value) {
        this.hasEmailAddressesOnToken = value;
    }

    /**
     * Gets the value of the autoCompleteFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoCompleteFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoCompleteFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAutoCompleteFields() {
        if (autoCompleteFields == null) {
            autoCompleteFields = new ArrayList<String>();
        }
        return this.autoCompleteFields;
    }

    /**
     * Gets the value of the savingConfig property.
     * 
     * @return
     *     possible object is
     *     {@link SavingConfig }
     *     
     */
    public SavingConfig getSavingConfig() {
        return savingConfig;
    }

    /**
     * Sets the value of the savingConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavingConfig }
     *     
     */
    public void setSavingConfig(SavingConfig value) {
        this.savingConfig = value;
    }

    /**
     * Gets the value of the linkNameLabels property.
     * 
     * @return
     *     possible object is
     *     {@link CompositeMetadata.LinkNameLabels }
     *     
     */
    public CompositeMetadata.LinkNameLabels getLinkNameLabels() {
        return linkNameLabels;
    }

    /**
     * Sets the value of the linkNameLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeMetadata.LinkNameLabels }
     *     
     */
    public void setLinkNameLabels(CompositeMetadata.LinkNameLabels value) {
        this.linkNameLabels = value;
    }

    /**
     * Gets the value of the relevanceLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relevanceLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelevanceLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRelevanceLabels() {
        if (relevanceLabels == null) {
            relevanceLabels = new ArrayList<String>();
        }
        return this.relevanceLabels;
    }

    /**
     * Gets the value of the headerLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headerLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaderLink }
     * 
     * 
     */
    public List<HeaderLink> getHeaderLinks() {
        if (headerLinks == null) {
            headerLinks = new ArrayList<HeaderLink>();
        }
        return this.headerLinks;
    }

    /**
     * Gets the value of the hasQueryExtractor property.
     * 
     */
    public boolean isHasQueryExtractor() {
        return hasQueryExtractor;
    }

    /**
     * Sets the value of the hasQueryExtractor property.
     * 
     */
    public void setHasQueryExtractor(boolean value) {
        this.hasQueryExtractor = value;
    }

    /**
     * Gets the value of the hasUserLogging property.
     * 
     */
    public boolean isHasUserLogging() {
        return hasUserLogging;
    }

    /**
     * Sets the value of the hasUserLogging property.
     * 
     */
    public void setHasUserLogging(boolean value) {
        this.hasUserLogging = value;
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
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class FieldNameLabels {

        protected List<CompositeMetadata.FieldNameLabels.Entry> entry;

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
         * {@link CompositeMetadata.FieldNameLabels.Entry }
         * 
         * 
         */
        public List<CompositeMetadata.FieldNameLabels.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<CompositeMetadata.FieldNameLabels.Entry>();
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
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            protected String value;

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
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
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
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class LinkNameLabels {

        protected List<CompositeMetadata.LinkNameLabels.Entry> entry;

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
         * {@link CompositeMetadata.LinkNameLabels.Entry }
         * 
         * 
         */
        public List<CompositeMetadata.LinkNameLabels.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<CompositeMetadata.LinkNameLabels.Entry>();
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
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            protected String value;

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
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
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
     *                   &lt;element name="value" type="{http://home.textkernel.nl/search}searcherMetadata" minOccurs="0"/>
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
    public static class SearcherMetadata {

        protected List<CompositeMetadata.SearcherMetadata.Entry> entry;

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
         * {@link CompositeMetadata.SearcherMetadata.Entry }
         * 
         * 
         */
        public List<CompositeMetadata.SearcherMetadata.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<CompositeMetadata.SearcherMetadata.Entry>();
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
         *         &lt;element name="value" type="{http://home.textkernel.nl/search}searcherMetadata" minOccurs="0"/>
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
            protected nl.textkernel.home.search.SearcherMetadata value;

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
             *     {@link nl.textkernel.home.search.SearcherMetadata }
             *     
             */
            public nl.textkernel.home.search.SearcherMetadata getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link nl.textkernel.home.search.SearcherMetadata }
             *     
             */
            public void setValue(nl.textkernel.home.search.SearcherMetadata value) {
                this.value = value;
            }

        }

    }

}

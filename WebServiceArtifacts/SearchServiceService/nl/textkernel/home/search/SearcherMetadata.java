
package nl.textkernel.home.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searcherMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searcherMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showLabelInTooltip" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultFields" type="{http://home.textkernel.nl/search}resultField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resultFieldLabels">
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
 *         &lt;element name="hasScoring" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasQueryPartScoring" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="documentIdLinks" type="{http://home.textkernel.nl/search}documentIdItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="actionLinks" type="{http://home.textkernel.nl/search}actionItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxDisplayedMatchSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nonApplicableFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nonAutomatic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searcherMetadata", propOrder = {
    "label",
    "shortLabel",
    "showLabelInTooltip",
    "icon",
    "type",
    "resultFields",
    "resultFieldLabels",
    "hasScoring",
    "hasQueryPartScoring",
    "documentIdLinks",
    "actionLinks",
    "pageSize",
    "maxDisplayedMatchSize",
    "nonApplicableFields",
    "nonAutomatic"
})
public class SearcherMetadata {

    protected String label;
    protected String shortLabel;
    protected boolean showLabelInTooltip;
    protected String icon;
    protected String type;
    @XmlElement(nillable = true)
    protected List<ResultField> resultFields;
    @XmlElement(required = true)
    protected SearcherMetadata.ResultFieldLabels resultFieldLabels;
    protected boolean hasScoring;
    protected boolean hasQueryPartScoring;
    @XmlElement(nillable = true)
    protected List<DocumentIdItem> documentIdLinks;
    @XmlElement(nillable = true)
    protected List<ActionItem> actionLinks;
    protected int pageSize;
    protected Integer maxDisplayedMatchSize;
    @XmlElement(nillable = true)
    protected List<String> nonApplicableFields;
    protected boolean nonAutomatic;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the shortLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortLabel() {
        return shortLabel;
    }

    /**
     * Sets the value of the shortLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortLabel(String value) {
        this.shortLabel = value;
    }

    /**
     * Gets the value of the showLabelInTooltip property.
     * 
     */
    public boolean isShowLabelInTooltip() {
        return showLabelInTooltip;
    }

    /**
     * Sets the value of the showLabelInTooltip property.
     * 
     */
    public void setShowLabelInTooltip(boolean value) {
        this.showLabelInTooltip = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the resultFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultField }
     * 
     * 
     */
    public List<ResultField> getResultFields() {
        if (resultFields == null) {
            resultFields = new ArrayList<ResultField>();
        }
        return this.resultFields;
    }

    /**
     * Gets the value of the resultFieldLabels property.
     * 
     * @return
     *     possible object is
     *     {@link SearcherMetadata.ResultFieldLabels }
     *     
     */
    public SearcherMetadata.ResultFieldLabels getResultFieldLabels() {
        return resultFieldLabels;
    }

    /**
     * Sets the value of the resultFieldLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearcherMetadata.ResultFieldLabels }
     *     
     */
    public void setResultFieldLabels(SearcherMetadata.ResultFieldLabels value) {
        this.resultFieldLabels = value;
    }

    /**
     * Gets the value of the hasScoring property.
     * 
     */
    public boolean isHasScoring() {
        return hasScoring;
    }

    /**
     * Sets the value of the hasScoring property.
     * 
     */
    public void setHasScoring(boolean value) {
        this.hasScoring = value;
    }

    /**
     * Gets the value of the hasQueryPartScoring property.
     * 
     */
    public boolean isHasQueryPartScoring() {
        return hasQueryPartScoring;
    }

    /**
     * Sets the value of the hasQueryPartScoring property.
     * 
     */
    public void setHasQueryPartScoring(boolean value) {
        this.hasQueryPartScoring = value;
    }

    /**
     * Gets the value of the documentIdLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentIdLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentIdLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdItem }
     * 
     * 
     */
    public List<DocumentIdItem> getDocumentIdLinks() {
        if (documentIdLinks == null) {
            documentIdLinks = new ArrayList<DocumentIdItem>();
        }
        return this.documentIdLinks;
    }

    /**
     * Gets the value of the actionLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionItem }
     * 
     * 
     */
    public List<ActionItem> getActionLinks() {
        if (actionLinks == null) {
            actionLinks = new ArrayList<ActionItem>();
        }
        return this.actionLinks;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the maxDisplayedMatchSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDisplayedMatchSize() {
        return maxDisplayedMatchSize;
    }

    /**
     * Sets the value of the maxDisplayedMatchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDisplayedMatchSize(Integer value) {
        this.maxDisplayedMatchSize = value;
    }

    /**
     * Gets the value of the nonApplicableFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonApplicableFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonApplicableFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNonApplicableFields() {
        if (nonApplicableFields == null) {
            nonApplicableFields = new ArrayList<String>();
        }
        return this.nonApplicableFields;
    }

    /**
     * Gets the value of the nonAutomatic property.
     * 
     */
    public boolean isNonAutomatic() {
        return nonAutomatic;
    }

    /**
     * Sets the value of the nonAutomatic property.
     * 
     */
    public void setNonAutomatic(boolean value) {
        this.nonAutomatic = value;
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
    public static class ResultFieldLabels {

        protected List<SearcherMetadata.ResultFieldLabels.Entry> entry;

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
         * {@link SearcherMetadata.ResultFieldLabels.Entry }
         * 
         * 
         */
        public List<SearcherMetadata.ResultFieldLabels.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<SearcherMetadata.ResultFieldLabels.Entry>();
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

}

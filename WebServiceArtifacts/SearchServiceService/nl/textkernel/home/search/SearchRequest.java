
package nl.textkernel.home.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryParts" type="{http://home.textkernel.nl/search}queryPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resultOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="provideTagcloud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suppressResultList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="searchEngine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outputLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suppressCorrection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchRequest", propOrder = {
    "query",
    "queryParts",
    "resultOffset",
    "provideTagcloud",
    "suppressResultList",
    "searchEngine",
    "inputLanguage",
    "outputLanguage",
    "suppressCorrection"
})
public class SearchRequest {

    protected String query;
    @XmlElement(nillable = true)
    protected List<QueryPart> queryParts;
    protected Integer resultOffset;
    protected String provideTagcloud;
    protected Boolean suppressResultList;
    protected String searchEngine;
    protected String inputLanguage;
    protected String outputLanguage;
    protected Boolean suppressCorrection;

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
     * Gets the value of the resultOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultOffset() {
        return resultOffset;
    }

    /**
     * Sets the value of the resultOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultOffset(Integer value) {
        this.resultOffset = value;
    }

    /**
     * Gets the value of the provideTagcloud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvideTagcloud() {
        return provideTagcloud;
    }

    /**
     * Sets the value of the provideTagcloud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvideTagcloud(String value) {
        this.provideTagcloud = value;
    }

    /**
     * Gets the value of the suppressResultList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressResultList() {
        return suppressResultList;
    }

    /**
     * Sets the value of the suppressResultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressResultList(Boolean value) {
        this.suppressResultList = value;
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
     * Gets the value of the inputLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputLanguage() {
        return inputLanguage;
    }

    /**
     * Sets the value of the inputLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputLanguage(String value) {
        this.inputLanguage = value;
    }

    /**
     * Gets the value of the outputLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputLanguage() {
        return outputLanguage;
    }

    /**
     * Sets the value of the outputLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputLanguage(String value) {
        this.outputLanguage = value;
    }

    /**
     * Gets the value of the suppressCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressCorrection() {
        return suppressCorrection;
    }

    /**
     * Sets the value of the suppressCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressCorrection(Boolean value) {
        this.suppressCorrection = value;
    }

}

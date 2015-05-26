
package com.epnet.webservices.searchservice._2007._07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthoritySearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthoritySearchRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epnet.com/webservices/SearchService/2007/07/}Request">
 *       &lt;sequence>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartingRecordNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberRecordsReturned" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SearchMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Authority_x0020_Database" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthoritySearchRequest", propOrder = {
    "query",
    "startingRecordNumber",
    "numberRecordsReturned",
    "searchMode",
    "authorityX0020Database",
    "recordFormat",
    "sort"
})
public class AuthoritySearchRequest
    extends Request
{

    @XmlElement(name = "Query")
    protected String query;
    @XmlElement(name = "StartingRecordNumber", defaultValue = "1")
    protected Integer startingRecordNumber;
    @XmlElement(name = "NumberRecordsReturned", defaultValue = "10")
    protected Integer numberRecordsReturned;
    @XmlElement(name = "SearchMode", defaultValue = "relevancy")
    protected String searchMode;
    @XmlElement(name = "Authority_x0020_Database")
    protected String authorityX0020Database;
    @XmlElement(name = "RecordFormat", defaultValue = "list")
    protected String recordFormat;
    @XmlElement(name = "Sort")
    protected String sort;

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
     * Gets the value of the startingRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartingRecordNumber() {
        return startingRecordNumber;
    }

    /**
     * Sets the value of the startingRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartingRecordNumber(Integer value) {
        this.startingRecordNumber = value;
    }

    /**
     * Gets the value of the numberRecordsReturned property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberRecordsReturned() {
        return numberRecordsReturned;
    }

    /**
     * Sets the value of the numberRecordsReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberRecordsReturned(Integer value) {
        this.numberRecordsReturned = value;
    }

    /**
     * Gets the value of the searchMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchMode() {
        return searchMode;
    }

    /**
     * Sets the value of the searchMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchMode(String value) {
        this.searchMode = value;
    }

    /**
     * Gets the value of the authorityX0020Database property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityX0020Database() {
        return authorityX0020Database;
    }

    /**
     * Sets the value of the authorityX0020Database property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityX0020Database(String value) {
        this.authorityX0020Database = value;
    }

    /**
     * Gets the value of the recordFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordFormat() {
        return recordFormat;
    }

    /**
     * Sets the value of the recordFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordFormat(String value) {
        this.recordFormat = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort(String value) {
        this.sort = value;
    }

}


package com.epnet.webservices.searchservice._2007._07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://epnet.com/webservices/SearchService/2007/07/}Request">
 *       &lt;sequence>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartingRecordNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberRecordsReturned" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Sort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Databases" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecordFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordsDataSubSet" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Clusters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRequest", propOrder = {
    "query",
    "startingRecordNumber",
    "numberRecordsReturned",
    "sort",
    "databases",
    "recordFormat",
    "recordsDataSubSet",
    "orgID",
    "clusters"
})
public class SearchRequest
    extends Request
{

    @XmlElement(name = "Query")
    protected String query;
    @XmlElement(name = "StartingRecordNumber", defaultValue = "1")
    protected Integer startingRecordNumber;
    @XmlElement(name = "NumberRecordsReturned", defaultValue = "10")
    protected Integer numberRecordsReturned;
    @XmlElement(name = "Sort", defaultValue = "date")
    protected String sort;
    @XmlElement(name = "Databases")
    protected List<String> databases;
    @XmlElement(name = "RecordFormat", defaultValue = "brief")
    protected String recordFormat;
    @XmlElement(name = "RecordsDataSubSet")
    protected List<String> recordsDataSubSet;
    @XmlElement(name = "OrgID")
    protected String orgID;
    @XmlElement(name = "Clusters", defaultValue = "false")
    protected Boolean clusters;

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

    /**
     * Gets the value of the databases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the databases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatabases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDatabases() {
        if (databases == null) {
            databases = new ArrayList<String>();
        }
        return this.databases;
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
     * Gets the value of the recordsDataSubSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordsDataSubSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordsDataSubSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecordsDataSubSet() {
        if (recordsDataSubSet == null) {
            recordsDataSubSet = new ArrayList<String>();
        }
        return this.recordsDataSubSet;
    }

    /**
     * Gets the value of the orgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgID() {
        return orgID;
    }

    /**
     * Sets the value of the orgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgID(String value) {
        this.orgID = value;
    }

    /**
     * Gets the value of the clusters property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClusters() {
        return clusters;
    }

    /**
     * Sets the value of the clusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClusters(Boolean value) {
        this.clusters = value;
    }

}

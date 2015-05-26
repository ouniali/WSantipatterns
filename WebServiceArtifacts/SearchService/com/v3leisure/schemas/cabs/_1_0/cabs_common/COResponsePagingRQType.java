
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO_ResponsePagingRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CO_ResponsePagingRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="records_per_page" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="page_to_return" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="query_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CO_ResponsePagingRQType")
public class COResponsePagingRQType {

    @XmlAttribute(name = "records_per_page", required = true)
    protected int recordsPerPage;
    @XmlAttribute(name = "page_to_return", required = true)
    protected int pageToReturn;
    @XmlAttribute(name = "query_id")
    protected String queryId;

    /**
     * Gets the value of the recordsPerPage property.
     * 
     */
    public int getRecordsPerPage() {
        return recordsPerPage;
    }

    /**
     * Sets the value of the recordsPerPage property.
     * 
     */
    public void setRecordsPerPage(int value) {
        this.recordsPerPage = value;
    }

    /**
     * Gets the value of the pageToReturn property.
     * 
     */
    public int getPageToReturn() {
        return pageToReturn;
    }

    /**
     * Sets the value of the pageToReturn property.
     * 
     */
    public void setPageToReturn(int value) {
        this.pageToReturn = value;
    }

    /**
     * Gets the value of the queryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryId() {
        return queryId;
    }

    /**
     * Sets the value of the queryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryId(String value) {
        this.queryId = value;
    }

}

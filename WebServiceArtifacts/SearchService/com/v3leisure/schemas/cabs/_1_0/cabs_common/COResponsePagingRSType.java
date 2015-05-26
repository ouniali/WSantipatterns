
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CO_ResponsePagingRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CO_ResponsePagingRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="records_matched" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="records_per_page" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="page_returned" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="query_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="query_timeout_utc" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CO_ResponsePagingRSType")
public class COResponsePagingRSType {

    @XmlAttribute(name = "records_matched", required = true)
    protected int recordsMatched;
    @XmlAttribute(name = "records_per_page", required = true)
    protected int recordsPerPage;
    @XmlAttribute(name = "page_returned", required = true)
    protected int pageReturned;
    @XmlAttribute(name = "query_id")
    protected String queryId;
    @XmlAttribute(name = "query_timeout_utc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar queryTimeoutUtc;

    /**
     * Gets the value of the recordsMatched property.
     * 
     */
    public int getRecordsMatched() {
        return recordsMatched;
    }

    /**
     * Sets the value of the recordsMatched property.
     * 
     */
    public void setRecordsMatched(int value) {
        this.recordsMatched = value;
    }

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
     * Gets the value of the pageReturned property.
     * 
     */
    public int getPageReturned() {
        return pageReturned;
    }

    /**
     * Sets the value of the pageReturned property.
     * 
     */
    public void setPageReturned(int value) {
        this.pageReturned = value;
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

    /**
     * Gets the value of the queryTimeoutUtc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQueryTimeoutUtc() {
        return queryTimeoutUtc;
    }

    /**
     * Sets the value of the queryTimeoutUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQueryTimeoutUtc(XMLGregorianCalendar value) {
        this.queryTimeoutUtc = value;
    }

}

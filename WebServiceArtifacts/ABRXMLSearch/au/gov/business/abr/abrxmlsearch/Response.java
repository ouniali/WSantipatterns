
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usageStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateRegisterLastUpdated" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dateTimeRetrieved" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;choice>
 *           &lt;element name="businessEntity200506" type="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBusinessEntity200506" minOccurs="0"/>
 *           &lt;element name="abnList" type="{http://abr.business.gov.au/ABRXMLSearch/}ResponseABNList" minOccurs="0"/>
 *           &lt;element name="businessEntity201408" type="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBusinessEntity201408" minOccurs="0"/>
 *           &lt;element name="businessEntity201205" type="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBusinessEntity201205" minOccurs="0"/>
 *           &lt;element name="businessEntity200709" type="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBusinessEntity200709" minOccurs="0"/>
 *           &lt;element name="exception" type="{http://abr.business.gov.au/ABRXMLSearch/}ResponseException" minOccurs="0"/>
 *           &lt;element name="businessEntity" type="{http://abr.business.gov.au/ABRXMLSearch/}ResponseBusinessEntity" minOccurs="0"/>
 *           &lt;element name="searchResultsList" type="{http://abr.business.gov.au/ABRXMLSearch/}ResponseSearchResultsList" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "usageStatement",
    "dateRegisterLastUpdated",
    "dateTimeRetrieved",
    "businessEntity200506",
    "abnList",
    "businessEntity201408",
    "businessEntity201205",
    "businessEntity200709",
    "exception",
    "businessEntity",
    "searchResultsList"
})
public class Response {

    protected String usageStatement;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateRegisterLastUpdated;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeRetrieved;
    protected ResponseBusinessEntity200506 businessEntity200506;
    protected ResponseABNList abnList;
    protected ResponseBusinessEntity201408 businessEntity201408;
    protected ResponseBusinessEntity201205 businessEntity201205;
    protected ResponseBusinessEntity200709 businessEntity200709;
    protected ResponseException exception;
    protected ResponseBusinessEntity businessEntity;
    protected ResponseSearchResultsList searchResultsList;

    /**
     * Gets the value of the usageStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageStatement() {
        return usageStatement;
    }

    /**
     * Sets the value of the usageStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageStatement(String value) {
        this.usageStatement = value;
    }

    /**
     * Gets the value of the dateRegisterLastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRegisterLastUpdated() {
        return dateRegisterLastUpdated;
    }

    /**
     * Sets the value of the dateRegisterLastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRegisterLastUpdated(XMLGregorianCalendar value) {
        this.dateRegisterLastUpdated = value;
    }

    /**
     * Gets the value of the dateTimeRetrieved property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeRetrieved() {
        return dateTimeRetrieved;
    }

    /**
     * Sets the value of the dateTimeRetrieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeRetrieved(XMLGregorianCalendar value) {
        this.dateTimeRetrieved = value;
    }

    /**
     * Gets the value of the businessEntity200506 property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBusinessEntity200506 }
     *     
     */
    public ResponseBusinessEntity200506 getBusinessEntity200506() {
        return businessEntity200506;
    }

    /**
     * Sets the value of the businessEntity200506 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBusinessEntity200506 }
     *     
     */
    public void setBusinessEntity200506(ResponseBusinessEntity200506 value) {
        this.businessEntity200506 = value;
    }

    /**
     * Gets the value of the abnList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseABNList }
     *     
     */
    public ResponseABNList getAbnList() {
        return abnList;
    }

    /**
     * Sets the value of the abnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseABNList }
     *     
     */
    public void setAbnList(ResponseABNList value) {
        this.abnList = value;
    }

    /**
     * Gets the value of the businessEntity201408 property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBusinessEntity201408 }
     *     
     */
    public ResponseBusinessEntity201408 getBusinessEntity201408() {
        return businessEntity201408;
    }

    /**
     * Sets the value of the businessEntity201408 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBusinessEntity201408 }
     *     
     */
    public void setBusinessEntity201408(ResponseBusinessEntity201408 value) {
        this.businessEntity201408 = value;
    }

    /**
     * Gets the value of the businessEntity201205 property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBusinessEntity201205 }
     *     
     */
    public ResponseBusinessEntity201205 getBusinessEntity201205() {
        return businessEntity201205;
    }

    /**
     * Sets the value of the businessEntity201205 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBusinessEntity201205 }
     *     
     */
    public void setBusinessEntity201205(ResponseBusinessEntity201205 value) {
        this.businessEntity201205 = value;
    }

    /**
     * Gets the value of the businessEntity200709 property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBusinessEntity200709 }
     *     
     */
    public ResponseBusinessEntity200709 getBusinessEntity200709() {
        return businessEntity200709;
    }

    /**
     * Sets the value of the businessEntity200709 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBusinessEntity200709 }
     *     
     */
    public void setBusinessEntity200709(ResponseBusinessEntity200709 value) {
        this.businessEntity200709 = value;
    }

    /**
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseException }
     *     
     */
    public ResponseException getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseException }
     *     
     */
    public void setException(ResponseException value) {
        this.exception = value;
    }

    /**
     * Gets the value of the businessEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBusinessEntity }
     *     
     */
    public ResponseBusinessEntity getBusinessEntity() {
        return businessEntity;
    }

    /**
     * Sets the value of the businessEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBusinessEntity }
     *     
     */
    public void setBusinessEntity(ResponseBusinessEntity value) {
        this.businessEntity = value;
    }

    /**
     * Gets the value of the searchResultsList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseSearchResultsList }
     *     
     */
    public ResponseSearchResultsList getSearchResultsList() {
        return searchResultsList;
    }

    /**
     * Sets the value of the searchResultsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseSearchResultsList }
     *     
     */
    public void setSearchResultsList(ResponseSearchResultsList value) {
        this.searchResultsList = value;
    }

}

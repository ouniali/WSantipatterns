
package au.gov.business.abr.abrxmlsearch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="nameSearchRequestAdvanced2006" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestNameSearchAdvanced2006" minOccurs="0"/>
 *           &lt;element name="externalRequestABNCharityFilter" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestABNCharityFilter" minOccurs="0"/>
 *           &lt;element name="externalRequestABNUpdateEventFilter" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestABNUpdateEventFilter" minOccurs="0"/>
 *           &lt;element name="nameSearchRequestAdvanced" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestNameSearchAdvanced" minOccurs="0"/>
 *           &lt;element name="externalRequestABNStatusFilter" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestABNStatusFilter" minOccurs="0"/>
 *           &lt;element name="nameSearchRequestAdvanced2012" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestNameSearchAdvanced2012" minOccurs="0"/>
 *           &lt;element name="identifierSearchRequest" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestIdentifierSearch" minOccurs="0"/>
 *           &lt;element name="externalRequestABNEventFilter" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestABNEventFilter" minOccurs="0"/>
 *           &lt;element name="externalRequestABNFilter" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestABNFilter" minOccurs="0"/>
 *           &lt;element name="nameSearchRequest" type="{http://abr.business.gov.au/ABRXMLSearch/}ExternalRequestNameSearch" minOccurs="0"/>
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
@XmlType(name = "ExternalRequest", propOrder = {
    "nameSearchRequestAdvanced2006",
    "externalRequestABNCharityFilter",
    "externalRequestABNUpdateEventFilter",
    "nameSearchRequestAdvanced",
    "externalRequestABNStatusFilter",
    "nameSearchRequestAdvanced2012",
    "identifierSearchRequest",
    "externalRequestABNEventFilter",
    "externalRequestABNFilter",
    "nameSearchRequest"
})
@XmlSeeAlso({
    ExternalRequestNameSearchAdvanced2012 .class,
    ExternalRequestNameSearch.class,
    ExternalRequestIdentifierSearch.class,
    ExternalRequestABNFilter.class
})
public class ExternalRequest {

    protected ExternalRequestNameSearchAdvanced2006 nameSearchRequestAdvanced2006;
    protected ExternalRequestABNCharityFilter externalRequestABNCharityFilter;
    protected ExternalRequestABNUpdateEventFilter externalRequestABNUpdateEventFilter;
    protected ExternalRequestNameSearchAdvanced nameSearchRequestAdvanced;
    protected ExternalRequestABNStatusFilter externalRequestABNStatusFilter;
    protected ExternalRequestNameSearchAdvanced2012 nameSearchRequestAdvanced2012;
    protected ExternalRequestIdentifierSearch identifierSearchRequest;
    protected ExternalRequestABNEventFilter externalRequestABNEventFilter;
    protected ExternalRequestABNFilter externalRequestABNFilter;
    protected ExternalRequestNameSearch nameSearchRequest;

    /**
     * Gets the value of the nameSearchRequestAdvanced2006 property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestNameSearchAdvanced2006 }
     *     
     */
    public ExternalRequestNameSearchAdvanced2006 getNameSearchRequestAdvanced2006() {
        return nameSearchRequestAdvanced2006;
    }

    /**
     * Sets the value of the nameSearchRequestAdvanced2006 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestNameSearchAdvanced2006 }
     *     
     */
    public void setNameSearchRequestAdvanced2006(ExternalRequestNameSearchAdvanced2006 value) {
        this.nameSearchRequestAdvanced2006 = value;
    }

    /**
     * Gets the value of the externalRequestABNCharityFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestABNCharityFilter }
     *     
     */
    public ExternalRequestABNCharityFilter getExternalRequestABNCharityFilter() {
        return externalRequestABNCharityFilter;
    }

    /**
     * Sets the value of the externalRequestABNCharityFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestABNCharityFilter }
     *     
     */
    public void setExternalRequestABNCharityFilter(ExternalRequestABNCharityFilter value) {
        this.externalRequestABNCharityFilter = value;
    }

    /**
     * Gets the value of the externalRequestABNUpdateEventFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestABNUpdateEventFilter }
     *     
     */
    public ExternalRequestABNUpdateEventFilter getExternalRequestABNUpdateEventFilter() {
        return externalRequestABNUpdateEventFilter;
    }

    /**
     * Sets the value of the externalRequestABNUpdateEventFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestABNUpdateEventFilter }
     *     
     */
    public void setExternalRequestABNUpdateEventFilter(ExternalRequestABNUpdateEventFilter value) {
        this.externalRequestABNUpdateEventFilter = value;
    }

    /**
     * Gets the value of the nameSearchRequestAdvanced property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestNameSearchAdvanced }
     *     
     */
    public ExternalRequestNameSearchAdvanced getNameSearchRequestAdvanced() {
        return nameSearchRequestAdvanced;
    }

    /**
     * Sets the value of the nameSearchRequestAdvanced property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestNameSearchAdvanced }
     *     
     */
    public void setNameSearchRequestAdvanced(ExternalRequestNameSearchAdvanced value) {
        this.nameSearchRequestAdvanced = value;
    }

    /**
     * Gets the value of the externalRequestABNStatusFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestABNStatusFilter }
     *     
     */
    public ExternalRequestABNStatusFilter getExternalRequestABNStatusFilter() {
        return externalRequestABNStatusFilter;
    }

    /**
     * Sets the value of the externalRequestABNStatusFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestABNStatusFilter }
     *     
     */
    public void setExternalRequestABNStatusFilter(ExternalRequestABNStatusFilter value) {
        this.externalRequestABNStatusFilter = value;
    }

    /**
     * Gets the value of the nameSearchRequestAdvanced2012 property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestNameSearchAdvanced2012 }
     *     
     */
    public ExternalRequestNameSearchAdvanced2012 getNameSearchRequestAdvanced2012() {
        return nameSearchRequestAdvanced2012;
    }

    /**
     * Sets the value of the nameSearchRequestAdvanced2012 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestNameSearchAdvanced2012 }
     *     
     */
    public void setNameSearchRequestAdvanced2012(ExternalRequestNameSearchAdvanced2012 value) {
        this.nameSearchRequestAdvanced2012 = value;
    }

    /**
     * Gets the value of the identifierSearchRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestIdentifierSearch }
     *     
     */
    public ExternalRequestIdentifierSearch getIdentifierSearchRequest() {
        return identifierSearchRequest;
    }

    /**
     * Sets the value of the identifierSearchRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestIdentifierSearch }
     *     
     */
    public void setIdentifierSearchRequest(ExternalRequestIdentifierSearch value) {
        this.identifierSearchRequest = value;
    }

    /**
     * Gets the value of the externalRequestABNEventFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestABNEventFilter }
     *     
     */
    public ExternalRequestABNEventFilter getExternalRequestABNEventFilter() {
        return externalRequestABNEventFilter;
    }

    /**
     * Sets the value of the externalRequestABNEventFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestABNEventFilter }
     *     
     */
    public void setExternalRequestABNEventFilter(ExternalRequestABNEventFilter value) {
        this.externalRequestABNEventFilter = value;
    }

    /**
     * Gets the value of the externalRequestABNFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestABNFilter }
     *     
     */
    public ExternalRequestABNFilter getExternalRequestABNFilter() {
        return externalRequestABNFilter;
    }

    /**
     * Sets the value of the externalRequestABNFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestABNFilter }
     *     
     */
    public void setExternalRequestABNFilter(ExternalRequestABNFilter value) {
        this.externalRequestABNFilter = value;
    }

    /**
     * Gets the value of the nameSearchRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalRequestNameSearch }
     *     
     */
    public ExternalRequestNameSearch getNameSearchRequest() {
        return nameSearchRequest;
    }

    /**
     * Sets the value of the nameSearchRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalRequestNameSearch }
     *     
     */
    public void setNameSearchRequest(ExternalRequestNameSearch value) {
        this.nameSearchRequest = value;
    }

}


package com.v3leisure.schemas.cabs._1_0.cabs_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PS_QueryRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PS_QueryRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchGroup" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_SearchCriteriaGroupRQType" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaOptin" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_OptInRQType" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaChanged" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_ChangedRQType" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaProviderType" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_ProviderRQType" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaStatusType" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_StatusRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaMaximumCapacity" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_MinimumMaximumExactRQType" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaMinimumDuration" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_MinimumMaximumExactRQType" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaIndustryCategory" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_IndustryCategoryRQType" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaIndustryCategoryGroup" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_IndustryCategoryGroupRQType" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaIntegrationType" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_IntegrationTypeRQType" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaIncludeTestProviders" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_BooleanRQType" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaCreditCardAccepted" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_IdRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaBookability" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_BookabilityRQType" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaMinimumGuidePrice" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_MinimumMaximumExactRQType" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaMaximumGuidePrice" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_MinimumMaximumExactRQType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="paging_sort_method" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_PagingQuerySortEnumType" />
 *       &lt;attribute name="paging_records_per_page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PS_QueryRQType", propOrder = {
    "searchGroup",
    "searchCriteriaOptin",
    "searchCriteriaChanged",
    "searchCriteriaProviderType",
    "searchCriteriaStatusType",
    "searchCriteriaMaximumCapacity",
    "searchCriteriaMinimumDuration",
    "searchCriteriaIndustryCategory",
    "searchCriteriaIndustryCategoryGroup",
    "searchCriteriaIntegrationType",
    "searchCriteriaIncludeTestProviders",
    "searchCriteriaCreditCardAccepted",
    "searchCriteriaBookability",
    "searchCriteriaMinimumGuidePrice",
    "searchCriteriaMaximumGuidePrice"
})
public class PSQueryRQType {

    @XmlElement(name = "SearchGroup")
    protected PSSearchCriteriaGroupRQType searchGroup;
    @XmlElement(name = "SearchCriteriaOptin")
    protected SCOptInRQType searchCriteriaOptin;
    @XmlElement(name = "SearchCriteriaChanged")
    protected SCChangedRQType searchCriteriaChanged;
    @XmlElement(name = "SearchCriteriaProviderType")
    protected SCProviderRQType searchCriteriaProviderType;
    @XmlElement(name = "SearchCriteriaStatusType")
    protected List<SCStatusRQType> searchCriteriaStatusType;
    @XmlElement(name = "SearchCriteriaMaximumCapacity")
    protected SCMinimumMaximumExactRQType searchCriteriaMaximumCapacity;
    @XmlElement(name = "SearchCriteriaMinimumDuration")
    protected SCMinimumMaximumExactRQType searchCriteriaMinimumDuration;
    @XmlElement(name = "SearchCriteriaIndustryCategory")
    protected SCIndustryCategoryRQType searchCriteriaIndustryCategory;
    @XmlElement(name = "SearchCriteriaIndustryCategoryGroup")
    protected SCIndustryCategoryGroupRQType searchCriteriaIndustryCategoryGroup;
    @XmlElement(name = "SearchCriteriaIntegrationType")
    protected SCIntegrationTypeRQType searchCriteriaIntegrationType;
    @XmlElement(name = "SearchCriteriaIncludeTestProviders")
    protected SCBooleanRQType searchCriteriaIncludeTestProviders;
    @XmlElement(name = "SearchCriteriaCreditCardAccepted")
    protected List<SCIdRQType> searchCriteriaCreditCardAccepted;
    @XmlElement(name = "SearchCriteriaBookability")
    protected SCBookabilityRQType searchCriteriaBookability;
    @XmlElement(name = "SearchCriteriaMinimumGuidePrice")
    protected SCMinimumMaximumExactRQType searchCriteriaMinimumGuidePrice;
    @XmlElement(name = "SearchCriteriaMaximumGuidePrice")
    protected SCMinimumMaximumExactRQType searchCriteriaMaximumGuidePrice;
    @XmlAttribute(name = "paging_sort_method")
    protected COPagingQuerySortEnumType pagingSortMethod;
    @XmlAttribute(name = "paging_records_per_page")
    protected Integer pagingRecordsPerPage;

    /**
     * Gets the value of the searchGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PSSearchCriteriaGroupRQType }
     *     
     */
    public PSSearchCriteriaGroupRQType getSearchGroup() {
        return searchGroup;
    }

    /**
     * Sets the value of the searchGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSSearchCriteriaGroupRQType }
     *     
     */
    public void setSearchGroup(PSSearchCriteriaGroupRQType value) {
        this.searchGroup = value;
    }

    /**
     * Gets the value of the searchCriteriaOptin property.
     * 
     * @return
     *     possible object is
     *     {@link SCOptInRQType }
     *     
     */
    public SCOptInRQType getSearchCriteriaOptin() {
        return searchCriteriaOptin;
    }

    /**
     * Sets the value of the searchCriteriaOptin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCOptInRQType }
     *     
     */
    public void setSearchCriteriaOptin(SCOptInRQType value) {
        this.searchCriteriaOptin = value;
    }

    /**
     * Gets the value of the searchCriteriaChanged property.
     * 
     * @return
     *     possible object is
     *     {@link SCChangedRQType }
     *     
     */
    public SCChangedRQType getSearchCriteriaChanged() {
        return searchCriteriaChanged;
    }

    /**
     * Sets the value of the searchCriteriaChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCChangedRQType }
     *     
     */
    public void setSearchCriteriaChanged(SCChangedRQType value) {
        this.searchCriteriaChanged = value;
    }

    /**
     * Gets the value of the searchCriteriaProviderType property.
     * 
     * @return
     *     possible object is
     *     {@link SCProviderRQType }
     *     
     */
    public SCProviderRQType getSearchCriteriaProviderType() {
        return searchCriteriaProviderType;
    }

    /**
     * Sets the value of the searchCriteriaProviderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCProviderRQType }
     *     
     */
    public void setSearchCriteriaProviderType(SCProviderRQType value) {
        this.searchCriteriaProviderType = value;
    }

    /**
     * Gets the value of the searchCriteriaStatusType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaStatusType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaStatusType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCStatusRQType }
     * 
     * 
     */
    public List<SCStatusRQType> getSearchCriteriaStatusType() {
        if (searchCriteriaStatusType == null) {
            searchCriteriaStatusType = new ArrayList<SCStatusRQType>();
        }
        return this.searchCriteriaStatusType;
    }

    /**
     * Gets the value of the searchCriteriaMaximumCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link SCMinimumMaximumExactRQType }
     *     
     */
    public SCMinimumMaximumExactRQType getSearchCriteriaMaximumCapacity() {
        return searchCriteriaMaximumCapacity;
    }

    /**
     * Sets the value of the searchCriteriaMaximumCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCMinimumMaximumExactRQType }
     *     
     */
    public void setSearchCriteriaMaximumCapacity(SCMinimumMaximumExactRQType value) {
        this.searchCriteriaMaximumCapacity = value;
    }

    /**
     * Gets the value of the searchCriteriaMinimumDuration property.
     * 
     * @return
     *     possible object is
     *     {@link SCMinimumMaximumExactRQType }
     *     
     */
    public SCMinimumMaximumExactRQType getSearchCriteriaMinimumDuration() {
        return searchCriteriaMinimumDuration;
    }

    /**
     * Sets the value of the searchCriteriaMinimumDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCMinimumMaximumExactRQType }
     *     
     */
    public void setSearchCriteriaMinimumDuration(SCMinimumMaximumExactRQType value) {
        this.searchCriteriaMinimumDuration = value;
    }

    /**
     * Gets the value of the searchCriteriaIndustryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SCIndustryCategoryRQType }
     *     
     */
    public SCIndustryCategoryRQType getSearchCriteriaIndustryCategory() {
        return searchCriteriaIndustryCategory;
    }

    /**
     * Sets the value of the searchCriteriaIndustryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCIndustryCategoryRQType }
     *     
     */
    public void setSearchCriteriaIndustryCategory(SCIndustryCategoryRQType value) {
        this.searchCriteriaIndustryCategory = value;
    }

    /**
     * Gets the value of the searchCriteriaIndustryCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SCIndustryCategoryGroupRQType }
     *     
     */
    public SCIndustryCategoryGroupRQType getSearchCriteriaIndustryCategoryGroup() {
        return searchCriteriaIndustryCategoryGroup;
    }

    /**
     * Sets the value of the searchCriteriaIndustryCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCIndustryCategoryGroupRQType }
     *     
     */
    public void setSearchCriteriaIndustryCategoryGroup(SCIndustryCategoryGroupRQType value) {
        this.searchCriteriaIndustryCategoryGroup = value;
    }

    /**
     * Gets the value of the searchCriteriaIntegrationType property.
     * 
     * @return
     *     possible object is
     *     {@link SCIntegrationTypeRQType }
     *     
     */
    public SCIntegrationTypeRQType getSearchCriteriaIntegrationType() {
        return searchCriteriaIntegrationType;
    }

    /**
     * Sets the value of the searchCriteriaIntegrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCIntegrationTypeRQType }
     *     
     */
    public void setSearchCriteriaIntegrationType(SCIntegrationTypeRQType value) {
        this.searchCriteriaIntegrationType = value;
    }

    /**
     * Gets the value of the searchCriteriaIncludeTestProviders property.
     * 
     * @return
     *     possible object is
     *     {@link SCBooleanRQType }
     *     
     */
    public SCBooleanRQType getSearchCriteriaIncludeTestProviders() {
        return searchCriteriaIncludeTestProviders;
    }

    /**
     * Sets the value of the searchCriteriaIncludeTestProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCBooleanRQType }
     *     
     */
    public void setSearchCriteriaIncludeTestProviders(SCBooleanRQType value) {
        this.searchCriteriaIncludeTestProviders = value;
    }

    /**
     * Gets the value of the searchCriteriaCreditCardAccepted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaCreditCardAccepted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaCreditCardAccepted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCIdRQType }
     * 
     * 
     */
    public List<SCIdRQType> getSearchCriteriaCreditCardAccepted() {
        if (searchCriteriaCreditCardAccepted == null) {
            searchCriteriaCreditCardAccepted = new ArrayList<SCIdRQType>();
        }
        return this.searchCriteriaCreditCardAccepted;
    }

    /**
     * Gets the value of the searchCriteriaBookability property.
     * 
     * @return
     *     possible object is
     *     {@link SCBookabilityRQType }
     *     
     */
    public SCBookabilityRQType getSearchCriteriaBookability() {
        return searchCriteriaBookability;
    }

    /**
     * Sets the value of the searchCriteriaBookability property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCBookabilityRQType }
     *     
     */
    public void setSearchCriteriaBookability(SCBookabilityRQType value) {
        this.searchCriteriaBookability = value;
    }

    /**
     * Gets the value of the searchCriteriaMinimumGuidePrice property.
     * 
     * @return
     *     possible object is
     *     {@link SCMinimumMaximumExactRQType }
     *     
     */
    public SCMinimumMaximumExactRQType getSearchCriteriaMinimumGuidePrice() {
        return searchCriteriaMinimumGuidePrice;
    }

    /**
     * Sets the value of the searchCriteriaMinimumGuidePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCMinimumMaximumExactRQType }
     *     
     */
    public void setSearchCriteriaMinimumGuidePrice(SCMinimumMaximumExactRQType value) {
        this.searchCriteriaMinimumGuidePrice = value;
    }

    /**
     * Gets the value of the searchCriteriaMaximumGuidePrice property.
     * 
     * @return
     *     possible object is
     *     {@link SCMinimumMaximumExactRQType }
     *     
     */
    public SCMinimumMaximumExactRQType getSearchCriteriaMaximumGuidePrice() {
        return searchCriteriaMaximumGuidePrice;
    }

    /**
     * Sets the value of the searchCriteriaMaximumGuidePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCMinimumMaximumExactRQType }
     *     
     */
    public void setSearchCriteriaMaximumGuidePrice(SCMinimumMaximumExactRQType value) {
        this.searchCriteriaMaximumGuidePrice = value;
    }

    /**
     * Gets the value of the pagingSortMethod property.
     * 
     * @return
     *     possible object is
     *     {@link COPagingQuerySortEnumType }
     *     
     */
    public COPagingQuerySortEnumType getPagingSortMethod() {
        return pagingSortMethod;
    }

    /**
     * Sets the value of the pagingSortMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link COPagingQuerySortEnumType }
     *     
     */
    public void setPagingSortMethod(COPagingQuerySortEnumType value) {
        this.pagingSortMethod = value;
    }

    /**
     * Gets the value of the pagingRecordsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPagingRecordsPerPage() {
        return pagingRecordsPerPage;
    }

    /**
     * Sets the value of the pagingRecordsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPagingRecordsPerPage(Integer value) {
        this.pagingRecordsPerPage = value;
    }

}

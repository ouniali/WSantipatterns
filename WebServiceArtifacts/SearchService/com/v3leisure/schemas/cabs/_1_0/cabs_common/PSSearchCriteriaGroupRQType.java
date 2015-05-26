
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PS_SearchCriteriaGroupRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PS_SearchCriteriaGroupRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCriteriaFullName" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_StringRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaShortName" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_StringRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaDescription" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_StringRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchGroup" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_SearchCriteriaGroupRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaState" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_IdRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaRegion" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_IdRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaClassification" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_IdRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaSupplier" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_IdRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaContentId" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_IdRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaKeyword" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_StringRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaProductName" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_StringRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaProductDescription" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_StringRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaProductCode" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_StringRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaProductType" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_ProductTypeRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaShortDescription" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_StringRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaGeocode" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_GeocodeRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaRatingScheme" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_RatingSchemeRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaCity" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_StringRQType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaId" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_IdRQType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_GroupAndOrEnumType" />
 *       &lt;attribute name="exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PS_SearchCriteriaGroupRQType", propOrder = {
    "searchCriteriaFullName",
    "searchCriteriaShortName",
    "searchCriteriaDescription",
    "searchGroup",
    "searchCriteriaState",
    "searchCriteriaRegion",
    "searchCriteriaClassification",
    "searchCriteriaSupplier",
    "searchCriteriaContentId",
    "searchCriteriaKeyword",
    "searchCriteriaProductName",
    "searchCriteriaProductDescription",
    "searchCriteriaProductCode",
    "searchCriteriaProductType",
    "searchCriteriaShortDescription",
    "searchCriteriaGeocode",
    "searchCriteriaRatingScheme",
    "searchCriteriaCity",
    "searchCriteriaId"
})
public class PSSearchCriteriaGroupRQType {

    @XmlElement(name = "SearchCriteriaFullName")
    protected List<SCStringRQType> searchCriteriaFullName;
    @XmlElement(name = "SearchCriteriaShortName")
    protected List<SCStringRQType> searchCriteriaShortName;
    @XmlElement(name = "SearchCriteriaDescription")
    protected List<SCStringRQType> searchCriteriaDescription;
    @XmlElement(name = "SearchGroup")
    protected List<PSSearchCriteriaGroupRQType> searchGroup;
    @XmlElement(name = "SearchCriteriaState")
    protected List<SCIdRQType> searchCriteriaState;
    @XmlElement(name = "SearchCriteriaRegion")
    protected List<SCIdRQType> searchCriteriaRegion;
    @XmlElement(name = "SearchCriteriaClassification")
    protected List<SCIdRQType> searchCriteriaClassification;
    @XmlElement(name = "SearchCriteriaSupplier")
    protected List<SCIdRQType> searchCriteriaSupplier;
    @XmlElement(name = "SearchCriteriaContentId")
    protected List<SCIdRQType> searchCriteriaContentId;
    @XmlElement(name = "SearchCriteriaKeyword")
    protected List<SCStringRQType> searchCriteriaKeyword;
    @XmlElement(name = "SearchCriteriaProductName")
    protected List<SCStringRQType> searchCriteriaProductName;
    @XmlElement(name = "SearchCriteriaProductDescription")
    protected List<SCStringRQType> searchCriteriaProductDescription;
    @XmlElement(name = "SearchCriteriaProductCode")
    protected List<SCStringRQType> searchCriteriaProductCode;
    @XmlElement(name = "SearchCriteriaProductType")
    protected List<SCProductTypeRQType> searchCriteriaProductType;
    @XmlElement(name = "SearchCriteriaShortDescription")
    protected List<SCStringRQType> searchCriteriaShortDescription;
    @XmlElement(name = "SearchCriteriaGeocode")
    protected List<PSGeocodeRQType> searchCriteriaGeocode;
    @XmlElement(name = "SearchCriteriaRatingScheme")
    protected List<PSRatingSchemeRQType> searchCriteriaRatingScheme;
    @XmlElement(name = "SearchCriteriaCity")
    protected List<SCStringRQType> searchCriteriaCity;
    @XmlElement(name = "SearchCriteriaId")
    protected List<SCIdRQType> searchCriteriaId;
    @XmlAttribute(name = "type")
    protected SCGroupAndOrEnumType type;
    @XmlAttribute(name = "exclude")
    protected Boolean exclude;

    /**
     * Gets the value of the searchCriteriaFullName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaFullName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaFullName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCStringRQType }
     * 
     * 
     */
    public List<SCStringRQType> getSearchCriteriaFullName() {
        if (searchCriteriaFullName == null) {
            searchCriteriaFullName = new ArrayList<SCStringRQType>();
        }
        return this.searchCriteriaFullName;
    }

    /**
     * Gets the value of the searchCriteriaShortName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaShortName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCStringRQType }
     * 
     * 
     */
    public List<SCStringRQType> getSearchCriteriaShortName() {
        if (searchCriteriaShortName == null) {
            searchCriteriaShortName = new ArrayList<SCStringRQType>();
        }
        return this.searchCriteriaShortName;
    }

    /**
     * Gets the value of the searchCriteriaDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCStringRQType }
     * 
     * 
     */
    public List<SCStringRQType> getSearchCriteriaDescription() {
        if (searchCriteriaDescription == null) {
            searchCriteriaDescription = new ArrayList<SCStringRQType>();
        }
        return this.searchCriteriaDescription;
    }

    /**
     * Gets the value of the searchGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSSearchCriteriaGroupRQType }
     * 
     * 
     */
    public List<PSSearchCriteriaGroupRQType> getSearchGroup() {
        if (searchGroup == null) {
            searchGroup = new ArrayList<PSSearchCriteriaGroupRQType>();
        }
        return this.searchGroup;
    }

    /**
     * Gets the value of the searchCriteriaState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCIdRQType }
     * 
     * 
     */
    public List<SCIdRQType> getSearchCriteriaState() {
        if (searchCriteriaState == null) {
            searchCriteriaState = new ArrayList<SCIdRQType>();
        }
        return this.searchCriteriaState;
    }

    /**
     * Gets the value of the searchCriteriaRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCIdRQType }
     * 
     * 
     */
    public List<SCIdRQType> getSearchCriteriaRegion() {
        if (searchCriteriaRegion == null) {
            searchCriteriaRegion = new ArrayList<SCIdRQType>();
        }
        return this.searchCriteriaRegion;
    }

    /**
     * Gets the value of the searchCriteriaClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCIdRQType }
     * 
     * 
     */
    public List<SCIdRQType> getSearchCriteriaClassification() {
        if (searchCriteriaClassification == null) {
            searchCriteriaClassification = new ArrayList<SCIdRQType>();
        }
        return this.searchCriteriaClassification;
    }

    /**
     * Gets the value of the searchCriteriaSupplier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaSupplier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaSupplier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCIdRQType }
     * 
     * 
     */
    public List<SCIdRQType> getSearchCriteriaSupplier() {
        if (searchCriteriaSupplier == null) {
            searchCriteriaSupplier = new ArrayList<SCIdRQType>();
        }
        return this.searchCriteriaSupplier;
    }

    /**
     * Gets the value of the searchCriteriaContentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaContentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaContentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCIdRQType }
     * 
     * 
     */
    public List<SCIdRQType> getSearchCriteriaContentId() {
        if (searchCriteriaContentId == null) {
            searchCriteriaContentId = new ArrayList<SCIdRQType>();
        }
        return this.searchCriteriaContentId;
    }

    /**
     * Gets the value of the searchCriteriaKeyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaKeyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCStringRQType }
     * 
     * 
     */
    public List<SCStringRQType> getSearchCriteriaKeyword() {
        if (searchCriteriaKeyword == null) {
            searchCriteriaKeyword = new ArrayList<SCStringRQType>();
        }
        return this.searchCriteriaKeyword;
    }

    /**
     * Gets the value of the searchCriteriaProductName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaProductName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaProductName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCStringRQType }
     * 
     * 
     */
    public List<SCStringRQType> getSearchCriteriaProductName() {
        if (searchCriteriaProductName == null) {
            searchCriteriaProductName = new ArrayList<SCStringRQType>();
        }
        return this.searchCriteriaProductName;
    }

    /**
     * Gets the value of the searchCriteriaProductDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaProductDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaProductDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCStringRQType }
     * 
     * 
     */
    public List<SCStringRQType> getSearchCriteriaProductDescription() {
        if (searchCriteriaProductDescription == null) {
            searchCriteriaProductDescription = new ArrayList<SCStringRQType>();
        }
        return this.searchCriteriaProductDescription;
    }

    /**
     * Gets the value of the searchCriteriaProductCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaProductCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaProductCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCStringRQType }
     * 
     * 
     */
    public List<SCStringRQType> getSearchCriteriaProductCode() {
        if (searchCriteriaProductCode == null) {
            searchCriteriaProductCode = new ArrayList<SCStringRQType>();
        }
        return this.searchCriteriaProductCode;
    }

    /**
     * Gets the value of the searchCriteriaProductType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaProductType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaProductType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCProductTypeRQType }
     * 
     * 
     */
    public List<SCProductTypeRQType> getSearchCriteriaProductType() {
        if (searchCriteriaProductType == null) {
            searchCriteriaProductType = new ArrayList<SCProductTypeRQType>();
        }
        return this.searchCriteriaProductType;
    }

    /**
     * Gets the value of the searchCriteriaShortDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaShortDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaShortDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCStringRQType }
     * 
     * 
     */
    public List<SCStringRQType> getSearchCriteriaShortDescription() {
        if (searchCriteriaShortDescription == null) {
            searchCriteriaShortDescription = new ArrayList<SCStringRQType>();
        }
        return this.searchCriteriaShortDescription;
    }

    /**
     * Gets the value of the searchCriteriaGeocode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaGeocode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaGeocode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSGeocodeRQType }
     * 
     * 
     */
    public List<PSGeocodeRQType> getSearchCriteriaGeocode() {
        if (searchCriteriaGeocode == null) {
            searchCriteriaGeocode = new ArrayList<PSGeocodeRQType>();
        }
        return this.searchCriteriaGeocode;
    }

    /**
     * Gets the value of the searchCriteriaRatingScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaRatingScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaRatingScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PSRatingSchemeRQType }
     * 
     * 
     */
    public List<PSRatingSchemeRQType> getSearchCriteriaRatingScheme() {
        if (searchCriteriaRatingScheme == null) {
            searchCriteriaRatingScheme = new ArrayList<PSRatingSchemeRQType>();
        }
        return this.searchCriteriaRatingScheme;
    }

    /**
     * Gets the value of the searchCriteriaCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCStringRQType }
     * 
     * 
     */
    public List<SCStringRQType> getSearchCriteriaCity() {
        if (searchCriteriaCity == null) {
            searchCriteriaCity = new ArrayList<SCStringRQType>();
        }
        return this.searchCriteriaCity;
    }

    /**
     * Gets the value of the searchCriteriaId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteriaId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchCriteriaId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCIdRQType }
     * 
     * 
     */
    public List<SCIdRQType> getSearchCriteriaId() {
        if (searchCriteriaId == null) {
            searchCriteriaId = new ArrayList<SCIdRQType>();
        }
        return this.searchCriteriaId;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SCGroupAndOrEnumType }
     *     
     */
    public SCGroupAndOrEnumType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCGroupAndOrEnumType }
     *     
     */
    public void setType(SCGroupAndOrEnumType value) {
        this.type = value;
    }

    /**
     * Gets the value of the exclude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclude() {
        return exclude;
    }

    /**
     * Sets the value of the exclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }

}

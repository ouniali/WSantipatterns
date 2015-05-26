
package com.travelport.schema.universal_v16_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.AgencyInfo;
import com.travelport.schema.common_v15_0.Name;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Name" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductInfo" type="{http://www.travelport.com/schema/universal_v16_0}typeProductInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AgencyInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UniversalRecordLocatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EarliestTravelDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Ticketed" use="required" type="{http://www.travelport.com/schema/universal_v16_0}typeReservationTicketed" />
 *       &lt;attribute name="ProviderCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProviderLocatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExternalSearchIndex" type="{http://www.travelport.com/schema/universal_v16_0}typeExternalSearchIndex" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "productInfo",
    "agencyInfo"
})
@XmlRootElement(name = "ProviderReservationSearchResult")
public class ProviderReservationSearchResult {

    @XmlElement(name = "Name", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<Name> name;
    @XmlElement(name = "ProductInfo")
    protected List<TypeProductInfo> productInfo;
    @XmlElement(name = "AgencyInfo", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected AgencyInfo agencyInfo;
    @XmlAttribute(name = "UniversalRecordLocatorCode")
    protected String universalRecordLocatorCode;
    @XmlAttribute(name = "CreatedDate")
    protected String createdDate;
    @XmlAttribute(name = "EarliestTravelDate")
    protected String earliestTravelDate;
    @XmlAttribute(name = "Ticketed", required = true)
    protected TypeReservationTicketed ticketed;
    @XmlAttribute(name = "ProviderCode", required = true)
    protected String providerCode;
    @XmlAttribute(name = "ProviderLocatorCode")
    protected String providerLocatorCode;
    @XmlAttribute(name = "ExternalSearchIndex")
    protected String externalSearchIndex;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getName() {
        if (name == null) {
            name = new ArrayList<Name>();
        }
        return this.name;
    }

    /**
     * Gets the value of the productInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeProductInfo }
     * 
     * 
     */
    public List<TypeProductInfo> getProductInfo() {
        if (productInfo == null) {
            productInfo = new ArrayList<TypeProductInfo>();
        }
        return this.productInfo;
    }

    /**
     * Gets the value of the agencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyInfo }
     *     
     */
    public AgencyInfo getAgencyInfo() {
        return agencyInfo;
    }

    /**
     * Sets the value of the agencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyInfo }
     *     
     */
    public void setAgencyInfo(AgencyInfo value) {
        this.agencyInfo = value;
    }

    /**
     * Gets the value of the universalRecordLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalRecordLocatorCode() {
        return universalRecordLocatorCode;
    }

    /**
     * Sets the value of the universalRecordLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalRecordLocatorCode(String value) {
        this.universalRecordLocatorCode = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the earliestTravelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestTravelDate() {
        return earliestTravelDate;
    }

    /**
     * Sets the value of the earliestTravelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestTravelDate(String value) {
        this.earliestTravelDate = value;
    }

    /**
     * Gets the value of the ticketed property.
     * 
     * @return
     *     possible object is
     *     {@link TypeReservationTicketed }
     *     
     */
    public TypeReservationTicketed getTicketed() {
        return ticketed;
    }

    /**
     * Sets the value of the ticketed property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReservationTicketed }
     *     
     */
    public void setTicketed(TypeReservationTicketed value) {
        this.ticketed = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the providerLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderLocatorCode() {
        return providerLocatorCode;
    }

    /**
     * Sets the value of the providerLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
    }

    /**
     * Gets the value of the externalSearchIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalSearchIndex() {
        return externalSearchIndex;
    }

    /**
     * Sets the value of the externalSearchIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalSearchIndex(String value) {
        this.externalSearchIndex = value;
    }

}

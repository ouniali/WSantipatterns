
package com.travelport.schema.universal_v16_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="ProductInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.travelport.com/schema/universal_v16_0}typeSavedTripProductInfo">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Name" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="EarliestTravelDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SavedTripName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LocatorCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *       &lt;attribute name="UniversalRecordLocatorCode" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "productInfo"
})
@XmlRootElement(name = "SavedTripSearchResult")
public class SavedTripSearchResult {

    @XmlElement(name = "ProductInfo")
    protected List<SavedTripSearchResult.ProductInfo> productInfo;
    @XmlAttribute(name = "EarliestTravelDate")
    protected String earliestTravelDate;
    @XmlAttribute(name = "CreatedDate")
    protected String createdDate;
    @XmlAttribute(name = "SavedTripName", required = true)
    protected String savedTripName;
    @XmlAttribute(name = "LocatorCode", required = true)
    protected String locatorCode;
    @XmlAttribute(name = "UniversalRecordLocatorCode")
    protected String universalRecordLocatorCode;

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
     * {@link SavedTripSearchResult.ProductInfo }
     * 
     * 
     */
    public List<SavedTripSearchResult.ProductInfo> getProductInfo() {
        if (productInfo == null) {
            productInfo = new ArrayList<SavedTripSearchResult.ProductInfo>();
        }
        return this.productInfo;
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
     * Gets the value of the savedTripName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedTripName() {
        return savedTripName;
    }

    /**
     * Sets the value of the savedTripName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedTripName(String value) {
        this.savedTripName = value;
    }

    /**
     * Gets the value of the locatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatorCode() {
        return locatorCode;
    }

    /**
     * Sets the value of the locatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocatorCode(String value) {
        this.locatorCode = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.travelport.com/schema/universal_v16_0}typeSavedTripProductInfo">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Name" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name"
    })
    public static class ProductInfo
        extends TypeSavedTripProductInfo
    {

        @XmlElement(name = "Name", namespace = "http://www.travelport.com/schema/common_v15_0")
        protected List<Name> name;

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

    }

}

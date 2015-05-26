
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PriceInfo" maxOccurs="8">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PriceInfoType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Dining" maxOccurs="8" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Sitting" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="Occupancy" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseCategoryGroup"/>
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="HeldIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CategoryLocation" type="{http://www.opentravel.org/OTA/2003/05}CategoryLocationType" />
 *       &lt;attribute name="MaxOccupancy" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *       &lt;attribute name="ListOfCategoryQualifierCodes" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *       &lt;attribute name="AvailableGroupAllocationQty" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to9999" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryOptionType", propOrder = {
    "priceInfos",
    "dining"
})
public class CategoryOptionType {

    @XmlElement(name = "PriceInfos")
    protected CategoryOptionType.PriceInfos priceInfos;
    @XmlElement(name = "Dining")
    protected List<CategoryOptionType.Dining> dining;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "HeldIndicator")
    protected Boolean heldIndicator;
    @XmlAttribute(name = "CategoryLocation")
    protected CategoryLocationType categoryLocation;
    @XmlAttribute(name = "MaxOccupancy")
    protected Integer maxOccupancy;
    @XmlAttribute(name = "ListOfCategoryQualifierCodes")
    protected List<String> listOfCategoryQualifierCodes;
    @XmlAttribute(name = "AvailableGroupAllocationQty")
    protected Integer availableGroupAllocationQty;
    @XmlAttribute(name = "FareCode")
    protected String fareCode;
    @XmlAttribute(name = "GroupCode")
    protected String groupCode;
    @XmlAttribute(name = "BerthedCategoryCode")
    protected String berthedCategoryCode;
    @XmlAttribute(name = "PricedCategoryCode")
    protected String pricedCategoryCode;

    /**
     * Gets the value of the priceInfos property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryOptionType.PriceInfos }
     *     
     */
    public CategoryOptionType.PriceInfos getPriceInfos() {
        return priceInfos;
    }

    /**
     * Sets the value of the priceInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryOptionType.PriceInfos }
     *     
     */
    public void setPriceInfos(CategoryOptionType.PriceInfos value) {
        this.priceInfos = value;
    }

    /**
     * Gets the value of the dining property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dining property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDining().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryOptionType.Dining }
     * 
     * 
     */
    public List<CategoryOptionType.Dining> getDining() {
        if (dining == null) {
            dining = new ArrayList<CategoryOptionType.Dining>();
        }
        return this.dining;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the heldIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeldIndicator() {
        return heldIndicator;
    }

    /**
     * Sets the value of the heldIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeldIndicator(Boolean value) {
        this.heldIndicator = value;
    }

    /**
     * Gets the value of the categoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryLocationType }
     *     
     */
    public CategoryLocationType getCategoryLocation() {
        return categoryLocation;
    }

    /**
     * Sets the value of the categoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryLocationType }
     *     
     */
    public void setCategoryLocation(CategoryLocationType value) {
        this.categoryLocation = value;
    }

    /**
     * Gets the value of the maxOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * Sets the value of the maxOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxOccupancy(Integer value) {
        this.maxOccupancy = value;
    }

    /**
     * Gets the value of the listOfCategoryQualifierCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfCategoryQualifierCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfCategoryQualifierCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOfCategoryQualifierCodes() {
        if (listOfCategoryQualifierCodes == null) {
            listOfCategoryQualifierCodes = new ArrayList<String>();
        }
        return this.listOfCategoryQualifierCodes;
    }

    /**
     * Gets the value of the availableGroupAllocationQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableGroupAllocationQty() {
        return availableGroupAllocationQty;
    }

    /**
     * Sets the value of the availableGroupAllocationQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableGroupAllocationQty(Integer value) {
        this.availableGroupAllocationQty = value;
    }

    /**
     * Gets the value of the fareCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCode() {
        return fareCode;
    }

    /**
     * Sets the value of the fareCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCode(String value) {
        this.fareCode = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the berthedCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBerthedCategoryCode() {
        return berthedCategoryCode;
    }

    /**
     * Sets the value of the berthedCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBerthedCategoryCode(String value) {
        this.berthedCategoryCode = value;
    }

    /**
     * Gets the value of the pricedCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricedCategoryCode() {
        return pricedCategoryCode;
    }

    /**
     * Sets the value of the pricedCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricedCategoryCode(String value) {
        this.pricedCategoryCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Sitting" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="Occupancy" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Dining {

        @XmlAttribute(name = "Sitting", required = true)
        protected String sitting;
        @XmlAttribute(name = "Status")
        protected String status;
        @XmlAttribute(name = "Occupancy")
        protected Integer occupancy;

        /**
         * Gets the value of the sitting property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSitting() {
            return sitting;
        }

        /**
         * Sets the value of the sitting property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSitting(String value) {
            this.sitting = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the occupancy property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOccupancy() {
            return occupancy;
        }

        /**
         * Sets the value of the occupancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOccupancy(Integer value) {
            this.occupancy = value;
        }

    }


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
     *         &lt;element name="PriceInfo" maxOccurs="8">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PriceInfoType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priceInfo"
    })
    public static class PriceInfos {

        @XmlElement(name = "PriceInfo", required = true)
        protected List<CategoryOptionType.PriceInfos.PriceInfo> priceInfo;

        /**
         * Gets the value of the priceInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CategoryOptionType.PriceInfos.PriceInfo }
         * 
         * 
         */
        public List<CategoryOptionType.PriceInfos.PriceInfo> getPriceInfo() {
            if (priceInfo == null) {
                priceInfo = new ArrayList<CategoryOptionType.PriceInfos.PriceInfo>();
            }
            return this.priceInfo;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PriceInfoType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PriceInfo
            extends PriceInfoType
        {

            @XmlAttribute(name = "FareCode")
            protected String fareCode;
            @XmlAttribute(name = "GroupCode")
            protected String groupCode;

            /**
             * Gets the value of the fareCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareCode() {
                return fareCode;
            }

            /**
             * Sets the value of the fareCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareCode(String value) {
                this.fareCode = value;
            }

            /**
             * Gets the value of the groupCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupCode() {
                return groupCode;
            }

            /**
             * Sets the value of the groupCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupCode(String value) {
                this.groupCode = value;
            }

        }

    }

}

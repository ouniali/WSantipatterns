
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
import com.travelport.schema.common_v15_0.TypeRecordStatus;


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
 *               &lt;extension base="{http://www.travelport.com/schema/universal_v16_0}typeProductInfo">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Name" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="UniversalRecordLocatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EarliestTravelDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SavedTripLocatorCode" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *       &lt;attribute name="Ticketed" type="{http://www.travelport.com/schema/universal_v16_0}typeReservationTicketed" />
 *       &lt;attribute name="RecordStatus" type="{http://www.travelport.com/schema/common_v15_0}typeRecordStatus" />
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
@XmlRootElement(name = "UniversalRecordSearchResult")
public class UniversalRecordSearchResult {

    @XmlElement(name = "ProductInfo")
    protected List<UniversalRecordSearchResult.ProductInfo> productInfo;
    @XmlAttribute(name = "UniversalRecordLocatorCode")
    protected String universalRecordLocatorCode;
    @XmlAttribute(name = "EarliestTravelDate")
    protected String earliestTravelDate;
    @XmlAttribute(name = "CreatedDate")
    protected String createdDate;
    @XmlAttribute(name = "SavedTripLocatorCode")
    protected String savedTripLocatorCode;
    @XmlAttribute(name = "Ticketed")
    protected TypeReservationTicketed ticketed;
    @XmlAttribute(name = "RecordStatus")
    protected TypeRecordStatus recordStatus;

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
     * {@link UniversalRecordSearchResult.ProductInfo }
     * 
     * 
     */
    public List<UniversalRecordSearchResult.ProductInfo> getProductInfo() {
        if (productInfo == null) {
            productInfo = new ArrayList<UniversalRecordSearchResult.ProductInfo>();
        }
        return this.productInfo;
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
     * Gets the value of the savedTripLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedTripLocatorCode() {
        return savedTripLocatorCode;
    }

    /**
     * Sets the value of the savedTripLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedTripLocatorCode(String value) {
        this.savedTripLocatorCode = value;
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
     * Gets the value of the recordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRecordStatus }
     *     
     */
    public TypeRecordStatus getRecordStatus() {
        return recordStatus;
    }

    /**
     * Sets the value of the recordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRecordStatus }
     *     
     */
    public void setRecordStatus(TypeRecordStatus value) {
        this.recordStatus = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.travelport.com/schema/universal_v16_0}typeProductInfo">
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
        extends TypeProductInfo
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

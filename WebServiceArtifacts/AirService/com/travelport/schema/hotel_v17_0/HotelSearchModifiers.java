
package com.travelport.schema.hotel_v17_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.CorporateDiscountID;
import com.travelport.schema.common_v15_0.Distance;
import com.travelport.schema.common_v15_0.LoyaltyCard;
import com.travelport.schema.common_v15_0.TypeStructuredAddress;


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
 *         &lt;element name="PermittedChains" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelChain" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedChains" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelChain" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}LoyaltyCard" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CorporateDiscountID" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Distance" minOccurs="0"/>
 *         &lt;element name="RateCategory" type="{http://www.travelport.com/schema/hotel_v17_0}typeHotelRateCategory" maxOccurs="8" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelRating" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}SearchPriority" minOccurs="0"/>
 *         &lt;element name="HotelAddress" type="{http://www.travelport.com/schema/common_v15_0}typeStructuredAddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ReferencePoint" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelBedding" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}Amenities" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NumberOfAdults" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="NumberOfRooms" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="IsRelaxed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedChains",
    "prohibitedChains",
    "loyaltyCard",
    "hotelName",
    "corporateDiscountID",
    "distance",
    "rateCategory",
    "hotelRating",
    "searchPriority",
    "hotelAddress",
    "referencePoint",
    "hotelBedding",
    "amenities"
})
@XmlRootElement(name = "HotelSearchModifiers")
public class HotelSearchModifiers {

    @XmlElement(name = "PermittedChains")
    protected HotelSearchModifiers.PermittedChains permittedChains;
    @XmlElement(name = "ProhibitedChains")
    protected HotelSearchModifiers.ProhibitedChains prohibitedChains;
    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "HotelName")
    protected String hotelName;
    @XmlElement(name = "CorporateDiscountID", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<CorporateDiscountID> corporateDiscountID;
    @XmlElement(name = "Distance", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected Distance distance;
    @XmlElement(name = "RateCategory")
    @XmlSchemaType(name = "string")
    protected List<TypeHotelRateCategory> rateCategory;
    @XmlElement(name = "HotelRating")
    protected List<HotelRating> hotelRating;
    @XmlElement(name = "SearchPriority")
    protected SearchPriority searchPriority;
    @XmlElement(name = "HotelAddress")
    protected TypeStructuredAddress hotelAddress;
    @XmlElement(name = "ReferencePoint", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected String referencePoint;
    @XmlElement(name = "HotelBedding")
    protected List<HotelBedding> hotelBedding;
    @XmlElement(name = "Amenities")
    protected Amenities amenities;
    @XmlAttribute(name = "NumberOfAdults")
    protected Integer numberOfAdults;
    @XmlAttribute(name = "NumberOfRooms")
    protected Integer numberOfRooms;
    @XmlAttribute(name = "IsRelaxed")
    protected Boolean isRelaxed;

    /**
     * Gets the value of the permittedChains property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchModifiers.PermittedChains }
     *     
     */
    public HotelSearchModifiers.PermittedChains getPermittedChains() {
        return permittedChains;
    }

    /**
     * Sets the value of the permittedChains property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchModifiers.PermittedChains }
     *     
     */
    public void setPermittedChains(HotelSearchModifiers.PermittedChains value) {
        this.permittedChains = value;
    }

    /**
     * Gets the value of the prohibitedChains property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchModifiers.ProhibitedChains }
     *     
     */
    public HotelSearchModifiers.ProhibitedChains getProhibitedChains() {
        return prohibitedChains;
    }

    /**
     * Sets the value of the prohibitedChains property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchModifiers.ProhibitedChains }
     *     
     */
    public void setProhibitedChains(HotelSearchModifiers.ProhibitedChains value) {
        this.prohibitedChains = value;
    }

    /**
     * Gets the value of the loyaltyCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * 
     * 
     */
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<LoyaltyCard>();
        }
        return this.loyaltyCard;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the corporateDiscountID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateDiscountID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateDiscountID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateDiscountID }
     * 
     * 
     */
    public List<CorporateDiscountID> getCorporateDiscountID() {
        if (corporateDiscountID == null) {
            corporateDiscountID = new ArrayList<CorporateDiscountID>();
        }
        return this.corporateDiscountID;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistance(Distance value) {
        this.distance = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeHotelRateCategory }
     * 
     * 
     */
    public List<TypeHotelRateCategory> getRateCategory() {
        if (rateCategory == null) {
            rateCategory = new ArrayList<TypeHotelRateCategory>();
        }
        return this.rateCategory;
    }

    /**
     * Gets the value of the hotelRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRating }
     * 
     * 
     */
    public List<HotelRating> getHotelRating() {
        if (hotelRating == null) {
            hotelRating = new ArrayList<HotelRating>();
        }
        return this.hotelRating;
    }

    /**
     * Gets the value of the searchPriority property.
     * 
     * @return
     *     possible object is
     *     {@link SearchPriority }
     *     
     */
    public SearchPriority getSearchPriority() {
        return searchPriority;
    }

    /**
     * Sets the value of the searchPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPriority }
     *     
     */
    public void setSearchPriority(SearchPriority value) {
        this.searchPriority = value;
    }

    /**
     * Gets the value of the hotelAddress property.
     * 
     * @return
     *     possible object is
     *     {@link TypeStructuredAddress }
     *     
     */
    public TypeStructuredAddress getHotelAddress() {
        return hotelAddress;
    }

    /**
     * Sets the value of the hotelAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStructuredAddress }
     *     
     */
    public void setHotelAddress(TypeStructuredAddress value) {
        this.hotelAddress = value;
    }

    /**
     * Search Hotel by reference point
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePoint() {
        return referencePoint;
    }

    /**
     * Sets the value of the referencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePoint(String value) {
        this.referencePoint = value;
    }

    /**
     * Gets the value of the hotelBedding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelBedding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelBedding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelBedding }
     * 
     * 
     */
    public List<HotelBedding> getHotelBedding() {
        if (hotelBedding == null) {
            hotelBedding = new ArrayList<HotelBedding>();
        }
        return this.hotelBedding;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link Amenities }
     *     
     */
    public Amenities getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amenities }
     *     
     */
    public void setAmenities(Amenities value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the numberOfAdults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    /**
     * Sets the value of the numberOfAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfAdults(Integer value) {
        this.numberOfAdults = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRooms(Integer value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the isRelaxed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRelaxed() {
        return isRelaxed;
    }

    /**
     * Sets the value of the isRelaxed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRelaxed(Boolean value) {
        this.isRelaxed = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelChain" maxOccurs="unbounded"/>
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
        "hotelChain"
    })
    public static class PermittedChains {

        @XmlElement(name = "HotelChain", required = true)
        protected List<HotelChain> hotelChain;

        /**
         * Gets the value of the hotelChain property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelChain property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelChain().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelChain }
         * 
         * 
         */
        public List<HotelChain> getHotelChain() {
            if (hotelChain == null) {
                hotelChain = new ArrayList<HotelChain>();
            }
            return this.hotelChain;
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
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelChain" maxOccurs="unbounded"/>
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
        "hotelChain"
    })
    public static class ProhibitedChains {

        @XmlElement(name = "HotelChain", required = true)
        protected List<HotelChain> hotelChain;

        /**
         * Gets the value of the hotelChain property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelChain property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelChain().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelChain }
         * 
         * 
         */
        public List<HotelChain> getHotelChain() {
            if (hotelChain == null) {
                hotelChain = new ArrayList<HotelChain>();
            }
            return this.hotelChain;
        }

    }

}

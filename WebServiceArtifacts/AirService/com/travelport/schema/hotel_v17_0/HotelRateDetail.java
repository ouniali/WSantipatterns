
package com.travelport.schema.hotel_v17_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.CorporateDiscountID;


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
 *         &lt;element name="RoomRateDescription" type="{http://www.travelport.com/schema/hotel_v17_0}typeHotelRateDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelRateByDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CorporateDiscountID" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}RateMatchIndicator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}TaxDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/hotel_v17_0}attrHotelRate"/>
 *       &lt;attribute name="RatePlanType" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRatePlanType" />
 *       &lt;attribute name="DepositRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RateGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RateCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "roomRateDescription",
    "hotelRateByDate",
    "corporateDiscountID",
    "rateMatchIndicator",
    "taxDetails"
})
@XmlRootElement(name = "HotelRateDetail")
public class HotelRateDetail {

    @XmlElement(name = "RoomRateDescription")
    protected List<TypeHotelRateDescription> roomRateDescription;
    @XmlElement(name = "HotelRateByDate")
    protected List<HotelRateByDate> hotelRateByDate;
    @XmlElement(name = "CorporateDiscountID", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<CorporateDiscountID> corporateDiscountID;
    @XmlElement(name = "RateMatchIndicator")
    protected List<RateMatchIndicator> rateMatchIndicator;
    @XmlElement(name = "TaxDetails")
    protected TaxDetails taxDetails;
    @XmlAttribute(name = "RatePlanType", required = true)
    protected String ratePlanType;
    @XmlAttribute(name = "DepositRequired")
    protected Boolean depositRequired;
    @XmlAttribute(name = "RateGuaranteed")
    protected Boolean rateGuaranteed;
    @XmlAttribute(name = "RateCategory")
    protected String rateCategory;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Base")
    protected String base;
    @XmlAttribute(name = "Tax")
    protected String tax;
    @XmlAttribute(name = "Total")
    protected String total;
    @XmlAttribute(name = "Surcharge")
    protected String surcharge;

    /**
     * Gets the value of the roomRateDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomRateDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomRateDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeHotelRateDescription }
     * 
     * 
     */
    public List<TypeHotelRateDescription> getRoomRateDescription() {
        if (roomRateDescription == null) {
            roomRateDescription = new ArrayList<TypeHotelRateDescription>();
        }
        return this.roomRateDescription;
    }

    /**
     * Gets the value of the hotelRateByDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRateByDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRateByDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRateByDate }
     * 
     * 
     */
    public List<HotelRateByDate> getHotelRateByDate() {
        if (hotelRateByDate == null) {
            hotelRateByDate = new ArrayList<HotelRateByDate>();
        }
        return this.hotelRateByDate;
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
     * Returns "Match" Indicators for certain request parameters for Hotel Rate returned in response.Gets the value of the rateMatchIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateMatchIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateMatchIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateMatchIndicator }
     * 
     * 
     */
    public List<RateMatchIndicator> getRateMatchIndicator() {
        if (rateMatchIndicator == null) {
            rateMatchIndicator = new ArrayList<RateMatchIndicator>();
        }
        return this.rateMatchIndicator;
    }

    /**
     * Gets the value of the taxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetails }
     *     
     */
    public TaxDetails getTaxDetails() {
        return taxDetails;
    }

    /**
     * Sets the value of the taxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetails }
     *     
     */
    public void setTaxDetails(TaxDetails value) {
        this.taxDetails = value;
    }

    /**
     * Gets the value of the ratePlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanType() {
        return ratePlanType;
    }

    /**
     * Sets the value of the ratePlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanType(String value) {
        this.ratePlanType = value;
    }

    /**
     * Gets the value of the depositRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepositRequired() {
        return depositRequired;
    }

    /**
     * Sets the value of the depositRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepositRequired(Boolean value) {
        this.depositRequired = value;
    }

    /**
     * Gets the value of the rateGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateGuaranteed() {
        return rateGuaranteed;
    }

    /**
     * Sets the value of the rateGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateGuaranteed(Boolean value) {
        this.rateGuaranteed = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCategory() {
        return rateCategory;
    }

    /**
     * Sets the value of the rateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCategory(String value) {
        this.rateCategory = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTax(String value) {
        this.tax = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurcharge(String value) {
        this.surcharge = value;
    }

}

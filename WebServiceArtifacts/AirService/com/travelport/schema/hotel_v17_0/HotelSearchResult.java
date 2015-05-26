
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
import com.travelport.schema.common_v15_0.TypeResultMessage;


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
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelProperty"/>
 *         &lt;element name="HotelSearchError" type="{http://www.travelport.com/schema/common_v15_0}typeResultMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CorporateDiscountID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MinimumAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="MinAmountRateChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MaximumAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="MaxAmountRateChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelProperty",
    "hotelSearchError",
    "corporateDiscountID"
})
@XmlRootElement(name = "HotelSearchResult")
public class HotelSearchResult {

    @XmlElement(name = "HotelProperty", required = true)
    protected HotelProperty hotelProperty;
    @XmlElement(name = "HotelSearchError")
    protected List<TypeResultMessage> hotelSearchError;
    @XmlElement(name = "CorporateDiscountID", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<CorporateDiscountID> corporateDiscountID;
    @XmlAttribute(name = "MinimumAmount")
    protected String minimumAmount;
    @XmlAttribute(name = "MinAmountRateChanged")
    protected Boolean minAmountRateChanged;
    @XmlAttribute(name = "MaximumAmount")
    protected String maximumAmount;
    @XmlAttribute(name = "MaxAmountRateChanged")
    protected Boolean maxAmountRateChanged;

    /**
     * Gets the value of the hotelProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProperty }
     *     
     */
    public HotelProperty getHotelProperty() {
        return hotelProperty;
    }

    /**
     * Sets the value of the hotelProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProperty }
     *     
     */
    public void setHotelProperty(HotelProperty value) {
        this.hotelProperty = value;
    }

    /**
     * Gets the value of the hotelSearchError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelSearchError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelSearchError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeResultMessage }
     * 
     * 
     */
    public List<TypeResultMessage> getHotelSearchError() {
        if (hotelSearchError == null) {
            hotelSearchError = new ArrayList<TypeResultMessage>();
        }
        return this.hotelSearchError;
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
     * Gets the value of the minimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Sets the value of the minimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumAmount(String value) {
        this.minimumAmount = value;
    }

    /**
     * Gets the value of the minAmountRateChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinAmountRateChanged() {
        return minAmountRateChanged;
    }

    /**
     * Sets the value of the minAmountRateChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinAmountRateChanged(Boolean value) {
        this.minAmountRateChanged = value;
    }

    /**
     * Gets the value of the maximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Sets the value of the maximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAmount(String value) {
        this.maximumAmount = value;
    }

    /**
     * Gets the value of the maxAmountRateChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaxAmountRateChanged() {
        return maxAmountRateChanged;
    }

    /**
     * Sets the value of the maxAmountRateChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaxAmountRateChanged(Boolean value) {
        this.maxAmountRateChanged = value;
    }

}

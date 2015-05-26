
package kr.co.rts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_GetHotelInfoSummaryNet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ST_GetHotelInfoSummaryNet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NationalityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerClientPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerNetPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecommendClientPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ST_GetHotelInfoSummaryNet", propOrder = {
    "languageCode",
    "nationalityCode",
    "itemCode",
    "roomTypeName",
    "sellerClientPrice",
    "sellingCurrencyCode",
    "sellerNetPrice",
    "priceStatus",
    "recommendClientPrice"
})
public class STGetHotelInfoSummaryNet {

    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "NationalityCode")
    protected String nationalityCode;
    @XmlElement(name = "ItemCode")
    protected String itemCode;
    @XmlElement(name = "RoomTypeName")
    protected String roomTypeName;
    @XmlElement(name = "SellerClientPrice")
    protected String sellerClientPrice;
    @XmlElement(name = "SellingCurrencyCode")
    protected String sellingCurrencyCode;
    @XmlElement(name = "SellerNetPrice")
    protected String sellerNetPrice;
    @XmlElement(name = "PriceStatus")
    protected String priceStatus;
    @XmlElement(name = "RecommendClientPrice")
    protected String recommendClientPrice;

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the nationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Sets the value of the nationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityCode(String value) {
        this.nationalityCode = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the roomTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeName() {
        return roomTypeName;
    }

    /**
     * Sets the value of the roomTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeName(String value) {
        this.roomTypeName = value;
    }

    /**
     * Gets the value of the sellerClientPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerClientPrice() {
        return sellerClientPrice;
    }

    /**
     * Sets the value of the sellerClientPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerClientPrice(String value) {
        this.sellerClientPrice = value;
    }

    /**
     * Gets the value of the sellingCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingCurrencyCode() {
        return sellingCurrencyCode;
    }

    /**
     * Sets the value of the sellingCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingCurrencyCode(String value) {
        this.sellingCurrencyCode = value;
    }

    /**
     * Gets the value of the sellerNetPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerNetPrice() {
        return sellerNetPrice;
    }

    /**
     * Sets the value of the sellerNetPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerNetPrice(String value) {
        this.sellerNetPrice = value;
    }

    /**
     * Gets the value of the priceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceStatus() {
        return priceStatus;
    }

    /**
     * Sets the value of the priceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceStatus(String value) {
        this.priceStatus = value;
    }

    /**
     * Gets the value of the recommendClientPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendClientPrice() {
        return recommendClientPrice;
    }

    /**
     * Sets the value of the recommendClientPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendClientPrice(String value) {
        this.recommendClientPrice = value;
    }

}

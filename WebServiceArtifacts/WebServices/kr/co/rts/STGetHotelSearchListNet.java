
package kr.co.rts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_GetHotelSearchListNet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ST_GetHotelSearchListNet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckOutDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StarRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierCompCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailableHotelOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RecommendHotelOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ClientCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerMarkup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompareYn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SortType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemCodeList" type="{http://www.rts.co.kr/}ArrayOfItemCodeInfo" minOccurs="0"/>
 *         &lt;element name="RoomsList" type="{http://www.rts.co.kr/}ArrayOfRoomsInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ST_GetHotelSearchListNet", propOrder = {
    "languageCode",
    "cityCode",
    "checkInDate",
    "checkOutDate",
    "starRating",
    "locationCode",
    "supplierCompCode",
    "availableHotelOnly",
    "recommendHotelOnly",
    "clientCurrencyCode",
    "itemName",
    "sellerMarkup",
    "compareYn",
    "sortType",
    "itemCodeList",
    "roomsList"
})
public class STGetHotelSearchListNet {

    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "CityCode")
    protected String cityCode;
    @XmlElement(name = "CheckInDate")
    protected String checkInDate;
    @XmlElement(name = "CheckOutDate")
    protected String checkOutDate;
    @XmlElement(name = "StarRating")
    protected String starRating;
    @XmlElement(name = "LocationCode")
    protected String locationCode;
    @XmlElement(name = "SupplierCompCode")
    protected String supplierCompCode;
    @XmlElement(name = "AvailableHotelOnly")
    protected boolean availableHotelOnly;
    @XmlElement(name = "RecommendHotelOnly")
    protected boolean recommendHotelOnly;
    @XmlElement(name = "ClientCurrencyCode")
    protected String clientCurrencyCode;
    @XmlElement(name = "ItemName")
    protected String itemName;
    @XmlElement(name = "SellerMarkup")
    protected String sellerMarkup;
    @XmlElement(name = "CompareYn")
    protected boolean compareYn;
    @XmlElement(name = "SortType")
    protected String sortType;
    @XmlElement(name = "ItemCodeList")
    protected ArrayOfItemCodeInfo itemCodeList;
    @XmlElement(name = "RoomsList")
    protected ArrayOfRoomsInfo roomsList;

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
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the checkInDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the value of the checkInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInDate(String value) {
        this.checkInDate = value;
    }

    /**
     * Gets the value of the checkOutDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * Sets the value of the checkOutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOutDate(String value) {
        this.checkOutDate = value;
    }

    /**
     * Gets the value of the starRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarRating() {
        return starRating;
    }

    /**
     * Sets the value of the starRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarRating(String value) {
        this.starRating = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the supplierCompCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCompCode() {
        return supplierCompCode;
    }

    /**
     * Sets the value of the supplierCompCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCompCode(String value) {
        this.supplierCompCode = value;
    }

    /**
     * Gets the value of the availableHotelOnly property.
     * 
     */
    public boolean isAvailableHotelOnly() {
        return availableHotelOnly;
    }

    /**
     * Sets the value of the availableHotelOnly property.
     * 
     */
    public void setAvailableHotelOnly(boolean value) {
        this.availableHotelOnly = value;
    }

    /**
     * Gets the value of the recommendHotelOnly property.
     * 
     */
    public boolean isRecommendHotelOnly() {
        return recommendHotelOnly;
    }

    /**
     * Sets the value of the recommendHotelOnly property.
     * 
     */
    public void setRecommendHotelOnly(boolean value) {
        this.recommendHotelOnly = value;
    }

    /**
     * Gets the value of the clientCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCurrencyCode() {
        return clientCurrencyCode;
    }

    /**
     * Sets the value of the clientCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCurrencyCode(String value) {
        this.clientCurrencyCode = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the sellerMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerMarkup() {
        return sellerMarkup;
    }

    /**
     * Sets the value of the sellerMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerMarkup(String value) {
        this.sellerMarkup = value;
    }

    /**
     * Gets the value of the compareYn property.
     * 
     */
    public boolean isCompareYn() {
        return compareYn;
    }

    /**
     * Sets the value of the compareYn property.
     * 
     */
    public void setCompareYn(boolean value) {
        this.compareYn = value;
    }

    /**
     * Gets the value of the sortType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortType() {
        return sortType;
    }

    /**
     * Sets the value of the sortType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortType(String value) {
        this.sortType = value;
    }

    /**
     * Gets the value of the itemCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemCodeInfo }
     *     
     */
    public ArrayOfItemCodeInfo getItemCodeList() {
        return itemCodeList;
    }

    /**
     * Sets the value of the itemCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemCodeInfo }
     *     
     */
    public void setItemCodeList(ArrayOfItemCodeInfo value) {
        this.itemCodeList = value;
    }

    /**
     * Gets the value of the roomsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomsInfo }
     *     
     */
    public ArrayOfRoomsInfo getRoomsList() {
        return roomsList;
    }

    /**
     * Sets the value of the roomsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomsInfo }
     *     
     */
    public void setRoomsList(ArrayOfRoomsInfo value) {
        this.roomsList = value;
    }

}

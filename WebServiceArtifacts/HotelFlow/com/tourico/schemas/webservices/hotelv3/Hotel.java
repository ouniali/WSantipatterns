
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hotel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location" type="{http://schemas.tourico.com/webservices/hotelv3}HotelLocation" minOccurs="0"/>
 *         &lt;element name="RoomTypes" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfRoomType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="brandId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PropertySubType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumOfRoom" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minAverPublishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="PropertyType" use="required" type="{http://schemas.tourico.com/webservices/hotelv3}PropertyType" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bestValue" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="hotelId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minAverPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="starsLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hotel", propOrder = {
    "location",
    "roomTypes"
})
public class Hotel {

    @XmlElement(name = "Location")
    protected HotelLocation location;
    @XmlElement(name = "RoomTypes")
    protected ArrayOfRoomType roomTypes;
    @XmlAttribute(name = "brandId", required = true)
    protected int brandId;
    @XmlAttribute(name = "brandName")
    protected String brandName;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "PropertySubType")
    protected String propertySubType;
    @XmlAttribute(name = "NumOfRoom", required = true)
    protected int numOfRoom;
    @XmlAttribute(name = "minAverPublishPrice")
    protected BigDecimal minAverPublishPrice;
    @XmlAttribute(name = "PropertyType", required = true)
    protected PropertyType propertyType;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "bestValue", required = true)
    protected boolean bestValue;
    @XmlAttribute(name = "hotelId", required = true)
    protected int hotelId;
    @XmlAttribute(name = "provider")
    protected String provider;
    @XmlAttribute(name = "thumb")
    protected String thumb;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "minAverPrice", required = true)
    protected BigDecimal minAverPrice;
    @XmlAttribute(name = "starsLevel", required = true)
    protected BigDecimal starsLevel;
    @XmlAttribute(name = "desc")
    protected String desc;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link HotelLocation }
     *     
     */
    public HotelLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelLocation }
     *     
     */
    public void setLocation(HotelLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomType }
     *     
     */
    public ArrayOfRoomType getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomType }
     *     
     */
    public void setRoomTypes(ArrayOfRoomType value) {
        this.roomTypes = value;
    }

    /**
     * Gets the value of the brandId property.
     * 
     */
    public int getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     */
    public void setBrandId(int value) {
        this.brandId = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the propertySubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertySubType() {
        return propertySubType;
    }

    /**
     * Sets the value of the propertySubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertySubType(String value) {
        this.propertySubType = value;
    }

    /**
     * Gets the value of the numOfRoom property.
     * 
     */
    public int getNumOfRoom() {
        return numOfRoom;
    }

    /**
     * Sets the value of the numOfRoom property.
     * 
     */
    public void setNumOfRoom(int value) {
        this.numOfRoom = value;
    }

    /**
     * Gets the value of the minAverPublishPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAverPublishPrice() {
        return minAverPublishPrice;
    }

    /**
     * Sets the value of the minAverPublishPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAverPublishPrice(BigDecimal value) {
        this.minAverPublishPrice = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setPropertyType(PropertyType value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the bestValue property.
     * 
     */
    public boolean isBestValue() {
        return bestValue;
    }

    /**
     * Sets the value of the bestValue property.
     * 
     */
    public void setBestValue(boolean value) {
        this.bestValue = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     */
    public int getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     */
    public void setHotelId(int value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the thumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * Sets the value of the thumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumb(String value) {
        this.thumb = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the minAverPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAverPrice() {
        return minAverPrice;
    }

    /**
     * Sets the value of the minAverPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAverPrice(BigDecimal value) {
        this.minAverPrice = value;
    }

    /**
     * Gets the value of the starsLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStarsLevel() {
        return starsLevel;
    }

    /**
     * Sets the value of the starsLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStarsLevel(BigDecimal value) {
        this.starsLevel = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}

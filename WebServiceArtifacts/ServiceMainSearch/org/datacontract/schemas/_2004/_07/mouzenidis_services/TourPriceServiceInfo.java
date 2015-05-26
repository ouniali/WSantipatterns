
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TourPriceServiceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourPriceServiceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accmd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccmdId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelCategoryGlobalKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HotelKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Meal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MealGlobalKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MealKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RoomCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Town" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourPriceServiceInfo", propOrder = {
    "accmd",
    "accmdId",
    "city",
    "cityKey",
    "day",
    "duration",
    "hotel",
    "hotelCategoryGlobalKey",
    "hotelKey",
    "meal",
    "mealGlobalKey",
    "mealKey",
    "roomCategory",
    "roomType",
    "town",
    "url"
})
public class TourPriceServiceInfo {

    @XmlElementRef(name = "Accmd", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accmd;
    @XmlElement(name = "AccmdId")
    protected Integer accmdId;
    @XmlElementRef(name = "City", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElement(name = "CityKey")
    protected Integer cityKey;
    @XmlElement(name = "Day")
    protected Integer day;
    @XmlElementRef(name = "Duration", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> duration;
    @XmlElementRef(name = "Hotel", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotel;
    @XmlElement(name = "HotelCategoryGlobalKey")
    protected Integer hotelCategoryGlobalKey;
    @XmlElement(name = "HotelKey")
    protected Integer hotelKey;
    @XmlElementRef(name = "Meal", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> meal;
    @XmlElement(name = "MealGlobalKey")
    protected Integer mealGlobalKey;
    @XmlElement(name = "MealKey")
    protected Integer mealKey;
    @XmlElementRef(name = "RoomCategory", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomCategory;
    @XmlElementRef(name = "RoomType", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roomType;
    @XmlElementRef(name = "Town", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> town;
    @XmlElementRef(name = "URL", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;

    /**
     * Gets the value of the accmd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccmd() {
        return accmd;
    }

    /**
     * Sets the value of the accmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccmd(JAXBElement<String> value) {
        this.accmd = value;
    }

    /**
     * Gets the value of the accmdId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccmdId() {
        return accmdId;
    }

    /**
     * Sets the value of the accmdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccmdId(Integer value) {
        this.accmdId = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the cityKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCityKey() {
        return cityKey;
    }

    /**
     * Sets the value of the cityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCityKey(Integer value) {
        this.cityKey = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDay(Integer value) {
        this.day = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDuration(JAXBElement<String> value) {
        this.duration = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotel(JAXBElement<String> value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the hotelCategoryGlobalKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelCategoryGlobalKey() {
        return hotelCategoryGlobalKey;
    }

    /**
     * Sets the value of the hotelCategoryGlobalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelCategoryGlobalKey(Integer value) {
        this.hotelCategoryGlobalKey = value;
    }

    /**
     * Gets the value of the hotelKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelKey() {
        return hotelKey;
    }

    /**
     * Sets the value of the hotelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelKey(Integer value) {
        this.hotelKey = value;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeal() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeal(JAXBElement<String> value) {
        this.meal = value;
    }

    /**
     * Gets the value of the mealGlobalKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMealGlobalKey() {
        return mealGlobalKey;
    }

    /**
     * Sets the value of the mealGlobalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMealGlobalKey(Integer value) {
        this.mealGlobalKey = value;
    }

    /**
     * Gets the value of the mealKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMealKey() {
        return mealKey;
    }

    /**
     * Sets the value of the mealKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMealKey(Integer value) {
        this.mealKey = value;
    }

    /**
     * Gets the value of the roomCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomCategory() {
        return roomCategory;
    }

    /**
     * Sets the value of the roomCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomCategory(JAXBElement<String> value) {
        this.roomCategory = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoomType(JAXBElement<String> value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTown(JAXBElement<String> value) {
        this.town = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURL(JAXBElement<String> value) {
        this.url = value;
    }

}

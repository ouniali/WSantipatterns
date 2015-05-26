
package org.datacontract.schemas._2004._07.mouzenidis_services_objects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hotel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hotel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary}DictionaryBase">
 *       &lt;sequence>
 *         &lt;element name="CityID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HTTP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelCategoryGlobal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelCategoryGlobalID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HotelCategoryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HotelTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelTownLat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hotel", propOrder = {
    "cityID",
    "countryID",
    "http",
    "hotelCategory",
    "hotelCategoryGlobal",
    "hotelCategoryGlobalID",
    "hotelCategoryID",
    "hotelTown",
    "hotelTownLat",
    "rating"
})
public class Hotel
    extends DictionaryBase
{

    @XmlElement(name = "CityID")
    protected Integer cityID;
    @XmlElement(name = "CountryID")
    protected Integer countryID;
    @XmlElementRef(name = "HTTP", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> http;
    @XmlElementRef(name = "HotelCategory", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelCategory;
    @XmlElementRef(name = "HotelCategoryGlobal", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelCategoryGlobal;
    @XmlElement(name = "HotelCategoryGlobalID")
    protected Integer hotelCategoryGlobalID;
    @XmlElement(name = "HotelCategoryID")
    protected Integer hotelCategoryID;
    @XmlElementRef(name = "HotelTown", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelTown;
    @XmlElementRef(name = "HotelTownLat", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects.Dictionary", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hotelTownLat;
    @XmlElement(name = "Rating")
    protected Double rating;

    /**
     * Gets the value of the cityID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCityID() {
        return cityID;
    }

    /**
     * Sets the value of the cityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCityID(Integer value) {
        this.cityID = value;
    }

    /**
     * Gets the value of the countryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryID(Integer value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the http property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHTTP() {
        return http;
    }

    /**
     * Sets the value of the http property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHTTP(JAXBElement<String> value) {
        this.http = value;
    }

    /**
     * Gets the value of the hotelCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelCategory() {
        return hotelCategory;
    }

    /**
     * Sets the value of the hotelCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelCategory(JAXBElement<String> value) {
        this.hotelCategory = value;
    }

    /**
     * Gets the value of the hotelCategoryGlobal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelCategoryGlobal() {
        return hotelCategoryGlobal;
    }

    /**
     * Sets the value of the hotelCategoryGlobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelCategoryGlobal(JAXBElement<String> value) {
        this.hotelCategoryGlobal = value;
    }

    /**
     * Gets the value of the hotelCategoryGlobalID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelCategoryGlobalID() {
        return hotelCategoryGlobalID;
    }

    /**
     * Sets the value of the hotelCategoryGlobalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelCategoryGlobalID(Integer value) {
        this.hotelCategoryGlobalID = value;
    }

    /**
     * Gets the value of the hotelCategoryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelCategoryID() {
        return hotelCategoryID;
    }

    /**
     * Sets the value of the hotelCategoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelCategoryID(Integer value) {
        this.hotelCategoryID = value;
    }

    /**
     * Gets the value of the hotelTown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelTown() {
        return hotelTown;
    }

    /**
     * Sets the value of the hotelTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelTown(JAXBElement<String> value) {
        this.hotelTown = value;
    }

    /**
     * Gets the value of the hotelTownLat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHotelTownLat() {
        return hotelTownLat;
    }

    /**
     * Sets the value of the hotelTownLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHotelTownLat(JAXBElement<String> value) {
        this.hotelTownLat = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRating(Double value) {
        this.rating = value;
    }

}


package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HotelDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortugueseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnglishDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpanishDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelCategory" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URLThumb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pictures" type="{WS_2013.Hotel}ArrayOfHotelDetailPhoto" minOccurs="0"/>
 *         &lt;element name="Amenities" type="{WS_2013.Hotel}ArrayOfAmenity" minOccurs="0"/>
 *         &lt;element name="CategoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrlStreetView" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MapUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDetail", propOrder = {
    "cityId",
    "hotelName",
    "address",
    "phone",
    "portugueseDescription",
    "englishDescription",
    "spanishDescription",
    "hotelCategory",
    "zipCode",
    "webSite",
    "email",
    "urlThumb",
    "pictures",
    "amenities",
    "categoryDescription",
    "hotelFax",
    "urlStreetView",
    "mapUrl",
    "hotelId",
    "cityName",
    "countryName",
    "lastUpdate"
})
public class HotelDetail {

    @XmlElement(name = "CityId")
    protected int cityId;
    @XmlElement(name = "HotelName")
    protected String hotelName;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "PortugueseDescription")
    protected String portugueseDescription;
    @XmlElement(name = "EnglishDescription")
    protected String englishDescription;
    @XmlElement(name = "SpanishDescription")
    protected String spanishDescription;
    @XmlElement(name = "HotelCategory", required = true, type = Double.class, nillable = true)
    protected Double hotelCategory;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "WebSite")
    protected String webSite;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "URLThumb")
    protected String urlThumb;
    @XmlElement(name = "Pictures")
    protected ArrayOfHotelDetailPhoto pictures;
    @XmlElement(name = "Amenities")
    protected ArrayOfAmenity amenities;
    @XmlElement(name = "CategoryDescription")
    protected String categoryDescription;
    @XmlElement(name = "HotelFax")
    protected String hotelFax;
    @XmlElement(name = "UrlStreetView")
    protected String urlStreetView;
    @XmlElement(name = "MapUrl")
    protected String mapUrl;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "LastUpdate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;

    /**
     * Gets the value of the cityId property.
     * 
     */
    public int getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     */
    public void setCityId(int value) {
        this.cityId = value;
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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the portugueseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortugueseDescription() {
        return portugueseDescription;
    }

    /**
     * Sets the value of the portugueseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortugueseDescription(String value) {
        this.portugueseDescription = value;
    }

    /**
     * Gets the value of the englishDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishDescription() {
        return englishDescription;
    }

    /**
     * Sets the value of the englishDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishDescription(String value) {
        this.englishDescription = value;
    }

    /**
     * Gets the value of the spanishDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpanishDescription() {
        return spanishDescription;
    }

    /**
     * Sets the value of the spanishDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpanishDescription(String value) {
        this.spanishDescription = value;
    }

    /**
     * Gets the value of the hotelCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHotelCategory() {
        return hotelCategory;
    }

    /**
     * Sets the value of the hotelCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHotelCategory(Double value) {
        this.hotelCategory = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSite(String value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the urlThumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLThumb() {
        return urlThumb;
    }

    /**
     * Sets the value of the urlThumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLThumb(String value) {
        this.urlThumb = value;
    }

    /**
     * Gets the value of the pictures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelDetailPhoto }
     *     
     */
    public ArrayOfHotelDetailPhoto getPictures() {
        return pictures;
    }

    /**
     * Sets the value of the pictures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelDetailPhoto }
     *     
     */
    public void setPictures(ArrayOfHotelDetailPhoto value) {
        this.pictures = value;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAmenity }
     *     
     */
    public ArrayOfAmenity getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAmenity }
     *     
     */
    public void setAmenities(ArrayOfAmenity value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the categoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * Sets the value of the categoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryDescription(String value) {
        this.categoryDescription = value;
    }

    /**
     * Gets the value of the hotelFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelFax() {
        return hotelFax;
    }

    /**
     * Sets the value of the hotelFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelFax(String value) {
        this.hotelFax = value;
    }

    /**
     * Gets the value of the urlStreetView property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlStreetView() {
        return urlStreetView;
    }

    /**
     * Sets the value of the urlStreetView property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlStreetView(String value) {
        this.urlStreetView = value;
    }

    /**
     * Gets the value of the mapUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapUrl() {
        return mapUrl;
    }

    /**
     * Sets the value of the mapUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapUrl(String value) {
        this.mapUrl = value;
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
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

}


package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfshort;


/**
 * <p>Java class for FilterParametr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterParametr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccommodationsCheck" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="Cities" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="CityKey" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="CityKeyTo" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="CountryKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrencyIsoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Debug" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}FilterParametr.Diagnostic" minOccurs="0"/>
 *         &lt;element name="Durations" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="HotelCategories" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="HotelFacilities" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="HotelGroups" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="HotelRatingFrom" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HotelRatingTo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Hotels" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="HotelsToExclude" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="InGlobalCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsOnlyHot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsQuota_Flight_Ok" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsQuota_Flight_Stop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsQuota_Flight_Wait" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsQuota_Hotel_Ok" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsQuota_Hotel_Stop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsQuota_Hotel_Wait" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Localization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Meals" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Pax_AdultCount" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Pax_ChildAges" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfshort" minOccurs="0"/>
 *         &lt;element name="Pax_ChildCount" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Paxs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceMax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PriceMin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RoomCategories" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="Sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderMarket" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TourID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TourTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="Tours" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="TransportKind" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}TransportKind" minOccurs="0"/>
 *         &lt;element name="TransportKindId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterParametr", propOrder = {
    "accommodationsCheck",
    "cities",
    "cityKey",
    "cityKeyTo",
    "countryKey",
    "currencyIsoCode",
    "dateBegin",
    "dateEnd",
    "debug",
    "durations",
    "hotelCategories",
    "hotelFacilities",
    "hotelGroups",
    "hotelRatingFrom",
    "hotelRatingTo",
    "hotels",
    "hotelsToExclude",
    "inGlobalCode",
    "isOnlyHot",
    "isQuotaFlightOk",
    "isQuotaFlightStop",
    "isQuotaFlightWait",
    "isQuotaHotelOk",
    "isQuotaHotelStop",
    "isQuotaHotelWait",
    "localization",
    "meals",
    "pageNumber",
    "pageSize",
    "paxAdultCount",
    "paxChildAges",
    "paxChildCount",
    "paxs",
    "priceMax",
    "priceMin",
    "roomCategories",
    "sender",
    "senderMarket",
    "tourID",
    "tourTypes",
    "tours",
    "transportKind",
    "transportKindId"
})
public class FilterParametr {

    @XmlElementRef(name = "AccommodationsCheck", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> accommodationsCheck;
    @XmlElementRef(name = "Cities", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> cities;
    @XmlElementRef(name = "CityKey", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> cityKey;
    @XmlElementRef(name = "CityKeyTo", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> cityKeyTo;
    @XmlElement(name = "CountryKey")
    protected Integer countryKey;
    @XmlElementRef(name = "CurrencyIsoCode", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyIsoCode;
    @XmlElement(name = "DateBegin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBegin;
    @XmlElement(name = "DateEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEnd;
    @XmlElementRef(name = "Debug", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<FilterParametrDiagnostic> debug;
    @XmlElementRef(name = "Durations", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> durations;
    @XmlElementRef(name = "HotelCategories", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> hotelCategories;
    @XmlElementRef(name = "HotelFacilities", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> hotelFacilities;
    @XmlElementRef(name = "HotelGroups", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> hotelGroups;
    @XmlElement(name = "HotelRatingFrom")
    protected Double hotelRatingFrom;
    @XmlElement(name = "HotelRatingTo")
    protected Double hotelRatingTo;
    @XmlElementRef(name = "Hotels", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> hotels;
    @XmlElementRef(name = "HotelsToExclude", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> hotelsToExclude;
    @XmlElement(name = "InGlobalCode")
    protected Boolean inGlobalCode;
    @XmlElement(name = "IsOnlyHot")
    protected Boolean isOnlyHot;
    @XmlElement(name = "IsQuota_Flight_Ok")
    protected Boolean isQuotaFlightOk;
    @XmlElement(name = "IsQuota_Flight_Stop")
    protected Boolean isQuotaFlightStop;
    @XmlElement(name = "IsQuota_Flight_Wait")
    protected Boolean isQuotaFlightWait;
    @XmlElement(name = "IsQuota_Hotel_Ok")
    protected Boolean isQuotaHotelOk;
    @XmlElement(name = "IsQuota_Hotel_Stop")
    protected Boolean isQuotaHotelStop;
    @XmlElement(name = "IsQuota_Hotel_Wait")
    protected Boolean isQuotaHotelWait;
    @XmlElementRef(name = "Localization", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localization;
    @XmlElementRef(name = "Meals", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> meals;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "Pax_AdultCount")
    protected Short paxAdultCount;
    @XmlElementRef(name = "Pax_ChildAges", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfshort> paxChildAges;
    @XmlElement(name = "Pax_ChildCount")
    protected Short paxChildCount;
    @XmlElementRef(name = "Paxs", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paxs;
    @XmlElement(name = "PriceMax")
    protected Double priceMax;
    @XmlElement(name = "PriceMin")
    protected Double priceMin;
    @XmlElementRef(name = "RoomCategories", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> roomCategories;
    @XmlElementRef(name = "Sender", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sender;
    @XmlElement(name = "SenderMarket")
    protected Integer senderMarket;
    @XmlElement(name = "TourID")
    protected Integer tourID;
    @XmlElementRef(name = "TourTypes", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> tourTypes;
    @XmlElementRef(name = "Tours", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> tours;
    @XmlElement(name = "TransportKind")
    @XmlSchemaType(name = "string")
    protected TransportKind transportKind;
    @XmlElement(name = "TransportKindId")
    protected Integer transportKindId;

    /**
     * Gets the value of the accommodationsCheck property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getAccommodationsCheck() {
        return accommodationsCheck;
    }

    /**
     * Sets the value of the accommodationsCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setAccommodationsCheck(JAXBElement<ArrayOfint> value) {
        this.accommodationsCheck = value;
    }

    /**
     * Gets the value of the cities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getCities() {
        return cities;
    }

    /**
     * Sets the value of the cities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setCities(JAXBElement<ArrayOfint> value) {
        this.cities = value;
    }

    /**
     * Gets the value of the cityKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getCityKey() {
        return cityKey;
    }

    /**
     * Sets the value of the cityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setCityKey(JAXBElement<ArrayOfint> value) {
        this.cityKey = value;
    }

    /**
     * Gets the value of the cityKeyTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getCityKeyTo() {
        return cityKeyTo;
    }

    /**
     * Sets the value of the cityKeyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setCityKeyTo(JAXBElement<ArrayOfint> value) {
        this.cityKeyTo = value;
    }

    /**
     * Gets the value of the countryKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryKey() {
        return countryKey;
    }

    /**
     * Sets the value of the countryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryKey(Integer value) {
        this.countryKey = value;
    }

    /**
     * Gets the value of the currencyIsoCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyIsoCode() {
        return currencyIsoCode;
    }

    /**
     * Sets the value of the currencyIsoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyIsoCode(JAXBElement<String> value) {
        this.currencyIsoCode = value;
    }

    /**
     * Gets the value of the dateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBegin() {
        return dateBegin;
    }

    /**
     * Sets the value of the dateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBegin(XMLGregorianCalendar value) {
        this.dateBegin = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEnd(XMLGregorianCalendar value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the debug property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FilterParametrDiagnostic }{@code >}
     *     
     */
    public JAXBElement<FilterParametrDiagnostic> getDebug() {
        return debug;
    }

    /**
     * Sets the value of the debug property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FilterParametrDiagnostic }{@code >}
     *     
     */
    public void setDebug(JAXBElement<FilterParametrDiagnostic> value) {
        this.debug = value;
    }

    /**
     * Gets the value of the durations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getDurations() {
        return durations;
    }

    /**
     * Sets the value of the durations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setDurations(JAXBElement<ArrayOfint> value) {
        this.durations = value;
    }

    /**
     * Gets the value of the hotelCategories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getHotelCategories() {
        return hotelCategories;
    }

    /**
     * Sets the value of the hotelCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setHotelCategories(JAXBElement<ArrayOfint> value) {
        this.hotelCategories = value;
    }

    /**
     * Gets the value of the hotelFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getHotelFacilities() {
        return hotelFacilities;
    }

    /**
     * Sets the value of the hotelFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setHotelFacilities(JAXBElement<ArrayOfint> value) {
        this.hotelFacilities = value;
    }

    /**
     * Gets the value of the hotelGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getHotelGroups() {
        return hotelGroups;
    }

    /**
     * Sets the value of the hotelGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setHotelGroups(JAXBElement<ArrayOfint> value) {
        this.hotelGroups = value;
    }

    /**
     * Gets the value of the hotelRatingFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHotelRatingFrom() {
        return hotelRatingFrom;
    }

    /**
     * Sets the value of the hotelRatingFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHotelRatingFrom(Double value) {
        this.hotelRatingFrom = value;
    }

    /**
     * Gets the value of the hotelRatingTo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHotelRatingTo() {
        return hotelRatingTo;
    }

    /**
     * Sets the value of the hotelRatingTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHotelRatingTo(Double value) {
        this.hotelRatingTo = value;
    }

    /**
     * Gets the value of the hotels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getHotels() {
        return hotels;
    }

    /**
     * Sets the value of the hotels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setHotels(JAXBElement<ArrayOfint> value) {
        this.hotels = value;
    }

    /**
     * Gets the value of the hotelsToExclude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getHotelsToExclude() {
        return hotelsToExclude;
    }

    /**
     * Sets the value of the hotelsToExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setHotelsToExclude(JAXBElement<ArrayOfint> value) {
        this.hotelsToExclude = value;
    }

    /**
     * Gets the value of the inGlobalCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInGlobalCode() {
        return inGlobalCode;
    }

    /**
     * Sets the value of the inGlobalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInGlobalCode(Boolean value) {
        this.inGlobalCode = value;
    }

    /**
     * Gets the value of the isOnlyHot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOnlyHot() {
        return isOnlyHot;
    }

    /**
     * Sets the value of the isOnlyHot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOnlyHot(Boolean value) {
        this.isOnlyHot = value;
    }

    /**
     * Gets the value of the isQuotaFlightOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuotaFlightOk() {
        return isQuotaFlightOk;
    }

    /**
     * Sets the value of the isQuotaFlightOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuotaFlightOk(Boolean value) {
        this.isQuotaFlightOk = value;
    }

    /**
     * Gets the value of the isQuotaFlightStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuotaFlightStop() {
        return isQuotaFlightStop;
    }

    /**
     * Sets the value of the isQuotaFlightStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuotaFlightStop(Boolean value) {
        this.isQuotaFlightStop = value;
    }

    /**
     * Gets the value of the isQuotaFlightWait property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuotaFlightWait() {
        return isQuotaFlightWait;
    }

    /**
     * Sets the value of the isQuotaFlightWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuotaFlightWait(Boolean value) {
        this.isQuotaFlightWait = value;
    }

    /**
     * Gets the value of the isQuotaHotelOk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuotaHotelOk() {
        return isQuotaHotelOk;
    }

    /**
     * Sets the value of the isQuotaHotelOk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuotaHotelOk(Boolean value) {
        this.isQuotaHotelOk = value;
    }

    /**
     * Gets the value of the isQuotaHotelStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuotaHotelStop() {
        return isQuotaHotelStop;
    }

    /**
     * Sets the value of the isQuotaHotelStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuotaHotelStop(Boolean value) {
        this.isQuotaHotelStop = value;
    }

    /**
     * Gets the value of the isQuotaHotelWait property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuotaHotelWait() {
        return isQuotaHotelWait;
    }

    /**
     * Sets the value of the isQuotaHotelWait property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuotaHotelWait(Boolean value) {
        this.isQuotaHotelWait = value;
    }

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalization(JAXBElement<String> value) {
        this.localization = value;
    }

    /**
     * Gets the value of the meals property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getMeals() {
        return meals;
    }

    /**
     * Sets the value of the meals property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setMeals(JAXBElement<ArrayOfint> value) {
        this.meals = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the paxAdultCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPaxAdultCount() {
        return paxAdultCount;
    }

    /**
     * Sets the value of the paxAdultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPaxAdultCount(Short value) {
        this.paxAdultCount = value;
    }

    /**
     * Gets the value of the paxChildAges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfshort }{@code >}
     *     
     */
    public JAXBElement<ArrayOfshort> getPaxChildAges() {
        return paxChildAges;
    }

    /**
     * Sets the value of the paxChildAges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfshort }{@code >}
     *     
     */
    public void setPaxChildAges(JAXBElement<ArrayOfshort> value) {
        this.paxChildAges = value;
    }

    /**
     * Gets the value of the paxChildCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPaxChildCount() {
        return paxChildCount;
    }

    /**
     * Sets the value of the paxChildCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPaxChildCount(Short value) {
        this.paxChildCount = value;
    }

    /**
     * Gets the value of the paxs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaxs() {
        return paxs;
    }

    /**
     * Sets the value of the paxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaxs(JAXBElement<String> value) {
        this.paxs = value;
    }

    /**
     * Gets the value of the priceMax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPriceMax() {
        return priceMax;
    }

    /**
     * Sets the value of the priceMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPriceMax(Double value) {
        this.priceMax = value;
    }

    /**
     * Gets the value of the priceMin property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPriceMin() {
        return priceMin;
    }

    /**
     * Sets the value of the priceMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPriceMin(Double value) {
        this.priceMin = value;
    }

    /**
     * Gets the value of the roomCategories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getRoomCategories() {
        return roomCategories;
    }

    /**
     * Sets the value of the roomCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setRoomCategories(JAXBElement<ArrayOfint> value) {
        this.roomCategories = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSender(JAXBElement<String> value) {
        this.sender = value;
    }

    /**
     * Gets the value of the senderMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSenderMarket() {
        return senderMarket;
    }

    /**
     * Sets the value of the senderMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSenderMarket(Integer value) {
        this.senderMarket = value;
    }

    /**
     * Gets the value of the tourID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTourID() {
        return tourID;
    }

    /**
     * Sets the value of the tourID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTourID(Integer value) {
        this.tourID = value;
    }

    /**
     * Gets the value of the tourTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getTourTypes() {
        return tourTypes;
    }

    /**
     * Sets the value of the tourTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setTourTypes(JAXBElement<ArrayOfint> value) {
        this.tourTypes = value;
    }

    /**
     * Gets the value of the tours property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getTours() {
        return tours;
    }

    /**
     * Sets the value of the tours property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setTours(JAXBElement<ArrayOfint> value) {
        this.tours = value;
    }

    /**
     * Gets the value of the transportKind property.
     * 
     * @return
     *     possible object is
     *     {@link TransportKind }
     *     
     */
    public TransportKind getTransportKind() {
        return transportKind;
    }

    /**
     * Sets the value of the transportKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportKind }
     *     
     */
    public void setTransportKind(TransportKind value) {
        this.transportKind = value;
    }

    /**
     * Gets the value of the transportKindId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransportKindId() {
        return transportKindId;
    }

    /**
     * Sets the value of the transportKindId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransportKindId(Integer value) {
        this.transportKindId = value;
    }

}


package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="searchingState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="searchingCity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="longitude" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="latitude" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelLocation")
public class HotelLocation {

    @XmlAttribute(name = "countryCode")
    protected String countryCode;
    @XmlAttribute(name = "stateCode")
    protected String stateCode;
    @XmlAttribute(name = "city")
    protected String city;
    @XmlAttribute(name = "searchingState")
    protected String searchingState;
    @XmlAttribute(name = "searchingCity")
    protected String searchingCity;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "longitude", required = true)
    protected BigDecimal longitude;
    @XmlAttribute(name = "latitude", required = true)
    protected BigDecimal latitude;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the searchingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchingState() {
        return searchingState;
    }

    /**
     * Sets the value of the searchingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchingState(String value) {
        this.searchingState = value;
    }

    /**
     * Gets the value of the searchingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchingCity() {
        return searchingCity;
    }

    /**
     * Sets the value of the searchingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchingCity(String value) {
        this.searchingCity = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
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
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

}

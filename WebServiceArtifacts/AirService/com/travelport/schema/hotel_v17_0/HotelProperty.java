
package com.travelport.schema.hotel_v17_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.CoordinateLocation;
import com.travelport.schema.common_v15_0.Distance;
import com.travelport.schema.common_v15_0.PhoneNumber;
import com.travelport.schema.common_v15_0.TypeReserveRequirement;


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
 *         &lt;element name="PropertyAddress" type="{http://www.travelport.com/schema/hotel_v17_0}typeUnstructuredAddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}PhoneNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CoordinateLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Distance" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelRating" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}Amenities" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="HotelChain" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeHotelChainCode" />
 *       &lt;attribute name="HotelCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeHotelCode" />
 *       &lt;attribute name="HotelLocation" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VendorLocationKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HotelTransportation" type="{http://www.travelport.com/schema/hotel_v17_0}typeTransportationType" />
 *       &lt;attribute name="ReserveRequirement" type="{http://www.travelport.com/schema/common_v15_0}typeReserveRequirement" />
 *       &lt;attribute name="ParticipationLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Availability" type="{http://www.travelport.com/schema/hotel_v17_0}typeHotelAvailability" />
 *       &lt;attribute name="FeaturedProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "propertyAddress",
    "phoneNumber",
    "coordinateLocation",
    "distance",
    "hotelRating",
    "amenities"
})
@XmlRootElement(name = "HotelProperty")
public class HotelProperty {

    @XmlElement(name = "PropertyAddress")
    protected TypeUnstructuredAddress propertyAddress;
    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<PhoneNumber> phoneNumber;
    @XmlElement(name = "CoordinateLocation", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected CoordinateLocation coordinateLocation;
    @XmlElement(name = "Distance", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected Distance distance;
    @XmlElement(name = "HotelRating")
    protected List<HotelRating> hotelRating;
    @XmlElement(name = "Amenities")
    protected Amenities amenities;
    @XmlAttribute(name = "HotelChain", required = true)
    protected String hotelChain;
    @XmlAttribute(name = "HotelCode", required = true)
    protected String hotelCode;
    @XmlAttribute(name = "HotelLocation")
    protected String hotelLocation;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "VendorLocationKey")
    protected String vendorLocationKey;
    @XmlAttribute(name = "HotelTransportation")
    protected TypeTransportationType hotelTransportation;
    @XmlAttribute(name = "ReserveRequirement")
    protected TypeReserveRequirement reserveRequirement;
    @XmlAttribute(name = "ParticipationLevel")
    protected String participationLevel;
    @XmlAttribute(name = "Availability")
    protected TypeHotelAvailability availability;
    @XmlAttribute(name = "FeaturedProperty")
    protected Boolean featuredProperty;
    @XmlAttribute(name = "Key")
    protected String key;

    /**
     * Gets the value of the propertyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link TypeUnstructuredAddress }
     *     
     */
    public TypeUnstructuredAddress getPropertyAddress() {
        return propertyAddress;
    }

    /**
     * Sets the value of the propertyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeUnstructuredAddress }
     *     
     */
    public void setPropertyAddress(TypeUnstructuredAddress value) {
        this.propertyAddress = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumber }
     * 
     * 
     */
    public List<PhoneNumber> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<PhoneNumber>();
        }
        return this.phoneNumber;
    }

    /**
     * Gets the value of the coordinateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateLocation }
     *     
     */
    public CoordinateLocation getCoordinateLocation() {
        return coordinateLocation;
    }

    /**
     * Sets the value of the coordinateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateLocation }
     *     
     */
    public void setCoordinateLocation(CoordinateLocation value) {
        this.coordinateLocation = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistance(Distance value) {
        this.distance = value;
    }

    /**
     * Gets the value of the hotelRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRating }
     * 
     * 
     */
    public List<HotelRating> getHotelRating() {
        if (hotelRating == null) {
            hotelRating = new ArrayList<HotelRating>();
        }
        return this.hotelRating;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link Amenities }
     *     
     */
    public Amenities getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amenities }
     *     
     */
    public void setAmenities(Amenities value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the hotelChain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelChain() {
        return hotelChain;
    }

    /**
     * Sets the value of the hotelChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelChain(String value) {
        this.hotelChain = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the hotelLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelLocation() {
        return hotelLocation;
    }

    /**
     * Sets the value of the hotelLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelLocation(String value) {
        this.hotelLocation = value;
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
     * Gets the value of the vendorLocationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorLocationKey() {
        return vendorLocationKey;
    }

    /**
     * Sets the value of the vendorLocationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorLocationKey(String value) {
        this.vendorLocationKey = value;
    }

    /**
     * Gets the value of the hotelTransportation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransportationType }
     *     
     */
    public TypeTransportationType getHotelTransportation() {
        return hotelTransportation;
    }

    /**
     * Sets the value of the hotelTransportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransportationType }
     *     
     */
    public void setHotelTransportation(TypeTransportationType value) {
        this.hotelTransportation = value;
    }

    /**
     * Gets the value of the reserveRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link TypeReserveRequirement }
     *     
     */
    public TypeReserveRequirement getReserveRequirement() {
        return reserveRequirement;
    }

    /**
     * Sets the value of the reserveRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReserveRequirement }
     *     
     */
    public void setReserveRequirement(TypeReserveRequirement value) {
        this.reserveRequirement = value;
    }

    /**
     * Gets the value of the participationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipationLevel() {
        return participationLevel;
    }

    /**
     * Sets the value of the participationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipationLevel(String value) {
        this.participationLevel = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHotelAvailability }
     *     
     */
    public TypeHotelAvailability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHotelAvailability }
     *     
     */
    public void setAvailability(TypeHotelAvailability value) {
        this.availability = value;
    }

    /**
     * Gets the value of the featuredProperty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeaturedProperty() {
        return featuredProperty;
    }

    /**
     * Sets the value of the featuredProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeaturedProperty(Boolean value) {
        this.featuredProperty = value;
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

}

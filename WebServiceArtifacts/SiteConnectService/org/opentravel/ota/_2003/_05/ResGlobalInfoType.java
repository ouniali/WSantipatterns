
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResGlobalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResGlobalInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ResCommonDetailType">
 *       &lt;sequence>
 *         &lt;element name="HotelReservationIDs" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationIDsType" minOccurs="0"/>
 *         &lt;element name="RoutingHops" type="{http://www.opentravel.org/OTA/2003/05}RoutingHopType" minOccurs="0"/>
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType" minOccurs="0"/>
 *         &lt;element name="BookingRules" type="{http://www.opentravel.org/OTA/2003/05}BookingRulesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGlobalInfoType", propOrder = {
    "hotelReservationIDs",
    "routingHops",
    "profiles",
    "bookingRules"
})
public class ResGlobalInfoType
    extends ResCommonDetailType
{

    @XmlElement(name = "HotelReservationIDs")
    protected HotelReservationIDsType hotelReservationIDs;
    @XmlElement(name = "RoutingHops")
    protected RoutingHopType routingHops;
    @XmlElement(name = "Profiles")
    protected ProfilesType profiles;
    @XmlElement(name = "BookingRules")
    protected BookingRulesType bookingRules;

    /**
     * Gets the value of the hotelReservationIDs property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationIDsType }
     *     
     */
    public HotelReservationIDsType getHotelReservationIDs() {
        return hotelReservationIDs;
    }

    /**
     * Sets the value of the hotelReservationIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationIDsType }
     *     
     */
    public void setHotelReservationIDs(HotelReservationIDsType value) {
        this.hotelReservationIDs = value;
    }

    /**
     * Gets the value of the routingHops property.
     * 
     * @return
     *     possible object is
     *     {@link RoutingHopType }
     *     
     */
    public RoutingHopType getRoutingHops() {
        return routingHops;
    }

    /**
     * Sets the value of the routingHops property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingHopType }
     *     
     */
    public void setRoutingHops(RoutingHopType value) {
        this.routingHops = value;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link ProfilesType }
     *     
     */
    public ProfilesType getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfilesType }
     *     
     */
    public void setProfiles(ProfilesType value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the bookingRules property.
     * 
     * @return
     *     possible object is
     *     {@link BookingRulesType }
     *     
     */
    public BookingRulesType getBookingRules() {
        return bookingRules;
    }

    /**
     * Sets the value of the bookingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingRulesType }
     *     
     */
    public void setBookingRules(BookingRulesType value) {
        this.bookingRules = value;
    }

}

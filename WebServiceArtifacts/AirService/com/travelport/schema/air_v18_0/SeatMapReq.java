
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.AgencySellInfo;
import com.travelport.schema.common_v15_0.BaseReq;
import com.travelport.schema.common_v15_0.HostToken;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AgencySellInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSegment"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}HostToken" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}BookingCode"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}SearchTraveler" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}HostReservation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnSeatPricing" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agencySellInfo",
    "airSegment",
    "hostToken",
    "bookingCode",
    "searchTraveler",
    "hostReservation"
})
@XmlRootElement(name = "SeatMapReq")
public class SeatMapReq
    extends BaseReq
{

    @XmlElement(name = "AgencySellInfo", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected AgencySellInfo agencySellInfo;
    @XmlElement(name = "AirSegment", required = true)
    protected AirSegment airSegment;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected HostToken hostToken;
    @XmlElement(name = "BookingCode", required = true)
    protected BookingCode bookingCode;
    @XmlElement(name = "SearchTraveler")
    protected List<SearchTraveler> searchTraveler;
    @XmlElement(name = "HostReservation")
    protected HostReservation hostReservation;
    @XmlAttribute(name = "ReturnSeatPricing")
    protected Boolean returnSeatPricing;

    /**
     * 
     *                     				Required if the user requesting the seat map is not the same agent authenticated in the request.
     *                     			
     * 
     * @return
     *     possible object is
     *     {@link AgencySellInfo }
     *     
     */
    public AgencySellInfo getAgencySellInfo() {
        return agencySellInfo;
    }

    /**
     * Sets the value of the agencySellInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencySellInfo }
     *     
     */
    public void setAgencySellInfo(AgencySellInfo value) {
        this.agencySellInfo = value;
    }

    /**
     * Gets the value of the airSegment property.
     * 
     * @return
     *     possible object is
     *     {@link AirSegment }
     *     
     */
    public AirSegment getAirSegment() {
        return airSegment;
    }

    /**
     * Sets the value of the airSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSegment }
     *     
     */
    public void setAirSegment(AirSegment value) {
        this.airSegment = value;
    }

    /**
     * Required if the carrier has multiple adapters.
     * 
     * @return
     *     possible object is
     *     {@link HostToken }
     *     
     */
    public HostToken getHostToken() {
        return hostToken;
    }

    /**
     * Sets the value of the hostToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostToken }
     *     
     */
    public void setHostToken(HostToken value) {
        this.hostToken = value;
    }

    /**
     * Gets the value of the bookingCode property.
     * 
     * @return
     *     possible object is
     *     {@link BookingCode }
     *     
     */
    public BookingCode getBookingCode() {
        return bookingCode;
    }

    /**
     * Sets the value of the bookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingCode }
     *     
     */
    public void setBookingCode(BookingCode value) {
        this.bookingCode = value;
    }

    /**
     * Gets the value of the searchTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchTraveler }
     * 
     * 
     */
    public List<SearchTraveler> getSearchTraveler() {
        if (searchTraveler == null) {
            searchTraveler = new ArrayList<SearchTraveler>();
        }
        return this.searchTraveler;
    }

    /**
     * Required when seat price is requested.
     * 
     * @return
     *     possible object is
     *     {@link HostReservation }
     *     
     */
    public HostReservation getHostReservation() {
        return hostReservation;
    }

    /**
     * Sets the value of the hostReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostReservation }
     *     
     */
    public void setHostReservation(HostReservation value) {
        this.hostReservation = value;
    }

    /**
     * Gets the value of the returnSeatPricing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnSeatPricing() {
        if (returnSeatPricing == null) {
            return false;
        } else {
            return returnSeatPricing;
        }
    }

    /**
     * Sets the value of the returnSeatPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSeatPricing(Boolean value) {
        this.returnSeatPricing = value;
    }

}

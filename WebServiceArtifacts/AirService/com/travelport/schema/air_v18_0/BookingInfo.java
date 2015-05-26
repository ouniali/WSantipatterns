
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypeCabinClass;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BookingCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CabinClass" type="{http://www.travelport.com/schema/common_v15_0}typeCabinClass" />
 *       &lt;attribute name="FareInfoRef" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="CouponRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="AirItinerarySolutionRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BookingInfo")
public class BookingInfo {

    @XmlAttribute(name = "BookingCode", required = true)
    protected String bookingCode;
    @XmlAttribute(name = "CabinClass")
    protected TypeCabinClass cabinClass;
    @XmlAttribute(name = "FareInfoRef", required = true)
    protected String fareInfoRef;
    @XmlAttribute(name = "SegmentRef")
    protected String segmentRef;
    @XmlAttribute(name = "CouponRef")
    protected String couponRef;
    @XmlAttribute(name = "AirItinerarySolutionRef")
    protected String airItinerarySolutionRef;

    /**
     * Gets the value of the bookingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * Sets the value of the bookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCabinClass }
     *     
     */
    public TypeCabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCabinClass }
     *     
     */
    public void setCabinClass(TypeCabinClass value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the fareInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareInfoRef() {
        return fareInfoRef;
    }

    /**
     * Sets the value of the fareInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareInfoRef(String value) {
        this.fareInfoRef = value;
    }

    /**
     * Gets the value of the segmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

    /**
     * Gets the value of the couponRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponRef() {
        return couponRef;
    }

    /**
     * Sets the value of the couponRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponRef(String value) {
        this.couponRef = value;
    }

    /**
     * Gets the value of the airItinerarySolutionRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirItinerarySolutionRef() {
        return airItinerarySolutionRef;
    }

    /**
     * Sets the value of the airItinerarySolutionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirItinerarySolutionRef(String value) {
        this.airItinerarySolutionRef = value;
    }

}


package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}BookingTravelerRef"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}NameOverride"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTravelerRef",
    "nameOverride"
})
@XmlRootElement(name = "ReservationName")
public class ReservationName {

    @XmlElement(name = "BookingTravelerRef")
    protected BookingTravelerRef bookingTravelerRef;
    @XmlElement(name = "NameOverride")
    protected NameOverride nameOverride;

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link BookingTravelerRef }
     *     
     */
    public BookingTravelerRef getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingTravelerRef }
     *     
     */
    public void setBookingTravelerRef(BookingTravelerRef value) {
        this.bookingTravelerRef = value;
    }

    /**
     * To be used if the reservation name is other than booking travelers in the PNR
     * 
     * @return
     *     possible object is
     *     {@link NameOverride }
     *     
     */
    public NameOverride getNameOverride() {
        return nameOverride;
    }

    /**
     * Sets the value of the nameOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameOverride }
     *     
     */
    public void setNameOverride(NameOverride value) {
        this.nameOverride = value;
    }

}

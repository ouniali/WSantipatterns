
package org.datacontract.schemas._2004._07.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightReservationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightReservationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightPriceBreakDown" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}BookingPriceBreakDownEN" minOccurs="0"/>
 *         &lt;element name="eTicket" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfFlightReservationEticketEN" minOccurs="0"/>
 *         &lt;element name="farerules" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfFareRulesEN" minOccurs="0"/>
 *         &lt;element name="flightReservation" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}FlightReservationEN" minOccurs="0"/>
 *         &lt;element name="flightReservationSegments" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfFlightReservationSegmentsEN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightReservationInfo", propOrder = {
    "flightPriceBreakDown",
    "eTicket",
    "farerules",
    "flightReservation",
    "flightReservationSegments"
})
public class FlightReservationInfo {

    @XmlElementRef(name = "FlightPriceBreakDown", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<BookingPriceBreakDownEN> flightPriceBreakDown;
    @XmlElementRef(name = "eTicket", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlightReservationEticketEN> eTicket;
    @XmlElementRef(name = "farerules", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFareRulesEN> farerules;
    @XmlElementRef(name = "flightReservation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightReservationEN> flightReservation;
    @XmlElementRef(name = "flightReservationSegments", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlightReservationSegmentsEN> flightReservationSegments;

    /**
     * Gets the value of the flightPriceBreakDown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BookingPriceBreakDownEN }{@code >}
     *     
     */
    public JAXBElement<BookingPriceBreakDownEN> getFlightPriceBreakDown() {
        return flightPriceBreakDown;
    }

    /**
     * Sets the value of the flightPriceBreakDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BookingPriceBreakDownEN }{@code >}
     *     
     */
    public void setFlightPriceBreakDown(JAXBElement<BookingPriceBreakDownEN> value) {
        this.flightPriceBreakDown = value;
    }

    /**
     * Gets the value of the eTicket property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationEticketEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFlightReservationEticketEN> getETicket() {
        return eTicket;
    }

    /**
     * Sets the value of the eTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationEticketEN }{@code >}
     *     
     */
    public void setETicket(JAXBElement<ArrayOfFlightReservationEticketEN> value) {
        this.eTicket = value;
    }

    /**
     * Gets the value of the farerules property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFareRulesEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFareRulesEN> getFarerules() {
        return farerules;
    }

    /**
     * Sets the value of the farerules property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFareRulesEN }{@code >}
     *     
     */
    public void setFarerules(JAXBElement<ArrayOfFareRulesEN> value) {
        this.farerules = value;
    }

    /**
     * Gets the value of the flightReservation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightReservationEN }{@code >}
     *     
     */
    public JAXBElement<FlightReservationEN> getFlightReservation() {
        return flightReservation;
    }

    /**
     * Sets the value of the flightReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightReservationEN }{@code >}
     *     
     */
    public void setFlightReservation(JAXBElement<FlightReservationEN> value) {
        this.flightReservation = value;
    }

    /**
     * Gets the value of the flightReservationSegments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationSegmentsEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFlightReservationSegmentsEN> getFlightReservationSegments() {
        return flightReservationSegments;
    }

    /**
     * Sets the value of the flightReservationSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationSegmentsEN }{@code >}
     *     
     */
    public void setFlightReservationSegments(JAXBElement<ArrayOfFlightReservationSegmentsEN> value) {
        this.flightReservationSegments = value;
    }

}

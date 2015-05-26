
package org.datacontract.schemas._2004._07.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultilegFlightReservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultilegFlightReservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightReservation" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}FlightReservationEN" minOccurs="0"/>
 *         &lt;element name="FlightReservationSegments" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfFlightReservationSegmentsEN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultilegFlightReservation", propOrder = {
    "flightReservation",
    "flightReservationSegments"
})
public class MultilegFlightReservation {

    @XmlElementRef(name = "FlightReservation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightReservationEN> flightReservation;
    @XmlElementRef(name = "FlightReservationSegments", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlightReservationSegmentsEN> flightReservationSegments;

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

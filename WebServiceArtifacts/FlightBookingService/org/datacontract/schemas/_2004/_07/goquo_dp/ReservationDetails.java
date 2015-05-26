
package org.datacontract.schemas._2004._07.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}FlightReservationInfo" minOccurs="0"/>
 *         &lt;element name="InvalidAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReservationInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ReservationsEN" minOccurs="0"/>
 *         &lt;element name="passengerDetails" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PassengerDetailsEN" minOccurs="0"/>
 *         &lt;element name="passengers" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfPassengersEN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", propOrder = {
    "flightInfo",
    "invalidAccount",
    "reservationInfo",
    "passengerDetails",
    "passengers"
})
public class ReservationDetails {

    @XmlElementRef(name = "FlightInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightReservationInfo> flightInfo;
    @XmlElement(name = "InvalidAccount")
    protected Boolean invalidAccount;
    @XmlElementRef(name = "ReservationInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ReservationsEN> reservationInfo;
    @XmlElementRef(name = "passengerDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PassengerDetailsEN> passengerDetails;
    @XmlElementRef(name = "passengers", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPassengersEN> passengers;

    /**
     * Gets the value of the flightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightReservationInfo }{@code >}
     *     
     */
    public JAXBElement<FlightReservationInfo> getFlightInfo() {
        return flightInfo;
    }

    /**
     * Sets the value of the flightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightReservationInfo }{@code >}
     *     
     */
    public void setFlightInfo(JAXBElement<FlightReservationInfo> value) {
        this.flightInfo = value;
    }

    /**
     * Gets the value of the invalidAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvalidAccount() {
        return invalidAccount;
    }

    /**
     * Sets the value of the invalidAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvalidAccount(Boolean value) {
        this.invalidAccount = value;
    }

    /**
     * Gets the value of the reservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReservationsEN }{@code >}
     *     
     */
    public JAXBElement<ReservationsEN> getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Sets the value of the reservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReservationsEN }{@code >}
     *     
     */
    public void setReservationInfo(JAXBElement<ReservationsEN> value) {
        this.reservationInfo = value;
    }

    /**
     * Gets the value of the passengerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PassengerDetailsEN }{@code >}
     *     
     */
    public JAXBElement<PassengerDetailsEN> getPassengerDetails() {
        return passengerDetails;
    }

    /**
     * Sets the value of the passengerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PassengerDetailsEN }{@code >}
     *     
     */
    public void setPassengerDetails(JAXBElement<PassengerDetailsEN> value) {
        this.passengerDetails = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassengersEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPassengersEN> getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassengersEN }{@code >}
     *     
     */
    public void setPassengers(JAXBElement<ArrayOfPassengersEN> value) {
        this.passengers = value;
    }

}

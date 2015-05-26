
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.goquo_dp.ArrayOfPassengersEN;
import org.datacontract.schemas._2004._07.goquo_dp.PassengerDetailsEN;
import org.datacontract.schemas._2004._07.goquo_dp.PaxLoginsEN;
import org.datacontract.schemas._2004._07.goquo_dp.ReservationsEN;


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
 *         &lt;element name="paxLoginEn" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PaxLoginsEN" minOccurs="0"/>
 *         &lt;element name="argReservation" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ReservationsEN" minOccurs="0"/>
 *         &lt;element name="argPassengers" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfPassengersEN" minOccurs="0"/>
 *         &lt;element name="argPassengerDetails" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PassengerDetailsEN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paxLoginEn",
    "argReservation",
    "argPassengers",
    "argPassengerDetails"
})
@XmlRootElement(name = "Booking_SaveReservationDetatils")
public class BookingSaveReservationDetatils {

    @XmlElementRef(name = "paxLoginEn", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PaxLoginsEN> paxLoginEn;
    @XmlElementRef(name = "argReservation", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReservationsEN> argReservation;
    @XmlElementRef(name = "argPassengers", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPassengersEN> argPassengers;
    @XmlElementRef(name = "argPassengerDetails", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PassengerDetailsEN> argPassengerDetails;

    /**
     * Gets the value of the paxLoginEn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaxLoginsEN }{@code >}
     *     
     */
    public JAXBElement<PaxLoginsEN> getPaxLoginEn() {
        return paxLoginEn;
    }

    /**
     * Sets the value of the paxLoginEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaxLoginsEN }{@code >}
     *     
     */
    public void setPaxLoginEn(JAXBElement<PaxLoginsEN> value) {
        this.paxLoginEn = value;
    }

    /**
     * Gets the value of the argReservation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReservationsEN }{@code >}
     *     
     */
    public JAXBElement<ReservationsEN> getArgReservation() {
        return argReservation;
    }

    /**
     * Sets the value of the argReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReservationsEN }{@code >}
     *     
     */
    public void setArgReservation(JAXBElement<ReservationsEN> value) {
        this.argReservation = value;
    }

    /**
     * Gets the value of the argPassengers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassengersEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPassengersEN> getArgPassengers() {
        return argPassengers;
    }

    /**
     * Sets the value of the argPassengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassengersEN }{@code >}
     *     
     */
    public void setArgPassengers(JAXBElement<ArrayOfPassengersEN> value) {
        this.argPassengers = value;
    }

    /**
     * Gets the value of the argPassengerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PassengerDetailsEN }{@code >}
     *     
     */
    public JAXBElement<PassengerDetailsEN> getArgPassengerDetails() {
        return argPassengerDetails;
    }

    /**
     * Sets the value of the argPassengerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PassengerDetailsEN }{@code >}
     *     
     */
    public void setArgPassengerDetails(JAXBElement<PassengerDetailsEN> value) {
        this.argPassengerDetails = value;
    }

}

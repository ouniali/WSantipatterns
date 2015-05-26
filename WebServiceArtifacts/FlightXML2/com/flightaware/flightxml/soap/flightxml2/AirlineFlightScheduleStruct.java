
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineFlightScheduleStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineFlightScheduleStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actual_ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departuretime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arrivaltime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aircrafttype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meal_service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="seats_cabin_first" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seats_cabin_business" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seats_cabin_coach" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineFlightScheduleStruct", propOrder = {
    "ident",
    "actualIdent",
    "departuretime",
    "arrivaltime",
    "origin",
    "destination",
    "aircrafttype",
    "mealService",
    "seatsCabinFirst",
    "seatsCabinBusiness",
    "seatsCabinCoach"
})
public class AirlineFlightScheduleStruct {

    @XmlElement(required = true)
    protected String ident;
    @XmlElement(name = "actual_ident", required = true)
    protected String actualIdent;
    protected int departuretime;
    protected int arrivaltime;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String aircrafttype;
    @XmlElement(name = "meal_service", required = true)
    protected String mealService;
    @XmlElement(name = "seats_cabin_first")
    protected int seatsCabinFirst;
    @XmlElement(name = "seats_cabin_business")
    protected int seatsCabinBusiness;
    @XmlElement(name = "seats_cabin_coach")
    protected int seatsCabinCoach;

    /**
     * Gets the value of the ident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the value of the actualIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualIdent() {
        return actualIdent;
    }

    /**
     * Sets the value of the actualIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualIdent(String value) {
        this.actualIdent = value;
    }

    /**
     * Gets the value of the departuretime property.
     * 
     */
    public int getDeparturetime() {
        return departuretime;
    }

    /**
     * Sets the value of the departuretime property.
     * 
     */
    public void setDeparturetime(int value) {
        this.departuretime = value;
    }

    /**
     * Gets the value of the arrivaltime property.
     * 
     */
    public int getArrivaltime() {
        return arrivaltime;
    }

    /**
     * Sets the value of the arrivaltime property.
     * 
     */
    public void setArrivaltime(int value) {
        this.arrivaltime = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the aircrafttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircrafttype() {
        return aircrafttype;
    }

    /**
     * Sets the value of the aircrafttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircrafttype(String value) {
        this.aircrafttype = value;
    }

    /**
     * Gets the value of the mealService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealService() {
        return mealService;
    }

    /**
     * Sets the value of the mealService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealService(String value) {
        this.mealService = value;
    }

    /**
     * Gets the value of the seatsCabinFirst property.
     * 
     */
    public int getSeatsCabinFirst() {
        return seatsCabinFirst;
    }

    /**
     * Sets the value of the seatsCabinFirst property.
     * 
     */
    public void setSeatsCabinFirst(int value) {
        this.seatsCabinFirst = value;
    }

    /**
     * Gets the value of the seatsCabinBusiness property.
     * 
     */
    public int getSeatsCabinBusiness() {
        return seatsCabinBusiness;
    }

    /**
     * Sets the value of the seatsCabinBusiness property.
     * 
     */
    public void setSeatsCabinBusiness(int value) {
        this.seatsCabinBusiness = value;
    }

    /**
     * Gets the value of the seatsCabinCoach property.
     * 
     */
    public int getSeatsCabinCoach() {
        return seatsCabinCoach;
    }

    /**
     * Sets the value of the seatsCabinCoach property.
     * 
     */
    public void setSeatsCabinCoach(int value) {
        this.seatsCabinCoach = value;
    }

}

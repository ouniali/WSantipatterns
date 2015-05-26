
package com.travelport.schema.air_v18_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}Connection" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}Meals" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}InFlightServices" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrOrigDestDepatureInfo"/>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrFlightTimes"/>
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="Equipment" type="{http://www.travelport.com/schema/air_v18_0}typeEquipment" />
 *       &lt;attribute name="OnTimePerformance" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="OriginTerminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DestinationTerminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "connection",
    "meals",
    "inFlightServices"
})
@XmlRootElement(name = "FlightDetails")
public class FlightDetails {

    @XmlElement(name = "Connection")
    protected Connection connection;
    @XmlElement(name = "Meals")
    @XmlSchemaType(name = "string")
    protected List<TypeMealService> meals;
    @XmlElement(name = "InFlightServices")
    @XmlSchemaType(name = "string")
    protected List<TypeInFlightService> inFlightServices;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "Equipment")
    protected String equipment;
    @XmlAttribute(name = "OnTimePerformance")
    protected BigInteger onTimePerformance;
    @XmlAttribute(name = "OriginTerminal")
    protected String originTerminal;
    @XmlAttribute(name = "DestinationTerminal")
    protected String destinationTerminal;
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    @XmlAttribute(name = "DepartureTime")
    protected String departureTime;
    @XmlAttribute(name = "ArrivalTime")
    protected String arrivalTime;
    @XmlAttribute(name = "FlightTime")
    protected BigInteger flightTime;
    @XmlAttribute(name = "TravelTime")
    protected BigInteger travelTime;
    @XmlAttribute(name = "Distance")
    protected BigInteger distance;

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link Connection }
     *     
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connection }
     *     
     */
    public void setConnection(Connection value) {
        this.connection = value;
    }

    /**
     * Gets the value of the meals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeMealService }
     * 
     * 
     */
    public List<TypeMealService> getMeals() {
        if (meals == null) {
            meals = new ArrayList<TypeMealService>();
        }
        return this.meals;
    }

    /**
     * Gets the value of the inFlightServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inFlightServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInFlightServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeInFlightService }
     * 
     * 
     */
    public List<TypeInFlightService> getInFlightServices() {
        if (inFlightServices == null) {
            inFlightServices = new ArrayList<TypeInFlightService>();
        }
        return this.inFlightServices;
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

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipment(String value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the onTimePerformance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOnTimePerformance() {
        return onTimePerformance;
    }

    /**
     * Sets the value of the onTimePerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOnTimePerformance(BigInteger value) {
        this.onTimePerformance = value;
    }

    /**
     * Gets the value of the originTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginTerminal() {
        return originTerminal;
    }

    /**
     * Sets the value of the originTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginTerminal(String value) {
        this.originTerminal = value;
    }

    /**
     * Gets the value of the destinationTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationTerminal() {
        return destinationTerminal;
    }

    /**
     * Sets the value of the destinationTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationTerminal(String value) {
        this.destinationTerminal = value;
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
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the flightTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlightTime() {
        return flightTime;
    }

    /**
     * Sets the value of the flightTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlightTime(BigInteger value) {
        this.flightTime = value;
    }

    /**
     * Gets the value of the travelTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravelTime(BigInteger value) {
        this.travelTime = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistance(BigInteger value) {
        this.distance = value;
    }

}

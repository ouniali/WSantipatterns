
package com.travelport.schema.air_v18_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;sequence>
 *         &lt;element name="DaysOfOperation" type="{http://www.travelport.com/schema/air_v18_0}typeDaysOfOperation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightNumber" type="{http://www.travelport.com/schema/common_v15_0}typeFlightNumber" />
 *       &lt;attribute name="Origin" type="{http://www.travelport.com/schema/common_v15_0}typeAirport" />
 *       &lt;attribute name="Destination" type="{http://www.travelport.com/schema/common_v15_0}typeAirport" />
 *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StopCount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Equipment" type="{http://www.travelport.com/schema/air_v18_0}typeEquipment" />
 *       &lt;attribute name="InsideAvailability">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SecureSell">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AvailabilitySource" type="{http://www.travelport.com/schema/air_v18_0}typeAvailabilitySource" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "daysOfOperation"
})
@XmlRootElement(name = "FlightTimeDetail")
public class FlightTimeDetail {

    @XmlElement(name = "DaysOfOperation")
    protected TypeDaysOfOperation daysOfOperation;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "VendorCode")
    protected String vendorCode;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "DepartureTime")
    protected String departureTime;
    @XmlAttribute(name = "ArrivalTime")
    protected String arrivalTime;
    @XmlAttribute(name = "StopCount")
    protected BigInteger stopCount;
    @XmlAttribute(name = "Equipment")
    protected String equipment;
    @XmlAttribute(name = "InsideAvailability")
    protected String insideAvailability;
    @XmlAttribute(name = "SecureSell")
    protected String secureSell;
    @XmlAttribute(name = "AvailabilitySource")
    protected TypeAvailabilitySource availabilitySource;

    /**
     * Gets the value of the daysOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDaysOfOperation }
     *     
     */
    public TypeDaysOfOperation getDaysOfOperation() {
        return daysOfOperation;
    }

    /**
     * Sets the value of the daysOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDaysOfOperation }
     *     
     */
    public void setDaysOfOperation(TypeDaysOfOperation value) {
        this.daysOfOperation = value;
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
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
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
     * Gets the value of the stopCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStopCount() {
        return stopCount;
    }

    /**
     * Sets the value of the stopCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStopCount(BigInteger value) {
        this.stopCount = value;
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
     * Gets the value of the insideAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsideAvailability() {
        return insideAvailability;
    }

    /**
     * Sets the value of the insideAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsideAvailability(String value) {
        this.insideAvailability = value;
    }

    /**
     * Gets the value of the secureSell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureSell() {
        return secureSell;
    }

    /**
     * Sets the value of the secureSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureSell(String value) {
        this.secureSell = value;
    }

    /**
     * Gets the value of the availabilitySource property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAvailabilitySource }
     *     
     */
    public TypeAvailabilitySource getAvailabilitySource() {
        return availabilitySource;
    }

    /**
     * Sets the value of the availabilitySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAvailabilitySource }
     *     
     */
    public void setAvailabilitySource(TypeAvailabilitySource value) {
        this.availabilitySource = value;
    }

}


package com.flightstats.schedules.service.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scheduledFlightV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduledFlightV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrierFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carrier" type="{http://v1.service.schedules.flightstats.com/}airlineV1" minOccurs="0"/>
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureAirport" type="{http://v1.service.schedules.flightstats.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="departureAirportFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalAirport" type="{http://v1.service.schedules.flightstats.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="arrivalAirportFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stops" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departureTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalTerminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flightEquipmentIataCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightEquipment" type="{http://v1.service.schedules.flightstats.com/}equipmentV1" minOccurs="0"/>
 *         &lt;element name="isCodeshare" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isWetlease" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceClasses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceClass" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="trafficRestrictions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="trafficRestriction" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="operator" type="{http://v1.service.schedules.flightstats.com/}operatorV1" minOccurs="0"/>
 *         &lt;element name="codeshares" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codeshare" type="{http://v1.service.schedules.flightstats.com/}codeshareV1" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="wetleaseOperator" type="{http://v1.service.schedules.flightstats.com/}airlineV1" minOccurs="0"/>
 *         &lt;element name="wetleaseOperatorFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduledFlightV1", propOrder = {
    "carrierFsCode",
    "carrier",
    "flightNumber",
    "brand",
    "departureAirport",
    "departureAirportFsCode",
    "arrivalAirport",
    "arrivalAirportFsCode",
    "stops",
    "departureTerminal",
    "arrivalTerminal",
    "departureTime",
    "arrivalTime",
    "flightEquipmentIataCode",
    "flightEquipment",
    "isCodeshare",
    "isWetlease",
    "serviceType",
    "serviceClasses",
    "trafficRestrictions",
    "operator",
    "codeshares",
    "wetleaseOperator",
    "wetleaseOperatorFsCode",
    "referenceCode"
})
public class ScheduledFlightV1 {

    protected String carrierFsCode;
    protected AirlineV1 carrier;
    @XmlElement(required = true)
    protected String flightNumber;
    protected String brand;
    protected AirportV1 departureAirport;
    protected String departureAirportFsCode;
    protected AirportV1 arrivalAirport;
    protected String arrivalAirportFsCode;
    protected int stops;
    protected String departureTerminal;
    protected String arrivalTerminal;
    @XmlElement(required = true)
    protected String departureTime;
    @XmlElement(required = true)
    protected String arrivalTime;
    protected String flightEquipmentIataCode;
    protected EquipmentV1 flightEquipment;
    protected boolean isCodeshare;
    protected boolean isWetlease;
    @XmlElement(required = true)
    protected String serviceType;
    protected ScheduledFlightV1 .ServiceClasses serviceClasses;
    protected ScheduledFlightV1 .TrafficRestrictions trafficRestrictions;
    protected OperatorV1 operator;
    protected ScheduledFlightV1 .Codeshares codeshares;
    protected AirlineV1 wetleaseOperator;
    protected String wetleaseOperatorFsCode;
    @XmlElement(required = true)
    protected String referenceCode;

    /**
     * Gets the value of the carrierFsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierFsCode() {
        return carrierFsCode;
    }

    /**
     * Sets the value of the carrierFsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierFsCode(String value) {
        this.carrierFsCode = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineV1 }
     *     
     */
    public AirlineV1 getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineV1 }
     *     
     */
    public void setCarrier(AirlineV1 value) {
        this.carrier = value;
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
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link AirportV1 }
     *     
     */
    public AirportV1 getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportV1 }
     *     
     */
    public void setDepartureAirport(AirportV1 value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the departureAirportFsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirportFsCode() {
        return departureAirportFsCode;
    }

    /**
     * Sets the value of the departureAirportFsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirportFsCode(String value) {
        this.departureAirportFsCode = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link AirportV1 }
     *     
     */
    public AirportV1 getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportV1 }
     *     
     */
    public void setArrivalAirport(AirportV1 value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the arrivalAirportFsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirportFsCode() {
        return arrivalAirportFsCode;
    }

    /**
     * Sets the value of the arrivalAirportFsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirportFsCode(String value) {
        this.arrivalAirportFsCode = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     */
    public int getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     */
    public void setStops(int value) {
        this.stops = value;
    }

    /**
     * Gets the value of the departureTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTerminal() {
        return departureTerminal;
    }

    /**
     * Sets the value of the departureTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTerminal(String value) {
        this.departureTerminal = value;
    }

    /**
     * Gets the value of the arrivalTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    /**
     * Sets the value of the arrivalTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTerminal(String value) {
        this.arrivalTerminal = value;
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
     * Gets the value of the flightEquipmentIataCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightEquipmentIataCode() {
        return flightEquipmentIataCode;
    }

    /**
     * Sets the value of the flightEquipmentIataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightEquipmentIataCode(String value) {
        this.flightEquipmentIataCode = value;
    }

    /**
     * Gets the value of the flightEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentV1 }
     *     
     */
    public EquipmentV1 getFlightEquipment() {
        return flightEquipment;
    }

    /**
     * Sets the value of the flightEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentV1 }
     *     
     */
    public void setFlightEquipment(EquipmentV1 value) {
        this.flightEquipment = value;
    }

    /**
     * Gets the value of the isCodeshare property.
     * 
     */
    public boolean isIsCodeshare() {
        return isCodeshare;
    }

    /**
     * Sets the value of the isCodeshare property.
     * 
     */
    public void setIsCodeshare(boolean value) {
        this.isCodeshare = value;
    }

    /**
     * Gets the value of the isWetlease property.
     * 
     */
    public boolean isIsWetlease() {
        return isWetlease;
    }

    /**
     * Sets the value of the isWetlease property.
     * 
     */
    public void setIsWetlease(boolean value) {
        this.isWetlease = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceClasses property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledFlightV1 .ServiceClasses }
     *     
     */
    public ScheduledFlightV1 .ServiceClasses getServiceClasses() {
        return serviceClasses;
    }

    /**
     * Sets the value of the serviceClasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledFlightV1 .ServiceClasses }
     *     
     */
    public void setServiceClasses(ScheduledFlightV1 .ServiceClasses value) {
        this.serviceClasses = value;
    }

    /**
     * Gets the value of the trafficRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledFlightV1 .TrafficRestrictions }
     *     
     */
    public ScheduledFlightV1 .TrafficRestrictions getTrafficRestrictions() {
        return trafficRestrictions;
    }

    /**
     * Sets the value of the trafficRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledFlightV1 .TrafficRestrictions }
     *     
     */
    public void setTrafficRestrictions(ScheduledFlightV1 .TrafficRestrictions value) {
        this.trafficRestrictions = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorV1 }
     *     
     */
    public OperatorV1 getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorV1 }
     *     
     */
    public void setOperator(OperatorV1 value) {
        this.operator = value;
    }

    /**
     * Gets the value of the codeshares property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledFlightV1 .Codeshares }
     *     
     */
    public ScheduledFlightV1 .Codeshares getCodeshares() {
        return codeshares;
    }

    /**
     * Sets the value of the codeshares property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledFlightV1 .Codeshares }
     *     
     */
    public void setCodeshares(ScheduledFlightV1 .Codeshares value) {
        this.codeshares = value;
    }

    /**
     * Gets the value of the wetleaseOperator property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineV1 }
     *     
     */
    public AirlineV1 getWetleaseOperator() {
        return wetleaseOperator;
    }

    /**
     * Sets the value of the wetleaseOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineV1 }
     *     
     */
    public void setWetleaseOperator(AirlineV1 value) {
        this.wetleaseOperator = value;
    }

    /**
     * Gets the value of the wetleaseOperatorFsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWetleaseOperatorFsCode() {
        return wetleaseOperatorFsCode;
    }

    /**
     * Sets the value of the wetleaseOperatorFsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWetleaseOperatorFsCode(String value) {
        this.wetleaseOperatorFsCode = value;
    }

    /**
     * Gets the value of the referenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceCode() {
        return referenceCode;
    }

    /**
     * Sets the value of the referenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }


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
     *         &lt;element name="codeshare" type="{http://v1.service.schedules.flightstats.com/}codeshareV1" maxOccurs="unbounded"/>
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
        "codeshare"
    })
    public static class Codeshares {

        @XmlElement(required = true)
        protected List<CodeshareV1> codeshare;

        /**
         * Gets the value of the codeshare property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the codeshare property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCodeshare().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeshareV1 }
         * 
         * 
         */
        public List<CodeshareV1> getCodeshare() {
            if (codeshare == null) {
                codeshare = new ArrayList<CodeshareV1>();
            }
            return this.codeshare;
        }

    }


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
     *         &lt;element name="serviceClass" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "serviceClass"
    })
    public static class ServiceClasses {

        @XmlElement(required = true)
        protected List<String> serviceClass;

        /**
         * Gets the value of the serviceClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getServiceClass() {
            if (serviceClass == null) {
                serviceClass = new ArrayList<String>();
            }
            return this.serviceClass;
        }

    }


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
     *         &lt;element name="trafficRestriction" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "trafficRestriction"
    })
    public static class TrafficRestrictions {

        @XmlElement(required = true)
        protected List<String> trafficRestriction;

        /**
         * Gets the value of the trafficRestriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trafficRestriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrafficRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTrafficRestriction() {
            if (trafficRestriction == null) {
                trafficRestriction = new ArrayList<String>();
            }
            return this.trafficRestriction;
        }

    }

}


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}CodeshareInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}Meals" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}InFlightServices" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}Variance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
 *       &lt;attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
 *       &lt;attribute name="ScheduledDepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ScheduledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TravelTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ETicketability" type="{http://www.travelport.com/schema/air_v18_0}typeEticketability" />
 *       &lt;attribute name="Equipment" type="{http://www.travelport.com/schema/air_v18_0}typeEquipment" />
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
    "codeshareInfo",
    "meals",
    "inFlightServices",
    "variance"
})
@XmlRootElement(name = "FlightInfoDetail")
public class FlightInfoDetail {

    @XmlElement(name = "CodeshareInfo")
    protected CodeshareInfo codeshareInfo;
    @XmlElement(name = "Meals")
    @XmlSchemaType(name = "string")
    protected List<TypeMealService> meals;
    @XmlElement(name = "InFlightServices")
    @XmlSchemaType(name = "string")
    protected List<TypeInFlightService> inFlightServices;
    @XmlElement(name = "Variance")
    protected List<Variance> variance;
    @XmlAttribute(name = "Origin", required = true)
    protected String origin;
    @XmlAttribute(name = "Destination", required = true)
    protected String destination;
    @XmlAttribute(name = "ScheduledDepartureTime")
    protected String scheduledDepartureTime;
    @XmlAttribute(name = "ScheduledArrivalTime")
    protected String scheduledArrivalTime;
    @XmlAttribute(name = "TravelTime")
    protected BigInteger travelTime;
    @XmlAttribute(name = "ETicketability")
    protected TypeEticketability eTicketability;
    @XmlAttribute(name = "Equipment")
    protected String equipment;
    @XmlAttribute(name = "OriginTerminal")
    protected String originTerminal;
    @XmlAttribute(name = "DestinationTerminal")
    protected String destinationTerminal;

    /**
     * Gets the value of the codeshareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CodeshareInfo }
     *     
     */
    public CodeshareInfo getCodeshareInfo() {
        return codeshareInfo;
    }

    /**
     * Sets the value of the codeshareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeshareInfo }
     *     
     */
    public void setCodeshareInfo(CodeshareInfo value) {
        this.codeshareInfo = value;
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
     * Gets the value of the variance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variance }
     * 
     * 
     */
    public List<Variance> getVariance() {
        if (variance == null) {
            variance = new ArrayList<Variance>();
        }
        return this.variance;
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
     * Gets the value of the scheduledDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    /**
     * Sets the value of the scheduledDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDepartureTime(String value) {
        this.scheduledDepartureTime = value;
    }

    /**
     * Gets the value of the scheduledArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }

    /**
     * Sets the value of the scheduledArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledArrivalTime(String value) {
        this.scheduledArrivalTime = value;
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
     * Gets the value of the eTicketability property.
     * 
     * @return
     *     possible object is
     *     {@link TypeEticketability }
     *     
     */
    public TypeEticketability getETicketability() {
        return eTicketability;
    }

    /**
     * Sets the value of the eTicketability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEticketability }
     *     
     */
    public void setETicketability(TypeEticketability value) {
        this.eTicketability = value;
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

}

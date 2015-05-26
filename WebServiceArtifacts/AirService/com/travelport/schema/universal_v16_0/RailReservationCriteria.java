
package com.travelport.schema.universal_v16_0;

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
 *         &lt;element name="JourneyDepartureDate" type="{http://www.travelport.com/schema/universal_v16_0}typeDateSpec" minOccurs="0"/>
 *         &lt;element name="JourneyArrivalDate" type="{http://www.travelport.com/schema/universal_v16_0}typeDateSpec" minOccurs="0"/>
 *         &lt;element name="SegmentDepartureDate" type="{http://www.travelport.com/schema/universal_v16_0}typeDateSpec" minOccurs="0"/>
 *         &lt;element name="SegmentArrivalDate" type="{http://www.travelport.com/schema/universal_v16_0}typeDateSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="JourneyOrigin" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
 *       &lt;attribute name="JourneyDestination" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
 *       &lt;attribute name="JourneyRailLocOrigin" type="{http://www.travelport.com/schema/common_v15_0}typeRailLocationCode" />
 *       &lt;attribute name="JourneyRailLocDestination" type="{http://www.travelport.com/schema/common_v15_0}typeRailLocationCode" />
 *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TrainNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PassiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "journeyDepartureDate",
    "journeyArrivalDate",
    "segmentDepartureDate",
    "segmentArrivalDate"
})
@XmlRootElement(name = "RailReservationCriteria")
public class RailReservationCriteria {

    @XmlElement(name = "JourneyDepartureDate")
    protected TypeDateSpec journeyDepartureDate;
    @XmlElement(name = "JourneyArrivalDate")
    protected TypeDateSpec journeyArrivalDate;
    @XmlElement(name = "SegmentDepartureDate")
    protected TypeDateSpec segmentDepartureDate;
    @XmlElement(name = "SegmentArrivalDate")
    protected TypeDateSpec segmentArrivalDate;
    @XmlAttribute(name = "JourneyOrigin")
    protected String journeyOrigin;
    @XmlAttribute(name = "JourneyDestination")
    protected String journeyDestination;
    @XmlAttribute(name = "JourneyRailLocOrigin")
    protected String journeyRailLocOrigin;
    @XmlAttribute(name = "JourneyRailLocDestination")
    protected String journeyRailLocDestination;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "TrainNumber")
    protected String trainNumber;
    @XmlAttribute(name = "PassiveOnly")
    protected Boolean passiveOnly;

    /**
     * Gets the value of the journeyDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateSpec }
     *     
     */
    public TypeDateSpec getJourneyDepartureDate() {
        return journeyDepartureDate;
    }

    /**
     * Sets the value of the journeyDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateSpec }
     *     
     */
    public void setJourneyDepartureDate(TypeDateSpec value) {
        this.journeyDepartureDate = value;
    }

    /**
     * Gets the value of the journeyArrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateSpec }
     *     
     */
    public TypeDateSpec getJourneyArrivalDate() {
        return journeyArrivalDate;
    }

    /**
     * Sets the value of the journeyArrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateSpec }
     *     
     */
    public void setJourneyArrivalDate(TypeDateSpec value) {
        this.journeyArrivalDate = value;
    }

    /**
     * Gets the value of the segmentDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateSpec }
     *     
     */
    public TypeDateSpec getSegmentDepartureDate() {
        return segmentDepartureDate;
    }

    /**
     * Sets the value of the segmentDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateSpec }
     *     
     */
    public void setSegmentDepartureDate(TypeDateSpec value) {
        this.segmentDepartureDate = value;
    }

    /**
     * Gets the value of the segmentArrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateSpec }
     *     
     */
    public TypeDateSpec getSegmentArrivalDate() {
        return segmentArrivalDate;
    }

    /**
     * Sets the value of the segmentArrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateSpec }
     *     
     */
    public void setSegmentArrivalDate(TypeDateSpec value) {
        this.segmentArrivalDate = value;
    }

    /**
     * Gets the value of the journeyOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyOrigin() {
        return journeyOrigin;
    }

    /**
     * Sets the value of the journeyOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyOrigin(String value) {
        this.journeyOrigin = value;
    }

    /**
     * Gets the value of the journeyDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyDestination() {
        return journeyDestination;
    }

    /**
     * Sets the value of the journeyDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyDestination(String value) {
        this.journeyDestination = value;
    }

    /**
     * Gets the value of the journeyRailLocOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyRailLocOrigin() {
        return journeyRailLocOrigin;
    }

    /**
     * Sets the value of the journeyRailLocOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyRailLocOrigin(String value) {
        this.journeyRailLocOrigin = value;
    }

    /**
     * Gets the value of the journeyRailLocDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyRailLocDestination() {
        return journeyRailLocDestination;
    }

    /**
     * Sets the value of the journeyRailLocDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyRailLocDestination(String value) {
        this.journeyRailLocDestination = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Gets the value of the passiveOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPassiveOnly() {
        if (passiveOnly == null) {
            return false;
        } else {
            return passiveOnly;
        }
    }

    /**
     * Sets the value of the passiveOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassiveOnly(Boolean value) {
        this.passiveOnly = value;
    }

}

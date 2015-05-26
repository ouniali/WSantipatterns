
package com.travelport.schema.air_v18_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareNote" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ChangeOfPlane" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ChangeOfTerminal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ChangeOfAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="StopOver" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MinConnectionTime" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="FlightDetailsIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="IncludeStopOverToFareQuote" type="{http://www.travelport.com/schema/air_v18_0}typeIgnoreStopOver" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareNote"
})
@XmlRootElement(name = "Connection")
public class Connection {

    @XmlElement(name = "FareNote")
    protected FareNote fareNote;
    @XmlAttribute(name = "ChangeOfPlane")
    protected Boolean changeOfPlane;
    @XmlAttribute(name = "ChangeOfTerminal")
    protected Boolean changeOfTerminal;
    @XmlAttribute(name = "ChangeOfAirport")
    protected Boolean changeOfAirport;
    @XmlAttribute(name = "StopOver")
    protected Boolean stopOver;
    @XmlAttribute(name = "MinConnectionTime")
    protected Integer minConnectionTime;
    @XmlAttribute(name = "Duration")
    protected Integer duration;
    @XmlAttribute(name = "SegmentIndex")
    protected Integer segmentIndex;
    @XmlAttribute(name = "FlightDetailsIndex")
    protected Integer flightDetailsIndex;
    @XmlAttribute(name = "IncludeStopOverToFareQuote")
    protected TypeIgnoreStopOver includeStopOverToFareQuote;

    /**
     * Gets the value of the fareNote property.
     * 
     * @return
     *     possible object is
     *     {@link FareNote }
     *     
     */
    public FareNote getFareNote() {
        return fareNote;
    }

    /**
     * Sets the value of the fareNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareNote }
     *     
     */
    public void setFareNote(FareNote value) {
        this.fareNote = value;
    }

    /**
     * Gets the value of the changeOfPlane property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChangeOfPlane() {
        if (changeOfPlane == null) {
            return false;
        } else {
            return changeOfPlane;
        }
    }

    /**
     * Sets the value of the changeOfPlane property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeOfPlane(Boolean value) {
        this.changeOfPlane = value;
    }

    /**
     * Gets the value of the changeOfTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChangeOfTerminal() {
        if (changeOfTerminal == null) {
            return false;
        } else {
            return changeOfTerminal;
        }
    }

    /**
     * Sets the value of the changeOfTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeOfTerminal(Boolean value) {
        this.changeOfTerminal = value;
    }

    /**
     * Gets the value of the changeOfAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChangeOfAirport() {
        if (changeOfAirport == null) {
            return false;
        } else {
            return changeOfAirport;
        }
    }

    /**
     * Sets the value of the changeOfAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeOfAirport(Boolean value) {
        this.changeOfAirport = value;
    }

    /**
     * Gets the value of the stopOver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStopOver() {
        if (stopOver == null) {
            return false;
        } else {
            return stopOver;
        }
    }

    /**
     * Sets the value of the stopOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopOver(Boolean value) {
        this.stopOver = value;
    }

    /**
     * Gets the value of the minConnectionTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinConnectionTime() {
        return minConnectionTime;
    }

    /**
     * Sets the value of the minConnectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinConnectionTime(Integer value) {
        this.minConnectionTime = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the segmentIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentIndex() {
        return segmentIndex;
    }

    /**
     * Sets the value of the segmentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentIndex(Integer value) {
        this.segmentIndex = value;
    }

    /**
     * Gets the value of the flightDetailsIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightDetailsIndex() {
        return flightDetailsIndex;
    }

    /**
     * Sets the value of the flightDetailsIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightDetailsIndex(Integer value) {
        this.flightDetailsIndex = value;
    }

    /**
     * Gets the value of the includeStopOverToFareQuote property.
     * 
     * @return
     *     possible object is
     *     {@link TypeIgnoreStopOver }
     *     
     */
    public TypeIgnoreStopOver getIncludeStopOverToFareQuote() {
        return includeStopOverToFareQuote;
    }

    /**
     * Sets the value of the includeStopOverToFareQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIgnoreStopOver }
     *     
     */
    public void setIncludeStopOverToFareQuote(TypeIgnoreStopOver value) {
        this.includeStopOverToFareQuote = value;
    }

}

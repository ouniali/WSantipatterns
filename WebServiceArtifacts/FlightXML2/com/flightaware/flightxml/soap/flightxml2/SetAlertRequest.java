
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetAlertRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetAlertRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alert_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aircrafttype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_start" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="date_end" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="channels" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="max_weekly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetAlertRequest", propOrder = {
    "alertId",
    "ident",
    "origin",
    "destination",
    "aircrafttype",
    "dateStart",
    "dateEnd",
    "channels",
    "enabled",
    "maxWeekly"
})
public class SetAlertRequest {

    @XmlElement(name = "alert_id")
    protected int alertId;
    @XmlElement(required = true)
    protected String ident;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String aircrafttype;
    @XmlElement(name = "date_start")
    protected int dateStart;
    @XmlElement(name = "date_end")
    protected int dateEnd;
    @XmlElement(required = true)
    protected String channels;
    protected boolean enabled;
    @XmlElement(name = "max_weekly")
    protected int maxWeekly;

    /**
     * Gets the value of the alertId property.
     * 
     */
    public int getAlertId() {
        return alertId;
    }

    /**
     * Sets the value of the alertId property.
     * 
     */
    public void setAlertId(int value) {
        this.alertId = value;
    }

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
     * Gets the value of the dateStart property.
     * 
     */
    public int getDateStart() {
        return dateStart;
    }

    /**
     * Sets the value of the dateStart property.
     * 
     */
    public void setDateStart(int value) {
        this.dateStart = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     */
    public int getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     */
    public void setDateEnd(int value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the channels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannels(String value) {
        this.channels = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the maxWeekly property.
     * 
     */
    public int getMaxWeekly() {
        return maxWeekly;
    }

    /**
     * Sets the value of the maxWeekly property.
     * 
     */
    public void setMaxWeekly(int value) {
        this.maxWeekly = value;
    }

}

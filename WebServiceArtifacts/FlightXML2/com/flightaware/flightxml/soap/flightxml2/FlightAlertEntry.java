
package com.flightaware.flightxml.soap.flightxml2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightAlertEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightAlertEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alert_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aircrafttype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_start" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="date_end" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="channels" type="{http://flightxml.flightaware.com/soap/FlightXML2}FlightAlertChannel" maxOccurs="unbounded"/>
 *         &lt;element name="alert_created" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="alert_changed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightAlertEntry", propOrder = {
    "alertId",
    "enabled",
    "description",
    "type",
    "ident",
    "userIdent",
    "aircrafttype",
    "origin",
    "destination",
    "dateStart",
    "dateEnd",
    "channels",
    "alertCreated",
    "alertChanged"
})
public class FlightAlertEntry {

    @XmlElement(name = "alert_id")
    protected int alertId;
    protected boolean enabled;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String ident;
    @XmlElement(name = "user_ident", required = true)
    protected String userIdent;
    @XmlElement(required = true)
    protected String aircrafttype;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(name = "date_start")
    protected int dateStart;
    @XmlElement(name = "date_end")
    protected int dateEnd;
    @XmlElement(required = true)
    protected List<FlightAlertChannel> channels;
    @XmlElement(name = "alert_created")
    protected int alertCreated;
    @XmlElement(name = "alert_changed")
    protected int alertChanged;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the userIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdent() {
        return userIdent;
    }

    /**
     * Sets the value of the userIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdent(String value) {
        this.userIdent = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the channels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChannels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightAlertChannel }
     * 
     * 
     */
    public List<FlightAlertChannel> getChannels() {
        if (channels == null) {
            channels = new ArrayList<FlightAlertChannel>();
        }
        return this.channels;
    }

    /**
     * Gets the value of the alertCreated property.
     * 
     */
    public int getAlertCreated() {
        return alertCreated;
    }

    /**
     * Sets the value of the alertCreated property.
     * 
     */
    public void setAlertCreated(int value) {
        this.alertCreated = value;
    }

    /**
     * Gets the value of the alertChanged property.
     * 
     */
    public int getAlertChanged() {
        return alertChanged;
    }

    /**
     * Sets the value of the alertChanged property.
     * 
     */
    public void setAlertChanged(int value) {
        this.alertChanged = value;
    }

}

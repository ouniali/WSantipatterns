
package com.flightwise.planexml.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FIDynamic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FIDynamic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArrivalMins" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Alt" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="GS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://planexml.flightwise.com/ws}FlightStatusType"/>
 *         &lt;element name="Lat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Lon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Course" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ClimbDescend" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StaticRefresh" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DestTimezoneOffset" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DestDST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIDynamic", propOrder = {
    "ident",
    "timeStamp",
    "arrivalMins",
    "alt",
    "gs",
    "status",
    "lat",
    "lon",
    "course",
    "climbDescend",
    "staticRefresh",
    "destTimezoneOffset",
    "destDST"
})
public class FIDynamic {

    @XmlElement(name = "Ident")
    protected String ident;
    @XmlElement(name = "TimeStamp")
    protected long timeStamp;
    @XmlElement(name = "ArrivalMins")
    protected long arrivalMins;
    @XmlElement(name = "Alt")
    protected long alt;
    @XmlElement(name = "GS")
    protected String gs;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected FlightStatusType status;
    @XmlElement(name = "Lat")
    protected double lat;
    @XmlElement(name = "Lon")
    protected double lon;
    @XmlElement(name = "Course")
    protected long course;
    @XmlElement(name = "ClimbDescend")
    protected long climbDescend;
    @XmlElement(name = "StaticRefresh")
    protected long staticRefresh;
    @XmlElement(name = "DestTimezoneOffset")
    protected short destTimezoneOffset;
    @XmlElement(name = "DestDST")
    protected String destDST;

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
     * Gets the value of the timeStamp property.
     * 
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     */
    public void setTimeStamp(long value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the arrivalMins property.
     * 
     */
    public long getArrivalMins() {
        return arrivalMins;
    }

    /**
     * Sets the value of the arrivalMins property.
     * 
     */
    public void setArrivalMins(long value) {
        this.arrivalMins = value;
    }

    /**
     * Gets the value of the alt property.
     * 
     */
    public long getAlt() {
        return alt;
    }

    /**
     * Sets the value of the alt property.
     * 
     */
    public void setAlt(long value) {
        this.alt = value;
    }

    /**
     * Gets the value of the gs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGS() {
        return gs;
    }

    /**
     * Sets the value of the gs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGS(String value) {
        this.gs = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusType }
     *     
     */
    public FlightStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusType }
     *     
     */
    public void setStatus(FlightStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     */
    public double getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     */
    public void setLat(double value) {
        this.lat = value;
    }

    /**
     * Gets the value of the lon property.
     * 
     */
    public double getLon() {
        return lon;
    }

    /**
     * Sets the value of the lon property.
     * 
     */
    public void setLon(double value) {
        this.lon = value;
    }

    /**
     * Gets the value of the course property.
     * 
     */
    public long getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     */
    public void setCourse(long value) {
        this.course = value;
    }

    /**
     * Gets the value of the climbDescend property.
     * 
     */
    public long getClimbDescend() {
        return climbDescend;
    }

    /**
     * Sets the value of the climbDescend property.
     * 
     */
    public void setClimbDescend(long value) {
        this.climbDescend = value;
    }

    /**
     * Gets the value of the staticRefresh property.
     * 
     */
    public long getStaticRefresh() {
        return staticRefresh;
    }

    /**
     * Sets the value of the staticRefresh property.
     * 
     */
    public void setStaticRefresh(long value) {
        this.staticRefresh = value;
    }

    /**
     * Gets the value of the destTimezoneOffset property.
     * 
     */
    public short getDestTimezoneOffset() {
        return destTimezoneOffset;
    }

    /**
     * Sets the value of the destTimezoneOffset property.
     * 
     */
    public void setDestTimezoneOffset(short value) {
        this.destTimezoneOffset = value;
    }

    /**
     * Gets the value of the destDST property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestDST() {
        return destDST;
    }

    /**
     * Sets the value of the destDST property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestDST(String value) {
        this.destDST = value;
    }

}

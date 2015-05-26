
package com.flightwise.planexml.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightPlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Ident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ETA" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Route" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Center" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DepartureTimezoneOffset" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DestinationTimezoneOffset" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightPlan", propOrder = {
    "id",
    "ident",
    "type",
    "dept",
    "dest",
    "fileTime",
    "departureTime",
    "eta",
    "route",
    "center",
    "status",
    "departureTimezoneOffset",
    "destinationTimezoneOffset"
})
public class FlightPlan {

    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(name = "Ident")
    protected String ident;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "Dest")
    protected String dest;
    @XmlElement(name = "FileTime")
    protected long fileTime;
    @XmlElement(name = "DepartureTime")
    protected long departureTime;
    @XmlElement(name = "ETA")
    protected long eta;
    @XmlElement(name = "Route")
    protected String route;
    @XmlElement(name = "Center")
    protected String center;
    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "DepartureTimezoneOffset")
    protected short departureTimezoneOffset;
    @XmlElement(name = "DestinationTimezoneOffset")
    protected short destinationTimezoneOffset;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
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
     * Gets the value of the dept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * Gets the value of the dest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDest() {
        return dest;
    }

    /**
     * Sets the value of the dest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDest(String value) {
        this.dest = value;
    }

    /**
     * Gets the value of the fileTime property.
     * 
     */
    public long getFileTime() {
        return fileTime;
    }

    /**
     * Sets the value of the fileTime property.
     * 
     */
    public void setFileTime(long value) {
        this.fileTime = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     */
    public long getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     */
    public void setDepartureTime(long value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the eta property.
     * 
     */
    public long getETA() {
        return eta;
    }

    /**
     * Sets the value of the eta property.
     * 
     */
    public void setETA(long value) {
        this.eta = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenter(String value) {
        this.center = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the departureTimezoneOffset property.
     * 
     */
    public short getDepartureTimezoneOffset() {
        return departureTimezoneOffset;
    }

    /**
     * Sets the value of the departureTimezoneOffset property.
     * 
     */
    public void setDepartureTimezoneOffset(short value) {
        this.departureTimezoneOffset = value;
    }

    /**
     * Gets the value of the destinationTimezoneOffset property.
     * 
     */
    public short getDestinationTimezoneOffset() {
        return destinationTimezoneOffset;
    }

    /**
     * Sets the value of the destinationTimezoneOffset property.
     * 
     */
    public void setDestinationTimezoneOffset(short value) {
        this.destinationTimezoneOffset = value;
    }

}

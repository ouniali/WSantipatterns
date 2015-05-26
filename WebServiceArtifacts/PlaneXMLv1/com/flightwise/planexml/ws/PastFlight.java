
package com.flightwise.planexml.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PastFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PastFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Ident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DepartureTimezoneOffset" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArrivalTimezoneOffset" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Center" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EquipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PastFlight", propOrder = {
    "index",
    "ident",
    "dept",
    "dest",
    "departureTime",
    "departureTimezoneOffset",
    "arrivalTime",
    "arrivalTimezoneOffset",
    "center",
    "acType",
    "equipCode",
    "status"
})
public class PastFlight {

    @XmlElement(name = "Index")
    protected long index;
    @XmlElement(name = "Ident")
    protected String ident;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "Dest")
    protected String dest;
    @XmlElement(name = "DepartureTime")
    protected long departureTime;
    @XmlElement(name = "DepartureTimezoneOffset")
    protected short departureTimezoneOffset;
    @XmlElement(name = "ArrivalTime")
    protected long arrivalTime;
    @XmlElement(name = "ArrivalTimezoneOffset")
    protected short arrivalTimezoneOffset;
    @XmlElement(name = "Center")
    protected String center;
    @XmlElement(name = "ACType")
    protected String acType;
    @XmlElement(name = "EquipCode")
    protected String equipCode;
    @XmlElement(name = "Status")
    protected short status;

    /**
     * Gets the value of the index property.
     * 
     */
    public long getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(long value) {
        this.index = value;
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
     * Gets the value of the arrivalTime property.
     * 
     */
    public long getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     */
    public void setArrivalTime(long value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the arrivalTimezoneOffset property.
     * 
     */
    public short getArrivalTimezoneOffset() {
        return arrivalTimezoneOffset;
    }

    /**
     * Sets the value of the arrivalTimezoneOffset property.
     * 
     */
    public void setArrivalTimezoneOffset(short value) {
        this.arrivalTimezoneOffset = value;
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
     * Gets the value of the acType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACType() {
        return acType;
    }

    /**
     * Sets the value of the acType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACType(String value) {
        this.acType = value;
    }

    /**
     * Gets the value of the equipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipCode() {
        return equipCode;
    }

    /**
     * Sets the value of the equipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipCode(String value) {
        this.equipCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public short getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(short value) {
        this.status = value;
    }

}

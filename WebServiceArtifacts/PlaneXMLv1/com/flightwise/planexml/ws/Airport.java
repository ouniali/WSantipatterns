
package com.flightwise.planexml.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Airport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Airport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ICAO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Lon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Elev" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GMTOffset" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="DST" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Tower" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Airport", propOrder = {
    "ident",
    "icao",
    "name",
    "location",
    "lat",
    "lon",
    "elev",
    "gmtOffset",
    "dst",
    "tower"
})
public class Airport {

    @XmlElement(name = "Ident")
    protected String ident;
    @XmlElement(name = "ICAO")
    protected String icao;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Lat")
    protected double lat;
    @XmlElement(name = "Lon")
    protected double lon;
    @XmlElement(name = "Elev")
    protected int elev;
    @XmlElement(name = "GMTOffset")
    protected short gmtOffset;
    @XmlElement(name = "DST")
    protected short dst;
    @XmlElement(name = "Tower")
    protected short tower;

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
     * Gets the value of the icao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICAO() {
        return icao;
    }

    /**
     * Sets the value of the icao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICAO(String value) {
        this.icao = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
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
     * Gets the value of the elev property.
     * 
     */
    public int getElev() {
        return elev;
    }

    /**
     * Sets the value of the elev property.
     * 
     */
    public void setElev(int value) {
        this.elev = value;
    }

    /**
     * Gets the value of the gmtOffset property.
     * 
     */
    public short getGMTOffset() {
        return gmtOffset;
    }

    /**
     * Sets the value of the gmtOffset property.
     * 
     */
    public void setGMTOffset(short value) {
        this.gmtOffset = value;
    }

    /**
     * Gets the value of the dst property.
     * 
     */
    public short getDST() {
        return dst;
    }

    /**
     * Sets the value of the dst property.
     * 
     */
    public void setDST(short value) {
        this.dst = value;
    }

    /**
     * Gets the value of the tower property.
     * 
     */
    public short getTower() {
        return tower;
    }

    /**
     * Sets the value of the tower property.
     * 
     */
    public void setTower(short value) {
        this.tower = value;
    }

}


package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for positionV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="speedMph" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="altitudeFt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="course" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="vrateMps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="phase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastObserved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionV2", propOrder = {
    "lon",
    "lat",
    "speedMph",
    "altitudeFt",
    "source",
    "date",
    "course",
    "vrateMps",
    "phase",
    "stationID",
    "lastObserved"
})
public class PositionV2 {

    protected double lon;
    protected double lat;
    protected Integer speedMph;
    protected Integer altitudeFt;
    protected String source;
    @XmlElement(required = true)
    protected String date;
    protected Integer course;
    protected Integer vrateMps;
    protected String phase;
    protected String stationID;
    protected String lastObserved;

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
     * Gets the value of the speedMph property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpeedMph() {
        return speedMph;
    }

    /**
     * Sets the value of the speedMph property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpeedMph(Integer value) {
        this.speedMph = value;
    }

    /**
     * Gets the value of the altitudeFt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAltitudeFt() {
        return altitudeFt;
    }

    /**
     * Sets the value of the altitudeFt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAltitudeFt(Integer value) {
        this.altitudeFt = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the course property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCourse(Integer value) {
        this.course = value;
    }

    /**
     * Gets the value of the vrateMps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVrateMps() {
        return vrateMps;
    }

    /**
     * Sets the value of the vrateMps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVrateMps(Integer value) {
        this.vrateMps = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    /**
     * Gets the value of the stationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationID() {
        return stationID;
    }

    /**
     * Sets the value of the stationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationID(String value) {
        this.stationID = value;
    }

    /**
     * Gets the value of the lastObserved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastObserved() {
        return lastObserved;
    }

    /**
     * Sets the value of the lastObserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastObserved(String value) {
        this.lastObserved = value;
    }

}

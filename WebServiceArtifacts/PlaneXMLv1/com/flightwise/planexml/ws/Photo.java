
package com.flightwise.planexml.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Photo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Photo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateUploaded" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DateTaken" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Lat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Lon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Airport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Photo", propOrder = {
    "key",
    "ident",
    "dateUploaded",
    "dateTaken",
    "lat",
    "lon",
    "airport",
    "desc",
    "primary"
})
public class Photo {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "Ident")
    protected String ident;
    @XmlElement(name = "DateUploaded")
    protected long dateUploaded;
    @XmlElement(name = "DateTaken")
    protected long dateTaken;
    @XmlElement(name = "Lat")
    protected double lat;
    @XmlElement(name = "Lon")
    protected double lon;
    @XmlElement(name = "Airport")
    protected String airport;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Primary")
    protected short primary;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
     * Gets the value of the dateUploaded property.
     * 
     */
    public long getDateUploaded() {
        return dateUploaded;
    }

    /**
     * Sets the value of the dateUploaded property.
     * 
     */
    public void setDateUploaded(long value) {
        this.dateUploaded = value;
    }

    /**
     * Gets the value of the dateTaken property.
     * 
     */
    public long getDateTaken() {
        return dateTaken;
    }

    /**
     * Sets the value of the dateTaken property.
     * 
     */
    public void setDateTaken(long value) {
        this.dateTaken = value;
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
     * Gets the value of the airport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirport() {
        return airport;
    }

    /**
     * Sets the value of the airport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirport(String value) {
        this.airport = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     */
    public short getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     */
    public void setPrimary(short value) {
        this.primary = value;
    }

}

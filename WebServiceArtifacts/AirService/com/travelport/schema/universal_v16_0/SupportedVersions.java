
package com.travelport.schema.universal_v16_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="urVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="airVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hotelVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vehicleVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="passiveVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="railVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SupportedVersions")
public class SupportedVersions {

    @XmlAttribute(name = "urVersion")
    protected String urVersion;
    @XmlAttribute(name = "airVersion")
    protected String airVersion;
    @XmlAttribute(name = "hotelVersion")
    protected String hotelVersion;
    @XmlAttribute(name = "vehicleVersion")
    protected String vehicleVersion;
    @XmlAttribute(name = "passiveVersion")
    protected String passiveVersion;
    @XmlAttribute(name = "railVersion")
    protected String railVersion;

    /**
     * Gets the value of the urVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrVersion() {
        return urVersion;
    }

    /**
     * Sets the value of the urVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrVersion(String value) {
        this.urVersion = value;
    }

    /**
     * Gets the value of the airVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirVersion() {
        return airVersion;
    }

    /**
     * Sets the value of the airVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirVersion(String value) {
        this.airVersion = value;
    }

    /**
     * Gets the value of the hotelVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelVersion() {
        return hotelVersion;
    }

    /**
     * Sets the value of the hotelVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelVersion(String value) {
        this.hotelVersion = value;
    }

    /**
     * Gets the value of the vehicleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleVersion() {
        return vehicleVersion;
    }

    /**
     * Sets the value of the vehicleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleVersion(String value) {
        this.vehicleVersion = value;
    }

    /**
     * Gets the value of the passiveVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassiveVersion() {
        return passiveVersion;
    }

    /**
     * Sets the value of the passiveVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassiveVersion(String value) {
        this.passiveVersion = value;
    }

    /**
     * Gets the value of the railVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailVersion() {
        return railVersion;
    }

    /**
     * Sets the value of the railVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailVersion(String value) {
        this.railVersion = value;
    }

}

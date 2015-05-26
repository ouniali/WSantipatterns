
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PS_GeocodeRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PS_GeocodeRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="maximum_longitude" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="minimum_longitude" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="minimum_latitude" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="maximum_latitude" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PS_GeocodeRQType")
public class PSGeocodeRQType {

    @XmlAttribute(name = "maximum_longitude", required = true)
    protected double maximumLongitude;
    @XmlAttribute(name = "minimum_longitude", required = true)
    protected double minimumLongitude;
    @XmlAttribute(name = "minimum_latitude", required = true)
    protected double minimumLatitude;
    @XmlAttribute(name = "maximum_latitude", required = true)
    protected double maximumLatitude;
    @XmlAttribute(name = "exclude")
    protected Boolean exclude;

    /**
     * Gets the value of the maximumLongitude property.
     * 
     */
    public double getMaximumLongitude() {
        return maximumLongitude;
    }

    /**
     * Sets the value of the maximumLongitude property.
     * 
     */
    public void setMaximumLongitude(double value) {
        this.maximumLongitude = value;
    }

    /**
     * Gets the value of the minimumLongitude property.
     * 
     */
    public double getMinimumLongitude() {
        return minimumLongitude;
    }

    /**
     * Sets the value of the minimumLongitude property.
     * 
     */
    public void setMinimumLongitude(double value) {
        this.minimumLongitude = value;
    }

    /**
     * Gets the value of the minimumLatitude property.
     * 
     */
    public double getMinimumLatitude() {
        return minimumLatitude;
    }

    /**
     * Sets the value of the minimumLatitude property.
     * 
     */
    public void setMinimumLatitude(double value) {
        this.minimumLatitude = value;
    }

    /**
     * Gets the value of the maximumLatitude property.
     * 
     */
    public double getMaximumLatitude() {
        return maximumLatitude;
    }

    /**
     * Sets the value of the maximumLatitude property.
     * 
     */
    public void setMaximumLatitude(double value) {
        this.maximumLatitude = value;
    }

    /**
     * Gets the value of the exclude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclude() {
        return exclude;
    }

    /**
     * Sets the value of the exclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }

}


package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Score complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Score">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Score", propOrder = {
    "name",
    "city",
    "country"
})
public class Score {

    @XmlElement(name = "Name")
    protected double name;
    @XmlElement(name = "City")
    protected double city;
    @XmlElement(name = "Country")
    protected double country;

    /**
     * Gets the value of the name property.
     * 
     */
    public double getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     */
    public void setName(double value) {
        this.name = value;
    }

    /**
     * Gets the value of the city property.
     * 
     */
    public double getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     */
    public void setCity(double value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     */
    public double getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     */
    public void setCountry(double value) {
        this.country = value;
    }

}

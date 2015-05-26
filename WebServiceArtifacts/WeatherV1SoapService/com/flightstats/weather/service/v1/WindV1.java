
package com.flightstats.weather.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for windV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="windV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="directionMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="directionMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="directionIsVariable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="speedKnots" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gustSpeedKnots" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "windV1", propOrder = {
    "direction",
    "directionMin",
    "directionMax",
    "directionIsVariable",
    "speedKnots",
    "gustSpeedKnots"
})
public class WindV1 {

    protected Integer direction;
    protected Integer directionMin;
    protected Integer directionMax;
    protected Boolean directionIsVariable;
    protected String speedKnots;
    protected String gustSpeedKnots;

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirection(Integer value) {
        this.direction = value;
    }

    /**
     * Gets the value of the directionMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectionMin() {
        return directionMin;
    }

    /**
     * Sets the value of the directionMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectionMin(Integer value) {
        this.directionMin = value;
    }

    /**
     * Gets the value of the directionMax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectionMax() {
        return directionMax;
    }

    /**
     * Sets the value of the directionMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectionMax(Integer value) {
        this.directionMax = value;
    }

    /**
     * Gets the value of the directionIsVariable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectionIsVariable() {
        return directionIsVariable;
    }

    /**
     * Sets the value of the directionIsVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectionIsVariable(Boolean value) {
        this.directionIsVariable = value;
    }

    /**
     * Gets the value of the speedKnots property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedKnots() {
        return speedKnots;
    }

    /**
     * Sets the value of the speedKnots property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedKnots(String value) {
        this.speedKnots = value;
    }

    /**
     * Gets the value of the gustSpeedKnots property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGustSpeedKnots() {
        return gustSpeedKnots;
    }

    /**
     * Sets the value of the gustSpeedKnots property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGustSpeedKnots(String value) {
        this.gustSpeedKnots = value;
    }

}

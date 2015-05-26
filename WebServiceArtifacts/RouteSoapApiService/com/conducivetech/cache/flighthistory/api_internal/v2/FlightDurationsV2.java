
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightDurationsV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightDurationsV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduledBlockMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="blockMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scheduledAirMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="airMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scheduledTaxiOutMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taxiOutMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scheduledTaxiInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taxiInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightDurationsV2", propOrder = {
    "scheduledBlockMinutes",
    "blockMinutes",
    "scheduledAirMinutes",
    "airMinutes",
    "scheduledTaxiOutMinutes",
    "taxiOutMinutes",
    "scheduledTaxiInMinutes",
    "taxiInMinutes"
})
public class FlightDurationsV2 {

    protected Integer scheduledBlockMinutes;
    protected Integer blockMinutes;
    protected Integer scheduledAirMinutes;
    protected Integer airMinutes;
    protected Integer scheduledTaxiOutMinutes;
    protected Integer taxiOutMinutes;
    protected Integer scheduledTaxiInMinutes;
    protected Integer taxiInMinutes;

    /**
     * Gets the value of the scheduledBlockMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduledBlockMinutes() {
        return scheduledBlockMinutes;
    }

    /**
     * Sets the value of the scheduledBlockMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduledBlockMinutes(Integer value) {
        this.scheduledBlockMinutes = value;
    }

    /**
     * Gets the value of the blockMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBlockMinutes() {
        return blockMinutes;
    }

    /**
     * Sets the value of the blockMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlockMinutes(Integer value) {
        this.blockMinutes = value;
    }

    /**
     * Gets the value of the scheduledAirMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduledAirMinutes() {
        return scheduledAirMinutes;
    }

    /**
     * Sets the value of the scheduledAirMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduledAirMinutes(Integer value) {
        this.scheduledAirMinutes = value;
    }

    /**
     * Gets the value of the airMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAirMinutes() {
        return airMinutes;
    }

    /**
     * Sets the value of the airMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAirMinutes(Integer value) {
        this.airMinutes = value;
    }

    /**
     * Gets the value of the scheduledTaxiOutMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduledTaxiOutMinutes() {
        return scheduledTaxiOutMinutes;
    }

    /**
     * Sets the value of the scheduledTaxiOutMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduledTaxiOutMinutes(Integer value) {
        this.scheduledTaxiOutMinutes = value;
    }

    /**
     * Gets the value of the taxiOutMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxiOutMinutes() {
        return taxiOutMinutes;
    }

    /**
     * Sets the value of the taxiOutMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxiOutMinutes(Integer value) {
        this.taxiOutMinutes = value;
    }

    /**
     * Gets the value of the scheduledTaxiInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduledTaxiInMinutes() {
        return scheduledTaxiInMinutes;
    }

    /**
     * Sets the value of the scheduledTaxiInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduledTaxiInMinutes(Integer value) {
        this.scheduledTaxiInMinutes = value;
    }

    /**
     * Gets the value of the taxiInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaxiInMinutes() {
        return taxiInMinutes;
    }

    /**
     * Sets the value of the taxiInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaxiInMinutes(Integer value) {
        this.taxiInMinutes = value;
    }

}

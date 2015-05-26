
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delaysV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delaysV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureGateDelayMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="departureRunwayDelayMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="arrivalGateDelayMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="arrivalRunwayDelayMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delaysV2", propOrder = {
    "departureGateDelayMinutes",
    "departureRunwayDelayMinutes",
    "arrivalGateDelayMinutes",
    "arrivalRunwayDelayMinutes"
})
public class DelaysV2 {

    protected Integer departureGateDelayMinutes;
    protected Integer departureRunwayDelayMinutes;
    protected Integer arrivalGateDelayMinutes;
    protected Integer arrivalRunwayDelayMinutes;

    /**
     * Gets the value of the departureGateDelayMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepartureGateDelayMinutes() {
        return departureGateDelayMinutes;
    }

    /**
     * Sets the value of the departureGateDelayMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepartureGateDelayMinutes(Integer value) {
        this.departureGateDelayMinutes = value;
    }

    /**
     * Gets the value of the departureRunwayDelayMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepartureRunwayDelayMinutes() {
        return departureRunwayDelayMinutes;
    }

    /**
     * Sets the value of the departureRunwayDelayMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepartureRunwayDelayMinutes(Integer value) {
        this.departureRunwayDelayMinutes = value;
    }

    /**
     * Gets the value of the arrivalGateDelayMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrivalGateDelayMinutes() {
        return arrivalGateDelayMinutes;
    }

    /**
     * Sets the value of the arrivalGateDelayMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrivalGateDelayMinutes(Integer value) {
        this.arrivalGateDelayMinutes = value;
    }

    /**
     * Gets the value of the arrivalRunwayDelayMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrivalRunwayDelayMinutes() {
        return arrivalRunwayDelayMinutes;
    }

    /**
     * Sets the value of the arrivalRunwayDelayMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrivalRunwayDelayMinutes(Integer value) {
        this.arrivalRunwayDelayMinutes = value;
    }

}

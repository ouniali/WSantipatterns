
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightAlertChannel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightAlertChannel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channel_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="channel_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mask_summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="e_filed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="e_departure" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="e_arrival" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="e_diverted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="e_cancelled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="target_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightAlertChannel", propOrder = {
    "channelId",
    "channelName",
    "maskSummary",
    "eFiled",
    "eDeparture",
    "eArrival",
    "eDiverted",
    "eCancelled",
    "targetAddress"
})
public class FlightAlertChannel {

    @XmlElement(name = "channel_id")
    protected int channelId;
    @XmlElement(name = "channel_name", required = true)
    protected String channelName;
    @XmlElement(name = "mask_summary", required = true)
    protected String maskSummary;
    @XmlElement(name = "e_filed")
    protected boolean eFiled;
    @XmlElement(name = "e_departure")
    protected boolean eDeparture;
    @XmlElement(name = "e_arrival")
    protected boolean eArrival;
    @XmlElement(name = "e_diverted")
    protected boolean eDiverted;
    @XmlElement(name = "e_cancelled")
    protected boolean eCancelled;
    @XmlElement(name = "target_address", required = true)
    protected String targetAddress;

    /**
     * Gets the value of the channelId property.
     * 
     */
    public int getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     */
    public void setChannelId(int value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the channelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * Sets the value of the channelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelName(String value) {
        this.channelName = value;
    }

    /**
     * Gets the value of the maskSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskSummary() {
        return maskSummary;
    }

    /**
     * Sets the value of the maskSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskSummary(String value) {
        this.maskSummary = value;
    }

    /**
     * Gets the value of the eFiled property.
     * 
     */
    public boolean isEFiled() {
        return eFiled;
    }

    /**
     * Sets the value of the eFiled property.
     * 
     */
    public void setEFiled(boolean value) {
        this.eFiled = value;
    }

    /**
     * Gets the value of the eDeparture property.
     * 
     */
    public boolean isEDeparture() {
        return eDeparture;
    }

    /**
     * Sets the value of the eDeparture property.
     * 
     */
    public void setEDeparture(boolean value) {
        this.eDeparture = value;
    }

    /**
     * Gets the value of the eArrival property.
     * 
     */
    public boolean isEArrival() {
        return eArrival;
    }

    /**
     * Sets the value of the eArrival property.
     * 
     */
    public void setEArrival(boolean value) {
        this.eArrival = value;
    }

    /**
     * Gets the value of the eDiverted property.
     * 
     */
    public boolean isEDiverted() {
        return eDiverted;
    }

    /**
     * Sets the value of the eDiverted property.
     * 
     */
    public void setEDiverted(boolean value) {
        this.eDiverted = value;
    }

    /**
     * Gets the value of the eCancelled property.
     * 
     */
    public boolean isECancelled() {
        return eCancelled;
    }

    /**
     * Sets the value of the eCancelled property.
     * 
     */
    public void setECancelled(boolean value) {
        this.eCancelled = value;
    }

    /**
     * Gets the value of the targetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAddress() {
        return targetAddress;
    }

    /**
     * Sets the value of the targetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAddress(String value) {
        this.targetAddress = value;
    }

}

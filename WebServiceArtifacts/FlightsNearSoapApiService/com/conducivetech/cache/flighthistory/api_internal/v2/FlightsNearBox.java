
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightsNear_box complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightsNear_box">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="topLat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="leftLon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bottomLat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rightLon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maxFlights" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendedOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightsNear_box", propOrder = {
    "appId",
    "appKey",
    "topLat",
    "leftLon",
    "bottomLat",
    "rightLon",
    "maxFlights",
    "sourceType",
    "extendedOptions"
})
public class FlightsNearBox {

    @XmlElement(required = true)
    protected String appId;
    @XmlElement(required = true)
    protected String appKey;
    protected double topLat;
    protected double leftLon;
    protected double bottomLat;
    protected double rightLon;
    protected Integer maxFlights;
    protected String sourceType;
    protected String extendedOptions;

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the appKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * Sets the value of the appKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppKey(String value) {
        this.appKey = value;
    }

    /**
     * Gets the value of the topLat property.
     * 
     */
    public double getTopLat() {
        return topLat;
    }

    /**
     * Sets the value of the topLat property.
     * 
     */
    public void setTopLat(double value) {
        this.topLat = value;
    }

    /**
     * Gets the value of the leftLon property.
     * 
     */
    public double getLeftLon() {
        return leftLon;
    }

    /**
     * Sets the value of the leftLon property.
     * 
     */
    public void setLeftLon(double value) {
        this.leftLon = value;
    }

    /**
     * Gets the value of the bottomLat property.
     * 
     */
    public double getBottomLat() {
        return bottomLat;
    }

    /**
     * Sets the value of the bottomLat property.
     * 
     */
    public void setBottomLat(double value) {
        this.bottomLat = value;
    }

    /**
     * Gets the value of the rightLon property.
     * 
     */
    public double getRightLon() {
        return rightLon;
    }

    /**
     * Sets the value of the rightLon property.
     * 
     */
    public void setRightLon(double value) {
        this.rightLon = value;
    }

    /**
     * Gets the value of the maxFlights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxFlights() {
        return maxFlights;
    }

    /**
     * Sets the value of the maxFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxFlights(Integer value) {
        this.maxFlights = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the extendedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedOptions() {
        return extendedOptions;
    }

    /**
     * Sets the value of the extendedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedOptions(String value) {
        this.extendedOptions = value;
    }

}

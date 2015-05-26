
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForwardContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForwardContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Mid" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Ask" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SpotRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForwardContract", propOrder = {
    "expiration",
    "bid",
    "mid",
    "ask",
    "spotRate",
    "points"
})
public class ForwardContract {

    @XmlElement(name = "Expiration")
    protected String expiration;
    @XmlElement(name = "Bid")
    protected double bid;
    @XmlElement(name = "Mid")
    protected double mid;
    @XmlElement(name = "Ask")
    protected double ask;
    @XmlElement(name = "SpotRate")
    protected double spotRate;
    @XmlElement(name = "Points")
    protected double points;

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiration(String value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the bid property.
     * 
     */
    public double getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     */
    public void setBid(double value) {
        this.bid = value;
    }

    /**
     * Gets the value of the mid property.
     * 
     */
    public double getMid() {
        return mid;
    }

    /**
     * Sets the value of the mid property.
     * 
     */
    public void setMid(double value) {
        this.mid = value;
    }

    /**
     * Gets the value of the ask property.
     * 
     */
    public double getAsk() {
        return ask;
    }

    /**
     * Sets the value of the ask property.
     * 
     */
    public void setAsk(double value) {
        this.ask = value;
    }

    /**
     * Gets the value of the spotRate property.
     * 
     */
    public double getSpotRate() {
        return spotRate;
    }

    /**
     * Sets the value of the spotRate property.
     * 
     */
    public void setSpotRate(double value) {
        this.spotRate = value;
    }

    /**
     * Gets the value of the points property.
     * 
     */
    public double getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     */
    public void setPoints(double value) {
        this.points = value;
    }

}

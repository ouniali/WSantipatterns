
package com.serviceobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Warning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Warning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error" type="{http://www.serviceobjects.com/}Err" minOccurs="0"/>
 *         &lt;element name="Event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Urgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certainty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Headline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountyFIPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Warning", propOrder = {
    "error",
    "event",
    "urgency",
    "severity",
    "certainty",
    "effectiveFrom",
    "effectiveUntil",
    "headline",
    "description",
    "area",
    "countyFIPS",
    "url"
})
public class Warning {

    @XmlElement(name = "Error")
    protected Err error;
    @XmlElement(name = "Event")
    protected String event;
    @XmlElement(name = "Urgency")
    protected String urgency;
    @XmlElement(name = "Severity")
    protected String severity;
    @XmlElement(name = "Certainty")
    protected String certainty;
    @XmlElement(name = "EffectiveFrom")
    protected String effectiveFrom;
    @XmlElement(name = "EffectiveUntil")
    protected String effectiveUntil;
    @XmlElement(name = "Headline")
    protected String headline;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Area")
    protected String area;
    @XmlElement(name = "CountyFIPS")
    protected String countyFIPS;
    @XmlElement(name = "URL")
    protected String url;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Err }
     *     
     */
    public Err getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Err }
     *     
     */
    public void setError(Err value) {
        this.error = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(String value) {
        this.event = value;
    }

    /**
     * Gets the value of the urgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrgency() {
        return urgency;
    }

    /**
     * Sets the value of the urgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrgency(String value) {
        this.urgency = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the certainty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertainty() {
        return certainty;
    }

    /**
     * Sets the value of the certainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertainty(String value) {
        this.certainty = value;
    }

    /**
     * Gets the value of the effectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveFrom() {
        return effectiveFrom;
    }

    /**
     * Sets the value of the effectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveFrom(String value) {
        this.effectiveFrom = value;
    }

    /**
     * Gets the value of the effectiveUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveUntil() {
        return effectiveUntil;
    }

    /**
     * Sets the value of the effectiveUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveUntil(String value) {
        this.effectiveUntil = value;
    }

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadline(String value) {
        this.headline = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the countyFIPS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyFIPS() {
        return countyFIPS;
    }

    /**
     * Sets the value of the countyFIPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyFIPS(String value) {
        this.countyFIPS = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

}

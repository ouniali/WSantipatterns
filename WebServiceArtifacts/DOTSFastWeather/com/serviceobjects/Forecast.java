
package com.serviceobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Forecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Forecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error" type="{http://www.serviceobjects.com/}Err" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChanceOfPrecipitation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Forecast", propOrder = {
    "error",
    "date",
    "high",
    "low",
    "chanceOfPrecipitation",
    "conditions"
})
public class Forecast {

    @XmlElement(name = "Error")
    protected Err error;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "High")
    protected String high;
    @XmlElement(name = "Low")
    protected String low;
    @XmlElement(name = "ChanceOfPrecipitation")
    protected String chanceOfPrecipitation;
    @XmlElement(name = "Conditions")
    protected String conditions;

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHigh(String value) {
        this.high = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLow(String value) {
        this.low = value;
    }

    /**
     * Gets the value of the chanceOfPrecipitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanceOfPrecipitation() {
        return chanceOfPrecipitation;
    }

    /**
     * Sets the value of the chanceOfPrecipitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChanceOfPrecipitation(String value) {
        this.chanceOfPrecipitation = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditions(String value) {
        this.conditions = value;
    }

}

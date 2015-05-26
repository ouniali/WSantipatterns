
package com.epostcode.ws.uk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Nearest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Nearest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Postcode_Datum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Postcode_Return" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Postcode_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ordinal_Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distance_Metres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distance_Kilometres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distance_Miles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distance_NauticalMiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Return_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nearest", propOrder = {
    "postcodeDatum",
    "postcodeReturn",
    "postcodeDescription",
    "ordinalPosition",
    "distanceMetres",
    "distanceKilometres",
    "distanceMiles",
    "distanceNauticalMiles",
    "returnCode"
})
public class Nearest {

    @XmlElement(name = "Postcode_Datum")
    protected String postcodeDatum;
    @XmlElement(name = "Postcode_Return")
    protected String postcodeReturn;
    @XmlElement(name = "Postcode_Description")
    protected String postcodeDescription;
    @XmlElement(name = "Ordinal_Position")
    protected String ordinalPosition;
    @XmlElement(name = "Distance_Metres")
    protected String distanceMetres;
    @XmlElement(name = "Distance_Kilometres")
    protected String distanceKilometres;
    @XmlElement(name = "Distance_Miles")
    protected String distanceMiles;
    @XmlElement(name = "Distance_NauticalMiles")
    protected String distanceNauticalMiles;
    @XmlElement(name = "Return_Code")
    protected String returnCode;

    /**
     * Gets the value of the postcodeDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodeDatum() {
        return postcodeDatum;
    }

    /**
     * Sets the value of the postcodeDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodeDatum(String value) {
        this.postcodeDatum = value;
    }

    /**
     * Gets the value of the postcodeReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodeReturn() {
        return postcodeReturn;
    }

    /**
     * Sets the value of the postcodeReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodeReturn(String value) {
        this.postcodeReturn = value;
    }

    /**
     * Gets the value of the postcodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodeDescription() {
        return postcodeDescription;
    }

    /**
     * Sets the value of the postcodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodeDescription(String value) {
        this.postcodeDescription = value;
    }

    /**
     * Gets the value of the ordinalPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdinalPosition() {
        return ordinalPosition;
    }

    /**
     * Sets the value of the ordinalPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdinalPosition(String value) {
        this.ordinalPosition = value;
    }

    /**
     * Gets the value of the distanceMetres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceMetres() {
        return distanceMetres;
    }

    /**
     * Sets the value of the distanceMetres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceMetres(String value) {
        this.distanceMetres = value;
    }

    /**
     * Gets the value of the distanceKilometres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceKilometres() {
        return distanceKilometres;
    }

    /**
     * Sets the value of the distanceKilometres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceKilometres(String value) {
        this.distanceKilometres = value;
    }

    /**
     * Gets the value of the distanceMiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceMiles() {
        return distanceMiles;
    }

    /**
     * Sets the value of the distanceMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceMiles(String value) {
        this.distanceMiles = value;
    }

    /**
     * Gets the value of the distanceNauticalMiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceNauticalMiles() {
        return distanceNauticalMiles;
    }

    /**
     * Sets the value of the distanceNauticalMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceNauticalMiles(String value) {
        this.distanceNauticalMiles = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

}

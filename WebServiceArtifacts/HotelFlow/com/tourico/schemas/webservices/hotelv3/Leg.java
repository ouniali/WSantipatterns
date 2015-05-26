
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Leg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Leg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="depArCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="arrArCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="depDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="arrDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="airlineCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="airlineName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="depTerm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="arrTerm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mealType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="duration" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leg")
public class Leg {

    @XmlAttribute(name = "depArCode")
    protected String depArCode;
    @XmlAttribute(name = "arrArCode")
    protected String arrArCode;
    @XmlAttribute(name = "depDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depDateTime;
    @XmlAttribute(name = "arrDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrDateTime;
    @XmlAttribute(name = "airlineCode")
    protected String airlineCode;
    @XmlAttribute(name = "airlineName")
    protected String airlineName;
    @XmlAttribute(name = "flightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "depTerm")
    protected String depTerm;
    @XmlAttribute(name = "arrTerm")
    protected String arrTerm;
    @XmlAttribute(name = "mealType")
    protected String mealType;
    @XmlAttribute(name = "duration", required = true)
    protected int duration;

    /**
     * Gets the value of the depArCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepArCode() {
        return depArCode;
    }

    /**
     * Sets the value of the depArCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepArCode(String value) {
        this.depArCode = value;
    }

    /**
     * Gets the value of the arrArCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrArCode() {
        return arrArCode;
    }

    /**
     * Sets the value of the arrArCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrArCode(String value) {
        this.arrArCode = value;
    }

    /**
     * Gets the value of the depDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepDateTime() {
        return depDateTime;
    }

    /**
     * Sets the value of the depDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepDateTime(XMLGregorianCalendar value) {
        this.depDateTime = value;
    }

    /**
     * Gets the value of the arrDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrDateTime() {
        return arrDateTime;
    }

    /**
     * Sets the value of the arrDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrDateTime(XMLGregorianCalendar value) {
        this.arrDateTime = value;
    }

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the airlineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineName() {
        return airlineName;
    }

    /**
     * Sets the value of the airlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineName(String value) {
        this.airlineName = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the depTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepTerm() {
        return depTerm;
    }

    /**
     * Sets the value of the depTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepTerm(String value) {
        this.depTerm = value;
    }

    /**
     * Gets the value of the arrTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrTerm() {
        return arrTerm;
    }

    /**
     * Sets the value of the arrTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrTerm(String value) {
        this.arrTerm = value;
    }

    /**
     * Gets the value of the mealType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealType() {
        return mealType;
    }

    /**
     * Sets the value of the mealType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealType(String value) {
        this.mealType = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     */
    public void setDuration(int value) {
        this.duration = value;
    }

}

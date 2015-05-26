
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForwardRateAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForwardRateAgreement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="FirstRate" type="{http://www.xignite.com/services/}LIBORRate" minOccurs="0"/>
 *         &lt;element name="SecondRate" type="{http://www.xignite.com/services/}LIBORRate" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpotDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstFixingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondFixingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.xignite.com/services/}RateDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForwardRateAgreement", propOrder = {
    "firstRate",
    "secondRate",
    "date",
    "spotDate",
    "firstFixingDate",
    "secondFixingDate",
    "value",
    "text",
    "source",
    "description"
})
public class ForwardRateAgreement
    extends Common
{

    @XmlElement(name = "FirstRate")
    protected LIBORRate firstRate;
    @XmlElement(name = "SecondRate")
    protected LIBORRate secondRate;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "SpotDate")
    protected String spotDate;
    @XmlElement(name = "FirstFixingDate")
    protected String firstFixingDate;
    @XmlElement(name = "SecondFixingDate")
    protected String secondFixingDate;
    @XmlElement(name = "Value")
    protected double value;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Description")
    protected RateDescription description;

    /**
     * Gets the value of the firstRate property.
     * 
     * @return
     *     possible object is
     *     {@link LIBORRate }
     *     
     */
    public LIBORRate getFirstRate() {
        return firstRate;
    }

    /**
     * Sets the value of the firstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LIBORRate }
     *     
     */
    public void setFirstRate(LIBORRate value) {
        this.firstRate = value;
    }

    /**
     * Gets the value of the secondRate property.
     * 
     * @return
     *     possible object is
     *     {@link LIBORRate }
     *     
     */
    public LIBORRate getSecondRate() {
        return secondRate;
    }

    /**
     * Sets the value of the secondRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LIBORRate }
     *     
     */
    public void setSecondRate(LIBORRate value) {
        this.secondRate = value;
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
     * Gets the value of the spotDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpotDate() {
        return spotDate;
    }

    /**
     * Sets the value of the spotDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpotDate(String value) {
        this.spotDate = value;
    }

    /**
     * Gets the value of the firstFixingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstFixingDate() {
        return firstFixingDate;
    }

    /**
     * Sets the value of the firstFixingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstFixingDate(String value) {
        this.firstFixingDate = value;
    }

    /**
     * Gets the value of the secondFixingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondFixingDate() {
        return secondFixingDate;
    }

    /**
     * Sets the value of the secondFixingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondFixingDate(String value) {
        this.secondFixingDate = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link RateDescription }
     *     
     */
    public RateDescription getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDescription }
     *     
     */
    public void setDescription(RateDescription value) {
        this.description = value;
    }

}

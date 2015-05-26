
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LIBORRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LIBORRate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}LIBORTypes"/>
 *         &lt;element name="Currency" type="{http://www.xignite.com/services/}LIBORCurrencyTypes"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "LIBORRate", propOrder = {
    "type",
    "currency",
    "date",
    "value",
    "text",
    "source",
    "description"
})
public class LIBORRate
    extends Common
{

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected LIBORTypes type;
    @XmlElement(name = "Currency", required = true)
    @XmlSchemaType(name = "string")
    protected LIBORCurrencyTypes currency;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Value")
    protected double value;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "Description")
    protected RateDescription description;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LIBORTypes }
     *     
     */
    public LIBORTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LIBORTypes }
     *     
     */
    public void setType(LIBORTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link LIBORCurrencyTypes }
     *     
     */
    public LIBORCurrencyTypes getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link LIBORCurrencyTypes }
     *     
     */
    public void setCurrency(LIBORCurrencyTypes value) {
        this.currency = value;
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

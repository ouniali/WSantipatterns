
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Split complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Split">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ratio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CumulatedRatio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Split", propOrder = {
    "date",
    "ratio",
    "cumulatedRatio",
    "text"
})
public class Split {

    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Ratio")
    protected double ratio;
    @XmlElement(name = "CumulatedRatio")
    protected double cumulatedRatio;
    @XmlElement(name = "Text")
    protected String text;

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
     * Gets the value of the ratio property.
     * 
     */
    public double getRatio() {
        return ratio;
    }

    /**
     * Sets the value of the ratio property.
     * 
     */
    public void setRatio(double value) {
        this.ratio = value;
    }

    /**
     * Gets the value of the cumulatedRatio property.
     * 
     */
    public double getCumulatedRatio() {
        return cumulatedRatio;
    }

    /**
     * Sets the value of the cumulatedRatio property.
     * 
     */
    public void setCumulatedRatio(double value) {
        this.cumulatedRatio = value;
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

}

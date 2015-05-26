
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionExercised complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionExercised">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SharesAcquiredOnExercise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ValueRealized" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NumSecuritiesUnexercisedOptionsExercisable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumSecuritiesUnexercisedOptionsUnexercisable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ValueOfUnerxercisedOptionsExercisable" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ValueOfUnerxercisedOptionsUnexercisable" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionExercised", propOrder = {
    "source",
    "sourceDate",
    "currency",
    "sharesAcquiredOnExercise",
    "valueRealized",
    "numSecuritiesUnexercisedOptionsExercisable",
    "numSecuritiesUnexercisedOptionsUnexercisable",
    "valueOfUnerxercisedOptionsExercisable",
    "valueOfUnerxercisedOptionsUnexercisable"
})
public class OptionExercised
    extends Common
{

    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "SourceDate")
    protected String sourceDate;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "SharesAcquiredOnExercise")
    protected int sharesAcquiredOnExercise;
    @XmlElement(name = "ValueRealized")
    protected double valueRealized;
    @XmlElement(name = "NumSecuritiesUnexercisedOptionsExercisable")
    protected int numSecuritiesUnexercisedOptionsExercisable;
    @XmlElement(name = "NumSecuritiesUnexercisedOptionsUnexercisable")
    protected int numSecuritiesUnexercisedOptionsUnexercisable;
    @XmlElement(name = "ValueOfUnerxercisedOptionsExercisable")
    protected double valueOfUnerxercisedOptionsExercisable;
    @XmlElement(name = "ValueOfUnerxercisedOptionsUnexercisable")
    protected double valueOfUnerxercisedOptionsUnexercisable;

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
     * Gets the value of the sourceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDate() {
        return sourceDate;
    }

    /**
     * Sets the value of the sourceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDate(String value) {
        this.sourceDate = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the sharesAcquiredOnExercise property.
     * 
     */
    public int getSharesAcquiredOnExercise() {
        return sharesAcquiredOnExercise;
    }

    /**
     * Sets the value of the sharesAcquiredOnExercise property.
     * 
     */
    public void setSharesAcquiredOnExercise(int value) {
        this.sharesAcquiredOnExercise = value;
    }

    /**
     * Gets the value of the valueRealized property.
     * 
     */
    public double getValueRealized() {
        return valueRealized;
    }

    /**
     * Sets the value of the valueRealized property.
     * 
     */
    public void setValueRealized(double value) {
        this.valueRealized = value;
    }

    /**
     * Gets the value of the numSecuritiesUnexercisedOptionsExercisable property.
     * 
     */
    public int getNumSecuritiesUnexercisedOptionsExercisable() {
        return numSecuritiesUnexercisedOptionsExercisable;
    }

    /**
     * Sets the value of the numSecuritiesUnexercisedOptionsExercisable property.
     * 
     */
    public void setNumSecuritiesUnexercisedOptionsExercisable(int value) {
        this.numSecuritiesUnexercisedOptionsExercisable = value;
    }

    /**
     * Gets the value of the numSecuritiesUnexercisedOptionsUnexercisable property.
     * 
     */
    public int getNumSecuritiesUnexercisedOptionsUnexercisable() {
        return numSecuritiesUnexercisedOptionsUnexercisable;
    }

    /**
     * Sets the value of the numSecuritiesUnexercisedOptionsUnexercisable property.
     * 
     */
    public void setNumSecuritiesUnexercisedOptionsUnexercisable(int value) {
        this.numSecuritiesUnexercisedOptionsUnexercisable = value;
    }

    /**
     * Gets the value of the valueOfUnerxercisedOptionsExercisable property.
     * 
     */
    public double getValueOfUnerxercisedOptionsExercisable() {
        return valueOfUnerxercisedOptionsExercisable;
    }

    /**
     * Sets the value of the valueOfUnerxercisedOptionsExercisable property.
     * 
     */
    public void setValueOfUnerxercisedOptionsExercisable(double value) {
        this.valueOfUnerxercisedOptionsExercisable = value;
    }

    /**
     * Gets the value of the valueOfUnerxercisedOptionsUnexercisable property.
     * 
     */
    public double getValueOfUnerxercisedOptionsUnexercisable() {
        return valueOfUnerxercisedOptionsUnexercisable;
    }

    /**
     * Sets the value of the valueOfUnerxercisedOptionsUnexercisable property.
     * 
     */
    public void setValueOfUnerxercisedOptionsUnexercisable(double value) {
        this.valueOfUnerxercisedOptionsUnexercisable = value;
    }

}

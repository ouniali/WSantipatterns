
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Component complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Component">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AdjustmentFactor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="IndexComponentWeightType" type="{http://www.xignite.com/services/}IndexComponentWeightTypes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Component", propOrder = {
    "security",
    "weight",
    "adjustmentFactor",
    "indexComponentWeightType"
})
public class Component {

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "Weight")
    protected double weight;
    @XmlElement(name = "AdjustmentFactor")
    protected double adjustmentFactor;
    @XmlElement(name = "IndexComponentWeightType", required = true)
    @XmlSchemaType(name = "string")
    protected IndexComponentWeightTypes indexComponentWeightType;

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setSecurity(Security value) {
        this.security = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the adjustmentFactor property.
     * 
     */
    public double getAdjustmentFactor() {
        return adjustmentFactor;
    }

    /**
     * Sets the value of the adjustmentFactor property.
     * 
     */
    public void setAdjustmentFactor(double value) {
        this.adjustmentFactor = value;
    }

    /**
     * Gets the value of the indexComponentWeightType property.
     * 
     * @return
     *     possible object is
     *     {@link IndexComponentWeightTypes }
     *     
     */
    public IndexComponentWeightTypes getIndexComponentWeightType() {
        return indexComponentWeightType;
    }

    /**
     * Sets the value of the indexComponentWeightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexComponentWeightTypes }
     *     
     */
    public void setIndexComponentWeightType(IndexComponentWeightTypes value) {
        this.indexComponentWeightType = value;
    }

}

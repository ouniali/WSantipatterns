
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockGrowthVariations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockGrowthVariations">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="VariationType" type="{http://www.xignite.com/services/}VariationTypes"/>
 *         &lt;element name="Variations" type="{http://www.xignite.com/services/}ArrayOfVariation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockGrowthVariations", propOrder = {
    "security",
    "variationType",
    "variations"
})
public class StockGrowthVariations
    extends Common
{

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "VariationType", required = true)
    @XmlSchemaType(name = "string")
    protected VariationTypes variationType;
    @XmlElement(name = "Variations")
    protected ArrayOfVariation variations;

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
     * Gets the value of the variationType property.
     * 
     * @return
     *     possible object is
     *     {@link VariationTypes }
     *     
     */
    public VariationTypes getVariationType() {
        return variationType;
    }

    /**
     * Sets the value of the variationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationTypes }
     *     
     */
    public void setVariationType(VariationTypes value) {
        this.variationType = value;
    }

    /**
     * Gets the value of the variations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVariation }
     *     
     */
    public ArrayOfVariation getVariations() {
        return variations;
    }

    /**
     * Sets the value of the variations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVariation }
     *     
     */
    public void setVariations(ArrayOfVariation value) {
        this.variations = value;
    }

}

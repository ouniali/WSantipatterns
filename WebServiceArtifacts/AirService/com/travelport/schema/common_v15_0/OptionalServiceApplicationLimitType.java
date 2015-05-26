
package com.travelport.schema.common_v15_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The optional service application limit
 * 
 * <p>Java class for OptionalServiceApplicationLimitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionalServiceApplicationLimitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}OptionalServiceApplicabilityLimitGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalServiceApplicationLimitType")
public class OptionalServiceApplicationLimitType {

    @XmlAttribute(name = "ApplicableLevel", required = true)
    protected OptionalServiceApplicabilityType applicableLevel;
    @XmlAttribute(name = "ProviderDefinedApplicableLevels")
    protected String providerDefinedApplicableLevels;
    @XmlAttribute(name = "MaximumQuantity", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumQuantity;
    @XmlAttribute(name = "MinimumQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger minimumQuantity;

    /**
     * Gets the value of the applicableLevel property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServiceApplicabilityType }
     *     
     */
    public OptionalServiceApplicabilityType getApplicableLevel() {
        return applicableLevel;
    }

    /**
     * Sets the value of the applicableLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServiceApplicabilityType }
     *     
     */
    public void setApplicableLevel(OptionalServiceApplicabilityType value) {
        this.applicableLevel = value;
    }

    /**
     * Gets the value of the providerDefinedApplicableLevels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderDefinedApplicableLevels() {
        return providerDefinedApplicableLevels;
    }

    /**
     * Sets the value of the providerDefinedApplicableLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderDefinedApplicableLevels(String value) {
        this.providerDefinedApplicableLevels = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumQuantity(BigInteger value) {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumQuantity(BigInteger value) {
        this.minimumQuantity = value;
    }

}

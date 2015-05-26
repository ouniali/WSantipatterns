
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for derivativeHolding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="derivativeHolding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="securityTitle" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="conversionOrExercisePrice" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="exerciseDate" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="underlyingSecurity" type="{http://www.xignite.com/services/}underlyingSecurity" minOccurs="0"/>
 *         &lt;element name="ownershipNature" type="{http://www.xignite.com/services/}ownershipNature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "derivativeHolding", propOrder = {
    "securityTitle",
    "conversionOrExercisePrice",
    "exerciseDate",
    "expirationDate",
    "underlyingSecurity",
    "ownershipNature"
})
public class DerivativeHolding {

    protected Value securityTitle;
    protected Value conversionOrExercisePrice;
    protected Value exerciseDate;
    protected Value expirationDate;
    protected UnderlyingSecurity underlyingSecurity;
    protected OwnershipNature ownershipNature;

    /**
     * Gets the value of the securityTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getSecurityTitle() {
        return securityTitle;
    }

    /**
     * Sets the value of the securityTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setSecurityTitle(Value value) {
        this.securityTitle = value;
    }

    /**
     * Gets the value of the conversionOrExercisePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getConversionOrExercisePrice() {
        return conversionOrExercisePrice;
    }

    /**
     * Sets the value of the conversionOrExercisePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setConversionOrExercisePrice(Value value) {
        this.conversionOrExercisePrice = value;
    }

    /**
     * Gets the value of the exerciseDate property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getExerciseDate() {
        return exerciseDate;
    }

    /**
     * Sets the value of the exerciseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setExerciseDate(Value value) {
        this.exerciseDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setExpirationDate(Value value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the underlyingSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingSecurity }
     *     
     */
    public UnderlyingSecurity getUnderlyingSecurity() {
        return underlyingSecurity;
    }

    /**
     * Sets the value of the underlyingSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingSecurity }
     *     
     */
    public void setUnderlyingSecurity(UnderlyingSecurity value) {
        this.underlyingSecurity = value;
    }

    /**
     * Gets the value of the ownershipNature property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipNature }
     *     
     */
    public OwnershipNature getOwnershipNature() {
        return ownershipNature;
    }

    /**
     * Sets the value of the ownershipNature property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipNature }
     *     
     */
    public void setOwnershipNature(OwnershipNature value) {
        this.ownershipNature = value;
    }

}

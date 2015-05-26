
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressDistanceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressDistanceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressToAddressDistanceResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.strikeiron.com}UnitOfMeasure"/>
 *         &lt;element name="LatitudeAddress1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LongitudeAddress1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LatitudeAddress2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="LongitudeAddress2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressDistanceResult", propOrder = {
    "addressToAddressDistanceResult",
    "unitOfMeasure",
    "latitudeAddress1",
    "longitudeAddress1",
    "latitudeAddress2",
    "longitudeAddress2"
})
public class AddressDistanceResult {

    @XmlElement(name = "AddressToAddressDistanceResult")
    protected double addressToAddressDistanceResult;
    @XmlElement(name = "UnitOfMeasure", required = true)
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "LatitudeAddress1")
    protected double latitudeAddress1;
    @XmlElement(name = "LongitudeAddress1")
    protected double longitudeAddress1;
    @XmlElement(name = "LatitudeAddress2")
    protected double latitudeAddress2;
    @XmlElement(name = "LongitudeAddress2")
    protected double longitudeAddress2;

    /**
     * Gets the value of the addressToAddressDistanceResult property.
     * 
     */
    public double getAddressToAddressDistanceResult() {
        return addressToAddressDistanceResult;
    }

    /**
     * Sets the value of the addressToAddressDistanceResult property.
     * 
     */
    public void setAddressToAddressDistanceResult(double value) {
        this.addressToAddressDistanceResult = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the latitudeAddress1 property.
     * 
     */
    public double getLatitudeAddress1() {
        return latitudeAddress1;
    }

    /**
     * Sets the value of the latitudeAddress1 property.
     * 
     */
    public void setLatitudeAddress1(double value) {
        this.latitudeAddress1 = value;
    }

    /**
     * Gets the value of the longitudeAddress1 property.
     * 
     */
    public double getLongitudeAddress1() {
        return longitudeAddress1;
    }

    /**
     * Sets the value of the longitudeAddress1 property.
     * 
     */
    public void setLongitudeAddress1(double value) {
        this.longitudeAddress1 = value;
    }

    /**
     * Gets the value of the latitudeAddress2 property.
     * 
     */
    public double getLatitudeAddress2() {
        return latitudeAddress2;
    }

    /**
     * Sets the value of the latitudeAddress2 property.
     * 
     */
    public void setLatitudeAddress2(double value) {
        this.latitudeAddress2 = value;
    }

    /**
     * Gets the value of the longitudeAddress2 property.
     * 
     */
    public double getLongitudeAddress2() {
        return longitudeAddress2;
    }

    /**
     * Sets the value of the longitudeAddress2 property.
     * 
     */
    public void setLongitudeAddress2(double value) {
        this.longitudeAddress2 = value;
    }

}

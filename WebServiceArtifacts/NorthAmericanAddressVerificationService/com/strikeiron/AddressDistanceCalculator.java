
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location1" type="{http://www.strikeiron.com}AddressInput" minOccurs="0"/>
 *         &lt;element name="Location2" type="{http://www.strikeiron.com}AddressInput" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.strikeiron.com}UnitOfMeasure"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "location1",
    "location2",
    "unitOfMeasure"
})
@XmlRootElement(name = "AddressDistanceCalculator")
public class AddressDistanceCalculator {

    @XmlElement(name = "Location1")
    protected AddressInput location1;
    @XmlElement(name = "Location2")
    protected AddressInput location2;
    @XmlElement(name = "UnitOfMeasure", required = true)
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure unitOfMeasure;

    /**
     * Gets the value of the location1 property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInput }
     *     
     */
    public AddressInput getLocation1() {
        return location1;
    }

    /**
     * Sets the value of the location1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInput }
     *     
     */
    public void setLocation1(AddressInput value) {
        this.location1 = value;
    }

    /**
     * Gets the value of the location2 property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInput }
     *     
     */
    public AddressInput getLocation2() {
        return location2;
    }

    /**
     * Sets the value of the location2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInput }
     *     
     */
    public void setLocation2(AddressInput value) {
        this.location2 = value;
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

}

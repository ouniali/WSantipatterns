
package com.carrierate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentConfirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BolNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationCarrierLocation" type="{http://carrierate.com/}CarrierAddress"/>
 *         &lt;element name="OriginCarrierLocation" type="{http://carrierate.com/}CarrierAddress"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentConfirmation", propOrder = {
    "bolNumber",
    "destinationCarrierLocation",
    "originCarrierLocation"
})
public class ShipmentConfirmation {

    @XmlElement(name = "BolNumber")
    protected String bolNumber;
    @XmlElement(name = "DestinationCarrierLocation", required = true)
    protected CarrierAddress destinationCarrierLocation;
    @XmlElement(name = "OriginCarrierLocation", required = true)
    protected CarrierAddress originCarrierLocation;

    /**
     * Gets the value of the bolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBolNumber() {
        return bolNumber;
    }

    /**
     * Sets the value of the bolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBolNumber(String value) {
        this.bolNumber = value;
    }

    /**
     * Gets the value of the destinationCarrierLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAddress }
     *     
     */
    public CarrierAddress getDestinationCarrierLocation() {
        return destinationCarrierLocation;
    }

    /**
     * Sets the value of the destinationCarrierLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAddress }
     *     
     */
    public void setDestinationCarrierLocation(CarrierAddress value) {
        this.destinationCarrierLocation = value;
    }

    /**
     * Gets the value of the originCarrierLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAddress }
     *     
     */
    public CarrierAddress getOriginCarrierLocation() {
        return originCarrierLocation;
    }

    /**
     * Sets the value of the originCarrierLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAddress }
     *     
     */
    public void setOriginCarrierLocation(CarrierAddress value) {
        this.originCarrierLocation = value;
    }

}


package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="AddressToAddressDistanceResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "addressToAddressDistanceResult"
})
@XmlRootElement(name = "AddressToAddressDistanceResponse")
public class AddressToAddressDistanceResponse {

    @XmlElement(name = "AddressToAddressDistanceResult")
    protected double addressToAddressDistanceResult;

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

}

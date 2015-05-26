
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
 *         &lt;element name="AddressDistanceCalculatorResult" type="{http://www.strikeiron.com}SIWsOutputOfAddressDistanceResult" minOccurs="0"/>
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
    "addressDistanceCalculatorResult"
})
@XmlRootElement(name = "AddressDistanceCalculatorResponse")
public class AddressDistanceCalculatorResponse {

    @XmlElement(name = "AddressDistanceCalculatorResult")
    protected SIWsOutputOfAddressDistanceResult addressDistanceCalculatorResult;

    /**
     * Gets the value of the addressDistanceCalculatorResult property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsOutputOfAddressDistanceResult }
     *     
     */
    public SIWsOutputOfAddressDistanceResult getAddressDistanceCalculatorResult() {
        return addressDistanceCalculatorResult;
    }

    /**
     * Sets the value of the addressDistanceCalculatorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsOutputOfAddressDistanceResult }
     *     
     */
    public void setAddressDistanceCalculatorResult(SIWsOutputOfAddressDistanceResult value) {
        this.addressDistanceCalculatorResult = value;
    }

}

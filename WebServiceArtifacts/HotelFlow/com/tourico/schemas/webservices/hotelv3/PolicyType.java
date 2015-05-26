
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelPolicy" type="{http://schemas.tourico.com/webservices/hotelv3}HotelPolicyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyType", propOrder = {
    "hotelPolicy"
})
public class PolicyType {

    @XmlElement(name = "HotelPolicy")
    protected HotelPolicyType hotelPolicy;

    /**
     * Gets the value of the hotelPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link HotelPolicyType }
     *     
     */
    public HotelPolicyType getHotelPolicy() {
        return hotelPolicy;
    }

    /**
     * Sets the value of the hotelPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPolicyType }
     *     
     */
    public void setHotelPolicy(HotelPolicyType value) {
        this.hotelPolicy = value;
    }

}

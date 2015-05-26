
package com.tourico.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tourico.webservices.tws_clxpolicies.HotelPolicyType;


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
 *         &lt;element ref="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}HotelPolicy" minOccurs="0"/>
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
    "hotelPolicy"
})
@XmlRootElement(name = "GetCancellationPoliciesResponse")
public class GetCancellationPoliciesResponse {

    @XmlElement(name = "HotelPolicy", namespace = "http://tourico.com/webservices/TWS_ClxPolicies.xsd")
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

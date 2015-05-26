
package com.epostcode.ws.uk;

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
 *         &lt;element name="GetPremiseAddressResult" type="{http://ws.epostcode.com/uk/}AddressPremises" minOccurs="0"/>
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
    "getPremiseAddressResult"
})
@XmlRootElement(name = "GetPremiseAddressResponse")
public class GetPremiseAddressResponse {

    @XmlElement(name = "GetPremiseAddressResult")
    protected AddressPremises getPremiseAddressResult;

    /**
     * Gets the value of the getPremiseAddressResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPremises }
     *     
     */
    public AddressPremises getGetPremiseAddressResult() {
        return getPremiseAddressResult;
    }

    /**
     * Sets the value of the getPremiseAddressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPremises }
     *     
     */
    public void setGetPremiseAddressResult(AddressPremises value) {
        this.getPremiseAddressResult = value;
    }

}

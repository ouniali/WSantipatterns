
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
 *         &lt;element name="GetPremiseAddressFromUDPResult" type="{http://ws.epostcode.com/uk/}AddressPremise" minOccurs="0"/>
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
    "getPremiseAddressFromUDPResult"
})
@XmlRootElement(name = "GetPremiseAddressFromUDPResponse")
public class GetPremiseAddressFromUDPResponse {

    @XmlElement(name = "GetPremiseAddressFromUDPResult")
    protected AddressPremise getPremiseAddressFromUDPResult;

    /**
     * Gets the value of the getPremiseAddressFromUDPResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPremise }
     *     
     */
    public AddressPremise getGetPremiseAddressFromUDPResult() {
        return getPremiseAddressFromUDPResult;
    }

    /**
     * Sets the value of the getPremiseAddressFromUDPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPremise }
     *     
     */
    public void setGetPremiseAddressFromUDPResult(AddressPremise value) {
        this.getPremiseAddressFromUDPResult = value;
    }

}

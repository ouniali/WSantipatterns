
package com.carrierate;

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
 *         &lt;element name="GetShipmentAddressesResult" type="{http://carrierate.com/}ArrayOfShipmentAddress" minOccurs="0"/>
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
    "getShipmentAddressesResult"
})
@XmlRootElement(name = "GetShipmentAddressesResponse")
public class GetShipmentAddressesResponse {

    @XmlElement(name = "GetShipmentAddressesResult")
    protected ArrayOfShipmentAddress getShipmentAddressesResult;

    /**
     * Gets the value of the getShipmentAddressesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipmentAddress }
     *     
     */
    public ArrayOfShipmentAddress getGetShipmentAddressesResult() {
        return getShipmentAddressesResult;
    }

    /**
     * Sets the value of the getShipmentAddressesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipmentAddress }
     *     
     */
    public void setGetShipmentAddressesResult(ArrayOfShipmentAddress value) {
        this.getShipmentAddressesResult = value;
    }

}

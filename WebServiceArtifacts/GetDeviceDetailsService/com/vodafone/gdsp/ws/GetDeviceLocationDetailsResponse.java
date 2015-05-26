
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDeviceLocationDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDeviceLocationDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.gdsp.vodafone.com/}getDeviceLocationDetailsResponseItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDeviceLocationDetailsResponse", propOrder = {
    "_return"
})
public class GetDeviceLocationDetailsResponse {

    @XmlElement(name = "return", required = true)
    protected GetDeviceLocationDetailsResponseItem _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetDeviceLocationDetailsResponseItem }
     *     
     */
    public GetDeviceLocationDetailsResponseItem getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDeviceLocationDetailsResponseItem }
     *     
     */
    public void setReturn(GetDeviceLocationDetailsResponseItem value) {
        this._return = value;
    }

}

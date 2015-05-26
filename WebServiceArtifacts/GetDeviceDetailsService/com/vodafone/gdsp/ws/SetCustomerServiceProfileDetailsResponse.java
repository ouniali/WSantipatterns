
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCustomerServiceProfileDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCustomerServiceProfileDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.gdsp.vodafone.com/}setCustomerServiceProfileDetailsResponseBody" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCustomerServiceProfileDetailsResponse", propOrder = {
    "_return"
})
public class SetCustomerServiceProfileDetailsResponse {

    @XmlElement(name = "return")
    protected SetCustomerServiceProfileDetailsResponseBody _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SetCustomerServiceProfileDetailsResponseBody }
     *     
     */
    public SetCustomerServiceProfileDetailsResponseBody getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCustomerServiceProfileDetailsResponseBody }
     *     
     */
    public void setReturn(SetCustomerServiceProfileDetailsResponseBody value) {
        this._return = value;
    }

}

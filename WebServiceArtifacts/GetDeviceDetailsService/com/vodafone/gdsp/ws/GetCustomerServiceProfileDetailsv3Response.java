
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerServiceProfileDetailsv3Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerServiceProfileDetailsv3Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.gdsp.vodafone.com/}getCustomerServiceProfilev3ResponseDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerServiceProfileDetailsv3Response", propOrder = {
    "_return"
})
public class GetCustomerServiceProfileDetailsv3Response {

    @XmlElement(name = "return")
    protected GetCustomerServiceProfilev3ResponseDetails _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerServiceProfilev3ResponseDetails }
     *     
     */
    public GetCustomerServiceProfilev3ResponseDetails getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerServiceProfilev3ResponseDetails }
     *     
     */
    public void setReturn(GetCustomerServiceProfilev3ResponseDetails value) {
        this._return = value;
    }

}

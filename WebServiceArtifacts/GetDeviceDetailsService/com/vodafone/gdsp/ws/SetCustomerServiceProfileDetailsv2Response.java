
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCustomerServiceProfileDetailsv2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCustomerServiceProfileDetailsv2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.gdsp.vodafone.com/}setCustomerServiceProfileDetailsv2ResponseBody" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCustomerServiceProfileDetailsv2Response", propOrder = {
    "_return"
})
public class SetCustomerServiceProfileDetailsv2Response {

    @XmlElement(name = "return")
    protected SetCustomerServiceProfileDetailsv2ResponseBody _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SetCustomerServiceProfileDetailsv2ResponseBody }
     *     
     */
    public SetCustomerServiceProfileDetailsv2ResponseBody getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCustomerServiceProfileDetailsv2ResponseBody }
     *     
     */
    public void setReturn(SetCustomerServiceProfileDetailsv2ResponseBody value) {
        this._return = value;
    }

}

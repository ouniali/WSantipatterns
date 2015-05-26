
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCustomerServiceProfileDetailsv5Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCustomerServiceProfileDetailsv5Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.gdsp.vodafone.com/}setCustomerServiceProfileDetailsv5ResponseBody" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCustomerServiceProfileDetailsv5Response", propOrder = {
    "_return"
})
public class SetCustomerServiceProfileDetailsv5Response {

    @XmlElement(name = "return")
    protected SetCustomerServiceProfileDetailsv5ResponseBody _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SetCustomerServiceProfileDetailsv5ResponseBody }
     *     
     */
    public SetCustomerServiceProfileDetailsv5ResponseBody getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCustomerServiceProfileDetailsv5ResponseBody }
     *     
     */
    public void setReturn(SetCustomerServiceProfileDetailsv5ResponseBody value) {
        this._return = value;
    }

}

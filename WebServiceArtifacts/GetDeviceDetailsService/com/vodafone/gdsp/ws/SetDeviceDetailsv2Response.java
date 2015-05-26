
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setDeviceDetailsv2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setDeviceDetailsv2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.gdsp.vodafone.com/}setDeviceDetailsv2ResponseItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setDeviceDetailsv2Response", propOrder = {
    "_return"
})
public class SetDeviceDetailsv2Response {

    @XmlElement(name = "return")
    protected SetDeviceDetailsv2ResponseItem _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SetDeviceDetailsv2ResponseItem }
     *     
     */
    public SetDeviceDetailsv2ResponseItem getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetDeviceDetailsv2ResponseItem }
     *     
     */
    public void setReturn(SetDeviceDetailsv2ResponseItem value) {
        this._return = value;
    }

}

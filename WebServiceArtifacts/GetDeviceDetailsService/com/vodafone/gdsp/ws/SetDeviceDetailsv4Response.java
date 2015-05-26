
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setDeviceDetailsv4Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setDeviceDetailsv4Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.gdsp.vodafone.com/}setDeviceDetailsv4ResponseItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setDeviceDetailsv4Response", propOrder = {
    "_return"
})
public class SetDeviceDetailsv4Response {

    @XmlElement(name = "return")
    protected SetDeviceDetailsv4ResponseItem _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SetDeviceDetailsv4ResponseItem }
     *     
     */
    public SetDeviceDetailsv4ResponseItem getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetDeviceDetailsv4ResponseItem }
     *     
     */
    public void setReturn(SetDeviceDetailsv4ResponseItem value) {
        this._return = value;
    }

}

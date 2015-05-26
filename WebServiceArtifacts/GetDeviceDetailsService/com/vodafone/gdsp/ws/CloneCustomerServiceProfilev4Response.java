
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cloneCustomerServiceProfilev4Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cloneCustomerServiceProfilev4Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.gdsp.vodafone.com/}cloneCustomerServiceProfilev4ResponseDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cloneCustomerServiceProfilev4Response", propOrder = {
    "_return"
})
public class CloneCustomerServiceProfilev4Response {

    @XmlElement(name = "return")
    protected CloneCustomerServiceProfilev4ResponseDetails _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link CloneCustomerServiceProfilev4ResponseDetails }
     *     
     */
    public CloneCustomerServiceProfilev4ResponseDetails getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloneCustomerServiceProfilev4ResponseDetails }
     *     
     */
    public void setReturn(CloneCustomerServiceProfilev4ResponseDetails value) {
        this._return = value;
    }

}

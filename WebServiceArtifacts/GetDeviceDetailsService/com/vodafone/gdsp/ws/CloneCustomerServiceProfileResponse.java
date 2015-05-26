
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cloneCustomerServiceProfileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cloneCustomerServiceProfileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.gdsp.vodafone.com/}cloneCustomerServiceProfileResponseDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cloneCustomerServiceProfileResponse", propOrder = {
    "_return"
})
public class CloneCustomerServiceProfileResponse {

    @XmlElement(name = "return")
    protected CloneCustomerServiceProfileResponseDetails _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link CloneCustomerServiceProfileResponseDetails }
     *     
     */
    public CloneCustomerServiceProfileResponseDetails getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloneCustomerServiceProfileResponseDetails }
     *     
     */
    public void setReturn(CloneCustomerServiceProfileResponseDetails value) {
        this._return = value;
    }

}

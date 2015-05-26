
package com.xignite.services;

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
 *         &lt;element name="WhatsMyIPResult" type="{http://www.xignite.com/services/}RequestInformation" minOccurs="0"/>
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
    "whatsMyIPResult"
})
@XmlRootElement(name = "WhatsMyIPResponse")
public class WhatsMyIPResponse {

    @XmlElement(name = "WhatsMyIPResult")
    protected RequestInformation whatsMyIPResult;

    /**
     * Gets the value of the whatsMyIPResult property.
     * 
     * @return
     *     possible object is
     *     {@link RequestInformation }
     *     
     */
    public RequestInformation getWhatsMyIPResult() {
        return whatsMyIPResult;
    }

    /**
     * Sets the value of the whatsMyIPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestInformation }
     *     
     */
    public void setWhatsMyIPResult(RequestInformation value) {
        this.whatsMyIPResult = value;
    }

}

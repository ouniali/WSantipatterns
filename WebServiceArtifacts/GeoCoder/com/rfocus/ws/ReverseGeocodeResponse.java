
package com.rfocus.ws;

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
 *         &lt;element name="ReverseGeocodeResult" type="{http://www.rfocus.com/ws}GeocodeResult" minOccurs="0"/>
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
    "reverseGeocodeResult"
})
@XmlRootElement(name = "ReverseGeocodeResponse")
public class ReverseGeocodeResponse {

    @XmlElement(name = "ReverseGeocodeResult")
    protected GeocodeResult reverseGeocodeResult;

    /**
     * Gets the value of the reverseGeocodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link GeocodeResult }
     *     
     */
    public GeocodeResult getReverseGeocodeResult() {
        return reverseGeocodeResult;
    }

    /**
     * Sets the value of the reverseGeocodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeocodeResult }
     *     
     */
    public void setReverseGeocodeResult(GeocodeResult value) {
        this.reverseGeocodeResult = value;
    }

}

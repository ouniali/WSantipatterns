
package com.avalara.avatax.services;

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
 *         &lt;element name="PingResult" type="{http://avatax.avalara.com/services}PingResult" minOccurs="0"/>
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
    "pingResult"
})
@XmlRootElement(name = "PingResponse")
public class PingResponse {

    @XmlElement(name = "PingResult")
    protected PingResult pingResult;

    /**
     * Gets the value of the pingResult property.
     * 
     * @return
     *     possible object is
     *     {@link PingResult }
     *     
     */
    public PingResult getPingResult() {
        return pingResult;
    }

    /**
     * Sets the value of the pingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PingResult }
     *     
     */
    public void setPingResult(PingResult value) {
        this.pingResult = value;
    }

}


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
 *         &lt;element name="GetCEOResult" type="{http://www.xignite.com/services/}Roster" minOccurs="0"/>
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
    "getCEOResult"
})
@XmlRootElement(name = "GetCEOResponse")
public class GetCEOResponse {

    @XmlElement(name = "GetCEOResult")
    protected Roster getCEOResult;

    /**
     * Gets the value of the getCEOResult property.
     * 
     * @return
     *     possible object is
     *     {@link Roster }
     *     
     */
    public Roster getGetCEOResult() {
        return getCEOResult;
    }

    /**
     * Sets the value of the getCEOResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Roster }
     *     
     */
    public void setGetCEOResult(Roster value) {
        this.getCEOResult = value;
    }

}


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
 *         &lt;element name="GetDirectorsResult" type="{http://www.xignite.com/services/}Roster" minOccurs="0"/>
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
    "getDirectorsResult"
})
@XmlRootElement(name = "GetDirectorsResponse")
public class GetDirectorsResponse {

    @XmlElement(name = "GetDirectorsResult")
    protected Roster getDirectorsResult;

    /**
     * Gets the value of the getDirectorsResult property.
     * 
     * @return
     *     possible object is
     *     {@link Roster }
     *     
     */
    public Roster getGetDirectorsResult() {
        return getDirectorsResult;
    }

    /**
     * Sets the value of the getDirectorsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Roster }
     *     
     */
    public void setGetDirectorsResult(Roster value) {
        this.getDirectorsResult = value;
    }

}

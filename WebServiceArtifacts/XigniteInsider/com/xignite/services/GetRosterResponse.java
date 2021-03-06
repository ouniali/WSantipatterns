
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
 *         &lt;element name="GetRosterResult" type="{http://www.xignite.com/services/}Roster" minOccurs="0"/>
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
    "getRosterResult"
})
@XmlRootElement(name = "GetRosterResponse")
public class GetRosterResponse {

    @XmlElement(name = "GetRosterResult")
    protected Roster getRosterResult;

    /**
     * Gets the value of the getRosterResult property.
     * 
     * @return
     *     possible object is
     *     {@link Roster }
     *     
     */
    public Roster getGetRosterResult() {
        return getRosterResult;
    }

    /**
     * Sets the value of the getRosterResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Roster }
     *     
     */
    public void setGetRosterResult(Roster value) {
        this.getRosterResult = value;
    }

}

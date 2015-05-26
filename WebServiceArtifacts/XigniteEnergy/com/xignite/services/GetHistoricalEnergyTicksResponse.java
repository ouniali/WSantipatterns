
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
 *         &lt;element name="GetHistoricalEnergyTicksResult" type="{http://www.xignite.com/services/}Ticks" minOccurs="0"/>
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
    "getHistoricalEnergyTicksResult"
})
@XmlRootElement(name = "GetHistoricalEnergyTicksResponse")
public class GetHistoricalEnergyTicksResponse {

    @XmlElement(name = "GetHistoricalEnergyTicksResult")
    protected Ticks getHistoricalEnergyTicksResult;

    /**
     * Gets the value of the getHistoricalEnergyTicksResult property.
     * 
     * @return
     *     possible object is
     *     {@link Ticks }
     *     
     */
    public Ticks getGetHistoricalEnergyTicksResult() {
        return getHistoricalEnergyTicksResult;
    }

    /**
     * Sets the value of the getHistoricalEnergyTicksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ticks }
     *     
     */
    public void setGetHistoricalEnergyTicksResult(Ticks value) {
        this.getHistoricalEnergyTicksResult = value;
    }

}


package com.epostcode.ws.uk;

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
 *         &lt;element name="NearestData_ForPostcodeWithinAMaximumRadiusResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nearestDataForPostcodeWithinAMaximumRadiusResult"
})
@XmlRootElement(name = "NearestData_ForPostcodeWithinAMaximumRadiusResponse")
public class NearestDataForPostcodeWithinAMaximumRadiusResponse {

    @XmlElement(name = "NearestData_ForPostcodeWithinAMaximumRadiusResult")
    protected String nearestDataForPostcodeWithinAMaximumRadiusResult;

    /**
     * Gets the value of the nearestDataForPostcodeWithinAMaximumRadiusResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNearestDataForPostcodeWithinAMaximumRadiusResult() {
        return nearestDataForPostcodeWithinAMaximumRadiusResult;
    }

    /**
     * Sets the value of the nearestDataForPostcodeWithinAMaximumRadiusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNearestDataForPostcodeWithinAMaximumRadiusResult(String value) {
        this.nearestDataForPostcodeWithinAMaximumRadiusResult = value;
    }

}

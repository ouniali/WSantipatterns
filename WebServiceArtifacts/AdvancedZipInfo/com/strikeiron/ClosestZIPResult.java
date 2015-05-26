
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClosestZIPResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClosestZIPResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZIP" type="{http://www.strikeiron.com}ZIPDistanceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosestZIPResult", propOrder = {
    "zip"
})
public class ClosestZIPResult {

    @XmlElement(name = "ZIP")
    protected ZIPDistanceInfo zip;

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link ZIPDistanceInfo }
     *     
     */
    public ZIPDistanceInfo getZIP() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZIPDistanceInfo }
     *     
     */
    public void setZIP(ZIPDistanceInfo value) {
        this.zip = value;
    }

}


package com.strikeiron;

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
 *         &lt;element name="ZIPDistanceResult" type="{http://www.strikeiron.com}SIWsOutputOfZIPDistanceResult" minOccurs="0"/>
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
    "zipDistanceResult"
})
@XmlRootElement(name = "ZIPDistanceResponse")
public class ZIPDistanceResponse {

    @XmlElement(name = "ZIPDistanceResult")
    protected SIWsOutputOfZIPDistanceResult zipDistanceResult;

    /**
     * Gets the value of the zipDistanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsOutputOfZIPDistanceResult }
     *     
     */
    public SIWsOutputOfZIPDistanceResult getZIPDistanceResult() {
        return zipDistanceResult;
    }

    /**
     * Sets the value of the zipDistanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsOutputOfZIPDistanceResult }
     *     
     */
    public void setZIPDistanceResult(SIWsOutputOfZIPDistanceResult value) {
        this.zipDistanceResult = value;
    }

}

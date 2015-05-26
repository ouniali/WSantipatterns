
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
 *         &lt;element name="DistanceBetween_PostcodesResult" type="{http://ws.epostcode.com/uk/}Nearests" minOccurs="0"/>
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
    "distanceBetweenPostcodesResult"
})
@XmlRootElement(name = "DistanceBetween_PostcodesResponse")
public class DistanceBetweenPostcodesResponse {

    @XmlElement(name = "DistanceBetween_PostcodesResult")
    protected Nearests distanceBetweenPostcodesResult;

    /**
     * Gets the value of the distanceBetweenPostcodesResult property.
     * 
     * @return
     *     possible object is
     *     {@link Nearests }
     *     
     */
    public Nearests getDistanceBetweenPostcodesResult() {
        return distanceBetweenPostcodesResult;
    }

    /**
     * Sets the value of the distanceBetweenPostcodesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nearests }
     *     
     */
    public void setDistanceBetweenPostcodesResult(Nearests value) {
        this.distanceBetweenPostcodesResult = value;
    }

}

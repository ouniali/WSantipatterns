
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
 *         &lt;element name="ClosestZIPResult" type="{http://www.strikeiron.com}SIWsOutputOfClosestZIPResult" minOccurs="0"/>
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
    "closestZIPResult"
})
@XmlRootElement(name = "ClosestZIPResponse")
public class ClosestZIPResponse {

    @XmlElement(name = "ClosestZIPResult")
    protected SIWsOutputOfClosestZIPResult closestZIPResult;

    /**
     * Gets the value of the closestZIPResult property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsOutputOfClosestZIPResult }
     *     
     */
    public SIWsOutputOfClosestZIPResult getClosestZIPResult() {
        return closestZIPResult;
    }

    /**
     * Sets the value of the closestZIPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsOutputOfClosestZIPResult }
     *     
     */
    public void setClosestZIPResult(SIWsOutputOfClosestZIPResult value) {
        this.closestZIPResult = value;
    }

}

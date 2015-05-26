
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
 *         &lt;element name="ZIPCodesInRadiusFromLatLongResult" type="{http://www.strikeiron.com}SIWsOutputOfZIPCodesInRadiusResult" minOccurs="0"/>
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
    "zipCodesInRadiusFromLatLongResult"
})
@XmlRootElement(name = "ZIPCodesInRadiusFromLatLongResponse")
public class ZIPCodesInRadiusFromLatLongResponse {

    @XmlElement(name = "ZIPCodesInRadiusFromLatLongResult")
    protected SIWsOutputOfZIPCodesInRadiusResult zipCodesInRadiusFromLatLongResult;

    /**
     * Gets the value of the zipCodesInRadiusFromLatLongResult property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsOutputOfZIPCodesInRadiusResult }
     *     
     */
    public SIWsOutputOfZIPCodesInRadiusResult getZIPCodesInRadiusFromLatLongResult() {
        return zipCodesInRadiusFromLatLongResult;
    }

    /**
     * Sets the value of the zipCodesInRadiusFromLatLongResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsOutputOfZIPCodesInRadiusResult }
     *     
     */
    public void setZIPCodesInRadiusFromLatLongResult(SIWsOutputOfZIPCodesInRadiusResult value) {
        this.zipCodesInRadiusFromLatLongResult = value;
    }

}

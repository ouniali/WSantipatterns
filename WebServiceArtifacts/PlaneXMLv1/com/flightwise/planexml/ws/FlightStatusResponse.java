
package com.flightwise.planexml.ws;

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
 *         &lt;element name="FIDynamic" type="{http://planexml.flightwise.com/ws}FIDynamic"/>
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
    "fiDynamic"
})
@XmlRootElement(name = "FlightStatusResponse")
public class FlightStatusResponse {

    @XmlElement(name = "FIDynamic", required = true, nillable = true)
    protected FIDynamic fiDynamic;

    /**
     * Gets the value of the fiDynamic property.
     * 
     * @return
     *     possible object is
     *     {@link FIDynamic }
     *     
     */
    public FIDynamic getFIDynamic() {
        return fiDynamic;
    }

    /**
     * Sets the value of the fiDynamic property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIDynamic }
     *     
     */
    public void setFIDynamic(FIDynamic value) {
        this.fiDynamic = value;
    }

}

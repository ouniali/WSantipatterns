
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
 *         &lt;element name="FIStatic" type="{http://planexml.flightwise.com/ws}FIStatic"/>
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
    "fiStatic"
})
@XmlRootElement(name = "FlightInfoResponse")
public class FlightInfoResponse {

    @XmlElement(name = "FIStatic", required = true, nillable = true)
    protected FIStatic fiStatic;

    /**
     * Gets the value of the fiStatic property.
     * 
     * @return
     *     possible object is
     *     {@link FIStatic }
     *     
     */
    public FIStatic getFIStatic() {
        return fiStatic;
    }

    /**
     * Sets the value of the fiStatic property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIStatic }
     *     
     */
    public void setFIStatic(FIStatic value) {
        this.fiStatic = value;
    }

}

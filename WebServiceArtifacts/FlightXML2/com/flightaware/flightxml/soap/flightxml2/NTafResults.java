
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NTafResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NTafResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NTafResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}TafStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NTafResults", propOrder = {
    "nTafResult"
})
public class NTafResults {

    @XmlElement(name = "NTafResult", required = true)
    protected TafStruct nTafResult;

    /**
     * Gets the value of the nTafResult property.
     * 
     * @return
     *     possible object is
     *     {@link TafStruct }
     *     
     */
    public TafStruct getNTafResult() {
        return nTafResult;
    }

    /**
     * Sets the value of the nTafResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TafStruct }
     *     
     */
    public void setNTafResult(TafStruct value) {
        this.nTafResult = value;
    }

}

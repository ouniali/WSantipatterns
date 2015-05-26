
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetarExResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetarExResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetarExResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfMetarStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetarExResults", propOrder = {
    "metarExResult"
})
public class MetarExResults {

    @XmlElement(name = "MetarExResult", required = true)
    protected ArrayOfMetarStruct metarExResult;

    /**
     * Gets the value of the metarExResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMetarStruct }
     *     
     */
    public ArrayOfMetarStruct getMetarExResult() {
        return metarExResult;
    }

    /**
     * Sets the value of the metarExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetarStruct }
     *     
     */
    public void setMetarExResult(ArrayOfMetarStruct value) {
        this.metarExResult = value;
    }

}

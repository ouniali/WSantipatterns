
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TailOwnerResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TailOwnerResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TailOwnerResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}TailOwnerStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TailOwnerResults", propOrder = {
    "tailOwnerResult"
})
public class TailOwnerResults {

    @XmlElement(name = "TailOwnerResult", required = true)
    protected TailOwnerStruct tailOwnerResult;

    /**
     * Gets the value of the tailOwnerResult property.
     * 
     * @return
     *     possible object is
     *     {@link TailOwnerStruct }
     *     
     */
    public TailOwnerStruct getTailOwnerResult() {
        return tailOwnerResult;
    }

    /**
     * Sets the value of the tailOwnerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TailOwnerStruct }
     *     
     */
    public void setTailOwnerResult(TailOwnerStruct value) {
        this.tailOwnerResult = value;
    }

}

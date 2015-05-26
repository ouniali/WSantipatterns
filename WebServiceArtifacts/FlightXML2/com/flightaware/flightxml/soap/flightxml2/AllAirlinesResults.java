
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllAirlinesResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllAirlinesResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllAirlinesResult" type="{http://flightxml.flightaware.com/soap/FlightXML2}ArrayOfString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllAirlinesResults", propOrder = {
    "allAirlinesResult"
})
public class AllAirlinesResults {

    @XmlElement(name = "AllAirlinesResult", required = true)
    protected ArrayOfString allAirlinesResult;

    /**
     * Gets the value of the allAirlinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAllAirlinesResult() {
        return allAirlinesResult;
    }

    /**
     * Sets the value of the allAirlinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAllAirlinesResult(ArrayOfString value) {
        this.allAirlinesResult = value;
    }

}


package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFlightIDResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFlightIDResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetFlightIDResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFlightIDResults", propOrder = {
    "getFlightIDResult"
})
public class GetFlightIDResults {

    @XmlElement(name = "GetFlightIDResult", required = true)
    protected String getFlightIDResult;

    /**
     * Gets the value of the getFlightIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetFlightIDResult() {
        return getFlightIDResult;
    }

    /**
     * Sets the value of the getFlightIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetFlightIDResult(String value) {
        this.getFlightIDResult = value;
    }

}

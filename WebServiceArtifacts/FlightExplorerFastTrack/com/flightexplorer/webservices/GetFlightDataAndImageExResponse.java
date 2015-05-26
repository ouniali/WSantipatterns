
package com.flightexplorer.webservices;

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
 *         &lt;element name="GetFlightDataAndImageExResult" type="{http://webservices.flightexplorer.com/}FlightDataAndImageEx"/>
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
    "getFlightDataAndImageExResult"
})
@XmlRootElement(name = "GetFlightDataAndImageExResponse")
public class GetFlightDataAndImageExResponse {

    @XmlElement(name = "GetFlightDataAndImageExResult", required = true)
    protected FlightDataAndImageEx getFlightDataAndImageExResult;

    /**
     * Gets the value of the getFlightDataAndImageExResult property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDataAndImageEx }
     *     
     */
    public FlightDataAndImageEx getGetFlightDataAndImageExResult() {
        return getFlightDataAndImageExResult;
    }

    /**
     * Sets the value of the getFlightDataAndImageExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDataAndImageEx }
     *     
     */
    public void setGetFlightDataAndImageExResult(FlightDataAndImageEx value) {
        this.getFlightDataAndImageExResult = value;
    }

}

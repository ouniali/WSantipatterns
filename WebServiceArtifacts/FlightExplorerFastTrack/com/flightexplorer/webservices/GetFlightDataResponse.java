
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
 *         &lt;element name="GetFlightDataResult" type="{http://webservices.flightexplorer.com/}FlightData"/>
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
    "getFlightDataResult"
})
@XmlRootElement(name = "GetFlightDataResponse")
public class GetFlightDataResponse {

    @XmlElement(name = "GetFlightDataResult", required = true)
    protected FlightData getFlightDataResult;

    /**
     * Gets the value of the getFlightDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link FlightData }
     *     
     */
    public FlightData getGetFlightDataResult() {
        return getFlightDataResult;
    }

    /**
     * Sets the value of the getFlightDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightData }
     *     
     */
    public void setGetFlightDataResult(FlightData value) {
        this.getFlightDataResult = value;
    }

}

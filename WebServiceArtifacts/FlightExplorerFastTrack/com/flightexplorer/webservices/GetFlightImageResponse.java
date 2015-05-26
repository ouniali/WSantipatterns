
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
 *         &lt;element name="GetFlightImageResult" type="{http://webservices.flightexplorer.com/}FlightImage"/>
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
    "getFlightImageResult"
})
@XmlRootElement(name = "GetFlightImageResponse")
public class GetFlightImageResponse {

    @XmlElement(name = "GetFlightImageResult", required = true)
    protected FlightImage getFlightImageResult;

    /**
     * Gets the value of the getFlightImageResult property.
     * 
     * @return
     *     possible object is
     *     {@link FlightImage }
     *     
     */
    public FlightImage getGetFlightImageResult() {
        return getFlightImageResult;
    }

    /**
     * Sets the value of the getFlightImageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightImage }
     *     
     */
    public void setGetFlightImageResult(FlightImage value) {
        this.getFlightImageResult = value;
    }

}

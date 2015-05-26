
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
 *         &lt;element name="GetFlightDataAndImageResult" type="{http://webservices.flightexplorer.com/}FlightDataAndImage"/>
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
    "getFlightDataAndImageResult"
})
@XmlRootElement(name = "GetFlightDataAndImageResponse")
public class GetFlightDataAndImageResponse {

    @XmlElement(name = "GetFlightDataAndImageResult", required = true)
    protected FlightDataAndImage getFlightDataAndImageResult;

    /**
     * Gets the value of the getFlightDataAndImageResult property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDataAndImage }
     *     
     */
    public FlightDataAndImage getGetFlightDataAndImageResult() {
        return getFlightDataAndImageResult;
    }

    /**
     * Sets the value of the getFlightDataAndImageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDataAndImage }
     *     
     */
    public void setGetFlightDataAndImageResult(FlightDataAndImage value) {
        this.getFlightDataAndImageResult = value;
    }

}

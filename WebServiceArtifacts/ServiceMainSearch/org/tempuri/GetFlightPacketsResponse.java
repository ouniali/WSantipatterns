
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.mouzenidis_services.FlightPackets;


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
 *         &lt;element name="GetFlightPacketsResult" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}FlightPackets" minOccurs="0"/>
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
    "getFlightPacketsResult"
})
@XmlRootElement(name = "GetFlightPacketsResponse")
public class GetFlightPacketsResponse {

    @XmlElementRef(name = "GetFlightPacketsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightPackets> getFlightPacketsResult;

    /**
     * Gets the value of the getFlightPacketsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightPackets }{@code >}
     *     
     */
    public JAXBElement<FlightPackets> getGetFlightPacketsResult() {
        return getFlightPacketsResult;
    }

    /**
     * Sets the value of the getFlightPacketsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightPackets }{@code >}
     *     
     */
    public void setGetFlightPacketsResult(JAXBElement<FlightPackets> value) {
        this.getFlightPacketsResult = value;
    }

}

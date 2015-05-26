
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseFlightsNearRadius complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseFlightsNearRadius">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightPositionResponse">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestFlightsNearRadius" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseFlightsNearRadius", propOrder = {
    "request"
})
public class ResponseFlightsNearRadius
    extends FlightPositionResponse
{

    protected RequestFlightsNearRadius request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestFlightsNearRadius }
     *     
     */
    public RequestFlightsNearRadius getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestFlightsNearRadius }
     *     
     */
    public void setRequest(RequestFlightsNearRadius value) {
        this.request = value;
    }

}


package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseRouteStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseRouteStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}flightStatusesResponse">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}requestRouteStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseRouteStatus", propOrder = {
    "request"
})
public class ResponseRouteStatus
    extends FlightStatusesResponse
{

    protected RequestRouteStatus request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestRouteStatus }
     *     
     */
    public RequestRouteStatus getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestRouteStatus }
     *     
     */
    public void setRequest(RequestRouteStatus value) {
        this.request = value;
    }

}

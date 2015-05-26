
package com.flightstats.schedules.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseByAirport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseByAirport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.schedules.flightstats.com/}responseBase">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v1.service.schedules.flightstats.com/}requestByAirport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseByAirport", propOrder = {
    "request"
})
public class ResponseByAirport
    extends ResponseBase
{

    protected RequestByAirport request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestByAirport }
     *     
     */
    public RequestByAirport getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestByAirport }
     *     
     */
    public void setRequest(RequestByAirport value) {
        this.request = value;
    }

}


package com.flightstats.schedules.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseByFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseByFlight">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.schedules.flightstats.com/}responseBase">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v1.service.schedules.flightstats.com/}requestByFlight" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseByFlight", propOrder = {
    "request"
})
public class ResponseByFlight
    extends ResponseBase
{

    protected RequestByFlight request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestByFlight }
     *     
     */
    public RequestByFlight getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestByFlight }
     *     
     */
    public void setRequest(RequestByFlight value) {
        this.request = value;
    }

}

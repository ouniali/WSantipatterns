
package com.conducivetech.cache.ratings.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseFlight">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.ratings.cache.conducivetech.com/}responseBase">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v1.service.ratings.cache.conducivetech.com/}requestFlight" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseFlight", propOrder = {
    "request"
})
public class ResponseFlight
    extends ResponseBase
{

    protected RequestFlight request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestFlight }
     *     
     */
    public RequestFlight getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestFlight }
     *     
     */
    public void setRequest(RequestFlight value) {
        this.request = value;
    }

}

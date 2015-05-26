
package com.conducivetech.cache.delayindex.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseAirports complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseAirports">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.delayindex.cache.conducivetech.com/}responseBase">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v1.service.delayindex.cache.conducivetech.com/}requestAirports" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseAirports", propOrder = {
    "request"
})
public class ResponseAirports
    extends ResponseBase
{

    protected RequestAirports request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestAirports }
     *     
     */
    public RequestAirports getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAirports }
     *     
     */
    public void setRequest(RequestAirports value) {
        this.request = value;
    }

}

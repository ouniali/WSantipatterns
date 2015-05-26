
package com.conducivetech.cache.delayindex.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseCountry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseCountry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.delayindex.cache.conducivetech.com/}responseBase">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v1.service.delayindex.cache.conducivetech.com/}requestCountry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseCountry", propOrder = {
    "request"
})
public class ResponseCountry
    extends ResponseBase
{

    protected RequestCountry request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestCountry }
     *     
     */
    public RequestCountry getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestCountry }
     *     
     */
    public void setRequest(RequestCountry value) {
        this.request = value;
    }

}

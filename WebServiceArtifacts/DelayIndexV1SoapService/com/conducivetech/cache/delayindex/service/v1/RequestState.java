
package com.conducivetech.cache.delayindex.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestState">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.delayindex.cache.conducivetech.com/}requestFiltered">
 *       &lt;sequence>
 *         &lt;element name="state" type="{http://v1.service.delayindex.cache.conducivetech.com/}requestedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestState", propOrder = {
    "state"
})
public class RequestState
    extends RequestFiltered
{

    protected RequestedString state;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedString }
     *     
     */
    public RequestedString getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedString }
     *     
     */
    public void setState(RequestedString value) {
        this.state = value;
    }

}

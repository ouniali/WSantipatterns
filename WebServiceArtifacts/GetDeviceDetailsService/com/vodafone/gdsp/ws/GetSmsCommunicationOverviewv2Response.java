
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSmsCommunicationOverviewv2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSmsCommunicationOverviewv2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.gdsp.vodafone.com/}getSmsCommunicationOverviewv2ResponseItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSmsCommunicationOverviewv2Response", propOrder = {
    "_return"
})
public class GetSmsCommunicationOverviewv2Response {

    @XmlElement(name = "return")
    protected GetSmsCommunicationOverviewv2ResponseItem _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSmsCommunicationOverviewv2ResponseItem }
     *     
     */
    public GetSmsCommunicationOverviewv2ResponseItem getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSmsCommunicationOverviewv2ResponseItem }
     *     
     */
    public void setReturn(GetSmsCommunicationOverviewv2ResponseItem value) {
        this._return = value;
    }

}

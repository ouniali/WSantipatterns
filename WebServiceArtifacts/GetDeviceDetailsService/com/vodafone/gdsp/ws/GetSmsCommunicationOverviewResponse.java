
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSmsCommunicationOverviewResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSmsCommunicationOverviewResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.gdsp.vodafone.com/}getSmsCommunicationOverviewResponseItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSmsCommunicationOverviewResponse", propOrder = {
    "_return"
})
public class GetSmsCommunicationOverviewResponse {

    @XmlElement(name = "return")
    protected GetSmsCommunicationOverviewResponseItem _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSmsCommunicationOverviewResponseItem }
     *     
     */
    public GetSmsCommunicationOverviewResponseItem getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSmsCommunicationOverviewResponseItem }
     *     
     */
    public void setReturn(GetSmsCommunicationOverviewResponseItem value) {
        this._return = value;
    }

}

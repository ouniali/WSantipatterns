
package com.rushweb.rushservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebTicketRetrieveByReferenceResult" type="{http://RushService.RushWeb.com/}ArrayOfOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "webTicketRetrieveByReferenceResult"
})
@XmlRootElement(name = "WebTicketRetrieveByReferenceResponse")
public class WebTicketRetrieveByReferenceResponse {

    @XmlElement(name = "WebTicketRetrieveByReferenceResult")
    protected ArrayOfOrder webTicketRetrieveByReferenceResult;

    /**
     * Gets the value of the webTicketRetrieveByReferenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrder }
     *     
     */
    public ArrayOfOrder getWebTicketRetrieveByReferenceResult() {
        return webTicketRetrieveByReferenceResult;
    }

    /**
     * Sets the value of the webTicketRetrieveByReferenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrder }
     *     
     */
    public void setWebTicketRetrieveByReferenceResult(ArrayOfOrder value) {
        this.webTicketRetrieveByReferenceResult = value;
    }

}

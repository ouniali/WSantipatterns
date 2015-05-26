
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
 *         &lt;element name="WebTicketRetrieveByTicketResult" type="{http://RushService.RushWeb.com/}ArrayOfOrder" minOccurs="0"/>
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
    "webTicketRetrieveByTicketResult"
})
@XmlRootElement(name = "WebTicketRetrieveByTicketResponse")
public class WebTicketRetrieveByTicketResponse {

    @XmlElement(name = "WebTicketRetrieveByTicketResult")
    protected ArrayOfOrder webTicketRetrieveByTicketResult;

    /**
     * Gets the value of the webTicketRetrieveByTicketResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrder }
     *     
     */
    public ArrayOfOrder getWebTicketRetrieveByTicketResult() {
        return webTicketRetrieveByTicketResult;
    }

    /**
     * Sets the value of the webTicketRetrieveByTicketResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrder }
     *     
     */
    public void setWebTicketRetrieveByTicketResult(ArrayOfOrder value) {
        this.webTicketRetrieveByTicketResult = value;
    }

}


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
 *         &lt;element name="WebTicketLogoutResult" type="{http://RushService.RushWeb.com/}WebTicketLogoutResult"/>
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
    "webTicketLogoutResult"
})
@XmlRootElement(name = "WebTicketLogoutResponse")
public class WebTicketLogoutResponse {

    @XmlElement(name = "WebTicketLogoutResult", required = true)
    protected WebTicketLogoutResult webTicketLogoutResult;

    /**
     * Gets the value of the webTicketLogoutResult property.
     * 
     * @return
     *     possible object is
     *     {@link WebTicketLogoutResult }
     *     
     */
    public WebTicketLogoutResult getWebTicketLogoutResult() {
        return webTicketLogoutResult;
    }

    /**
     * Sets the value of the webTicketLogoutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebTicketLogoutResult }
     *     
     */
    public void setWebTicketLogoutResult(WebTicketLogoutResult value) {
        this.webTicketLogoutResult = value;
    }

}

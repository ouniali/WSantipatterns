
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
 *         &lt;element name="WebTicketLoginResult" type="{http://RushService.RushWeb.com/}WebTicketLoginResult"/>
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
    "webTicketLoginResult"
})
@XmlRootElement(name = "WebTicketLoginResponse")
public class WebTicketLoginResponse {

    @XmlElement(name = "WebTicketLoginResult", required = true)
    protected WebTicketLoginResult webTicketLoginResult;

    /**
     * Gets the value of the webTicketLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link WebTicketLoginResult }
     *     
     */
    public WebTicketLoginResult getWebTicketLoginResult() {
        return webTicketLoginResult;
    }

    /**
     * Sets the value of the webTicketLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebTicketLoginResult }
     *     
     */
    public void setWebTicketLoginResult(WebTicketLoginResult value) {
        this.webTicketLoginResult = value;
    }

}

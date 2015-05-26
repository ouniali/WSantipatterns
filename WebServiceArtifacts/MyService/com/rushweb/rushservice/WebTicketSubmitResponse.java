
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
 *         &lt;element name="WebTicketSubmitResult" type="{http://RushService.RushWeb.com/}WebTicketSubmitResult"/>
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
    "webTicketSubmitResult"
})
@XmlRootElement(name = "WebTicketSubmitResponse")
public class WebTicketSubmitResponse {

    @XmlElement(name = "WebTicketSubmitResult", required = true)
    protected WebTicketSubmitResult webTicketSubmitResult;

    /**
     * Gets the value of the webTicketSubmitResult property.
     * 
     * @return
     *     possible object is
     *     {@link WebTicketSubmitResult }
     *     
     */
    public WebTicketSubmitResult getWebTicketSubmitResult() {
        return webTicketSubmitResult;
    }

    /**
     * Sets the value of the webTicketSubmitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebTicketSubmitResult }
     *     
     */
    public void setWebTicketSubmitResult(WebTicketSubmitResult value) {
        this.webTicketSubmitResult = value;
    }

}

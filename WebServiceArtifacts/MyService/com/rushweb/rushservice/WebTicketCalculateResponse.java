
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
 *         &lt;element name="WebTicketCalculateResult" type="{http://RushService.RushWeb.com/}Order"/>
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
    "webTicketCalculateResult"
})
@XmlRootElement(name = "WebTicketCalculateResponse")
public class WebTicketCalculateResponse {

    @XmlElement(name = "WebTicketCalculateResult", required = true)
    protected Order webTicketCalculateResult;

    /**
     * Gets the value of the webTicketCalculateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getWebTicketCalculateResult() {
        return webTicketCalculateResult;
    }

    /**
     * Sets the value of the webTicketCalculateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setWebTicketCalculateResult(Order value) {
        this.webTicketCalculateResult = value;
    }

}


package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WhoAreYou" type="{http://www.xignite.com/services/}WhoIs" minOccurs="0"/>
 *         &lt;element name="Headers" type="{http://www.xignite.com/services/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Browser" type="{http://www.xignite.com/services/}Browser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestInformation", propOrder = {
    "ip",
    "whoAreYou",
    "headers",
    "browser"
})
public class RequestInformation
    extends Common
{

    @XmlElement(name = "IP")
    protected String ip;
    @XmlElement(name = "WhoAreYou")
    protected WhoIs whoAreYou;
    @XmlElement(name = "Headers")
    protected ArrayOfString headers;
    @XmlElement(name = "Browser")
    protected Browser browser;

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP(String value) {
        this.ip = value;
    }

    /**
     * Gets the value of the whoAreYou property.
     * 
     * @return
     *     possible object is
     *     {@link WhoIs }
     *     
     */
    public WhoIs getWhoAreYou() {
        return whoAreYou;
    }

    /**
     * Sets the value of the whoAreYou property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhoIs }
     *     
     */
    public void setWhoAreYou(WhoIs value) {
        this.whoAreYou = value;
    }

    /**
     * Gets the value of the headers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHeaders() {
        return headers;
    }

    /**
     * Sets the value of the headers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHeaders(ArrayOfString value) {
        this.headers = value;
    }

    /**
     * Gets the value of the browser property.
     * 
     * @return
     *     possible object is
     *     {@link Browser }
     *     
     */
    public Browser getBrowser() {
        return browser;
    }

    /**
     * Sets the value of the browser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Browser }
     *     
     */
    public void setBrowser(Browser value) {
        this.browser = value;
    }

}


package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CyberSourceParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CyberSourceParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HttpBrowserCookiesAccepted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HttpBrowserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HttpBrowserEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CyberSourceParams", propOrder = {
    "userId",
    "domainName",
    "httpBrowserCookiesAccepted",
    "httpBrowserType",
    "ipAddress",
    "httpBrowserEmail"
})
public class CyberSourceParams {

    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "DomainName")
    protected String domainName;
    @XmlElement(name = "HttpBrowserCookiesAccepted")
    protected String httpBrowserCookiesAccepted;
    @XmlElement(name = "HttpBrowserType")
    protected String httpBrowserType;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "HttpBrowserEmail")
    protected String httpBrowserEmail;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the httpBrowserCookiesAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserCookiesAccepted() {
        return httpBrowserCookiesAccepted;
    }

    /**
     * Sets the value of the httpBrowserCookiesAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserCookiesAccepted(String value) {
        this.httpBrowserCookiesAccepted = value;
    }

    /**
     * Gets the value of the httpBrowserType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserType() {
        return httpBrowserType;
    }

    /**
     * Sets the value of the httpBrowserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserType(String value) {
        this.httpBrowserType = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the httpBrowserEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpBrowserEmail() {
        return httpBrowserEmail;
    }

    /**
     * Sets the value of the httpBrowserEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpBrowserEmail(String value) {
        this.httpBrowserEmail = value;
    }

}

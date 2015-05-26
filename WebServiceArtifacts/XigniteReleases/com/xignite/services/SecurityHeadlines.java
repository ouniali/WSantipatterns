
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityHeadlines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityHeadlines">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="Headlines" type="{http://www.xignite.com/services/}ArrayOfSecurityHeadline" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityHeadlines", propOrder = {
    "security",
    "headlines"
})
public class SecurityHeadlines
    extends Common
{

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "Headlines")
    protected ArrayOfSecurityHeadline headlines;

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link Security }
     *     
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security }
     *     
     */
    public void setSecurity(Security value) {
        this.security = value;
    }

    /**
     * Gets the value of the headlines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSecurityHeadline }
     *     
     */
    public ArrayOfSecurityHeadline getHeadlines() {
        return headlines;
    }

    /**
     * Sets the value of the headlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSecurityHeadline }
     *     
     */
    public void setHeadlines(ArrayOfSecurityHeadline value) {
        this.headlines = value;
    }

}

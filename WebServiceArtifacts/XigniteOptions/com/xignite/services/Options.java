
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Options">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="Quote" type="{http://www.xignite.com/services/}QuickQuote" minOccurs="0"/>
 *         &lt;element name="Expirations" type="{http://www.xignite.com/services/}ArrayOfExpiration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Options", propOrder = {
    "security",
    "quote",
    "expirations"
})
public class Options
    extends Common
{

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "Quote")
    protected QuickQuote quote;
    @XmlElement(name = "Expirations")
    protected ArrayOfExpiration expirations;

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
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link QuickQuote }
     *     
     */
    public QuickQuote getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuickQuote }
     *     
     */
    public void setQuote(QuickQuote value) {
        this.quote = value;
    }

    /**
     * Gets the value of the expirations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExpiration }
     *     
     */
    public ArrayOfExpiration getExpirations() {
        return expirations;
    }

    /**
     * Sets the value of the expirations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExpiration }
     *     
     */
    public void setExpirations(ArrayOfExpiration value) {
        this.expirations = value;
    }

}

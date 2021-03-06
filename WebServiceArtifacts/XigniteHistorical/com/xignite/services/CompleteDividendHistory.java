
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompleteDividendHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteDividendHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="CompleteDividends" type="{http://www.xignite.com/services/}ArrayOfCompleteDividend" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompleteDividendHistory", propOrder = {
    "security",
    "completeDividends"
})
public class CompleteDividendHistory
    extends Common
{

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "CompleteDividends")
    protected ArrayOfCompleteDividend completeDividends;

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
     * Gets the value of the completeDividends property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompleteDividend }
     *     
     */
    public ArrayOfCompleteDividend getCompleteDividends() {
        return completeDividends;
    }

    /**
     * Sets the value of the completeDividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompleteDividend }
     *     
     */
    public void setCompleteDividends(ArrayOfCompleteDividend value) {
        this.completeDividends = value;
    }

}

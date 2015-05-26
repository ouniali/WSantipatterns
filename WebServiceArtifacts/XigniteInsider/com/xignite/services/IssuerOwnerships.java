
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuerOwnerships complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuerOwnerships">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="ShareOutstanding" type="{http://www.xignite.com/services/}SharesAsOf" minOccurs="0"/>
 *         &lt;element name="Ownerships" type="{http://www.xignite.com/services/}ArrayOfIssuerOwnership" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerOwnerships", propOrder = {
    "security",
    "shareOutstanding",
    "ownerships"
})
public class IssuerOwnerships
    extends Common
{

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "ShareOutstanding")
    protected SharesAsOf shareOutstanding;
    @XmlElement(name = "Ownerships")
    protected ArrayOfIssuerOwnership ownerships;

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
     * Gets the value of the shareOutstanding property.
     * 
     * @return
     *     possible object is
     *     {@link SharesAsOf }
     *     
     */
    public SharesAsOf getShareOutstanding() {
        return shareOutstanding;
    }

    /**
     * Sets the value of the shareOutstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharesAsOf }
     *     
     */
    public void setShareOutstanding(SharesAsOf value) {
        this.shareOutstanding = value;
    }

    /**
     * Gets the value of the ownerships property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIssuerOwnership }
     *     
     */
    public ArrayOfIssuerOwnership getOwnerships() {
        return ownerships;
    }

    /**
     * Sets the value of the ownerships property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIssuerOwnership }
     *     
     */
    public void setOwnerships(ArrayOfIssuerOwnership value) {
        this.ownerships = value;
    }

}

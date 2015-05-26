
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoricalMarketCapitalization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricalMarketCapitalization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Security" type="{http://www.xignite.com/services/}Security" minOccurs="0"/>
 *         &lt;element name="Capitalizations" type="{http://www.xignite.com/services/}ArrayOfCapitalization" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricalMarketCapitalization", propOrder = {
    "security",
    "capitalizations"
})
public class HistoricalMarketCapitalization
    extends Common
{

    @XmlElement(name = "Security")
    protected Security security;
    @XmlElement(name = "Capitalizations")
    protected ArrayOfCapitalization capitalizations;

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
     * Gets the value of the capitalizations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCapitalization }
     *     
     */
    public ArrayOfCapitalization getCapitalizations() {
        return capitalizations;
    }

    /**
     * Sets the value of the capitalizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCapitalization }
     *     
     */
    public void setCapitalizations(ArrayOfCapitalization value) {
        this.capitalizations = value;
    }

}

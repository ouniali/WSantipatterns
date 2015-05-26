
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsiderHoldings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsiderHoldings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Insider" type="{http://www.xignite.com/services/}Insider" minOccurs="0"/>
 *         &lt;element name="Holdings" type="{http://www.xignite.com/services/}ArrayOfHolding" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsiderHoldings", propOrder = {
    "insider",
    "holdings"
})
public class InsiderHoldings
    extends Common
{

    @XmlElement(name = "Insider")
    protected Insider insider;
    @XmlElement(name = "Holdings")
    protected ArrayOfHolding holdings;

    /**
     * Gets the value of the insider property.
     * 
     * @return
     *     possible object is
     *     {@link Insider }
     *     
     */
    public Insider getInsider() {
        return insider;
    }

    /**
     * Sets the value of the insider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Insider }
     *     
     */
    public void setInsider(Insider value) {
        this.insider = value;
    }

    /**
     * Gets the value of the holdings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHolding }
     *     
     */
    public ArrayOfHolding getHoldings() {
        return holdings;
    }

    /**
     * Sets the value of the holdings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHolding }
     *     
     */
    public void setHoldings(ArrayOfHolding value) {
        this.holdings = value;
    }

}

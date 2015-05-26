
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketHeadlines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketHeadlines">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Headlines" type="{http://www.xignite.com/services/}ArrayOfMarketHeadline" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketHeadlines", propOrder = {
    "headlines"
})
public class MarketHeadlines
    extends Common
{

    @XmlElement(name = "Headlines")
    protected ArrayOfMarketHeadline headlines;

    /**
     * Gets the value of the headlines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarketHeadline }
     *     
     */
    public ArrayOfMarketHeadline getHeadlines() {
        return headlines;
    }

    /**
     * Sets the value of the headlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarketHeadline }
     *     
     */
    public void setHeadlines(ArrayOfMarketHeadline value) {
        this.headlines = value;
    }

}


package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvancesAndDeclines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdvancesAndDeclines">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="AsOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketChanges" type="{http://www.xignite.com/services/}ArrayOfMarketChange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvancesAndDeclines", propOrder = {
    "asOfDate",
    "marketChanges"
})
public class AdvancesAndDeclines
    extends Common
{

    @XmlElement(name = "AsOfDate")
    protected String asOfDate;
    @XmlElement(name = "MarketChanges")
    protected ArrayOfMarketChange marketChanges;

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsOfDate(String value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the marketChanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarketChange }
     *     
     */
    public ArrayOfMarketChange getMarketChanges() {
        return marketChanges;
    }

    /**
     * Sets the value of the marketChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarketChange }
     *     
     */
    public void setMarketChanges(ArrayOfMarketChange value) {
        this.marketChanges = value;
    }

}


package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Indexes" type="{http://www.xignite.com/services/}ArrayOfIndex" minOccurs="0"/>
 *         &lt;element name="Indicators" type="{http://www.xignite.com/services/}ArrayOfIndicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketSummary", propOrder = {
    "indexes",
    "indicators"
})
public class MarketSummary
    extends Common
{

    @XmlElement(name = "Indexes")
    protected ArrayOfIndex indexes;
    @XmlElement(name = "Indicators")
    protected ArrayOfIndicator indicators;

    /**
     * Gets the value of the indexes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndex }
     *     
     */
    public ArrayOfIndex getIndexes() {
        return indexes;
    }

    /**
     * Sets the value of the indexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndex }
     *     
     */
    public void setIndexes(ArrayOfIndex value) {
        this.indexes = value;
    }

    /**
     * Gets the value of the indicators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndicator }
     *     
     */
    public ArrayOfIndicator getIndicators() {
        return indicators;
    }

    /**
     * Sets the value of the indicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndicator }
     *     
     */
    public void setIndicators(ArrayOfIndicator value) {
        this.indicators = value;
    }

}

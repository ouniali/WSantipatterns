
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossRateTableWithBidAsk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossRateTableWithBidAsk">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Lines" type="{http://www.xignite.com/services/}ArrayOfCrossRateTableLineWithBidAsk" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossRateTableWithBidAsk", propOrder = {
    "lines"
})
public class CrossRateTableWithBidAsk
    extends Common
{

    @XmlElement(name = "Lines")
    protected ArrayOfCrossRateTableLineWithBidAsk lines;

    /**
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrossRateTableLineWithBidAsk }
     *     
     */
    public ArrayOfCrossRateTableLineWithBidAsk getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrossRateTableLineWithBidAsk }
     *     
     */
    public void setLines(ArrayOfCrossRateTableLineWithBidAsk value) {
        this.lines = value;
    }

}

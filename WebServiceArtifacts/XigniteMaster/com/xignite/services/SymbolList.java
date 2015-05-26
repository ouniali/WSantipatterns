
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SymbolList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SymbolList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Exchange" type="{http://www.xignite.com/services/}ExchangeTypes"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Symbols" type="{http://www.xignite.com/services/}ArrayOfSymbol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymbolList", propOrder = {
    "exchange",
    "count",
    "symbols"
})
public class SymbolList
    extends Common
{

    @XmlElement(name = "Exchange", required = true)
    @XmlSchemaType(name = "string")
    protected ExchangeTypes exchange;
    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "Symbols")
    protected ArrayOfSymbol symbols;

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeTypes }
     *     
     */
    public ExchangeTypes getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeTypes }
     *     
     */
    public void setExchange(ExchangeTypes value) {
        this.exchange = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the symbols property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSymbol }
     *     
     */
    public ArrayOfSymbol getSymbols() {
        return symbols;
    }

    /**
     * Sets the value of the symbols property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSymbol }
     *     
     */
    public void setSymbols(ArrayOfSymbol value) {
        this.symbols = value;
    }

}

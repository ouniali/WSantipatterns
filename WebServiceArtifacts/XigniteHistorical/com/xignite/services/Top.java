
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Top complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Top">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Rank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}TopTypes"/>
 *         &lt;element name="Quote" type="{http://www.xignite.com/services/}HistoricalQuote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Top", propOrder = {
    "rank",
    "type",
    "quote"
})
public class Top
    extends Common
{

    @XmlElement(name = "Rank")
    protected int rank;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected TopTypes type;
    @XmlElement(name = "Quote")
    protected HistoricalQuote quote;

    /**
     * Gets the value of the rank property.
     * 
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     */
    public void setRank(int value) {
        this.rank = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TopTypes }
     *     
     */
    public TopTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopTypes }
     *     
     */
    public void setType(TopTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalQuote }
     *     
     */
    public HistoricalQuote getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalQuote }
     *     
     */
    public void setQuote(HistoricalQuote value) {
        this.quote = value;
    }

}

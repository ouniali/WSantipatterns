
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CIKList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIKList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="Exchange" type="{http://www.xignite.com/services/}ExchangeTypes"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CIKs" type="{http://www.xignite.com/services/}ArrayOfCIK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIKList", propOrder = {
    "exchange",
    "count",
    "ciKs"
})
public class CIKList
    extends Common
{

    @XmlElement(name = "Exchange", required = true)
    @XmlSchemaType(name = "string")
    protected ExchangeTypes exchange;
    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "CIKs")
    protected ArrayOfCIK ciKs;

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
     * Gets the value of the ciKs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCIK }
     *     
     */
    public ArrayOfCIK getCIKs() {
        return ciKs;
    }

    /**
     * Sets the value of the ciKs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCIK }
     *     
     */
    public void setCIKs(ArrayOfCIK value) {
        this.ciKs = value;
    }

}

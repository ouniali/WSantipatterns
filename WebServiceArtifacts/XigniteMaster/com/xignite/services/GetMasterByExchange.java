
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Exchange" type="{http://www.xignite.com/services/}ExchangeTypes"/>
 *         &lt;element name="StartSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exchange",
    "startSymbol",
    "endSymbol"
})
@XmlRootElement(name = "GetMasterByExchange")
public class GetMasterByExchange {

    @XmlElement(name = "Exchange", required = true)
    @XmlSchemaType(name = "string")
    protected ExchangeTypes exchange;
    @XmlElement(name = "StartSymbol")
    protected String startSymbol;
    @XmlElement(name = "EndSymbol")
    protected String endSymbol;

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
     * Gets the value of the startSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartSymbol() {
        return startSymbol;
    }

    /**
     * Sets the value of the startSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartSymbol(String value) {
        this.startSymbol = value;
    }

    /**
     * Gets the value of the endSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndSymbol() {
        return endSymbol;
    }

    /**
     * Sets the value of the endSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndSymbol(String value) {
        this.endSymbol = value;
    }

}

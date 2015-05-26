
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
 *         &lt;element name="TopType" type="{http://www.xignite.com/services/}TopTypes"/>
 *         &lt;element name="Exchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "topType",
    "exchange"
})
@XmlRootElement(name = "GetTopsByExchange")
public class GetTopsByExchange {

    @XmlElement(name = "TopType", required = true)
    @XmlSchemaType(name = "string")
    protected TopTypes topType;
    @XmlElement(name = "Exchange")
    protected String exchange;

    /**
     * Gets the value of the topType property.
     * 
     * @return
     *     possible object is
     *     {@link TopTypes }
     *     
     */
    public TopTypes getTopType() {
        return topType;
    }

    /**
     * Sets the value of the topType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopTypes }
     *     
     */
    public void setTopType(TopTypes value) {
        this.topType = value;
    }

    /**
     * Gets the value of the exchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * Sets the value of the exchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchange(String value) {
        this.exchange = value;
    }

}

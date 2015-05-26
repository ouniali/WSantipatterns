
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
 *         &lt;element name="From" type="{http://www.xignite.com/services/}Currencies"/>
 *         &lt;element name="To" type="{http://www.xignite.com/services/}Currencies"/>
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
    "from",
    "to"
})
@XmlRootElement(name = "GetRealTimeCrossRate")
public class GetRealTimeCrossRate {

    @XmlElement(name = "From", required = true)
    @XmlSchemaType(name = "string")
    protected Currencies from;
    @XmlElement(name = "To", required = true)
    @XmlSchemaType(name = "string")
    protected Currencies to;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Currencies }
     *     
     */
    public Currencies getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currencies }
     *     
     */
    public void setFrom(Currencies value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Currencies }
     *     
     */
    public Currencies getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currencies }
     *     
     */
    public void setTo(Currencies value) {
        this.to = value;
    }

}

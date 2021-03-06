
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
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}TreasuryRateTypes"/>
 *         &lt;element name="Currency" type="{http://www.xignite.com/services/}TreasuryCurrencyTypes"/>
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
    "type",
    "currency"
})
@XmlRootElement(name = "GetTreasuryRate")
public class GetTreasuryRate {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected TreasuryRateTypes type;
    @XmlElement(name = "Currency", required = true)
    @XmlSchemaType(name = "string")
    protected TreasuryCurrencyTypes currency;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TreasuryRateTypes }
     *     
     */
    public TreasuryRateTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreasuryRateTypes }
     *     
     */
    public void setType(TreasuryRateTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link TreasuryCurrencyTypes }
     *     
     */
    public TreasuryCurrencyTypes getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreasuryCurrencyTypes }
     *     
     */
    public void setCurrency(TreasuryCurrencyTypes value) {
        this.currency = value;
    }

}

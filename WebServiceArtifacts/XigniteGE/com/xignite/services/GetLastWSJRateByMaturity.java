
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
 *         &lt;element name="Type" type="{http://www.xignite.com/services/}WSJRateTypes"/>
 *         &lt;element name="Maturity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "maturity"
})
@XmlRootElement(name = "GetLastWSJRateByMaturity")
public class GetLastWSJRateByMaturity {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected WSJRateTypes type;
    @XmlElement(name = "Maturity")
    protected String maturity;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link WSJRateTypes }
     *     
     */
    public WSJRateTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSJRateTypes }
     *     
     */
    public void setType(WSJRateTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the maturity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaturity() {
        return maturity;
    }

    /**
     * Sets the value of the maturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaturity(String value) {
        this.maturity = value;
    }

}

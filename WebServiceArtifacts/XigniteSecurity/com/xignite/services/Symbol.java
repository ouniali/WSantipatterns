
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Symbol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Symbol">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="FromSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromType" type="{http://www.xignite.com/services/}SymbologyTypes"/>
 *         &lt;element name="ToSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToType" type="{http://www.xignite.com/services/}SymbologyTypes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Symbol", propOrder = {
    "fromSymbol",
    "fromType",
    "toSymbol",
    "toType"
})
public class Symbol
    extends Common
{

    @XmlElement(name = "FromSymbol")
    protected String fromSymbol;
    @XmlElement(name = "FromType", required = true)
    @XmlSchemaType(name = "string")
    protected SymbologyTypes fromType;
    @XmlElement(name = "ToSymbol")
    protected String toSymbol;
    @XmlElement(name = "ToType", required = true)
    @XmlSchemaType(name = "string")
    protected SymbologyTypes toType;

    /**
     * Gets the value of the fromSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromSymbol() {
        return fromSymbol;
    }

    /**
     * Sets the value of the fromSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromSymbol(String value) {
        this.fromSymbol = value;
    }

    /**
     * Gets the value of the fromType property.
     * 
     * @return
     *     possible object is
     *     {@link SymbologyTypes }
     *     
     */
    public SymbologyTypes getFromType() {
        return fromType;
    }

    /**
     * Sets the value of the fromType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbologyTypes }
     *     
     */
    public void setFromType(SymbologyTypes value) {
        this.fromType = value;
    }

    /**
     * Gets the value of the toSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToSymbol() {
        return toSymbol;
    }

    /**
     * Sets the value of the toSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToSymbol(String value) {
        this.toSymbol = value;
    }

    /**
     * Gets the value of the toType property.
     * 
     * @return
     *     possible object is
     *     {@link SymbologyTypes }
     *     
     */
    public SymbologyTypes getToType() {
        return toType;
    }

    /**
     * Sets the value of the toType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbologyTypes }
     *     
     */
    public void setToType(SymbologyTypes value) {
        this.toType = value;
    }

}


package com.travelport.schema.air_v18_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="Precedence" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="NoteName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "FareNote")
public class FareNote {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "Precedence")
    protected BigInteger precedence;
    @XmlAttribute(name = "NoteName")
    protected String noteName;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the precedence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecedence() {
        return precedence;
    }

    /**
     * Sets the value of the precedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecedence(BigInteger value) {
        this.precedence = value;
    }

    /**
     * Gets the value of the noteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteName() {
        return noteName;
    }

    /**
     * Sets the value of the noteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteName(String value) {
        this.noteName = value;
    }

}

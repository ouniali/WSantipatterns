
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for value complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="value">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="footnoteId" type="{http://www.xignite.com/services/}footnoteId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "value", propOrder = {
    "value",
    "footnoteId"
})
public class Value {

    protected String value;
    protected FootnoteId footnoteId;

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
     * Gets the value of the footnoteId property.
     * 
     * @return
     *     possible object is
     *     {@link FootnoteId }
     *     
     */
    public FootnoteId getFootnoteId() {
        return footnoteId;
    }

    /**
     * Sets the value of the footnoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FootnoteId }
     *     
     */
    public void setFootnoteId(FootnoteId value) {
        this.footnoteId = value;
    }

}

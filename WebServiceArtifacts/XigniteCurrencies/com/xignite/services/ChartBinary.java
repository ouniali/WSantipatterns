
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChartBinary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChartBinary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="ByteArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChartBinary", propOrder = {
    "byteArray"
})
public class ChartBinary
    extends Common
{

    @XmlElement(name = "ByteArray")
    protected byte[] byteArray;

    /**
     * Gets the value of the byteArray property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getByteArray() {
        return byteArray;
    }

    /**
     * Sets the value of the byteArray property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setByteArray(byte[] value) {
        this.byteArray = value;
    }

}

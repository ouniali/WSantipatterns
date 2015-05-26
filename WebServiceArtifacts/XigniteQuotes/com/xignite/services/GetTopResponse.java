
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="GetTopResult" type="{http://www.xignite.com/services/}ArrayOfTop" minOccurs="0"/>
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
    "getTopResult"
})
@XmlRootElement(name = "GetTopResponse")
public class GetTopResponse {

    @XmlElement(name = "GetTopResult")
    protected ArrayOfTop getTopResult;

    /**
     * Gets the value of the getTopResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTop }
     *     
     */
    public ArrayOfTop getGetTopResult() {
        return getTopResult;
    }

    /**
     * Sets the value of the getTopResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTop }
     *     
     */
    public void setGetTopResult(ArrayOfTop value) {
        this.getTopResult = value;
    }

}

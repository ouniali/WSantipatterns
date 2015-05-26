
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
 *         &lt;element name="GetTopMoversResult" type="{http://www.xignite.com/services/}ArrayOfTop" minOccurs="0"/>
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
    "getTopMoversResult"
})
@XmlRootElement(name = "GetTopMoversResponse")
public class GetTopMoversResponse {

    @XmlElement(name = "GetTopMoversResult")
    protected ArrayOfTop getTopMoversResult;

    /**
     * Gets the value of the getTopMoversResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTop }
     *     
     */
    public ArrayOfTop getGetTopMoversResult() {
        return getTopMoversResult;
    }

    /**
     * Sets the value of the getTopMoversResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTop }
     *     
     */
    public void setGetTopMoversResult(ArrayOfTop value) {
        this.getTopMoversResult = value;
    }

}

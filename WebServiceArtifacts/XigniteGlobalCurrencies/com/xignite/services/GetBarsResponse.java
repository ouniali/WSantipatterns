
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
 *         &lt;element name="GetBarsResult" type="{http://www.xignite.com/services/}ArrayOfBar" minOccurs="0"/>
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
    "getBarsResult"
})
@XmlRootElement(name = "GetBarsResponse")
public class GetBarsResponse {

    @XmlElement(name = "GetBarsResult")
    protected ArrayOfBar getBarsResult;

    /**
     * Gets the value of the getBarsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBar }
     *     
     */
    public ArrayOfBar getGetBarsResult() {
        return getBarsResult;
    }

    /**
     * Sets the value of the getBarsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBar }
     *     
     */
    public void setGetBarsResult(ArrayOfBar value) {
        this.getBarsResult = value;
    }

}


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
 *         &lt;element name="GetIndicesResult" type="{http://www.xignite.com/services/}ArrayOfMarketIndex" minOccurs="0"/>
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
    "getIndicesResult"
})
@XmlRootElement(name = "GetIndicesResponse")
public class GetIndicesResponse {

    @XmlElement(name = "GetIndicesResult")
    protected ArrayOfMarketIndex getIndicesResult;

    /**
     * Gets the value of the getIndicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarketIndex }
     *     
     */
    public ArrayOfMarketIndex getGetIndicesResult() {
        return getIndicesResult;
    }

    /**
     * Sets the value of the getIndicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarketIndex }
     *     
     */
    public void setGetIndicesResult(ArrayOfMarketIndex value) {
        this.getIndicesResult = value;
    }

}

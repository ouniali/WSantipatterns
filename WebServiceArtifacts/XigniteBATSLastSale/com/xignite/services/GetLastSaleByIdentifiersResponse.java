
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
 *         &lt;element name="GetLastSaleByIdentifiersResult" type="{http://www.xignite.com/services/}ArrayOfLastSaleQuote" minOccurs="0"/>
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
    "getLastSaleByIdentifiersResult"
})
@XmlRootElement(name = "GetLastSaleByIdentifiersResponse")
public class GetLastSaleByIdentifiersResponse {

    @XmlElement(name = "GetLastSaleByIdentifiersResult")
    protected ArrayOfLastSaleQuote getLastSaleByIdentifiersResult;

    /**
     * Gets the value of the getLastSaleByIdentifiersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLastSaleQuote }
     *     
     */
    public ArrayOfLastSaleQuote getGetLastSaleByIdentifiersResult() {
        return getLastSaleByIdentifiersResult;
    }

    /**
     * Sets the value of the getLastSaleByIdentifiersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLastSaleQuote }
     *     
     */
    public void setGetLastSaleByIdentifiersResult(ArrayOfLastSaleQuote value) {
        this.getLastSaleByIdentifiersResult = value;
    }

}

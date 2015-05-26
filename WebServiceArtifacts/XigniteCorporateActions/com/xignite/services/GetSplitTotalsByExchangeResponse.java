
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
 *         &lt;element name="GetSplitTotalsByExchangeResult" type="{http://www.xignite.com/services/}ArrayOfSplitTotal" minOccurs="0"/>
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
    "getSplitTotalsByExchangeResult"
})
@XmlRootElement(name = "GetSplitTotalsByExchangeResponse")
public class GetSplitTotalsByExchangeResponse {

    @XmlElement(name = "GetSplitTotalsByExchangeResult")
    protected ArrayOfSplitTotal getSplitTotalsByExchangeResult;

    /**
     * Gets the value of the getSplitTotalsByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSplitTotal }
     *     
     */
    public ArrayOfSplitTotal getGetSplitTotalsByExchangeResult() {
        return getSplitTotalsByExchangeResult;
    }

    /**
     * Sets the value of the getSplitTotalsByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSplitTotal }
     *     
     */
    public void setGetSplitTotalsByExchangeResult(ArrayOfSplitTotal value) {
        this.getSplitTotalsByExchangeResult = value;
    }

}

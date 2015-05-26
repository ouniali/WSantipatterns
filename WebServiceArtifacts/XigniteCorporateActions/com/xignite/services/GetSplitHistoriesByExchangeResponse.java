
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
 *         &lt;element name="GetSplitHistoriesByExchangeResult" type="{http://www.xignite.com/services/}ArrayOfSplitHistory" minOccurs="0"/>
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
    "getSplitHistoriesByExchangeResult"
})
@XmlRootElement(name = "GetSplitHistoriesByExchangeResponse")
public class GetSplitHistoriesByExchangeResponse {

    @XmlElement(name = "GetSplitHistoriesByExchangeResult")
    protected ArrayOfSplitHistory getSplitHistoriesByExchangeResult;

    /**
     * Gets the value of the getSplitHistoriesByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSplitHistory }
     *     
     */
    public ArrayOfSplitHistory getGetSplitHistoriesByExchangeResult() {
        return getSplitHistoriesByExchangeResult;
    }

    /**
     * Sets the value of the getSplitHistoriesByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSplitHistory }
     *     
     */
    public void setGetSplitHistoriesByExchangeResult(ArrayOfSplitHistory value) {
        this.getSplitHistoriesByExchangeResult = value;
    }

}

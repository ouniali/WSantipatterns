
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
 *         &lt;element name="GetStockHeadlinesRangeResult" type="{http://www.xignite.com/services/}ArrayOfStockNews" minOccurs="0"/>
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
    "getStockHeadlinesRangeResult"
})
@XmlRootElement(name = "GetStockHeadlinesRangeResponse")
public class GetStockHeadlinesRangeResponse {

    @XmlElement(name = "GetStockHeadlinesRangeResult")
    protected ArrayOfStockNews getStockHeadlinesRangeResult;

    /**
     * Gets the value of the getStockHeadlinesRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStockNews }
     *     
     */
    public ArrayOfStockNews getGetStockHeadlinesRangeResult() {
        return getStockHeadlinesRangeResult;
    }

    /**
     * Sets the value of the getStockHeadlinesRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStockNews }
     *     
     */
    public void setGetStockHeadlinesRangeResult(ArrayOfStockNews value) {
        this.getStockHeadlinesRangeResult = value;
    }

}


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
 *         &lt;element name="GetMarketNewsHeadlinesResult" type="{http://www.xignite.com/services/}ArrayOfMarketNews" minOccurs="0"/>
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
    "getMarketNewsHeadlinesResult"
})
@XmlRootElement(name = "GetMarketNewsHeadlinesResponse")
public class GetMarketNewsHeadlinesResponse {

    @XmlElement(name = "GetMarketNewsHeadlinesResult")
    protected ArrayOfMarketNews getMarketNewsHeadlinesResult;

    /**
     * Gets the value of the getMarketNewsHeadlinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMarketNews }
     *     
     */
    public ArrayOfMarketNews getGetMarketNewsHeadlinesResult() {
        return getMarketNewsHeadlinesResult;
    }

    /**
     * Sets the value of the getMarketNewsHeadlinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMarketNews }
     *     
     */
    public void setGetMarketNewsHeadlinesResult(ArrayOfMarketNews value) {
        this.getMarketNewsHeadlinesResult = value;
    }

}

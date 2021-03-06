
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
 *         &lt;element name="GetTopMoversByExchangeResult" type="{http://www.xignite.com/services/}ArrayOfTop" minOccurs="0"/>
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
    "getTopMoversByExchangeResult"
})
@XmlRootElement(name = "GetTopMoversByExchangeResponse")
public class GetTopMoversByExchangeResponse {

    @XmlElement(name = "GetTopMoversByExchangeResult")
    protected ArrayOfTop getTopMoversByExchangeResult;

    /**
     * Gets the value of the getTopMoversByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTop }
     *     
     */
    public ArrayOfTop getGetTopMoversByExchangeResult() {
        return getTopMoversByExchangeResult;
    }

    /**
     * Sets the value of the getTopMoversByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTop }
     *     
     */
    public void setGetTopMoversByExchangeResult(ArrayOfTop value) {
        this.getTopMoversByExchangeResult = value;
    }

}

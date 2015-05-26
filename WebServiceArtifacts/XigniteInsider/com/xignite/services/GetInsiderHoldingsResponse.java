
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
 *         &lt;element name="GetInsiderHoldingsResult" type="{http://www.xignite.com/services/}InsiderHoldings" minOccurs="0"/>
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
    "getInsiderHoldingsResult"
})
@XmlRootElement(name = "GetInsiderHoldingsResponse")
public class GetInsiderHoldingsResponse {

    @XmlElement(name = "GetInsiderHoldingsResult")
    protected InsiderHoldings getInsiderHoldingsResult;

    /**
     * Gets the value of the getInsiderHoldingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link InsiderHoldings }
     *     
     */
    public InsiderHoldings getGetInsiderHoldingsResult() {
        return getInsiderHoldingsResult;
    }

    /**
     * Sets the value of the getInsiderHoldingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsiderHoldings }
     *     
     */
    public void setGetInsiderHoldingsResult(InsiderHoldings value) {
        this.getInsiderHoldingsResult = value;
    }

}

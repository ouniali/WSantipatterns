
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
 *         &lt;element name="GetDividendHistoriesByExchangeResult" type="{http://www.xignite.com/services/}ArrayOfDividendHistory" minOccurs="0"/>
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
    "getDividendHistoriesByExchangeResult"
})
@XmlRootElement(name = "GetDividendHistoriesByExchangeResponse")
public class GetDividendHistoriesByExchangeResponse {

    @XmlElement(name = "GetDividendHistoriesByExchangeResult")
    protected ArrayOfDividendHistory getDividendHistoriesByExchangeResult;

    /**
     * Gets the value of the getDividendHistoriesByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDividendHistory }
     *     
     */
    public ArrayOfDividendHistory getGetDividendHistoriesByExchangeResult() {
        return getDividendHistoriesByExchangeResult;
    }

    /**
     * Sets the value of the getDividendHistoriesByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDividendHistory }
     *     
     */
    public void setGetDividendHistoriesByExchangeResult(ArrayOfDividendHistory value) {
        this.getDividendHistoriesByExchangeResult = value;
    }

}

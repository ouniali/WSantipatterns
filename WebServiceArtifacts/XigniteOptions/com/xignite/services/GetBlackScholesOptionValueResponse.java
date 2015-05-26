
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
 *         &lt;element name="GetBlackScholesOptionValueResult" type="{http://www.xignite.com/services/}NumericResult" minOccurs="0"/>
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
    "getBlackScholesOptionValueResult"
})
@XmlRootElement(name = "GetBlackScholesOptionValueResponse")
public class GetBlackScholesOptionValueResponse {

    @XmlElement(name = "GetBlackScholesOptionValueResult")
    protected NumericResult getBlackScholesOptionValueResult;

    /**
     * Gets the value of the getBlackScholesOptionValueResult property.
     * 
     * @return
     *     possible object is
     *     {@link NumericResult }
     *     
     */
    public NumericResult getGetBlackScholesOptionValueResult() {
        return getBlackScholesOptionValueResult;
    }

    /**
     * Sets the value of the getBlackScholesOptionValueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericResult }
     *     
     */
    public void setGetBlackScholesOptionValueResult(NumericResult value) {
        this.getBlackScholesOptionValueResult = value;
    }

}


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
 *         &lt;element name="GetIssuerTransformationsByExchangeResult" type="{http://www.xignite.com/services/}ArrayOfIssuerTransformation" minOccurs="0"/>
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
    "getIssuerTransformationsByExchangeResult"
})
@XmlRootElement(name = "GetIssuerTransformationsByExchangeResponse")
public class GetIssuerTransformationsByExchangeResponse {

    @XmlElement(name = "GetIssuerTransformationsByExchangeResult")
    protected ArrayOfIssuerTransformation getIssuerTransformationsByExchangeResult;

    /**
     * Gets the value of the getIssuerTransformationsByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIssuerTransformation }
     *     
     */
    public ArrayOfIssuerTransformation getGetIssuerTransformationsByExchangeResult() {
        return getIssuerTransformationsByExchangeResult;
    }

    /**
     * Sets the value of the getIssuerTransformationsByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIssuerTransformation }
     *     
     */
    public void setGetIssuerTransformationsByExchangeResult(ArrayOfIssuerTransformation value) {
        this.getIssuerTransformationsByExchangeResult = value;
    }

}

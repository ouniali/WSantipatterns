
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
 *         &lt;element name="GetIssuerTransformationsResult" type="{http://www.xignite.com/services/}ArrayOfIssuerTransformation" minOccurs="0"/>
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
    "getIssuerTransformationsResult"
})
@XmlRootElement(name = "GetIssuerTransformationsResponse")
public class GetIssuerTransformationsResponse {

    @XmlElement(name = "GetIssuerTransformationsResult")
    protected ArrayOfIssuerTransformation getIssuerTransformationsResult;

    /**
     * Gets the value of the getIssuerTransformationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIssuerTransformation }
     *     
     */
    public ArrayOfIssuerTransformation getGetIssuerTransformationsResult() {
        return getIssuerTransformationsResult;
    }

    /**
     * Sets the value of the getIssuerTransformationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIssuerTransformation }
     *     
     */
    public void setGetIssuerTransformationsResult(ArrayOfIssuerTransformation value) {
        this.getIssuerTransformationsResult = value;
    }

}

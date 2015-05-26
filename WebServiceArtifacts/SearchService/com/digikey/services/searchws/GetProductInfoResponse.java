
package com.digikey.services.searchws;

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
 *         &lt;element name="GetProductInfoResult" type="{http://services.digikey.com/SearchWS}ProductInfoEx" minOccurs="0"/>
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
    "getProductInfoResult"
})
@XmlRootElement(name = "GetProductInfoResponse")
public class GetProductInfoResponse {

    @XmlElement(name = "GetProductInfoResult")
    protected ProductInfoEx getProductInfoResult;

    /**
     * Gets the value of the getProductInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInfoEx }
     *     
     */
    public ProductInfoEx getGetProductInfoResult() {
        return getProductInfoResult;
    }

    /**
     * Sets the value of the getProductInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInfoEx }
     *     
     */
    public void setGetProductInfoResult(ProductInfoEx value) {
        this.getProductInfoResult = value;
    }

}

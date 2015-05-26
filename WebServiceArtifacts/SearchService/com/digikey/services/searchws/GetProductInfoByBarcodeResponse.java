
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
 *         &lt;element name="GetProductInfoByBarcodeResult" type="{http://services.digikey.com/SearchWS}ProductInfoEx" minOccurs="0"/>
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
    "getProductInfoByBarcodeResult"
})
@XmlRootElement(name = "GetProductInfoByBarcodeResponse")
public class GetProductInfoByBarcodeResponse {

    @XmlElement(name = "GetProductInfoByBarcodeResult")
    protected ProductInfoEx getProductInfoByBarcodeResult;

    /**
     * Gets the value of the getProductInfoByBarcodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInfoEx }
     *     
     */
    public ProductInfoEx getGetProductInfoByBarcodeResult() {
        return getProductInfoByBarcodeResult;
    }

    /**
     * Sets the value of the getProductInfoByBarcodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInfoEx }
     *     
     */
    public void setGetProductInfoByBarcodeResult(ProductInfoEx value) {
        this.getProductInfoByBarcodeResult = value;
    }

}

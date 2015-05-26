
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
 *         &lt;element name="GetProductInfoByDigikeyPartNumberResult" type="{http://services.digikey.com/SearchWS}EDAProductInfo" minOccurs="0"/>
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
    "getProductInfoByDigikeyPartNumberResult"
})
@XmlRootElement(name = "GetProductInfoByDigikeyPartNumberResponse")
public class GetProductInfoByDigikeyPartNumberResponse {

    @XmlElement(name = "GetProductInfoByDigikeyPartNumberResult")
    protected EDAProductInfo getProductInfoByDigikeyPartNumberResult;

    /**
     * Gets the value of the getProductInfoByDigikeyPartNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link EDAProductInfo }
     *     
     */
    public EDAProductInfo getGetProductInfoByDigikeyPartNumberResult() {
        return getProductInfoByDigikeyPartNumberResult;
    }

    /**
     * Sets the value of the getProductInfoByDigikeyPartNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDAProductInfo }
     *     
     */
    public void setGetProductInfoByDigikeyPartNumberResult(EDAProductInfo value) {
        this.getProductInfoByDigikeyPartNumberResult = value;
    }

}

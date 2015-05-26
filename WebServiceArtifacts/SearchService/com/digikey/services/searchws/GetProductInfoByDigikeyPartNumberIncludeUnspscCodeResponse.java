
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
 *         &lt;element name="GetProductInfoByDigikeyPartNumberIncludeUnspscCodeResult" type="{http://services.digikey.com/SearchWS}EDAProductInfoUnspsc" minOccurs="0"/>
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
    "getProductInfoByDigikeyPartNumberIncludeUnspscCodeResult"
})
@XmlRootElement(name = "GetProductInfoByDigikeyPartNumberIncludeUnspscCodeResponse")
public class GetProductInfoByDigikeyPartNumberIncludeUnspscCodeResponse {

    @XmlElement(name = "GetProductInfoByDigikeyPartNumberIncludeUnspscCodeResult")
    protected EDAProductInfoUnspsc getProductInfoByDigikeyPartNumberIncludeUnspscCodeResult;

    /**
     * Gets the value of the getProductInfoByDigikeyPartNumberIncludeUnspscCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link EDAProductInfoUnspsc }
     *     
     */
    public EDAProductInfoUnspsc getGetProductInfoByDigikeyPartNumberIncludeUnspscCodeResult() {
        return getProductInfoByDigikeyPartNumberIncludeUnspscCodeResult;
    }

    /**
     * Sets the value of the getProductInfoByDigikeyPartNumberIncludeUnspscCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDAProductInfoUnspsc }
     *     
     */
    public void setGetProductInfoByDigikeyPartNumberIncludeUnspscCodeResult(EDAProductInfoUnspsc value) {
        this.getProductInfoByDigikeyPartNumberIncludeUnspscCodeResult = value;
    }

}

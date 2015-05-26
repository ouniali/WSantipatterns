
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
 *         &lt;element name="GetProductInfoByDigikeyPartNumberSiteLanguageResult" type="{http://services.digikey.com/SearchWS}EDAProductInfoInt" minOccurs="0"/>
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
    "getProductInfoByDigikeyPartNumberSiteLanguageResult"
})
@XmlRootElement(name = "GetProductInfoByDigikeyPartNumberSiteLanguageResponse")
public class GetProductInfoByDigikeyPartNumberSiteLanguageResponse {

    @XmlElement(name = "GetProductInfoByDigikeyPartNumberSiteLanguageResult")
    protected EDAProductInfoInt getProductInfoByDigikeyPartNumberSiteLanguageResult;

    /**
     * Gets the value of the getProductInfoByDigikeyPartNumberSiteLanguageResult property.
     * 
     * @return
     *     possible object is
     *     {@link EDAProductInfoInt }
     *     
     */
    public EDAProductInfoInt getGetProductInfoByDigikeyPartNumberSiteLanguageResult() {
        return getProductInfoByDigikeyPartNumberSiteLanguageResult;
    }

    /**
     * Sets the value of the getProductInfoByDigikeyPartNumberSiteLanguageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDAProductInfoInt }
     *     
     */
    public void setGetProductInfoByDigikeyPartNumberSiteLanguageResult(EDAProductInfoInt value) {
        this.getProductInfoByDigikeyPartNumberSiteLanguageResult = value;
    }

}

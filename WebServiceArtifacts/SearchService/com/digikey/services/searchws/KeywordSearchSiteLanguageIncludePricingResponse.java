
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
 *         &lt;element name="KeywordSearchSiteLanguageIncludePricingResult" type="{http://services.digikey.com/SearchWS}BaseProductInfoPricingCollectionInt" minOccurs="0"/>
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
    "keywordSearchSiteLanguageIncludePricingResult"
})
@XmlRootElement(name = "KeywordSearchSiteLanguageIncludePricingResponse")
public class KeywordSearchSiteLanguageIncludePricingResponse {

    @XmlElement(name = "KeywordSearchSiteLanguageIncludePricingResult")
    protected BaseProductInfoPricingCollectionInt keywordSearchSiteLanguageIncludePricingResult;

    /**
     * Gets the value of the keywordSearchSiteLanguageIncludePricingResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductInfoPricingCollectionInt }
     *     
     */
    public BaseProductInfoPricingCollectionInt getKeywordSearchSiteLanguageIncludePricingResult() {
        return keywordSearchSiteLanguageIncludePricingResult;
    }

    /**
     * Sets the value of the keywordSearchSiteLanguageIncludePricingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductInfoPricingCollectionInt }
     *     
     */
    public void setKeywordSearchSiteLanguageIncludePricingResult(BaseProductInfoPricingCollectionInt value) {
        this.keywordSearchSiteLanguageIncludePricingResult = value;
    }

}

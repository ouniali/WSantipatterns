
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
 *         &lt;element name="KeywordSearchSiteLanguageIncludeAllPricingResult" type="{http://services.digikey.com/SearchWS}BaseProductInfoAllPricingCollectionInt" minOccurs="0"/>
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
    "keywordSearchSiteLanguageIncludeAllPricingResult"
})
@XmlRootElement(name = "KeywordSearchSiteLanguageIncludeAllPricingResponse")
public class KeywordSearchSiteLanguageIncludeAllPricingResponse {

    @XmlElement(name = "KeywordSearchSiteLanguageIncludeAllPricingResult")
    protected BaseProductInfoAllPricingCollectionInt keywordSearchSiteLanguageIncludeAllPricingResult;

    /**
     * Gets the value of the keywordSearchSiteLanguageIncludeAllPricingResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductInfoAllPricingCollectionInt }
     *     
     */
    public BaseProductInfoAllPricingCollectionInt getKeywordSearchSiteLanguageIncludeAllPricingResult() {
        return keywordSearchSiteLanguageIncludeAllPricingResult;
    }

    /**
     * Sets the value of the keywordSearchSiteLanguageIncludeAllPricingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductInfoAllPricingCollectionInt }
     *     
     */
    public void setKeywordSearchSiteLanguageIncludeAllPricingResult(BaseProductInfoAllPricingCollectionInt value) {
        this.keywordSearchSiteLanguageIncludeAllPricingResult = value;
    }

}

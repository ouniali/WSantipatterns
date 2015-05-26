
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
 *         &lt;element name="KeywordSearchIncludePricingResult" type="{http://services.digikey.com/SearchWS}BaseProductInfoPricingCollection" minOccurs="0"/>
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
    "keywordSearchIncludePricingResult"
})
@XmlRootElement(name = "KeywordSearchIncludePricingResponse")
public class KeywordSearchIncludePricingResponse {

    @XmlElement(name = "KeywordSearchIncludePricingResult")
    protected BaseProductInfoPricingCollection keywordSearchIncludePricingResult;

    /**
     * Gets the value of the keywordSearchIncludePricingResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductInfoPricingCollection }
     *     
     */
    public BaseProductInfoPricingCollection getKeywordSearchIncludePricingResult() {
        return keywordSearchIncludePricingResult;
    }

    /**
     * Sets the value of the keywordSearchIncludePricingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductInfoPricingCollection }
     *     
     */
    public void setKeywordSearchIncludePricingResult(BaseProductInfoPricingCollection value) {
        this.keywordSearchIncludePricingResult = value;
    }

}

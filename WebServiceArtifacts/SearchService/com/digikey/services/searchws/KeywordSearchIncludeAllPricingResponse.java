
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
 *         &lt;element name="KeywordSearchIncludeAllPricingResult" type="{http://services.digikey.com/SearchWS}BaseProductInfoAllPricingCollection" minOccurs="0"/>
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
    "keywordSearchIncludeAllPricingResult"
})
@XmlRootElement(name = "KeywordSearchIncludeAllPricingResponse")
public class KeywordSearchIncludeAllPricingResponse {

    @XmlElement(name = "KeywordSearchIncludeAllPricingResult")
    protected BaseProductInfoAllPricingCollection keywordSearchIncludeAllPricingResult;

    /**
     * Gets the value of the keywordSearchIncludeAllPricingResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductInfoAllPricingCollection }
     *     
     */
    public BaseProductInfoAllPricingCollection getKeywordSearchIncludeAllPricingResult() {
        return keywordSearchIncludeAllPricingResult;
    }

    /**
     * Sets the value of the keywordSearchIncludeAllPricingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductInfoAllPricingCollection }
     *     
     */
    public void setKeywordSearchIncludeAllPricingResult(BaseProductInfoAllPricingCollection value) {
        this.keywordSearchIncludeAllPricingResult = value;
    }

}

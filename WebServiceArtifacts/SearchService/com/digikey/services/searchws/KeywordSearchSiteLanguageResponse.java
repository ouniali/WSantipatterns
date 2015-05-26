
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
 *         &lt;element name="KeywordSearchSiteLanguageResult" type="{http://services.digikey.com/SearchWS}BaseProductInfoCollectionInt" minOccurs="0"/>
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
    "keywordSearchSiteLanguageResult"
})
@XmlRootElement(name = "KeywordSearchSiteLanguageResponse")
public class KeywordSearchSiteLanguageResponse {

    @XmlElement(name = "KeywordSearchSiteLanguageResult")
    protected BaseProductInfoCollectionInt keywordSearchSiteLanguageResult;

    /**
     * Gets the value of the keywordSearchSiteLanguageResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductInfoCollectionInt }
     *     
     */
    public BaseProductInfoCollectionInt getKeywordSearchSiteLanguageResult() {
        return keywordSearchSiteLanguageResult;
    }

    /**
     * Sets the value of the keywordSearchSiteLanguageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductInfoCollectionInt }
     *     
     */
    public void setKeywordSearchSiteLanguageResult(BaseProductInfoCollectionInt value) {
        this.keywordSearchSiteLanguageResult = value;
    }

}

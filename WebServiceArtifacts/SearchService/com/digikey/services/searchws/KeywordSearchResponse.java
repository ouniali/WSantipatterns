
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
 *         &lt;element name="KeywordSearchResult" type="{http://services.digikey.com/SearchWS}BaseProductInfoCollection" minOccurs="0"/>
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
    "keywordSearchResult"
})
@XmlRootElement(name = "KeywordSearchResponse")
public class KeywordSearchResponse {

    @XmlElement(name = "KeywordSearchResult")
    protected BaseProductInfoCollection keywordSearchResult;

    /**
     * Gets the value of the keywordSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductInfoCollection }
     *     
     */
    public BaseProductInfoCollection getKeywordSearchResult() {
        return keywordSearchResult;
    }

    /**
     * Sets the value of the keywordSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductInfoCollection }
     *     
     */
    public void setKeywordSearchResult(BaseProductInfoCollection value) {
        this.keywordSearchResult = value;
    }

}

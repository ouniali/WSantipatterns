
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
 *         &lt;element name="KeywordParametricSearchResult" type="{http://services.digikey.com/SearchWS}CategoryCollection" minOccurs="0"/>
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
    "keywordParametricSearchResult"
})
@XmlRootElement(name = "KeywordParametricSearchResponse")
public class KeywordParametricSearchResponse {

    @XmlElement(name = "KeywordParametricSearchResult")
    protected CategoryCollection keywordParametricSearchResult;

    /**
     * Gets the value of the keywordParametricSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryCollection }
     *     
     */
    public CategoryCollection getKeywordParametricSearchResult() {
        return keywordParametricSearchResult;
    }

    /**
     * Sets the value of the keywordParametricSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryCollection }
     *     
     */
    public void setKeywordParametricSearchResult(CategoryCollection value) {
        this.keywordParametricSearchResult = value;
    }

}

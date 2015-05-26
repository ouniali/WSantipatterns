
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
 *         &lt;element name="SearchByVendorSiteLanguageResult" type="{http://services.digikey.com/SearchWS}BaseProductInfoCollectionInt" minOccurs="0"/>
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
    "searchByVendorSiteLanguageResult"
})
@XmlRootElement(name = "SearchByVendorSiteLanguageResponse")
public class SearchByVendorSiteLanguageResponse {

    @XmlElement(name = "SearchByVendorSiteLanguageResult")
    protected BaseProductInfoCollectionInt searchByVendorSiteLanguageResult;

    /**
     * Gets the value of the searchByVendorSiteLanguageResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseProductInfoCollectionInt }
     *     
     */
    public BaseProductInfoCollectionInt getSearchByVendorSiteLanguageResult() {
        return searchByVendorSiteLanguageResult;
    }

    /**
     * Sets the value of the searchByVendorSiteLanguageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseProductInfoCollectionInt }
     *     
     */
    public void setSearchByVendorSiteLanguageResult(BaseProductInfoCollectionInt value) {
        this.searchByVendorSiteLanguageResult = value;
    }

}

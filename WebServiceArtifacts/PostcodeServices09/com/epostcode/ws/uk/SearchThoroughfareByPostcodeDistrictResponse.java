
package com.epostcode.ws.uk;

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
 *         &lt;element name="SearchThoroughfare_ByPostcodeDistrictResult" type="{http://ws.epostcode.com/uk/}ListAddressThoroughfares" minOccurs="0"/>
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
    "searchThoroughfareByPostcodeDistrictResult"
})
@XmlRootElement(name = "SearchThoroughfare_ByPostcodeDistrictResponse")
public class SearchThoroughfareByPostcodeDistrictResponse {

    @XmlElement(name = "SearchThoroughfare_ByPostcodeDistrictResult")
    protected ListAddressThoroughfares searchThoroughfareByPostcodeDistrictResult;

    /**
     * Gets the value of the searchThoroughfareByPostcodeDistrictResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListAddressThoroughfares }
     *     
     */
    public ListAddressThoroughfares getSearchThoroughfareByPostcodeDistrictResult() {
        return searchThoroughfareByPostcodeDistrictResult;
    }

    /**
     * Sets the value of the searchThoroughfareByPostcodeDistrictResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAddressThoroughfares }
     *     
     */
    public void setSearchThoroughfareByPostcodeDistrictResult(ListAddressThoroughfares value) {
        this.searchThoroughfareByPostcodeDistrictResult = value;
    }

}

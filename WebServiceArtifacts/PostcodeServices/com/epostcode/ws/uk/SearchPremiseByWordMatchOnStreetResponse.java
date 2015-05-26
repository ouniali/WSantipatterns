
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
 *         &lt;element name="SearchPremise_ByWordMatchOnStreetResult" type="{http://ws.epostcode.com/uk/}ListAddressPremises" minOccurs="0"/>
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
    "searchPremiseByWordMatchOnStreetResult"
})
@XmlRootElement(name = "SearchPremise_ByWordMatchOnStreetResponse")
public class SearchPremiseByWordMatchOnStreetResponse {

    @XmlElement(name = "SearchPremise_ByWordMatchOnStreetResult")
    protected ListAddressPremises searchPremiseByWordMatchOnStreetResult;

    /**
     * Gets the value of the searchPremiseByWordMatchOnStreetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListAddressPremises }
     *     
     */
    public ListAddressPremises getSearchPremiseByWordMatchOnStreetResult() {
        return searchPremiseByWordMatchOnStreetResult;
    }

    /**
     * Sets the value of the searchPremiseByWordMatchOnStreetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAddressPremises }
     *     
     */
    public void setSearchPremiseByWordMatchOnStreetResult(ListAddressPremises value) {
        this.searchPremiseByWordMatchOnStreetResult = value;
    }

}

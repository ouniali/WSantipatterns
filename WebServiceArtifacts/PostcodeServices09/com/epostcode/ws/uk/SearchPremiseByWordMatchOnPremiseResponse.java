
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
 *         &lt;element name="SearchPremise_ByWordMatchOnPremiseResult" type="{http://ws.epostcode.com/uk/}ListAddressPremises" minOccurs="0"/>
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
    "searchPremiseByWordMatchOnPremiseResult"
})
@XmlRootElement(name = "SearchPremise_ByWordMatchOnPremiseResponse")
public class SearchPremiseByWordMatchOnPremiseResponse {

    @XmlElement(name = "SearchPremise_ByWordMatchOnPremiseResult")
    protected ListAddressPremises searchPremiseByWordMatchOnPremiseResult;

    /**
     * Gets the value of the searchPremiseByWordMatchOnPremiseResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListAddressPremises }
     *     
     */
    public ListAddressPremises getSearchPremiseByWordMatchOnPremiseResult() {
        return searchPremiseByWordMatchOnPremiseResult;
    }

    /**
     * Sets the value of the searchPremiseByWordMatchOnPremiseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAddressPremises }
     *     
     */
    public void setSearchPremiseByWordMatchOnPremiseResult(ListAddressPremises value) {
        this.searchPremiseByWordMatchOnPremiseResult = value;
    }

}

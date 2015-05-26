
package com.familytreemaker.service.search;

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
 *         &lt;element name="GetProvidersResult" type="{urn:service.familytreemaker.com/Search}ArrayOfSearchProviderType" minOccurs="0"/>
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
    "getProvidersResult"
})
@XmlRootElement(name = "GetProvidersResponse")
public class GetProvidersResponse {

    @XmlElement(name = "GetProvidersResult")
    protected ArrayOfSearchProviderType getProvidersResult;

    /**
     * Gets the value of the getProvidersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchProviderType }
     *     
     */
    public ArrayOfSearchProviderType getGetProvidersResult() {
        return getProvidersResult;
    }

    /**
     * Sets the value of the getProvidersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchProviderType }
     *     
     */
    public void setGetProvidersResult(ArrayOfSearchProviderType value) {
        this.getProvidersResult = value;
    }

}

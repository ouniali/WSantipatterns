
package com.serviceobjects;

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
 *         &lt;element name="GetAllCountryCurrenciesResult" type="{http://www.serviceobjects.com/}ArrayOfCountryCurrencyResponse" minOccurs="0"/>
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
    "getAllCountryCurrenciesResult"
})
@XmlRootElement(name = "GetAllCountryCurrenciesResponse")
public class GetAllCountryCurrenciesResponse {

    @XmlElement(name = "GetAllCountryCurrenciesResult")
    protected ArrayOfCountryCurrencyResponse getAllCountryCurrenciesResult;

    /**
     * Gets the value of the getAllCountryCurrenciesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountryCurrencyResponse }
     *     
     */
    public ArrayOfCountryCurrencyResponse getGetAllCountryCurrenciesResult() {
        return getAllCountryCurrenciesResult;
    }

    /**
     * Sets the value of the getAllCountryCurrenciesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountryCurrencyResponse }
     *     
     */
    public void setGetAllCountryCurrenciesResult(ArrayOfCountryCurrencyResponse value) {
        this.getAllCountryCurrenciesResult = value;
    }

}

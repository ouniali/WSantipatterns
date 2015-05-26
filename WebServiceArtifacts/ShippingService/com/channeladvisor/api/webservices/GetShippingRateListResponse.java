
package com.channeladvisor.api.webservices;

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
 *         &lt;element name="GetShippingRateListResult" type="{http://api.channeladvisor.com/webservices/}APIResultOfShippingRateResult" minOccurs="0"/>
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
    "getShippingRateListResult"
})
@XmlRootElement(name = "GetShippingRateListResponse")
public class GetShippingRateListResponse {

    @XmlElement(name = "GetShippingRateListResult")
    protected APIResultOfShippingRateResult getShippingRateListResult;

    /**
     * Gets the value of the getShippingRateListResult property.
     * 
     * @return
     *     possible object is
     *     {@link APIResultOfShippingRateResult }
     *     
     */
    public APIResultOfShippingRateResult getGetShippingRateListResult() {
        return getShippingRateListResult;
    }

    /**
     * Sets the value of the getShippingRateListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIResultOfShippingRateResult }
     *     
     */
    public void setGetShippingRateListResult(APIResultOfShippingRateResult value) {
        this.getShippingRateListResult = value;
    }

}

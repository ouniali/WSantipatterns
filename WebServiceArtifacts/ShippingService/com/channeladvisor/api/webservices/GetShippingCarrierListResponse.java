
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
 *         &lt;element name="GetShippingCarrierListResult" type="{http://api.channeladvisor.com/webservices/}APIResultOfArrayOfShippingCarrier" minOccurs="0"/>
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
    "getShippingCarrierListResult"
})
@XmlRootElement(name = "GetShippingCarrierListResponse")
public class GetShippingCarrierListResponse {

    @XmlElement(name = "GetShippingCarrierListResult")
    protected APIResultOfArrayOfShippingCarrier getShippingCarrierListResult;

    /**
     * Gets the value of the getShippingCarrierListResult property.
     * 
     * @return
     *     possible object is
     *     {@link APIResultOfArrayOfShippingCarrier }
     *     
     */
    public APIResultOfArrayOfShippingCarrier getGetShippingCarrierListResult() {
        return getShippingCarrierListResult;
    }

    /**
     * Sets the value of the getShippingCarrierListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIResultOfArrayOfShippingCarrier }
     *     
     */
    public void setGetShippingCarrierListResult(APIResultOfArrayOfShippingCarrier value) {
        this.getShippingCarrierListResult = value;
    }

}

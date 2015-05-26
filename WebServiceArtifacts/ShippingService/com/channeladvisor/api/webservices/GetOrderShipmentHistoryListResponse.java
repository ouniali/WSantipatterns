
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
 *         &lt;element name="GetOrderShipmentHistoryListResult" type="{http://api.channeladvisor.com/webservices/}APIResultOfArrayOfOrderShipmentHistoryResponse" minOccurs="0"/>
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
    "getOrderShipmentHistoryListResult"
})
@XmlRootElement(name = "GetOrderShipmentHistoryListResponse")
public class GetOrderShipmentHistoryListResponse {

    @XmlElement(name = "GetOrderShipmentHistoryListResult")
    protected APIResultOfArrayOfOrderShipmentHistoryResponse getOrderShipmentHistoryListResult;

    /**
     * Gets the value of the getOrderShipmentHistoryListResult property.
     * 
     * @return
     *     possible object is
     *     {@link APIResultOfArrayOfOrderShipmentHistoryResponse }
     *     
     */
    public APIResultOfArrayOfOrderShipmentHistoryResponse getGetOrderShipmentHistoryListResult() {
        return getOrderShipmentHistoryListResult;
    }

    /**
     * Sets the value of the getOrderShipmentHistoryListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIResultOfArrayOfOrderShipmentHistoryResponse }
     *     
     */
    public void setGetOrderShipmentHistoryListResult(APIResultOfArrayOfOrderShipmentHistoryResponse value) {
        this.getOrderShipmentHistoryListResult = value;
    }

}


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
 *         &lt;element name="GetProductInfoListResult" type="{http://services.digikey.com/SearchWS}ArrayOfProductInfoListResult" minOccurs="0"/>
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
    "getProductInfoListResult"
})
@XmlRootElement(name = "GetProductInfoListResponse")
public class GetProductInfoListResponse {

    @XmlElement(name = "GetProductInfoListResult")
    protected ArrayOfProductInfoListResult getProductInfoListResult;

    /**
     * Gets the value of the getProductInfoListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductInfoListResult }
     *     
     */
    public ArrayOfProductInfoListResult getGetProductInfoListResult() {
        return getProductInfoListResult;
    }

    /**
     * Sets the value of the getProductInfoListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductInfoListResult }
     *     
     */
    public void setGetProductInfoListResult(ArrayOfProductInfoListResult value) {
        this.getProductInfoListResult = value;
    }

}

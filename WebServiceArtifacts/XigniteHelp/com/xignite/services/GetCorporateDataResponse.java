
package com.xignite.services;

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
 *         &lt;element name="GetCorporateDataResult" type="{http://www.xignite.com/services/}CorporateData" minOccurs="0"/>
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
    "getCorporateDataResult"
})
@XmlRootElement(name = "GetCorporateDataResponse")
public class GetCorporateDataResponse {

    @XmlElement(name = "GetCorporateDataResult")
    protected CorporateData getCorporateDataResult;

    /**
     * Gets the value of the getCorporateDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateData }
     *     
     */
    public CorporateData getGetCorporateDataResult() {
        return getCorporateDataResult;
    }

    /**
     * Sets the value of the getCorporateDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateData }
     *     
     */
    public void setGetCorporateDataResult(CorporateData value) {
        this.getCorporateDataResult = value;
    }

}

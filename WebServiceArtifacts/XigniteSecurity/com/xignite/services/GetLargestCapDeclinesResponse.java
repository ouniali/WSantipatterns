
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
 *         &lt;element name="GetLargestCapDeclinesResult" type="{http://www.xignite.com/services/}StockGrowthVariations" minOccurs="0"/>
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
    "getLargestCapDeclinesResult"
})
@XmlRootElement(name = "GetLargestCapDeclinesResponse")
public class GetLargestCapDeclinesResponse {

    @XmlElement(name = "GetLargestCapDeclinesResult")
    protected StockGrowthVariations getLargestCapDeclinesResult;

    /**
     * Gets the value of the getLargestCapDeclinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link StockGrowthVariations }
     *     
     */
    public StockGrowthVariations getGetLargestCapDeclinesResult() {
        return getLargestCapDeclinesResult;
    }

    /**
     * Sets the value of the getLargestCapDeclinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockGrowthVariations }
     *     
     */
    public void setGetLargestCapDeclinesResult(StockGrowthVariations value) {
        this.getLargestCapDeclinesResult = value;
    }

}

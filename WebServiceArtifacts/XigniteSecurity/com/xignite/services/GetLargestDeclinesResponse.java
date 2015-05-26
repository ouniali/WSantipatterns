
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
 *         &lt;element name="GetLargestDeclinesResult" type="{http://www.xignite.com/services/}StockGrowthVariations" minOccurs="0"/>
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
    "getLargestDeclinesResult"
})
@XmlRootElement(name = "GetLargestDeclinesResponse")
public class GetLargestDeclinesResponse {

    @XmlElement(name = "GetLargestDeclinesResult")
    protected StockGrowthVariations getLargestDeclinesResult;

    /**
     * Gets the value of the getLargestDeclinesResult property.
     * 
     * @return
     *     possible object is
     *     {@link StockGrowthVariations }
     *     
     */
    public StockGrowthVariations getGetLargestDeclinesResult() {
        return getLargestDeclinesResult;
    }

    /**
     * Sets the value of the getLargestDeclinesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockGrowthVariations }
     *     
     */
    public void setGetLargestDeclinesResult(StockGrowthVariations value) {
        this.getLargestDeclinesResult = value;
    }

}

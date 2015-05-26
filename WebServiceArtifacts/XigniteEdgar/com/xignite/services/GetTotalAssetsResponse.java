
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
 *         &lt;element name="GetTotalAssetsResult" type="{http://www.xignite.com/services/}TotalAssets" minOccurs="0"/>
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
    "getTotalAssetsResult"
})
@XmlRootElement(name = "GetTotalAssetsResponse")
public class GetTotalAssetsResponse {

    @XmlElement(name = "GetTotalAssetsResult")
    protected TotalAssets getTotalAssetsResult;

    /**
     * Gets the value of the getTotalAssetsResult property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAssets }
     *     
     */
    public TotalAssets getGetTotalAssetsResult() {
        return getTotalAssetsResult;
    }

    /**
     * Sets the value of the getTotalAssetsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAssets }
     *     
     */
    public void setGetTotalAssetsResult(TotalAssets value) {
        this.getTotalAssetsResult = value;
    }

}


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
 *         &lt;element name="GetSplitHistoryResult" type="{http://www.xignite.com/services/}SplitHistory" minOccurs="0"/>
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
    "getSplitHistoryResult"
})
@XmlRootElement(name = "GetSplitHistoryResponse")
public class GetSplitHistoryResponse {

    @XmlElement(name = "GetSplitHistoryResult")
    protected SplitHistory getSplitHistoryResult;

    /**
     * Gets the value of the getSplitHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link SplitHistory }
     *     
     */
    public SplitHistory getGetSplitHistoryResult() {
        return getSplitHistoryResult;
    }

    /**
     * Sets the value of the getSplitHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitHistory }
     *     
     */
    public void setGetSplitHistoryResult(SplitHistory value) {
        this.getSplitHistoryResult = value;
    }

}

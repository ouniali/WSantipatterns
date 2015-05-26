
package com.avalara.avatax.services;

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
 *         &lt;element name="PostTaxResult" type="{http://avatax.avalara.com/services}PostTaxResult" minOccurs="0"/>
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
    "postTaxResult"
})
@XmlRootElement(name = "PostTaxResponse")
public class PostTaxResponse {

    @XmlElement(name = "PostTaxResult")
    protected PostTaxResult postTaxResult;

    /**
     * Gets the value of the postTaxResult property.
     * 
     * @return
     *     possible object is
     *     {@link PostTaxResult }
     *     
     */
    public PostTaxResult getPostTaxResult() {
        return postTaxResult;
    }

    /**
     * Sets the value of the postTaxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostTaxResult }
     *     
     */
    public void setPostTaxResult(PostTaxResult value) {
        this.postTaxResult = value;
    }

}


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
 *         &lt;element name="PostTaxRequest" type="{http://avatax.avalara.com/services}PostTaxRequest" minOccurs="0"/>
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
    "postTaxRequest"
})
@XmlRootElement(name = "PostTax")
public class PostTax {

    @XmlElement(name = "PostTaxRequest")
    protected PostTaxRequest postTaxRequest;

    /**
     * Gets the value of the postTaxRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PostTaxRequest }
     *     
     */
    public PostTaxRequest getPostTaxRequest() {
        return postTaxRequest;
    }

    /**
     * Sets the value of the postTaxRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostTaxRequest }
     *     
     */
    public void setPostTaxRequest(PostTaxRequest value) {
        this.postTaxRequest = value;
    }

}

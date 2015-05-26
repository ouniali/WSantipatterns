
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
 *         &lt;element name="GetIssuerAttributeChangesAllResult" type="{http://www.xignite.com/services/}ArrayOfIssuerAttributeChange" minOccurs="0"/>
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
    "getIssuerAttributeChangesAllResult"
})
@XmlRootElement(name = "GetIssuerAttributeChangesAllResponse")
public class GetIssuerAttributeChangesAllResponse {

    @XmlElement(name = "GetIssuerAttributeChangesAllResult")
    protected ArrayOfIssuerAttributeChange getIssuerAttributeChangesAllResult;

    /**
     * Gets the value of the getIssuerAttributeChangesAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIssuerAttributeChange }
     *     
     */
    public ArrayOfIssuerAttributeChange getGetIssuerAttributeChangesAllResult() {
        return getIssuerAttributeChangesAllResult;
    }

    /**
     * Sets the value of the getIssuerAttributeChangesAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIssuerAttributeChange }
     *     
     */
    public void setGetIssuerAttributeChangesAllResult(ArrayOfIssuerAttributeChange value) {
        this.getIssuerAttributeChangesAllResult = value;
    }

}

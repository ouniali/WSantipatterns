
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
 *         &lt;element name="GetUnitOfAccountResult" type="{http://www.xignite.com/services/}UnitOfAccount" minOccurs="0"/>
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
    "getUnitOfAccountResult"
})
@XmlRootElement(name = "GetUnitOfAccountResponse")
public class GetUnitOfAccountResponse {

    @XmlElement(name = "GetUnitOfAccountResult")
    protected UnitOfAccount getUnitOfAccountResult;

    /**
     * Gets the value of the getUnitOfAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfAccount }
     *     
     */
    public UnitOfAccount getGetUnitOfAccountResult() {
        return getUnitOfAccountResult;
    }

    /**
     * Sets the value of the getUnitOfAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfAccount }
     *     
     */
    public void setGetUnitOfAccountResult(UnitOfAccount value) {
        this.getUnitOfAccountResult = value;
    }

}

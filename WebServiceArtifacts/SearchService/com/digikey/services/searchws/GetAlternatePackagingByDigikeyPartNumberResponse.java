
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
 *         &lt;element name="GetAlternatePackagingByDigikeyPartNumberResult" type="{http://services.digikey.com/SearchWS}AlternatePackagingOptions" minOccurs="0"/>
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
    "getAlternatePackagingByDigikeyPartNumberResult"
})
@XmlRootElement(name = "GetAlternatePackagingByDigikeyPartNumberResponse")
public class GetAlternatePackagingByDigikeyPartNumberResponse {

    @XmlElement(name = "GetAlternatePackagingByDigikeyPartNumberResult")
    protected AlternatePackagingOptions getAlternatePackagingByDigikeyPartNumberResult;

    /**
     * Gets the value of the getAlternatePackagingByDigikeyPartNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePackagingOptions }
     *     
     */
    public AlternatePackagingOptions getGetAlternatePackagingByDigikeyPartNumberResult() {
        return getAlternatePackagingByDigikeyPartNumberResult;
    }

    /**
     * Sets the value of the getAlternatePackagingByDigikeyPartNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePackagingOptions }
     *     
     */
    public void setGetAlternatePackagingByDigikeyPartNumberResult(AlternatePackagingOptions value) {
        this.getAlternatePackagingByDigikeyPartNumberResult = value;
    }

}

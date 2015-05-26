
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
 *         &lt;element name="GetReleaseContentResult" type="{http://www.xignite.com/services/}Release" minOccurs="0"/>
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
    "getReleaseContentResult"
})
@XmlRootElement(name = "GetReleaseContentResponse")
public class GetReleaseContentResponse {

    @XmlElement(name = "GetReleaseContentResult")
    protected Release getReleaseContentResult;

    /**
     * Gets the value of the getReleaseContentResult property.
     * 
     * @return
     *     possible object is
     *     {@link Release }
     *     
     */
    public Release getGetReleaseContentResult() {
        return getReleaseContentResult;
    }

    /**
     * Sets the value of the getReleaseContentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Release }
     *     
     */
    public void setGetReleaseContentResult(Release value) {
        this.getReleaseContentResult = value;
    }

}

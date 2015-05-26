
package com.serviceobjects;

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
 *         &lt;element name="GetWMOIDByCityResult" type="{http://www.serviceobjects.com/}WMOIDInfo" minOccurs="0"/>
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
    "getWMOIDByCityResult"
})
@XmlRootElement(name = "GetWMOIDByCityResponse")
public class GetWMOIDByCityResponse {

    @XmlElement(name = "GetWMOIDByCityResult")
    protected WMOIDInfo getWMOIDByCityResult;

    /**
     * Gets the value of the getWMOIDByCityResult property.
     * 
     * @return
     *     possible object is
     *     {@link WMOIDInfo }
     *     
     */
    public WMOIDInfo getGetWMOIDByCityResult() {
        return getWMOIDByCityResult;
    }

    /**
     * Sets the value of the getWMOIDByCityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WMOIDInfo }
     *     
     */
    public void setGetWMOIDByCityResult(WMOIDInfo value) {
        this.getWMOIDByCityResult = value;
    }

}

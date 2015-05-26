
package com.conducivetech.cache.delayindex.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestRegion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.delayindex.cache.conducivetech.com/}requestFiltered">
 *       &lt;sequence>
 *         &lt;element name="region" type="{http://v1.service.delayindex.cache.conducivetech.com/}requestedEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestRegion", propOrder = {
    "region"
})
public class RequestRegion
    extends RequestFiltered
{

    protected RequestedEnum region;

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedEnum }
     *     
     */
    public RequestedEnum getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedEnum }
     *     
     */
    public void setRegion(RequestedEnum value) {
        this.region = value;
    }

}


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
 *         &lt;element name="MapSecurityDetailsResult" type="{http://www.xignite.com/services/}ArrayOfRecord" minOccurs="0"/>
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
    "mapSecurityDetailsResult"
})
@XmlRootElement(name = "MapSecurityDetailsResponse")
public class MapSecurityDetailsResponse {

    @XmlElement(name = "MapSecurityDetailsResult")
    protected ArrayOfRecord mapSecurityDetailsResult;

    /**
     * Gets the value of the mapSecurityDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecord }
     *     
     */
    public ArrayOfRecord getMapSecurityDetailsResult() {
        return mapSecurityDetailsResult;
    }

    /**
     * Sets the value of the mapSecurityDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecord }
     *     
     */
    public void setMapSecurityDetailsResult(ArrayOfRecord value) {
        this.mapSecurityDetailsResult = value;
    }

}

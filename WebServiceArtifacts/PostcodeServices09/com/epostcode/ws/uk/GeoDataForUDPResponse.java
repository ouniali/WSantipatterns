
package com.epostcode.ws.uk;

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
 *         &lt;element name="GeoData_ForUDPResult" type="{http://ws.epostcode.com/uk/}Geographic" minOccurs="0"/>
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
    "geoDataForUDPResult"
})
@XmlRootElement(name = "GeoData_ForUDPResponse")
public class GeoDataForUDPResponse {

    @XmlElement(name = "GeoData_ForUDPResult")
    protected Geographic geoDataForUDPResult;

    /**
     * Gets the value of the geoDataForUDPResult property.
     * 
     * @return
     *     possible object is
     *     {@link Geographic }
     *     
     */
    public Geographic getGeoDataForUDPResult() {
        return geoDataForUDPResult;
    }

    /**
     * Sets the value of the geoDataForUDPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geographic }
     *     
     */
    public void setGeoDataForUDPResult(Geographic value) {
        this.geoDataForUDPResult = value;
    }

}

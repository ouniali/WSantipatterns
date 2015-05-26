
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
 *         &lt;element name="CoordinateData_ForUDPResult" type="{http://ws.epostcode.com/uk/}Geographic" minOccurs="0"/>
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
    "coordinateDataForUDPResult"
})
@XmlRootElement(name = "CoordinateData_ForUDPResponse")
public class CoordinateDataForUDPResponse {

    @XmlElement(name = "CoordinateData_ForUDPResult")
    protected Geographic coordinateDataForUDPResult;

    /**
     * Gets the value of the coordinateDataForUDPResult property.
     * 
     * @return
     *     possible object is
     *     {@link Geographic }
     *     
     */
    public Geographic getCoordinateDataForUDPResult() {
        return coordinateDataForUDPResult;
    }

    /**
     * Sets the value of the coordinateDataForUDPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geographic }
     *     
     */
    public void setCoordinateDataForUDPResult(Geographic value) {
        this.coordinateDataForUDPResult = value;
    }

}

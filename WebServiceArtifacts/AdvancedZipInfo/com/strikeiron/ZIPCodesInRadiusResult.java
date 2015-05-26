
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZIPCodesInRadiusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZIPCodesInRadiusResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZIPCodes" type="{http://www.strikeiron.com}ArrayOfZIPDistanceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZIPCodesInRadiusResult", propOrder = {
    "zipCodes"
})
public class ZIPCodesInRadiusResult {

    @XmlElement(name = "ZIPCodes")
    protected ArrayOfZIPDistanceInfo zipCodes;

    /**
     * Gets the value of the zipCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfZIPDistanceInfo }
     *     
     */
    public ArrayOfZIPDistanceInfo getZIPCodes() {
        return zipCodes;
    }

    /**
     * Sets the value of the zipCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfZIPDistanceInfo }
     *     
     */
    public void setZIPCodes(ArrayOfZIPDistanceInfo value) {
        this.zipCodes = value;
    }

}

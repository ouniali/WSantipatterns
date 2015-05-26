
package com.strikeiron;

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
 *         &lt;element name="ZIPOrPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RadiusMiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "zipOrPostalCode",
    "radiusMiles"
})
@XmlRootElement(name = "ZIPCodesInRadius")
public class ZIPCodesInRadius {

    @XmlElement(name = "ZIPOrPostalCode")
    protected String zipOrPostalCode;
    @XmlElement(name = "RadiusMiles")
    protected int radiusMiles;

    /**
     * Gets the value of the zipOrPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPOrPostalCode() {
        return zipOrPostalCode;
    }

    /**
     * Sets the value of the zipOrPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPOrPostalCode(String value) {
        this.zipOrPostalCode = value;
    }

    /**
     * Gets the value of the radiusMiles property.
     * 
     */
    public int getRadiusMiles() {
        return radiusMiles;
    }

    /**
     * Sets the value of the radiusMiles property.
     * 
     */
    public void setRadiusMiles(int value) {
        this.radiusMiles = value;
    }

}

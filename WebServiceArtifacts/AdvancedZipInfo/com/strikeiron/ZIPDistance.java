
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
 *         &lt;element name="ZIPOrPostalCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZIPOrPostalCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "zipOrPostalCode1",
    "zipOrPostalCode2"
})
@XmlRootElement(name = "ZIPDistance")
public class ZIPDistance {

    @XmlElement(name = "ZIPOrPostalCode1")
    protected String zipOrPostalCode1;
    @XmlElement(name = "ZIPOrPostalCode2")
    protected String zipOrPostalCode2;

    /**
     * Gets the value of the zipOrPostalCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPOrPostalCode1() {
        return zipOrPostalCode1;
    }

    /**
     * Sets the value of the zipOrPostalCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPOrPostalCode1(String value) {
        this.zipOrPostalCode1 = value;
    }

    /**
     * Gets the value of the zipOrPostalCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPOrPostalCode2() {
        return zipOrPostalCode2;
    }

    /**
     * Sets the value of the zipOrPostalCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPOrPostalCode2(String value) {
        this.zipOrPostalCode2 = value;
    }

}

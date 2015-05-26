
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZIPDistanceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZIPDistanceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZIP1" type="{http://www.strikeiron.com}BasicZIPInfo" minOccurs="0"/>
 *         &lt;element name="ZIP2" type="{http://www.strikeiron.com}BasicZIPInfo" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZIPDistanceResult", propOrder = {
    "zip1",
    "zip2",
    "distance"
})
public class ZIPDistanceResult {

    @XmlElement(name = "ZIP1")
    protected BasicZIPInfo zip1;
    @XmlElement(name = "ZIP2")
    protected BasicZIPInfo zip2;
    @XmlElement(name = "Distance")
    protected String distance;

    /**
     * Gets the value of the zip1 property.
     * 
     * @return
     *     possible object is
     *     {@link BasicZIPInfo }
     *     
     */
    public BasicZIPInfo getZIP1() {
        return zip1;
    }

    /**
     * Sets the value of the zip1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicZIPInfo }
     *     
     */
    public void setZIP1(BasicZIPInfo value) {
        this.zip1 = value;
    }

    /**
     * Gets the value of the zip2 property.
     * 
     * @return
     *     possible object is
     *     {@link BasicZIPInfo }
     *     
     */
    public BasicZIPInfo getZIP2() {
        return zip2;
    }

    /**
     * Sets the value of the zip2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicZIPInfo }
     *     
     */
    public void setZIP2(BasicZIPInfo value) {
        this.zip2 = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

}


package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmendInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResGroup" type="{http://schemas.tourico.com/webservices/hotelv3}ResGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendInfo", propOrder = {
    "resGroup"
})
public class AmendInfo {

    @XmlElement(name = "ResGroup")
    protected ResGroupType resGroup;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the resGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ResGroupType }
     *     
     */
    public ResGroupType getResGroup() {
        return resGroup;
    }

    /**
     * Sets the value of the resGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResGroupType }
     *     
     */
    public void setResGroup(ResGroupType value) {
        this.resGroup = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}

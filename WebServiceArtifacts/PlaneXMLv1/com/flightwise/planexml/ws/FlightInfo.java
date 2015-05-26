
package com.flightwise.planexml.ws;

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
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeDetails" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeDynamicInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "ident",
    "includeDetails",
    "includeDynamicInfo"
})
@XmlRootElement(name = "FlightInfo")
public class FlightInfo {

    protected String ident;
    @XmlElement(name = "IncludeDetails")
    protected boolean includeDetails;
    @XmlElement(name = "IncludeDynamicInfo")
    protected boolean includeDynamicInfo;

    /**
     * Gets the value of the ident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the value of the includeDetails property.
     * 
     */
    public boolean isIncludeDetails() {
        return includeDetails;
    }

    /**
     * Sets the value of the includeDetails property.
     * 
     */
    public void setIncludeDetails(boolean value) {
        this.includeDetails = value;
    }

    /**
     * Gets the value of the includeDynamicInfo property.
     * 
     */
    public boolean isIncludeDynamicInfo() {
        return includeDynamicInfo;
    }

    /**
     * Sets the value of the includeDynamicInfo property.
     * 
     */
    public void setIncludeDynamicInfo(boolean value) {
        this.includeDynamicInfo = value;
    }

}

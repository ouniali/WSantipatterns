
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareStatusFailureInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" use="required" type="{http://www.travelport.com/schema/air_v18_0}typeFareStatusCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareStatusFailureInfo"
})
@XmlRootElement(name = "FareStatus")
public class FareStatus {

    @XmlElement(name = "FareStatusFailureInfo")
    protected FareStatusFailureInfo fareStatusFailureInfo;
    @XmlAttribute(name = "Code", required = true)
    protected TypeFareStatusCode code;

    /**
     * Gets the value of the fareStatusFailureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareStatusFailureInfo }
     *     
     */
    public FareStatusFailureInfo getFareStatusFailureInfo() {
        return fareStatusFailureInfo;
    }

    /**
     * Sets the value of the fareStatusFailureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareStatusFailureInfo }
     *     
     */
    public void setFareStatusFailureInfo(FareStatusFailureInfo value) {
        this.fareStatusFailureInfo = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareStatusCode }
     *     
     */
    public TypeFareStatusCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareStatusCode }
     *     
     */
    public void setCode(TypeFareStatusCode value) {
        this.code = value;
    }

}

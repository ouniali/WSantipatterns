
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
 *         &lt;element name="PenaltyInfo" type="{http://www.travelport.com/schema/air_v18_0}typeFarePenalty" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ProhibitPenaltyFares" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "penaltyInfo"
})
@XmlRootElement(name = "PenaltyFareInformation")
public class PenaltyFareInformation {

    @XmlElement(name = "PenaltyInfo")
    protected TypeFarePenalty penaltyInfo;
    @XmlAttribute(name = "ProhibitPenaltyFares", required = true)
    protected boolean prohibitPenaltyFares;

    /**
     * Gets the value of the penaltyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFarePenalty }
     *     
     */
    public TypeFarePenalty getPenaltyInfo() {
        return penaltyInfo;
    }

    /**
     * Sets the value of the penaltyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFarePenalty }
     *     
     */
    public void setPenaltyInfo(TypeFarePenalty value) {
        this.penaltyInfo = value;
    }

    /**
     * Gets the value of the prohibitPenaltyFares property.
     * 
     */
    public boolean isProhibitPenaltyFares() {
        return prohibitPenaltyFares;
    }

    /**
     * Sets the value of the prohibitPenaltyFares property.
     * 
     */
    public void setProhibitPenaltyFares(boolean value) {
        this.prohibitPenaltyFares = value;
    }

}

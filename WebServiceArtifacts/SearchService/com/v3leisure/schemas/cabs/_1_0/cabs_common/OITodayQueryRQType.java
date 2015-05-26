
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OI_TodayQueryRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OI_TodayQueryRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="status" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}OI_StatusEnumType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OI_TodayQueryRQType")
public class OITodayQueryRQType {

    @XmlAttribute(name = "status", required = true)
    protected OIStatusEnumType status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OIStatusEnumType }
     *     
     */
    public OIStatusEnumType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OIStatusEnumType }
     *     
     */
    public void setStatus(OIStatusEnumType value) {
        this.status = value;
    }

}


package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_IntegrationTypeRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC_IntegrationTypeRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IntegrationModeEnumType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_IntegrationTypeRQType")
public class SCIntegrationTypeRQType {

    @XmlAttribute(name = "type", required = true)
    protected COIntegrationModeEnumType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link COIntegrationModeEnumType }
     *     
     */
    public COIntegrationModeEnumType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link COIntegrationModeEnumType }
     *     
     */
    public void setType(COIntegrationModeEnumType value) {
        this.type = value;
    }

}

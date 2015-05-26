
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_ProductTypeRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC_ProductTypeRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_AvailReqType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_ProductTypeRQType")
public class SCProductTypeRQType {

    @XmlAttribute(name = "type", required = true)
    protected COAvailReqType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link COAvailReqType }
     *     
     */
    public COAvailReqType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link COAvailReqType }
     *     
     */
    public void setType(COAvailReqType value) {
        this.type = value;
    }

}

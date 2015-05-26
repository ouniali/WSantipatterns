
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_IndustryCategoryRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC_IndustryCategoryRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="category" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IndustryCategoryEnumType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_IndustryCategoryRQType")
public class SCIndustryCategoryRQType {

    @XmlAttribute(name = "category", required = true)
    protected COIndustryCategoryEnumType category;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link COIndustryCategoryEnumType }
     *     
     */
    public COIndustryCategoryEnumType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link COIndustryCategoryEnumType }
     *     
     */
    public void setCategory(COIndustryCategoryEnumType value) {
        this.category = value;
    }

}

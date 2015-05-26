
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_IndustryCategoryGroupRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC_IndustryCategoryGroupRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="category" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IndustryCategoryGroupEnumType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_IndustryCategoryGroupRQType")
public class SCIndustryCategoryGroupRQType {

    @XmlAttribute(name = "category", required = true)
    protected COIndustryCategoryGroupEnumType category;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link COIndustryCategoryGroupEnumType }
     *     
     */
    public COIndustryCategoryGroupEnumType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link COIndustryCategoryGroupEnumType }
     *     
     */
    public void setCategory(COIndustryCategoryGroupEnumType value) {
        this.category = value;
    }

}


package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="OptionalServiceRef" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "GroupedOption")
public class GroupedOption {

    @XmlAttribute(name = "OptionalServiceRef", required = true)
    protected String optionalServiceRef;

    /**
     * Gets the value of the optionalServiceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalServiceRef() {
        return optionalServiceRef;
    }

    /**
     * Sets the value of the optionalServiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalServiceRef(String value) {
        this.optionalServiceRef = value;
    }

}

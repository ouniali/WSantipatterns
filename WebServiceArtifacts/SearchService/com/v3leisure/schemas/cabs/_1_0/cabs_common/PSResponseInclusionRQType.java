
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PS_ResponseInclusionRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PS_ResponseInclusionRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="include" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PS_ResponseInclusionRQType")
public class PSResponseInclusionRQType {

    @XmlAttribute(name = "include", required = true)
    protected boolean include;

    /**
     * Gets the value of the include property.
     * 
     */
    public boolean isInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     */
    public void setInclude(boolean value) {
        this.include = value;
    }

}

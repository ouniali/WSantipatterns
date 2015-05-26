
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * ProfileEntityID and ProfileLevel together identity a profile entity.
 * 
 * <p>Java class for typeProfileRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeProfileRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ProfileEntityID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProfileLevel" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeProfileLevel" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeProfileRef")
public class TypeProfileRef {

    @XmlAttribute(name = "ProfileEntityID", required = true)
    protected String profileEntityID;
    @XmlAttribute(name = "ProfileLevel", required = true)
    protected TypeProfileLevel profileLevel;

    /**
     * Gets the value of the profileEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileEntityID() {
        return profileEntityID;
    }

    /**
     * Sets the value of the profileEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileEntityID(String value) {
        this.profileEntityID = value;
    }

    /**
     * Gets the value of the profileLevel property.
     * 
     * @return
     *     possible object is
     *     {@link TypeProfileLevel }
     *     
     */
    public TypeProfileLevel getProfileLevel() {
        return profileLevel;
    }

    /**
     * Sets the value of the profileLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProfileLevel }
     *     
     */
    public void setProfileLevel(TypeProfileLevel value) {
        this.profileLevel = value;
    }

}

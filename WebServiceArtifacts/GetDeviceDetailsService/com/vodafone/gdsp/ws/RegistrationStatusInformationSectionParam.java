
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrationStatusInformationSectionParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrationStatusInformationSectionParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sectionParamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectionParamValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrationStatusInformationSectionParam", propOrder = {
    "sectionParamName",
    "sectionParamValue"
})
public class RegistrationStatusInformationSectionParam {

    protected String sectionParamName;
    protected String sectionParamValue;

    /**
     * Gets the value of the sectionParamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionParamName() {
        return sectionParamName;
    }

    /**
     * Sets the value of the sectionParamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionParamName(String value) {
        this.sectionParamName = value;
    }

    /**
     * Gets the value of the sectionParamValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionParamValue() {
        return sectionParamValue;
    }

    /**
     * Sets the value of the sectionParamValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionParamValue(String value) {
        this.sectionParamValue = value;
    }

}

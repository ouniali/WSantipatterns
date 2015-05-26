
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrationStatusInformationSection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrationStatusInformationSection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectionParam" type="{http://ws.gdsp.vodafone.com/}registrationStatusInformationSectionParam" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrationStatusInformationSection", propOrder = {
    "sectionName",
    "sectionParam"
})
public class RegistrationStatusInformationSection {

    protected String sectionName;
    @XmlElement(nillable = true)
    protected List<RegistrationStatusInformationSectionParam> sectionParam;

    /**
     * Gets the value of the sectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * Sets the value of the sectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionName(String value) {
        this.sectionName = value;
    }

    /**
     * Gets the value of the sectionParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationStatusInformationSectionParam }
     * 
     * 
     */
    public List<RegistrationStatusInformationSectionParam> getSectionParam() {
        if (sectionParam == null) {
            sectionParam = new ArrayList<RegistrationStatusInformationSectionParam>();
        }
        return this.sectionParam;
    }

}

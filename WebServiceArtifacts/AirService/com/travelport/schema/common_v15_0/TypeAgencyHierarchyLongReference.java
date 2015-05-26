
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAgencyHierarchyLongReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeAgencyHierarchyLongReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}typeAgencyHierarchyReference">
 *       &lt;attribute name="ProfileVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ProfileName" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="102"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeAgencyHierarchyLongReference")
public class TypeAgencyHierarchyLongReference
    extends TypeAgencyHierarchyReference
{

    @XmlAttribute(name = "ProfileVersion", required = true)
    protected int profileVersion;
    @XmlAttribute(name = "ProfileName", required = true)
    protected String profileName;

    /**
     * Gets the value of the profileVersion property.
     * 
     */
    public int getProfileVersion() {
        return profileVersion;
    }

    /**
     * Sets the value of the profileVersion property.
     * 
     */
    public void setProfileVersion(int value) {
        this.profileVersion = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

}

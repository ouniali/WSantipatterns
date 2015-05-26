
package com.travelport.schema.universal_v16_0;

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
 *     &lt;extension base="{http://www.travelport.com/schema/universal_v16_0}BaseSearchModifiers">
 *       &lt;attribute name="SavedTripName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExcludeURAssociated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SavedTripSearchModifiers")
public class SavedTripSearchModifiers
    extends BaseSearchModifiers
{

    @XmlAttribute(name = "SavedTripName")
    protected String savedTripName;
    @XmlAttribute(name = "ExcludeURAssociated")
    protected Boolean excludeURAssociated;

    /**
     * Gets the value of the savedTripName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedTripName() {
        return savedTripName;
    }

    /**
     * Sets the value of the savedTripName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedTripName(String value) {
        this.savedTripName = value;
    }

    /**
     * Gets the value of the excludeURAssociated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeURAssociated() {
        if (excludeURAssociated == null) {
            return true;
        } else {
            return excludeURAssociated;
        }
    }

    /**
     * Sets the value of the excludeURAssociated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeURAssociated(Boolean value) {
        this.excludeURAssociated = value;
    }

}

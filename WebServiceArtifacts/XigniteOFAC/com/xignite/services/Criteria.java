
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Criteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Criteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="CriteriaType" type="{http://www.xignite.com/services/}CriteriaTypes"/>
 *         &lt;element name="Values" type="{http://www.xignite.com/services/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Criteria", propOrder = {
    "criteriaType",
    "values"
})
public class Criteria
    extends Common
{

    @XmlElement(name = "CriteriaType", required = true)
    @XmlSchemaType(name = "string")
    protected CriteriaTypes criteriaType;
    @XmlElement(name = "Values")
    protected ArrayOfString values;

    /**
     * Gets the value of the criteriaType property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaTypes }
     *     
     */
    public CriteriaTypes getCriteriaType() {
        return criteriaType;
    }

    /**
     * Sets the value of the criteriaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaTypes }
     *     
     */
    public void setCriteriaType(CriteriaTypes value) {
        this.criteriaType = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setValues(ArrayOfString value) {
        this.values = value;
    }

}

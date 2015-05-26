
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PossibleValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PossibleValues">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceObj">
 *       &lt;sequence>
 *         &lt;element name="PossibleValuesOf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Values" type="{http://www.xignite.com/services/}ArrayOfPossibleValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PossibleValues", propOrder = {
    "possibleValuesOf",
    "values"
})
public class PossibleValues
    extends AbstractPublicWebServiceObj
{

    @XmlElement(name = "PossibleValuesOf")
    protected String possibleValuesOf;
    @XmlElement(name = "Values")
    protected ArrayOfPossibleValue values;

    /**
     * Gets the value of the possibleValuesOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPossibleValuesOf() {
        return possibleValuesOf;
    }

    /**
     * Sets the value of the possibleValuesOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPossibleValuesOf(String value) {
        this.possibleValuesOf = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPossibleValue }
     *     
     */
    public ArrayOfPossibleValue getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPossibleValue }
     *     
     */
    public void setValues(ArrayOfPossibleValue value) {
        this.values = value;
    }

}


package org.cuahsi.waterml._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariablesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariablesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variables" type="{http://www.cuahsi.org/waterML/1.0/}ArrayOfVariableInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariablesResponseType", propOrder = {
    "variables"
})
public class VariablesResponseType {

    protected ArrayOfVariableInfoType variables;

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVariableInfoType }
     *     
     */
    public ArrayOfVariableInfoType getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVariableInfoType }
     *     
     */
    public void setVariables(ArrayOfVariableInfoType value) {
        this.variables = value;
    }

}

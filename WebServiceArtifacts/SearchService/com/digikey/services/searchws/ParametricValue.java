
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParametricValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParametricValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParameterID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ValueID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametricValue", propOrder = {
    "parameterID",
    "valueID"
})
public class ParametricValue {

    @XmlElement(name = "ParameterID")
    protected int parameterID;
    @XmlElement(name = "ValueID")
    protected int valueID;

    /**
     * Gets the value of the parameterID property.
     * 
     */
    public int getParameterID() {
        return parameterID;
    }

    /**
     * Sets the value of the parameterID property.
     * 
     */
    public void setParameterID(int value) {
        this.parameterID = value;
    }

    /**
     * Gets the value of the valueID property.
     * 
     */
    public int getValueID() {
        return valueID;
    }

    /**
     * Sets the value of the valueID property.
     * 
     */
    public void setValueID(int value) {
        this.valueID = value;
    }

}

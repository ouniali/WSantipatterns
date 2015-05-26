
package com.digikey.services.searchws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfParametricValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfParametricValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParametricValue" type="{http://services.digikey.com/SearchWS}ParametricValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfParametricValue", propOrder = {
    "parametricValue"
})
public class ArrayOfParametricValue {

    @XmlElement(name = "ParametricValue", nillable = true)
    protected List<ParametricValue> parametricValue;

    /**
     * Gets the value of the parametricValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametricValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametricValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametricValue }
     * 
     * 
     */
    public List<ParametricValue> getParametricValue() {
        if (parametricValue == null) {
            parametricValue = new ArrayList<ParametricValue>();
        }
        return this.parametricValue;
    }

}

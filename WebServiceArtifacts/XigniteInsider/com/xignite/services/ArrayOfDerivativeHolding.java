
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDerivativeHolding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDerivativeHolding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="derivativeHolding" type="{http://www.xignite.com/services/}derivativeHolding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDerivativeHolding", propOrder = {
    "derivativeHolding"
})
public class ArrayOfDerivativeHolding {

    @XmlElement(nillable = true)
    protected List<DerivativeHolding> derivativeHolding;

    /**
     * Gets the value of the derivativeHolding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivativeHolding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivativeHolding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivativeHolding }
     * 
     * 
     */
    public List<DerivativeHolding> getDerivativeHolding() {
        if (derivativeHolding == null) {
            derivativeHolding = new ArrayList<DerivativeHolding>();
        }
        return this.derivativeHolding;
    }

}


package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDerivativeTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDerivativeTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="derivativeTable" type="{http://www.xignite.com/services/}derivativeTable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDerivativeTable", propOrder = {
    "derivativeTable"
})
public class ArrayOfDerivativeTable {

    @XmlElement(nillable = true)
    protected List<DerivativeTable> derivativeTable;

    /**
     * Gets the value of the derivativeTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivativeTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivativeTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivativeTable }
     * 
     * 
     */
    public List<DerivativeTable> getDerivativeTable() {
        if (derivativeTable == null) {
            derivativeTable = new ArrayList<DerivativeTable>();
        }
        return this.derivativeTable;
    }

}

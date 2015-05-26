
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCompleteDividend complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCompleteDividend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompleteDividend" type="{http://www.xignite.com/services/}CompleteDividend" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCompleteDividend", propOrder = {
    "completeDividend"
})
public class ArrayOfCompleteDividend {

    @XmlElement(name = "CompleteDividend", nillable = true)
    protected List<CompleteDividend> completeDividend;

    /**
     * Gets the value of the completeDividend property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the completeDividend property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompleteDividend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompleteDividend }
     * 
     * 
     */
    public List<CompleteDividend> getCompleteDividend() {
        if (completeDividend == null) {
            completeDividend = new ArrayList<CompleteDividend>();
        }
        return this.completeDividend;
    }

}

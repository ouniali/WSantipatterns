
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCIKLookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCIKLookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIKLookup" type="{http://www.xignite.com/services/}CIKLookup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCIKLookup", propOrder = {
    "cikLookup"
})
public class ArrayOfCIKLookup {

    @XmlElement(name = "CIKLookup", nillable = true)
    protected List<CIKLookup> cikLookup;

    /**
     * Gets the value of the cikLookup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cikLookup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIKLookup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIKLookup }
     * 
     * 
     */
    public List<CIKLookup> getCIKLookup() {
        if (cikLookup == null) {
            cikLookup = new ArrayList<CIKLookup>();
        }
        return this.cikLookup;
    }

}

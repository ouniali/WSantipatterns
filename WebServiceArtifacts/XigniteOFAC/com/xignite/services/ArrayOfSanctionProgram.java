
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSanctionProgram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSanctionProgram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SanctionProgram" type="{http://www.xignite.com/services/}SanctionProgram" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSanctionProgram", propOrder = {
    "sanctionProgram"
})
public class ArrayOfSanctionProgram {

    @XmlElement(name = "SanctionProgram", nillable = true)
    protected List<SanctionProgram> sanctionProgram;

    /**
     * Gets the value of the sanctionProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanctionProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanctionProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanctionProgram }
     * 
     * 
     */
    public List<SanctionProgram> getSanctionProgram() {
        if (sanctionProgram == null) {
            sanctionProgram = new ArrayList<SanctionProgram>();
        }
        return this.sanctionProgram;
    }

}

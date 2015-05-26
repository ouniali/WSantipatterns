
package com.flightwise.planexml.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFIStatic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFIStatic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FIStatic" type="{http://planexml.flightwise.com/ws}FIStatic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFIStatic", propOrder = {
    "fiStatic"
})
public class ArrayOfFIStatic {

    @XmlElement(name = "FIStatic", nillable = true)
    protected List<FIStatic> fiStatic;

    /**
     * Gets the value of the fiStatic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiStatic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFIStatic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FIStatic }
     * 
     * 
     */
    public List<FIStatic> getFIStatic() {
        if (fiStatic == null) {
            fiStatic = new ArrayList<FIStatic>();
        }
        return this.fiStatic;
    }

}

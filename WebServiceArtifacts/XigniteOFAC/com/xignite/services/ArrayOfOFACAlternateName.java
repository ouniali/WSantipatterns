
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOFACAlternateName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOFACAlternateName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OFACAlternateName" type="{http://www.xignite.com/services/}OFACAlternateName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOFACAlternateName", propOrder = {
    "ofacAlternateName"
})
public class ArrayOfOFACAlternateName {

    @XmlElement(name = "OFACAlternateName", nillable = true)
    protected List<OFACAlternateName> ofacAlternateName;

    /**
     * Gets the value of the ofacAlternateName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ofacAlternateName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOFACAlternateName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OFACAlternateName }
     * 
     * 
     */
    public List<OFACAlternateName> getOFACAlternateName() {
        if (ofacAlternateName == null) {
            ofacAlternateName = new ArrayList<OFACAlternateName>();
        }
        return this.ofacAlternateName;
    }

}

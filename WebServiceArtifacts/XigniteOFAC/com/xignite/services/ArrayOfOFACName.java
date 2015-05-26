
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOFACName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOFACName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OFACName" type="{http://www.xignite.com/services/}OFACName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOFACName", propOrder = {
    "ofacName"
})
public class ArrayOfOFACName {

    @XmlElement(name = "OFACName", nillable = true)
    protected List<OFACName> ofacName;

    /**
     * Gets the value of the ofacName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ofacName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOFACName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OFACName }
     * 
     * 
     */
    public List<OFACName> getOFACName() {
        if (ofacName == null) {
            ofacName = new ArrayList<OFACName>();
        }
        return this.ofacName;
    }

}

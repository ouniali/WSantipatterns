
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLookupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLookupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LookupItem" type="{http://www.xignite.com/services/}LookupItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLookupItem", propOrder = {
    "lookupItem"
})
public class ArrayOfLookupItem {

    @XmlElement(name = "LookupItem", nillable = true)
    protected List<LookupItem> lookupItem;

    /**
     * Gets the value of the lookupItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lookupItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLookupItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LookupItem }
     * 
     * 
     */
    public List<LookupItem> getLookupItem() {
        if (lookupItem == null) {
            lookupItem = new ArrayList<LookupItem>();
        }
        return this.lookupItem;
    }

}

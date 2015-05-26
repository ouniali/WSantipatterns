
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFullCrossRateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFullCrossRateItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FullCrossRateItem" type="{http://www.xignite.com/services/}FullCrossRateItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFullCrossRateItem", propOrder = {
    "fullCrossRateItem"
})
public class ArrayOfFullCrossRateItem {

    @XmlElement(name = "FullCrossRateItem", nillable = true)
    protected List<FullCrossRateItem> fullCrossRateItem;

    /**
     * Gets the value of the fullCrossRateItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullCrossRateItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullCrossRateItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullCrossRateItem }
     * 
     * 
     */
    public List<FullCrossRateItem> getFullCrossRateItem() {
        if (fullCrossRateItem == null) {
            fullCrossRateItem = new ArrayList<FullCrossRateItem>();
        }
        return this.fullCrossRateItem;
    }

}


package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQuickQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQuickQuote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuickQuote" type="{http://www.xignite.com/services/}QuickQuote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuickQuote", propOrder = {
    "quickQuote"
})
public class ArrayOfQuickQuote {

    @XmlElement(name = "QuickQuote", nillable = true)
    protected List<QuickQuote> quickQuote;

    /**
     * Gets the value of the quickQuote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quickQuote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuickQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuickQuote }
     * 
     * 
     */
    public List<QuickQuote> getQuickQuote() {
        if (quickQuote == null) {
            quickQuote = new ArrayList<QuickQuote>();
        }
        return this.quickQuote;
    }

}

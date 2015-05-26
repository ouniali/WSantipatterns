
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLastSaleQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLastSaleQuote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastSaleQuote" type="{http://www.xignite.com/services/}LastSaleQuote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLastSaleQuote", propOrder = {
    "lastSaleQuote"
})
public class ArrayOfLastSaleQuote {

    @XmlElement(name = "LastSaleQuote", nillable = true)
    protected List<LastSaleQuote> lastSaleQuote;

    /**
     * Gets the value of the lastSaleQuote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastSaleQuote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastSaleQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LastSaleQuote }
     * 
     * 
     */
    public List<LastSaleQuote> getLastSaleQuote() {
        if (lastSaleQuote == null) {
            lastSaleQuote = new ArrayList<LastSaleQuote>();
        }
        return this.lastSaleQuote;
    }

}

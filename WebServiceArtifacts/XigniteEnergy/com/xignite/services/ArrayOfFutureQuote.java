
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFutureQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFutureQuote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FutureQuote" type="{http://www.xignite.com/services/}FutureQuote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFutureQuote", propOrder = {
    "futureQuote"
})
public class ArrayOfFutureQuote {

    @XmlElement(name = "FutureQuote", nillable = true)
    protected List<FutureQuote> futureQuote;

    /**
     * Gets the value of the futureQuote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the futureQuote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFutureQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FutureQuote }
     * 
     * 
     */
    public List<FutureQuote> getFutureQuote() {
        if (futureQuote == null) {
            futureQuote = new ArrayList<FutureQuote>();
        }
        return this.futureQuote;
    }

}

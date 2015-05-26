
package com.carrierate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQuoteItemsInfoForTMSCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQuoteItemsInfoForTMSCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuoteItemsInfoForTMSCustomer" type="{http://carrierate.com/}QuoteItemsInfoForTMSCustomer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuoteItemsInfoForTMSCustomer", propOrder = {
    "quoteItemsInfoForTMSCustomer"
})
public class ArrayOfQuoteItemsInfoForTMSCustomer {

    @XmlElement(name = "QuoteItemsInfoForTMSCustomer", nillable = true)
    protected List<QuoteItemsInfoForTMSCustomer> quoteItemsInfoForTMSCustomer;

    /**
     * Gets the value of the quoteItemsInfoForTMSCustomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteItemsInfoForTMSCustomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteItemsInfoForTMSCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteItemsInfoForTMSCustomer }
     * 
     * 
     */
    public List<QuoteItemsInfoForTMSCustomer> getQuoteItemsInfoForTMSCustomer() {
        if (quoteItemsInfoForTMSCustomer == null) {
            quoteItemsInfoForTMSCustomer = new ArrayList<QuoteItemsInfoForTMSCustomer>();
        }
        return this.quoteItemsInfoForTMSCustomer;
    }

}

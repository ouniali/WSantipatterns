
package com.carrierate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfQuoteRatesWithCarrierLiability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQuoteRatesWithCarrierLiability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuoteRatesWithCarrierLiability" type="{http://carrierate.com/}QuoteRatesWithCarrierLiability" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQuoteRatesWithCarrierLiability", propOrder = {
    "quoteRatesWithCarrierLiability"
})
public class ArrayOfQuoteRatesWithCarrierLiability {

    @XmlElement(name = "QuoteRatesWithCarrierLiability", nillable = true)
    protected List<QuoteRatesWithCarrierLiability> quoteRatesWithCarrierLiability;

    /**
     * Gets the value of the quoteRatesWithCarrierLiability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteRatesWithCarrierLiability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteRatesWithCarrierLiability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteRatesWithCarrierLiability }
     * 
     * 
     */
    public List<QuoteRatesWithCarrierLiability> getQuoteRatesWithCarrierLiability() {
        if (quoteRatesWithCarrierLiability == null) {
            quoteRatesWithCarrierLiability = new ArrayList<QuoteRatesWithCarrierLiability>();
        }
        return this.quoteRatesWithCarrierLiability;
    }

}


package com.digikey.services.searchws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPriceBreakItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPriceBreakItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceBreakItem" type="{http://services.digikey.com/SearchWS}PriceBreakItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPriceBreakItem", propOrder = {
    "priceBreakItem"
})
public class ArrayOfPriceBreakItem {

    @XmlElement(name = "PriceBreakItem", nillable = true)
    protected List<PriceBreakItem> priceBreakItem;

    /**
     * Gets the value of the priceBreakItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceBreakItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceBreakItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceBreakItem }
     * 
     * 
     */
    public List<PriceBreakItem> getPriceBreakItem() {
        if (priceBreakItem == null) {
            priceBreakItem = new ArrayList<PriceBreakItem>();
        }
        return this.priceBreakItem;
    }

}

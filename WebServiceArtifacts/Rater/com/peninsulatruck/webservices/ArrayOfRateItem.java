
package com.peninsulatruck.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRateItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRateItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateItem" type="{http://peninsulatruck.com/WebServices/}RateItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRateItem", propOrder = {
    "rateItem"
})
public class ArrayOfRateItem {

    @XmlElement(name = "RateItem", nillable = true)
    protected List<RateItem> rateItem;

    /**
     * Gets the value of the rateItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateItem }
     * 
     * 
     */
    public List<RateItem> getRateItem() {
        if (rateItem == null) {
            rateItem = new ArrayList<RateItem>();
        }
        return this.rateItem;
    }

}


package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMarketIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMarketIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketIndex" type="{http://www.xignite.com/services/}MarketIndex" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMarketIndex", propOrder = {
    "marketIndex"
})
public class ArrayOfMarketIndex {

    @XmlElement(name = "MarketIndex", nillable = true)
    protected List<MarketIndex> marketIndex;

    /**
     * Gets the value of the marketIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketIndex }
     * 
     * 
     */
    public List<MarketIndex> getMarketIndex() {
        if (marketIndex == null) {
            marketIndex = new ArrayList<MarketIndex>();
        }
        return this.marketIndex;
    }

}

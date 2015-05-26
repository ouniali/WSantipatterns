
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHistoricalRateBidAsk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHistoricalRateBidAsk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HistoricalRateBidAsk" type="{http://www.xignite.com/services/}HistoricalRateBidAsk" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHistoricalRateBidAsk", propOrder = {
    "historicalRateBidAsk"
})
public class ArrayOfHistoricalRateBidAsk {

    @XmlElement(name = "HistoricalRateBidAsk", nillable = true)
    protected List<HistoricalRateBidAsk> historicalRateBidAsk;

    /**
     * Gets the value of the historicalRateBidAsk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicalRateBidAsk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricalRateBidAsk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoricalRateBidAsk }
     * 
     * 
     */
    public List<HistoricalRateBidAsk> getHistoricalRateBidAsk() {
        if (historicalRateBidAsk == null) {
            historicalRateBidAsk = new ArrayList<HistoricalRateBidAsk>();
        }
        return this.historicalRateBidAsk;
    }

}

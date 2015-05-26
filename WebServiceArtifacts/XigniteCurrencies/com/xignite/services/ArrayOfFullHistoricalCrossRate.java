
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFullHistoricalCrossRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFullHistoricalCrossRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FullHistoricalCrossRate" type="{http://www.xignite.com/services/}FullHistoricalCrossRate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFullHistoricalCrossRate", propOrder = {
    "fullHistoricalCrossRate"
})
public class ArrayOfFullHistoricalCrossRate {

    @XmlElement(name = "FullHistoricalCrossRate", nillable = true)
    protected List<FullHistoricalCrossRate> fullHistoricalCrossRate;

    /**
     * Gets the value of the fullHistoricalCrossRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullHistoricalCrossRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullHistoricalCrossRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullHistoricalCrossRate }
     * 
     * 
     */
    public List<FullHistoricalCrossRate> getFullHistoricalCrossRate() {
        if (fullHistoricalCrossRate == null) {
            fullHistoricalCrossRate = new ArrayList<FullHistoricalCrossRate>();
        }
        return this.fullHistoricalCrossRate;
    }

}

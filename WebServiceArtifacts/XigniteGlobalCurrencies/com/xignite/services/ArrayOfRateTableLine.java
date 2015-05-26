
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRateTableLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRateTableLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateTableLine" type="{http://www.xignite.com/services/}RateTableLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRateTableLine", propOrder = {
    "rateTableLine"
})
public class ArrayOfRateTableLine {

    @XmlElement(name = "RateTableLine", nillable = true)
    protected List<RateTableLine> rateTableLine;

    /**
     * Gets the value of the rateTableLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateTableLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateTableLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateTableLine }
     * 
     * 
     */
    public List<RateTableLine> getRateTableLine() {
        if (rateTableLine == null) {
            rateTableLine = new ArrayList<RateTableLine>();
        }
        return this.rateTableLine;
    }

}

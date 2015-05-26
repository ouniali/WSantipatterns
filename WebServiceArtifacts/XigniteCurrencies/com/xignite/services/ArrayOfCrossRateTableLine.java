
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCrossRateTableLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCrossRateTableLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CrossRateTableLine" type="{http://www.xignite.com/services/}CrossRateTableLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCrossRateTableLine", propOrder = {
    "crossRateTableLine"
})
public class ArrayOfCrossRateTableLine {

    @XmlElement(name = "CrossRateTableLine", nillable = true)
    protected List<CrossRateTableLine> crossRateTableLine;

    /**
     * Gets the value of the crossRateTableLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crossRateTableLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrossRateTableLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrossRateTableLine }
     * 
     * 
     */
    public List<CrossRateTableLine> getCrossRateTableLine() {
        if (crossRateTableLine == null) {
            crossRateTableLine = new ArrayList<CrossRateTableLine>();
        }
        return this.crossRateTableLine;
    }

}

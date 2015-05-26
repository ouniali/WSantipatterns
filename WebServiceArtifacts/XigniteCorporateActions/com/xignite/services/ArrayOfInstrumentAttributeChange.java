
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInstrumentAttributeChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInstrumentAttributeChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrumentAttributeChange" type="{http://www.xignite.com/services/}InstrumentAttributeChange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInstrumentAttributeChange", propOrder = {
    "instrumentAttributeChange"
})
public class ArrayOfInstrumentAttributeChange {

    @XmlElement(name = "InstrumentAttributeChange", nillable = true)
    protected List<InstrumentAttributeChange> instrumentAttributeChange;

    /**
     * Gets the value of the instrumentAttributeChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrumentAttributeChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrumentAttributeChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentAttributeChange }
     * 
     * 
     */
    public List<InstrumentAttributeChange> getInstrumentAttributeChange() {
        if (instrumentAttributeChange == null) {
            instrumentAttributeChange = new ArrayList<InstrumentAttributeChange>();
        }
        return this.instrumentAttributeChange;
    }

}


package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInstrumentTransformationInputOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInstrumentTransformationInputOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrumentTransformationInputOutput" type="{http://www.xignite.com/services/}InstrumentTransformationInputOutput" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInstrumentTransformationInputOutput", propOrder = {
    "instrumentTransformationInputOutput"
})
public class ArrayOfInstrumentTransformationInputOutput {

    @XmlElement(name = "InstrumentTransformationInputOutput", nillable = true)
    protected List<InstrumentTransformationInputOutput> instrumentTransformationInputOutput;

    /**
     * Gets the value of the instrumentTransformationInputOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrumentTransformationInputOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrumentTransformationInputOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentTransformationInputOutput }
     * 
     * 
     */
    public List<InstrumentTransformationInputOutput> getInstrumentTransformationInputOutput() {
        if (instrumentTransformationInputOutput == null) {
            instrumentTransformationInputOutput = new ArrayList<InstrumentTransformationInputOutput>();
        }
        return this.instrumentTransformationInputOutput;
    }

}

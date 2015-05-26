
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEuroDollarFRA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEuroDollarFRA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EuroDollarFRA" type="{http://www.xignite.com/services/}EuroDollarFRA" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEuroDollarFRA", propOrder = {
    "euroDollarFRA"
})
public class ArrayOfEuroDollarFRA {

    @XmlElement(name = "EuroDollarFRA", nillable = true)
    protected List<EuroDollarFRA> euroDollarFRA;

    /**
     * Gets the value of the euroDollarFRA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the euroDollarFRA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEuroDollarFRA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EuroDollarFRA }
     * 
     * 
     */
    public List<EuroDollarFRA> getEuroDollarFRA() {
        if (euroDollarFRA == null) {
            euroDollarFRA = new ArrayList<EuroDollarFRA>();
        }
        return this.euroDollarFRA;
    }

}

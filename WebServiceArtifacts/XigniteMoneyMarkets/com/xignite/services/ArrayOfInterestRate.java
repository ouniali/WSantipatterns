
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInterestRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInterestRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterestRate" type="{http://www.xignite.com/services/}InterestRate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInterestRate", propOrder = {
    "interestRate"
})
public class ArrayOfInterestRate {

    @XmlElement(name = "InterestRate", nillable = true)
    protected List<InterestRate> interestRate;

    /**
     * Gets the value of the interestRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestRate }
     * 
     * 
     */
    public List<InterestRate> getInterestRate() {
        if (interestRate == null) {
            interestRate = new ArrayList<InterestRate>();
        }
        return this.interestRate;
    }

}


package com.strikeiron;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNorthAmericanBatchAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNorthAmericanBatchAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NorthAmericanBatchAddress" type="{http://www.strikeiron.com}NorthAmericanBatchAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNorthAmericanBatchAddress", propOrder = {
    "northAmericanBatchAddress"
})
public class ArrayOfNorthAmericanBatchAddress {

    @XmlElement(name = "NorthAmericanBatchAddress", nillable = true)
    protected List<NorthAmericanBatchAddress> northAmericanBatchAddress;

    /**
     * Gets the value of the northAmericanBatchAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the northAmericanBatchAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNorthAmericanBatchAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NorthAmericanBatchAddress }
     * 
     * 
     */
    public List<NorthAmericanBatchAddress> getNorthAmericanBatchAddress() {
        if (northAmericanBatchAddress == null) {
            northAmericanBatchAddress = new ArrayList<NorthAmericanBatchAddress>();
        }
        return this.northAmericanBatchAddress;
    }

}

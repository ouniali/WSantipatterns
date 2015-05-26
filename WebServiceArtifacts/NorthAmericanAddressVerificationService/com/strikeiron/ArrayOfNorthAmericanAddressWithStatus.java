
package com.strikeiron;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNorthAmericanAddressWithStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNorthAmericanAddressWithStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NorthAmericanAddressWithStatus" type="{http://www.strikeiron.com}NorthAmericanAddressWithStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNorthAmericanAddressWithStatus", propOrder = {
    "northAmericanAddressWithStatus"
})
public class ArrayOfNorthAmericanAddressWithStatus {

    @XmlElement(name = "NorthAmericanAddressWithStatus", nillable = true)
    protected List<NorthAmericanAddressWithStatus> northAmericanAddressWithStatus;

    /**
     * Gets the value of the northAmericanAddressWithStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the northAmericanAddressWithStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNorthAmericanAddressWithStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NorthAmericanAddressWithStatus }
     * 
     * 
     */
    public List<NorthAmericanAddressWithStatus> getNorthAmericanAddressWithStatus() {
        if (northAmericanAddressWithStatus == null) {
            northAmericanAddressWithStatus = new ArrayList<NorthAmericanAddressWithStatus>();
        }
        return this.northAmericanAddressWithStatus;
    }

}

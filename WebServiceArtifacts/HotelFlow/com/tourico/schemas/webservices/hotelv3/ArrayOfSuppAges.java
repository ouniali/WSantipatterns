
package com.tourico.schemas.webservices.hotelv3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSuppAges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSuppAges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuppAges" type="{http://schemas.tourico.com/webservices/hotelv3}SuppAges" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSuppAges", propOrder = {
    "suppAges"
})
public class ArrayOfSuppAges {

    @XmlElement(name = "SuppAges", nillable = true)
    protected List<SuppAges> suppAges;

    /**
     * Gets the value of the suppAges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suppAges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuppAges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuppAges }
     * 
     * 
     */
    public List<SuppAges> getSuppAges() {
        if (suppAges == null) {
            suppAges = new ArrayList<SuppAges>();
        }
        return this.suppAges;
    }

}

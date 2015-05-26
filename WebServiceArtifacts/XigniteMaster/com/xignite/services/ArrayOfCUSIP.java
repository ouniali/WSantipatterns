
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCUSIP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCUSIP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUSIP" type="{http://www.xignite.com/services/}CUSIP" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCUSIP", propOrder = {
    "cusip"
})
public class ArrayOfCUSIP {

    @XmlElement(name = "CUSIP", nillable = true)
    protected List<CUSIP> cusip;

    /**
     * Gets the value of the cusip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cusip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCUSIP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CUSIP }
     * 
     * 
     */
    public List<CUSIP> getCUSIP() {
        if (cusip == null) {
            cusip = new ArrayList<CUSIP>();
        }
        return this.cusip;
    }

}

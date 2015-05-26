
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSJRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSJRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSJRate" type="{http://www.xignite.com/services/}WSJRate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSJRate", propOrder = {
    "wsjRate"
})
public class ArrayOfWSJRate {

    @XmlElement(name = "WSJRate", nillable = true)
    protected List<WSJRate> wsjRate;

    /**
     * Gets the value of the wsjRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsjRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSJRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSJRate }
     * 
     * 
     */
    public List<WSJRate> getWSJRate() {
        if (wsjRate == null) {
            wsjRate = new ArrayList<WSJRate>();
        }
        return this.wsjRate;
    }

}

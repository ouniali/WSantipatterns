
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFutureOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFutureOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FutureOption" type="{http://www.xignite.com/services/}FutureOption" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFutureOption", propOrder = {
    "futureOption"
})
public class ArrayOfFutureOption {

    @XmlElement(name = "FutureOption", nillable = true)
    protected List<FutureOption> futureOption;

    /**
     * Gets the value of the futureOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the futureOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFutureOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FutureOption }
     * 
     * 
     */
    public List<FutureOption> getFutureOption() {
        if (futureOption == null) {
            futureOption = new ArrayList<FutureOption>();
        }
        return this.futureOption;
    }

}

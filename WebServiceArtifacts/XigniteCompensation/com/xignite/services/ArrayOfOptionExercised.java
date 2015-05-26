
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOptionExercised complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOptionExercised">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptionExercised" type="{http://www.xignite.com/services/}OptionExercised" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOptionExercised", propOrder = {
    "optionExercised"
})
public class ArrayOfOptionExercised {

    @XmlElement(name = "OptionExercised", nillable = true)
    protected List<OptionExercised> optionExercised;

    /**
     * Gets the value of the optionExercised property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionExercised property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionExercised().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionExercised }
     * 
     * 
     */
    public List<OptionExercised> getOptionExercised() {
        if (optionExercised == null) {
            optionExercised = new ArrayList<OptionExercised>();
        }
        return this.optionExercised;
    }

}

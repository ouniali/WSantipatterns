
package com.epostcode.ws.uk;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNearest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNearest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nearest" type="{http://ws.epostcode.com/uk/}Nearest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNearest", propOrder = {
    "nearest"
})
public class ArrayOfNearest {

    @XmlElement(name = "Nearest", nillable = true)
    protected List<Nearest> nearest;

    /**
     * Gets the value of the nearest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nearest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNearest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nearest }
     * 
     * 
     */
    public List<Nearest> getNearest() {
        if (nearest == null) {
            nearest = new ArrayList<Nearest>();
        }
        return this.nearest;
    }

}


package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTopByCapitalization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTopByCapitalization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TopByCapitalization" type="{http://www.xignite.com/services/}TopByCapitalization" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTopByCapitalization", propOrder = {
    "topByCapitalization"
})
public class ArrayOfTopByCapitalization {

    @XmlElement(name = "TopByCapitalization", nillable = true)
    protected List<TopByCapitalization> topByCapitalization;

    /**
     * Gets the value of the topByCapitalization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topByCapitalization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopByCapitalization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopByCapitalization }
     * 
     * 
     */
    public List<TopByCapitalization> getTopByCapitalization() {
        if (topByCapitalization == null) {
            topByCapitalization = new ArrayList<TopByCapitalization>();
        }
        return this.topByCapitalization;
    }

}

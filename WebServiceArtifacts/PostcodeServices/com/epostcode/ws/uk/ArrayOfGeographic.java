
package com.epostcode.ws.uk;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGeographic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGeographic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Geographic" type="{http://ws.epostcode.com/uk/}Geographic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGeographic", propOrder = {
    "geographic"
})
public class ArrayOfGeographic {

    @XmlElement(name = "Geographic", nillable = true)
    protected List<Geographic> geographic;

    /**
     * Gets the value of the geographic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Geographic }
     * 
     * 
     */
    public List<Geographic> getGeographic() {
        if (geographic == null) {
            geographic = new ArrayList<Geographic>();
        }
        return this.geographic;
    }

}

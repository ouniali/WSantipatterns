
package com.epostcode.ws.uk;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfListAddressThoroughfare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfListAddressThoroughfare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListAddressThoroughfare" type="{http://ws.epostcode.com/uk/}ListAddressThoroughfare" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfListAddressThoroughfare", propOrder = {
    "listAddressThoroughfare"
})
public class ArrayOfListAddressThoroughfare {

    @XmlElement(name = "ListAddressThoroughfare", nillable = true)
    protected List<ListAddressThoroughfare> listAddressThoroughfare;

    /**
     * Gets the value of the listAddressThoroughfare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listAddressThoroughfare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListAddressThoroughfare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListAddressThoroughfare }
     * 
     * 
     */
    public List<ListAddressThoroughfare> getListAddressThoroughfare() {
        if (listAddressThoroughfare == null) {
            listAddressThoroughfare = new ArrayList<ListAddressThoroughfare>();
        }
        return this.listAddressThoroughfare;
    }

}

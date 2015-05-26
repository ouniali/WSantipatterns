
package org.datacontract.schemas._2004._07.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPassengersEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPassengersEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengersEN" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PassengersEN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPassengersEN", propOrder = {
    "passengersEN"
})
public class ArrayOfPassengersEN {

    @XmlElement(name = "PassengersEN", nillable = true)
    protected List<PassengersEN> passengersEN;

    /**
     * Gets the value of the passengersEN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengersEN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengersEN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengersEN }
     * 
     * 
     */
    public List<PassengersEN> getPassengersEN() {
        if (passengersEN == null) {
            passengersEN = new ArrayList<PassengersEN>();
        }
        return this.passengersEN;
    }

}

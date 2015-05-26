
package org.datacontract.schemas._2004._07.mouzenidis_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatValue" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch}StatValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatValue", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", propOrder = {
    "statValue"
})
public class ArrayOfStatValue {

    @XmlElement(name = "StatValue", nillable = true)
    protected List<StatValue> statValue;

    /**
     * Gets the value of the statValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatValue }
     * 
     * 
     */
    public List<StatValue> getStatValue() {
        if (statValue == null) {
            statValue = new ArrayList<StatValue>();
        }
        return this.statValue;
    }

}

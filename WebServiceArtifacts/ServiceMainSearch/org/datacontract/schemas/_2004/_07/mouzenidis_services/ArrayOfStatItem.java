
package org.datacontract.schemas._2004._07.mouzenidis_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatItem" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch}StatItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatItem", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.ServiceMainSearch", propOrder = {
    "statItem"
})
public class ArrayOfStatItem {

    @XmlElement(name = "StatItem", nillable = true)
    protected List<StatItem> statItem;

    /**
     * Gets the value of the statItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatItem }
     * 
     * 
     */
    public List<StatItem> getStatItem() {
        if (statItem == null) {
            statItem = new ArrayList<StatItem>();
        }
        return this.statItem;
    }

}

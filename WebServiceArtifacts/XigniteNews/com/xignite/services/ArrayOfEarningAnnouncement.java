
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEarningAnnouncement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEarningAnnouncement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarningAnnouncement" type="{http://www.xignite.com/services/}EarningAnnouncement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEarningAnnouncement", propOrder = {
    "earningAnnouncement"
})
public class ArrayOfEarningAnnouncement {

    @XmlElement(name = "EarningAnnouncement", nillable = true)
    protected List<EarningAnnouncement> earningAnnouncement;

    /**
     * Gets the value of the earningAnnouncement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earningAnnouncement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarningAnnouncement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarningAnnouncement }
     * 
     * 
     */
    public List<EarningAnnouncement> getEarningAnnouncement() {
        if (earningAnnouncement == null) {
            earningAnnouncement = new ArrayList<EarningAnnouncement>();
        }
        return this.earningAnnouncement;
    }

}

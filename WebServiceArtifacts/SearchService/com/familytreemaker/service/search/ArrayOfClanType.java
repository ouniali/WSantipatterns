
package com.familytreemaker.service.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.familytreemaker.service.ClanType;


/**
 * <p>Java class for ArrayOfClanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClanType" type="{urn:service.familytreemaker.com}ClanType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClanType", propOrder = {
    "clanType"
})
public class ArrayOfClanType {

    @XmlElement(name = "ClanType")
    protected List<ClanType> clanType;

    /**
     * Gets the value of the clanType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clanType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClanType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClanType }
     * 
     * 
     */
    public List<ClanType> getClanType() {
        if (clanType == null) {
            clanType = new ArrayList<ClanType>();
        }
        return this.clanType;
    }

}

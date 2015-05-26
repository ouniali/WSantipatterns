
package com.vodafone.gdsp.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tBaseCountry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tBaseCountry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseCountry" type="{http://ws.gdsp.vodafone.com/}tBaseCountryItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBaseCountry", propOrder = {
    "baseCountry"
})
public class TBaseCountry {

    @XmlElement(nillable = true)
    protected List<TBaseCountryItem> baseCountry;

    /**
     * Gets the value of the baseCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TBaseCountryItem }
     * 
     * 
     */
    public List<TBaseCountryItem> getBaseCountry() {
        if (baseCountry == null) {
            baseCountry = new ArrayList<TBaseCountryItem>();
        }
        return this.baseCountry;
    }

}

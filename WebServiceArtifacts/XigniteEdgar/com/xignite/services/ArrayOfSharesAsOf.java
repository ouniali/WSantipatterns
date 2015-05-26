
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSharesAsOf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSharesAsOf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SharesAsOf" type="{http://www.xignite.com/services/}SharesAsOf" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSharesAsOf", propOrder = {
    "sharesAsOf"
})
public class ArrayOfSharesAsOf {

    @XmlElement(name = "SharesAsOf", nillable = true)
    protected List<SharesAsOf> sharesAsOf;

    /**
     * Gets the value of the sharesAsOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharesAsOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharesAsOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharesAsOf }
     * 
     * 
     */
    public List<SharesAsOf> getSharesAsOf() {
        if (sharesAsOf == null) {
            sharesAsOf = new ArrayList<SharesAsOf>();
        }
        return this.sharesAsOf;
    }

}

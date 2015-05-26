
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSECFormerCompanyName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSECFormerCompanyName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SECFormerCompanyName" type="{http://www.xignite.com/services/}SECFormerCompanyName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSECFormerCompanyName", propOrder = {
    "secFormerCompanyName"
})
public class ArrayOfSECFormerCompanyName {

    @XmlElement(name = "SECFormerCompanyName", nillable = true)
    protected List<SECFormerCompanyName> secFormerCompanyName;

    /**
     * Gets the value of the secFormerCompanyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secFormerCompanyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSECFormerCompanyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SECFormerCompanyName }
     * 
     * 
     */
    public List<SECFormerCompanyName> getSECFormerCompanyName() {
        if (secFormerCompanyName == null) {
            secFormerCompanyName = new ArrayList<SECFormerCompanyName>();
        }
        return this.secFormerCompanyName;
    }

}

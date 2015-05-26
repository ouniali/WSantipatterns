
package com.xignite.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIssuerAttributeChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIssuerAttributeChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssuerAttributeChange" type="{http://www.xignite.com/services/}IssuerAttributeChange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIssuerAttributeChange", propOrder = {
    "issuerAttributeChange"
})
public class ArrayOfIssuerAttributeChange {

    @XmlElement(name = "IssuerAttributeChange", nillable = true)
    protected List<IssuerAttributeChange> issuerAttributeChange;

    /**
     * Gets the value of the issuerAttributeChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuerAttributeChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuerAttributeChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuerAttributeChange }
     * 
     * 
     */
    public List<IssuerAttributeChange> getIssuerAttributeChange() {
        if (issuerAttributeChange == null) {
            issuerAttributeChange = new ArrayList<IssuerAttributeChange>();
        }
        return this.issuerAttributeChange;
    }

}

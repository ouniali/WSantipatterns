
package com.ukmail.services.contracts.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUKMWebWarning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUKMWebWarning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UKMWebWarning" type="{http://www.UKMail.com/Services/Contracts/DataContracts}UKMWebWarning" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUKMWebWarning", propOrder = {
    "ukmWebWarning"
})
public class ArrayOfUKMWebWarning {

    @XmlElement(name = "UKMWebWarning", nillable = true)
    protected List<UKMWebWarning> ukmWebWarning;

    /**
     * Gets the value of the ukmWebWarning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ukmWebWarning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUKMWebWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UKMWebWarning }
     * 
     * 
     */
    public List<UKMWebWarning> getUKMWebWarning() {
        if (ukmWebWarning == null) {
            ukmWebWarning = new ArrayList<UKMWebWarning>();
        }
        return this.ukmWebWarning;
    }

}

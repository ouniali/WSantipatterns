
package com.ukmail.services.contracts.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUKMWebError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUKMWebError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UKMWebError" type="{http://www.UKMail.com/Services/Contracts/DataContracts}UKMWebError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUKMWebError", propOrder = {
    "ukmWebError"
})
public class ArrayOfUKMWebError {

    @XmlElement(name = "UKMWebError", nillable = true)
    protected List<UKMWebError> ukmWebError;

    /**
     * Gets the value of the ukmWebError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ukmWebError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUKMWebError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UKMWebError }
     * 
     * 
     */
    public List<UKMWebError> getUKMWebError() {
        if (ukmWebError == null) {
            ukmWebError = new ArrayList<UKMWebError>();
        }
        return this.ukmWebError;
    }

}

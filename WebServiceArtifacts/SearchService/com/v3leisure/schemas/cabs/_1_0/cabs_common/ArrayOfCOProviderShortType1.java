
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCO_ProviderShortType1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCO_ProviderShortType1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProviderRQ" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_ProviderShortType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCO_ProviderShortType1", propOrder = {
    "providerRQ"
})
public class ArrayOfCOProviderShortType1 {

    @XmlElement(name = "ProviderRQ")
    protected List<COProviderShortType> providerRQ;

    /**
     * Gets the value of the providerRQ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerRQ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderRQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COProviderShortType }
     * 
     * 
     */
    public List<COProviderShortType> getProviderRQ() {
        if (providerRQ == null) {
            providerRQ = new ArrayList<COProviderShortType>();
        }
        return this.providerRQ;
    }

}

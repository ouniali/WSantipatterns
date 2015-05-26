
package com.oracle.xmlns.enterprise.tools.schemas.m661196;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Find__CompIntfc__CI_PERSONAL_DATAResponseTypeShape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Find__CompIntfc__CI_PERSONAL_DATAResponseTypeShape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CI_PERSONAL_DATA" type="{http://xmlns.oracle.com/Enterprise/Tools/schemas/M661196.V1}CI_PERSONAL_DATAComplexTypeShape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Find__CompIntfc__CI_PERSONAL_DATAResponseTypeShape", propOrder = {
    "cipersonaldata"
})
public class FindCompIntfcCIPERSONALDATAResponseTypeShape {

    @XmlElement(name = "CI_PERSONAL_DATA")
    protected List<CIPERSONALDATAComplexTypeShape> cipersonaldata;

    /**
     * Gets the value of the cipersonaldata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cipersonaldata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIPERSONALDATA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIPERSONALDATAComplexTypeShape }
     * 
     * 
     */
    public List<CIPERSONALDATAComplexTypeShape> getCIPERSONALDATA() {
        if (cipersonaldata == null) {
            cipersonaldata = new ArrayList<CIPERSONALDATAComplexTypeShape>();
        }
        return this.cipersonaldata;
    }

}
